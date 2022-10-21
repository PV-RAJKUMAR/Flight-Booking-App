package spring.service;

import spring.model.UserModel;

import java.io.IOException;

public interface UserService
{
    public boolean checkUser(String userName);
    public boolean checkLogin(String userName, String password);

    public UserModel getUser(String userName);

    public boolean insertValues(UserModel user) throws IOException;
}
