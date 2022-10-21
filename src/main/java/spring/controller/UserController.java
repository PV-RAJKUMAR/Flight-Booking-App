package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import spring.model.UserModel;
import spring.service.UserService;
import spring.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping(value = "/checkLogin", method = RequestMethod.GET)
    public ModelAndView checkLogin(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Boolean isUser = userService.checkLogin(userName, password);
        Boolean status = userService.checkUser(userName);
        if (isUser && status) {
            String firstName = userService.getUser(userName).getFirstName();
            String lastName = userService.getUser(userName).getLastName();
            mv.addObject("userName", userName);
            mv.addObject("firstName", firstName);
            mv.addObject("lastName", lastName);
            return new ModelAndView("userProfile");
        } else {
            String message = "Please enter correct credentials";
            return new ModelAndView("unsuccessfulLogin", "message", message);
        }
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public ModelAndView viewUserProfile(@RequestParam String userName) throws IOException {
        ModelAndView mv = new ModelAndView("userProfile");
        UserModel user = userService.getUser(userName);
        mv.addObject("user", user);
        return mv;
    }

    @RequestMapping(value = "/editUser/{userName}", method = RequestMethod.GET)
    public ModelAndView editUserProfile(@PathVariable String userName) throws IOException {
        ModelAndView mv = new ModelAndView("editUser");
        UserModel user = userService.getUser(userName);
        String fName = user.getFirstName();
        mv.addObject("user", user);
        mv.addObject("headerMessage", fName);
        return mv;
    }

    @PostMapping(value = "/editUser/{userName}")
    public ModelAndView saveUpdatedUser(@ModelAttribute UserModel user, BindingResult result) throws IOException {
        ModelAndView mv = new ModelAndView("redirect:/index");
        if (result.hasErrors()) {
            return new ModelAndView("error");
        }
        boolean isSaved = userService.insertValues(user);
        if (!isSaved) {
            return new ModelAndView("error");
        }
        return mv;
    }

}