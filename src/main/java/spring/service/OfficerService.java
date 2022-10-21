package spring.service;

import spring.model.OfficerModel;

public interface OfficerService
{
    public boolean checkLogin(String userName, String password);

    public OfficerModel getUser(String userName);

    public boolean checkUser(String userName);
}
