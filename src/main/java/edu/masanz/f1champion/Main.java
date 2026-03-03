package edu.masanz.f1champion;

import edu.masanz.f1champion.controller.UsersController;
import edu.masanz.f1champion.controller.FiltroController;
import edu.masanz.f1champion.database.ConnectionManager;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.rendering.template.JavalinFreemarker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("ARRANCANDO APLICACION");

        ConnectionManager.conectar("nombredelabase", "root", "roo7");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public");
            config.fileRenderer(new JavalinFreemarker());
        }).start(8080);

        //app.before("/*", FiltroController::filtroBefore);


        app.get("/login", UsersController::accederLogin);
        app.post("/login", UsersController::login);
        app.get("/inicio", UsersController::accederInicio);
        app.get("/grand-prix", UsersController::accederGrandPrix);
        app.get("/equipos", UsersController::accederEquipos);
        app.get("/clasificacion", UsersController::accederClasificacion);


        // PRINCIPAL
        app.get("/", UsersController::accederLogin);
        // app.get("/lista-usuarios", UsersController::listarUsuario);
        app.get("/edita-usuario/{id}", UsersController::servirUsuario);
        app.post("/edita-usuario/{id}", UsersController::editarUsuario);
        // app.get("/crea-usuario", UsersController::crearUsuario);
        // app.post("/crea-usuario", UsersController::crearUsuario);
        app.get("/elimina-usuario/{id}", UsersController::eliminarUsuario);

        app.after("*", FiltroController::filtroAfter);

    }
}