package spring.service;

import spring.model.UserModel;

public interface UserService
{
    public boolean checkLogin(String userName, String password);

    public UserModel getUser(String userName);
}
