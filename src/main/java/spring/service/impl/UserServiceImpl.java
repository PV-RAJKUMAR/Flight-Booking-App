package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import spring.dao.UserDAO;
import spring.model.UserModel;
import spring.service.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    public boolean checkLogin(String userName, String password) {
        UserModel user = userDAO.getUser(userName);
        if (user != null) {
            String userPass = user.getPassword();
            if (userPass.equals(password))
                return true;
            else
                return false;
        } else
            return false;
    }

    public UserModel getUser(String userName) {
        return userDAO.getUser(userName);
    }
}
