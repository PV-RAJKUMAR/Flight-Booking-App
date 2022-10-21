package spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import spring.dao.OfficerDAO;
import spring.model.OfficerModel;
import spring.model.UserModel;
import spring.repository.OfficerRepository;

public class OfficerImpl implements OfficerDAO {
    @Autowired
    OfficerRepository officerRepo;

    public OfficerModel getUser(String userName) {
        OfficerModel officer = new OfficerModel();
        try {
            officer.setUserName(userName);
            officerRepo.equals(officer);
            return officer;
        } catch (Exception ex) {
            return officer;

        }
    }
}
