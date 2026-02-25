package edu.masanz.f1champion.dao;

import edu.masanz.f1champion.database.ConnectionManager;
import edu.masanz.f1champion.model.User;

public class UsersDao {

    public static User login(String username, String password){
        String select = "select * from basededatos where username = ? and password = ?";
        Object[] params = {username, password};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);
        if (result!=null){

            User user = ;
            return user;
        }
        return null;
    }

}
