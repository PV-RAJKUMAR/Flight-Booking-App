package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import spring.dao.UserDAO;
import spring.model.UserModel;
import spring.service.UserService;

import java.io.IOException;

public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    public boolean checkUser(String userName) {
        UserModel user = userDAO.getUser(userName);
        boolean status = user.isIs_admin();
        if (status) {
            return false;
        } else {
            return true;
        }
    }

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

    public boolean insertValues(UserModel user) throws IOException {
        userDAO.insertValues(user);
        return true;
    }
}
