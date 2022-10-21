package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import spring.dao.OfficerDAO;
import spring.model.OfficerModel;
import spring.model.UserModel;
import spring.service.OfficerService;

public class OfficerServiceImpl implements OfficerService {
    @Autowired
    OfficerDAO officerDAO;

    public boolean checkLogin(String userName, String password) {
        OfficerModel officer = officerDAO.getUser(userName);
        if (officer != null) {
            String userPass = officer.getPassword();
            if (userPass.equals(password))
                return true;
            else
                return false;
        } else
            return false;
    }

    public OfficerModel getUser(String userName) {
        return officerDAO.getUser(userName);
    }

    public boolean checkUser(String userName) {
        OfficerModel officer = officerDAO.getUser(userName);
        boolean status = officer.isIs_admin();
        if (status) {
            return true;
        } else {
            return false;
        }
    }
}
