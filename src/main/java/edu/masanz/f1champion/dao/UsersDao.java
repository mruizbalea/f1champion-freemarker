package edu.masanz.f1champion.dao;

import edu.masanz.f1champion.database.ConnectionManager;
import edu.masanz.f1champion.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UsersDao {

    public static Map<Integer, User> usuario;

    public static User obtenerUsuario(int id) {
        return usuario.get(id);
    }

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

    public static List<User> obtenerUsuarios() {

        List<User> usuarios = new ArrayList<>(usuario.values());

        return usuarios;
    }
}
