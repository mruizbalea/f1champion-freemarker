package edu.masanz.f1champion;

import edu.masanz.f1champion.controller.EquiposController;
import edu.masanz.f1champion.controller.PilotosController;
import edu.masanz.f1champion.controller.UsersController;
import edu.masanz.f1champion.controller.FiltroController;
import edu.masanz.f1champion.dao.PilotosDao;
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

        ConnectionManager.conectar("f1_db", "root", "roo7");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public");
            config.fileRenderer(new JavalinFreemarker());
        }).start(8080);

        // app.before("/*", FiltroController::filtroBefore);

        // PRINCIPAL
        app.get("/", UsersController::accederLogin);
        app.get("/login", UsersController::accederLogin);
        app.post("/login", UsersController::login);
        app.get("/inicio", UsersController::accederInicio);


        // PILOTOS
        app.get("/pilotos", PilotosController::listarPilotos);
        app.get("/piloto/{id}", PilotosController::servirPiloto);
        app.post("/crear-piloto", PilotosController::crearPiloto);
        app.get("/crear-piloto", PilotosController::formularioPiloto);
        app.post("/piloto/editar/{id}", PilotosController::editarPiloto);
        app.get("/piloto/editar/{id}", PilotosController::formularioPiloto);
        app.get("/piloto/eliminar/{id}", PilotosController::eliminarPiloto);


        // EQUIPOS
        app.get("/equipos", EquiposController::listarEquipos);
        app.get("/equipo/{id}", EquiposController::servirEquipo);
        app.post("/crear-equipo", EquiposController::crearEquipo);
        app.get("/crear-equipo", EquiposController::formularioEquipo);
        app.post("/equipo/editar/{id}", EquiposController::editarEquipo);
        app.get("/equipo/editar/{id}", EquiposController::formularioEquipo);
        app.get("/equipo/eliminar/{id}", EquiposController::eliminarEquipo);

        // CLASIFICACION
        app.get("/clasificacion", UsersController::accederClasificacion);


        app.after("*", FiltroController::filtroAfter);

    }
}