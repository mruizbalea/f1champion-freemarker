package edu.masanz.f1champion.controller;

import edu.masanz.f1champion.dao.PilotosDao;
import edu.masanz.f1champion.model.Piloto;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersController {

    public static boolean AUTENTICADO = false;

    public static void accederLogin(@NotNull Context context) {

        context.render("/templates/login.ftl");
    }

    public static void accederInicio(@NotNull Context context) {

        context.render("/templates/inicio.ftl");
    }

    public static void accederClasificacion(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();

        List<Piloto> pilotos = PilotosDao.obtenerPilotos();

        model.put("pilotos", pilotos);

        context.render("/templates/clasificacion.ftl", model);
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
}
