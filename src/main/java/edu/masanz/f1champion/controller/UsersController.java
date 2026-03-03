package edu.masanz.f1champion.controller;

import edu.masanz.f1champion.dao.UsersDao;
import edu.masanz.f1champion.model.User;
import io.javalin.http.Context;
import io.javalin.http.UploadedFile;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static edu.masanz.f1champion.dao.UsersDao.usuario;

public class UsersController {

    public static boolean AUTENTICADO = false;
    // private static NotaService notaService = new NotaService();

    public static void accederLogin(@NotNull Context context) {

        context.render("/templates/login.ftl");
    }

    public static void accederGrandPrix(@NotNull Context context) {

        context.render("/templates/grandprix.ftl");
    }

    public static void accederEquipos(@NotNull Context context) {

        context.render("/templates/equipos.ftl");
    }

    public static void accederClasificacion(@NotNull Context context) {

        context.render("/templates/clasificacion.ftl");
    }

    public static void accederInicio(@NotNull Context context) {

        context.render("/templates/inicio.ftl");
    }


    public static void login(@NotNull Context context) {

        String username = context.formParam("username");
        String password = context.formParam("password");

        if (username.equals("admin") && password.equals("admin")) {
            AUTENTICADO = true;
            context.redirect("/inicio");
        } else {
            context.redirect("/login");
        }

    }
/*
    public static void servirLista(Context context){
        Map<String, Object> model = new HashMap<>();
        Integer numeroPagina = 1;
        try {
            numeroPagina = Integer.parseInt(context.queryParam("pagina"));
        } catch (NumberFormatException e) { }
        int numeroNotas = notaService.obtenerNumeroNotas();
        Boolean tieneAnterior = numeroPagina > 1;
        Boolean tieneSiguiente = (numeroPagina * NOTAS_POR_PAGINA) < numeroNotas;

        model.put("numeroPagina", numeroPagina);
        model.put("tieneAnterior", tieneAnterior);
        model.put("paginaAnterior", numeroPagina - 1);
        model.put("tieneSiguiente", tieneSiguiente);
        model.put("paginaSiguiente", numeroPagina + 1);

        // me llega un array list de tipo NOTA
        model.put("notas", notaService.obtenerNotas(numeroPagina, NOTAS_POR_PAGINA));

        context.render("templates/lista-notas.ftl", model);
    }

    public static void listarUsuario(Context context) {
        Map<String, Object> model = new HashMap<>();

        List<User> usuarios = UsersDao.obtenerUsuarios();
        model.put("usuarios", usuarios);

        context.render("templates/login.ftl", model);
    }
*/
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

    public static void eliminarUsuario(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));
        UsersDao.eliminarUsuario(id);
        context.redirect("/lista-items");
    }


}
