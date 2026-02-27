package edu.masanz.f1champion.controller;

import edu.masanz.f1champion.dao.UsersDao;
import edu.masanz.f1champion.model.User;
import io.javalin.http.Context;
import io.javalin.http.UploadedFile;

import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static edu.masanz.f1champion.dao.UsersDao.usuario;

public class UsersController {

    public static void listarUsuario(Context context) {
        Map<String, Object> model = new HashMap<>();

        List<User> usuarios = UsersDao.obtenerUsuarios();
        model.put("usuarios", usuarios);

        context.render("templates/login.ftl", model);
    }

    public static void servirUsuario(Context context) {
        Map<String, Object> model = new HashMap<>();

        Map<String, String> pathParams = context.pathParamMap();
        if(pathParams.containsKey("id")){
            int id = Integer.parseInt(context.pathParam("id"));
            User usuario = UsersDao.obtenerUsuario(id);
            model.put("usuario", usuario);
        }

        context.render("templates/inventario/form-item.ftl", model);
    }

    public static void editarUsuario(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");
        String password = context.formParam("password");
        int rol = Integer.parseInt(context.pathParam("rol"));

        UsersDao.actualizarUsuario(new User((long) id, nombre, password, rol));

        context.redirect("/lista-items");
    }

    public static void crearUsuario(Context context) {
        String nombreUsuario = context.formParam("nombre");
        String contrasenaUsuario = context.formParam("contraseña");
        int rolUsuario = Integer.parseInt(context.pathParam("rol"));

        UsersDao.crearUsuario(nombreUsuario, contrasenaUsuario, rolUsuario);

        context.redirect("/lista-items");
    }

    public static void eliminarUsuario(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));
        UsersDao.eliminarUsuario(id);
        context.redirect("/lista-items");
    }

    public static void irAInicio(Context context){


        context.render("/inicio");
    }
}
