package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import spring.model.UserModel;
import spring.service.UserService;
import spring.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        if (isUser) {
            String firstName = userService.getUser(userName).getFirstName();
            String lastName = userService.getUser(userName).getLastName();
            mv.addObject("userName", userName);
            mv.addObject("firstName", firstName);
            mv.addObject("lastName", lastName);
            return new ModelAndView("index", "message", "Logged in successfully!");
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

    @RequestMapping("/editUser")
    public ModelAndView editUserProfile(HttpServletRequest request) {
        String userName = (String) request.getSession().getAttribute("userName");
        UserModel user = userService.getUser(userName);
        return new ModelAndView("userProfileEdit", "user", user);
    }
}