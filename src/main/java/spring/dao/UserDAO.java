package spring.dao;

import spring.model.UserModel;

public interface UserDAO
{
    public UserModel getUser(String userName);

    public boolean insertValues(UserModel user);
}
