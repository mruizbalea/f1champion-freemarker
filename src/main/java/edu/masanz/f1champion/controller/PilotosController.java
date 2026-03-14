package edu.masanz.f1champion.controller;

import edu.masanz.f1champion.Main;
import edu.masanz.f1champion.dao.PilotosDao;
import edu.masanz.f1champion.model.Piloto;
import edu.masanz.f1champion.service.PilotosService;
import io.javalin.http.Context;
import io.javalin.http.UploadedFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.*;

public class PilotosController {

    private static final Logger logger = LogManager.getLogger(PilotosController.class);

    public static void listarPilotos(Context context) {
        Map<String, Object> model = new HashMap<>();

        List<Piloto> pilotos = PilotosService.obtenerPilotos();

        for (Piloto piloto : pilotos) {
            if(piloto.getImagen() == null || piloto.getImagen().trim().isEmpty()){
                piloto.setImagen("pilotoHD.jpg");
            }
        }

        model.put("pilotos", pilotos);

        context.render("/templates/pilotos.ftl", model);
    }

    public static void servirPiloto(Context context) {
        Map<String, Object> model = new HashMap<>();

        int id = Integer.parseInt(context.pathParam("id"));
        Piloto piloto = PilotosService.obtenerPiloto(id);

        if(piloto.getImagen() == null || piloto.getImagen().trim().isEmpty()){
            piloto.setImagen("pilotoHD.jpg");
        }

        model.put("piloto", piloto);

        context.render("/templates/piloto.ftl", model);
    }

    public static void crearPiloto(Context context) {

        String nombre = "";
        int edad = 0;
        int victorias = 0;
        int idEquipo = 0;

        nombre = context.formParam("nombre");
        if (nombre == null || nombre.isEmpty()){
            logger.info("nombre = " + nombre);
            context.redirect("/inicio");
        }
        try {
            edad = Integer.parseInt(context.formParam("edad"));
            victorias = Integer.parseInt(context.formParam("victorias"));
            idEquipo = Integer.parseInt(context.formParam("idEquipo"));
        } catch (Exception e) {

            context.redirect("/inicio");
        }

        String imagenActual = context.formParam("imagenActual");

        UploadedFile imagen = context.uploadedFile("imagen");
        String nombreImagenFinal;

        if (imagen != null && !imagen.filename().isEmpty()) {
            nombreImagenFinal = imagen.filename();
        } else {
            nombreImagenFinal = imagenActual;
        }



        PilotosService.crearPiloto(nombre, edad, victorias, idEquipo, nombreImagenFinal);

        context.redirect("/pilotos");
    }

    public static void editarPiloto(Context context) {

        int id = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");
        int edad = Integer.parseInt(context.formParam("edad"));
        int victorias = Integer.parseInt(context.formParam("victorias"));
        int idEquipo = Integer.parseInt(context.formParam("idEquipo"));

        String imagenActual = context.formParam("imagenActual");

        UploadedFile imagen = context.uploadedFile("imagen");
        String nombreImagenFinal;

        if (imagen != null && !imagen.filename().isEmpty()) {
            nombreImagenFinal = imagen.filename();
        } else {
            nombreImagenFinal = imagenActual;
        }


        Piloto piloto = new Piloto();
        piloto.setId(id);
        piloto.setNombre(nombre);
        piloto.setEdad(edad);
        piloto.setVictorias(victorias);
        piloto.setIdEquipo(idEquipo);
        piloto.setImagen(nombreImagenFinal);

        PilotosService.actualizarPiloto(piloto);

        context.redirect("/pilotos");
    }

    public static void eliminarPiloto(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));

        PilotosService.eliminarPiloto(id);

        context.redirect("/pilotos");
    }

    public static void formularioPiloto(@NotNull Context context) {

        Map<String, Object> model = new HashMap<>();

        Map<String, String> pathParams = context.pathParamMap();
        if(pathParams.containsKey("id")){
            int id = Integer.parseInt(context.pathParam("id"));
            Piloto piloto = PilotosService.obtenerPiloto(id);
            model.put("piloto", piloto);
        }

        context.render("/templates/editar-piloto.ftl", model);

    }
}
