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
            User item = UsersDao.obtenerUsuario(id);
            model.put("usuario", usuario);
        }

        context.render("templates/inventario/form-item.ftl", model);
    }

    public static void editarItem(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");
        int cantidad = Integer.parseInt(context.formParam("cantidad"));

        UploadedFile imagen = context.uploadedFile("imagen");
        System.out.println(imagen.toString());

        InventarioDao.actualizarItem(new Item(id, nombre, cantidad));

        context.redirect("/lista-items");
    }

    public static void crearItem(Context context) {
        String nombreItem = context.formParam("nombre");
        int cantidad = Integer.parseInt(context.formParam("cantidad"));
        String textoImagen = "";

        UploadedFile archivo = context.uploadedFile("imagen");
        if (archivo != null) {
            try {
                byte[] contenido = archivo.content().readAllBytes();
                String encodedString = Base64.getEncoder().encodeToString(contenido);
                textoImagen = "data:image/png;base64,"+encodedString;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        InventarioDao.crearItem(nombreItem, cantidad, textoImagen);

        context.redirect("/lista-items");
    }

    public static void eliminarItem(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));
        InventarioDao.eliminarItem(id);
        context.redirect("/lista-items");
    }
}
