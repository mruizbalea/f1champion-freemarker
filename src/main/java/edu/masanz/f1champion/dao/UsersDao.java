package edu.masanz.f1champion.dao;

import edu.masanz.f1champion.database.ConnectionManager;
import edu.masanz.f1champion.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UsersDao {

    public static Map<Integer, User> usuario;
    public static int contador;

    public UsersDao() {
        ConnectionManager.conectar("f1_db", "root", "roo7");
    }

    public static User login(String username, String password){
        String select = "select * from usuarios where username = ? and password = ?";
        Object[] params = {username, password};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);
        if (result!=null){

            User user = new User((long)result[0][0], (String)result[0][1], (String)result[0][2], (int)result[0][3]);
            return user;
        }
        return null;
    }

    public static int obtenerNumeroUsuarios() {
        String sql = "SELECT COUNT(*) FROM usuarios";
        Object[] params = {};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);
        if (resultado != null && resultado.length == 1) {
            int numeroUsuarios = Integer.parseInt(resultado[0][0].toString());
            return numeroUsuarios;
        }
        return 0;
    }

    public static List<User> obtenerUsuarios(int pagina, int usuariosPorPagina) {
        String sql = "SELECT id, username, password, rol " +
                "FROM usuarios ORDER BY id DESC LIMIT ? OFFSET ?";
        Long limite = (long) usuariosPorPagina;
        Long offset = (long) ((pagina-1)*usuariosPorPagina);
        Object[] params = {limite, offset};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);
        List<User> users = new ArrayList<>();
        if (resultado != null) {
            for (Object[] fila : resultado) {
                User user = new User();

                user.setId((Long) fila[0]);
                user.setUsername((String) fila[1]);
                user.setPassword((String) fila[2]);
                user.setRol((int) fila[3]);

                users.add(user);
            }
        }
        return users;
    }

    public static User obtenerUsuario(int id) {
        String sql = "SELECT id, username, password, rol " +
                "FROM usuarios WHERE id = ? ORDER BY id DESC LIMIT 1";
        Object[] params = {id};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);
        if (resultado != null && resultado.length == 1) {
            User user = new User();

            user.setId((Long) resultado[0][0]);
            user.setUsername((String) resultado[0][1]);
            user.setPassword((String) resultado[0][2]);
            user.setRol((int) resultado[0][3]);

            return user;
        }
        return null;
    }

    public static User guardarUsuario(User user) {
        String sql = "INSERT INTO usuarios (username, password, rol) VALUES (?, ?, ?)";
        Object[] params = {user.getUsername(), user.getPassword(), user.getRol()};
        long id = ConnectionManager.ejecutarInsertSQL(sql, params);
        if (id > 0){
            user.setId(id);
        }
        return user;
    }

    public static boolean actualizarUsuario(User user) {
        String sql = "UPDATE usuarios SET username = ?, password = ?, rol = ? WHERE id = ?";
        Object[] params = {user.getUsername(), user.getPassword(), user.getRol(), user.getId()};
        ConnectionManager.ejecutarUpdateSQL(sql, params);
        return true;
    }

    public static boolean eliminarUsuario(long id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        Object[] params = {id};
        ConnectionManager.ejecutarUpdateSQL(sql, params);
        return true;
    }


    public static void crearUsuario(long contador, String nombreUsuario, String contrasenaUsuario, int rolUsuario) {
        User user = new User(contador, nombreUsuario, contrasenaUsuario, rolUsuario);
        usuario.put((int) contador, user);
        contador++;
    }


    public static User validarCredenciales(String nombreUsuario, String password) {

        return validarCredenciales(nombreUsuario, password);
    }
}