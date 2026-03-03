package edu.masanz.f1champion.controller;

import edu.masanz.f1champion.dao.PilotosDao;
import edu.masanz.f1champion.model.Piloto;
import io.javalin.http.Context;
import io.javalin.http.UploadedFile;

import java.io.IOException;
import java.util.*;

public class PilotosController {

    public static void listarPilotos(Context context) {
        Map<String, Object> model = new HashMap<>();

        List<Piloto> pilotos = PilotosDao.obtenerPilotos();

        model.put("pilotos", pilotos);

        context.render("/templates/pilotos.ftl", model);
    }

    public static void servirPiloto(Context context) {
        Map<String, Object> model = new HashMap<>();

        int id = Integer.parseInt(context.pathParam("id"));
        Piloto piloto = PilotosDao.obtenerPiloto(id);

        model.put("piloto", piloto);

        context.render("/templates/piloto.ftl", model);
    }

    public static void crearPiloto(Context context) {

        String nombre = context.formParam("nombre");
        int edad = Integer.parseInt(context.formParam("edad"));
        int idEquipo = Integer.parseInt(context.formParam("id_equipo"));

        PilotosDao.crearPiloto(nombre, edad, idEquipo, "");

        context.redirect("/templates/lista-pilotos");
    }

    public static void editarPiloto(Context context) {

        int id = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");
        int edad = Integer.parseInt(context.formParam("edad"));
        int idEquipo = Integer.parseInt(context.formParam("id_equipo"));

        Piloto piloto = new Piloto();
        piloto.setId(id);
        piloto.setNombre(nombre);
        piloto.setEdad(edad);
        piloto.setId_equipo(idEquipo);

        PilotosDao.actualizarPiloto(piloto);

        context.redirect("/templates/lista-pilotos");
    }

    public static void eliminarPiloto(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));

        PilotosDao.eliminarPiloto(id);

        context.redirect("/templates/lista-pilotos");
    }
}
