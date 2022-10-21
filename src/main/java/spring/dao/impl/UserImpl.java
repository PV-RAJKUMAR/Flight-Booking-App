package spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import spring.dao.UserDAO;
import spring.model.UserModel;
import spring.repository.UserRepository;

import java.security.PublicKey;

public class UserImpl implements UserDAO {
    @Autowired
    UserRepository userRepo;

    public UserModel getUser(String userName) {
        UserModel user = new UserModel();
        try {
            user.setUserName(userName);
            userRepo.equals(user);
            return user;
        } catch (Exception ex) {
            return user;

        }
    }

    public boolean insertValues(UserModel user) {
        try {
            userRepo.save(user);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }


}
