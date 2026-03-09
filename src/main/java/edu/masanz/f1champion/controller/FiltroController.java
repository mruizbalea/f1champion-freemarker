package edu.masanz.f1champion.controller;


import edu.masanz.f1champion.Main;
import io.javalin.http.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;



public class FiltroController {

    private static final Logger logger = LogManager.getLogger(FiltroController.class);

    public static void filtroBefore(@NotNull Context context) {
        if (!context.path().equals("/login") && !UsersController.AUTENTICADO){
            context.redirect("/login");
        }
    }

    public static void filtroAfter(@NotNull Context context) {

        logger.info("Filtro after");
        logger.info(context.path());

    }
}
