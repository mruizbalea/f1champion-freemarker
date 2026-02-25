package edu.masanz.f1champion;

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

        // PRINCIPAL
        app.get("/", Main::ejemplo);
        app.get("/login/error", Main::error);
        app.get("/inicio", Main::correcto);

    }

    private static void correcto(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();

        context.render("/templates/inicio.ftl");
    }

    private static void error(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();

        context.render("/templates/errorlogin.ftl");
    }

    private static void ejemplo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();

        context.render("/templates/index.ftl");
    }

}