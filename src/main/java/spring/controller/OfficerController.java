package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spring.service.OfficerService;

import javax.servlet.http.HttpServletRequest;

public class OfficerController {
    @Autowired
    OfficerService officerService;

    @RequestMapping(value = "/checkLogin", method = RequestMethod.GET)
    public ModelAndView checkLogin(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Boolean isUser = officerService.checkLogin(userName, password);
        Boolean status = officerService.checkUser(userName);
        if (isUser && status) {
            String firstName = officerService.getUser(userName).getFirstName();
            String lastName = officerService.getUser(userName).getLastName();
            mv.addObject("userName", userName);
            mv.addObject("firstName", firstName);
            mv.addObject("lastName", lastName);
            return new ModelAndView("officerProfile");
        } else {
            String message = "Please enter correct credentials";
            return new ModelAndView("unsuccessfulLogin", "message", message);
        }
    }

}
