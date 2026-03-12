package edu.masanz.f1champion.controller;

import edu.masanz.f1champion.Main;
import edu.masanz.f1champion.dao.PilotosDao;
import edu.masanz.f1champion.model.Piloto;
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

        List<Piloto> pilotos = PilotosDao.obtenerPilotos();

        for (Piloto piloto : pilotos) {
            if(piloto.getImagen() == null || piloto.getImagen().trim().isEmpty()){
                piloto.setImagen("/img/Iconos/pilotoHD.jpg");
            }
        }

        model.put("pilotos", pilotos);

        context.render("/templates/pilotos.ftl", model);
    }

    public static void servirPiloto(Context context) {
        Map<String, Object> model = new HashMap<>();

        int id = Integer.parseInt(context.pathParam("id"));
        Piloto piloto = PilotosDao.obtenerPiloto(id);

        if(piloto.getImagen() == null || piloto.getImagen().trim().isEmpty()){
            piloto.setImagen("/img/Iconos/pilotoHD.jpg");
        }

        model.put("piloto", piloto);

        context.render("/templates/piloto.ftl", model);
    }

    public static void crearPiloto(Context context) {

        String nombre = "";
        int edad = 0;
        int victorias = 0;
        int idEquipo = 0;
        String textoImagen = "";

        nombre = context.formParam("nombre");
        if (nombre == null || nombre.isEmpty()){
            System.out.println("nombre = " + nombre);
            context.redirect("/inicio");
        }
        try {
            edad = Integer.parseInt(context.formParam("edad"));
            victorias = Integer.parseInt(context.formParam("victorias"));
            idEquipo = Integer.parseInt(context.formParam("idEquipo"));
        } catch (Exception e) {

            context.redirect("/inicio");
        }

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


        PilotosDao.crearPiloto(nombre, edad, victorias, idEquipo, textoImagen);

        context.redirect("/pilotos");
    }

    public static void editarPiloto(Context context) {

        int id = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");
        int edad = Integer.parseInt(context.formParam("edad"));
        int victorias = Integer.parseInt(context.formParam("victorias"));
        int idEquipo = Integer.parseInt(context.formParam("idEquipo"));
        UploadedFile imagen = context.uploadedFile("imagen");


        Piloto piloto = new Piloto();
        piloto.setId(id);
        piloto.setNombre(nombre);
        piloto.setEdad(edad);
        piloto.setVictorias(victorias);
        piloto.setIdEquipo(idEquipo);
        piloto.setImagen(imagen.toString());

        PilotosDao.actualizarPiloto(piloto);

        context.redirect("/pilotos");
    }

    public static void eliminarPiloto(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));

        PilotosDao.eliminarPiloto(id);

        context.redirect("/pilotos");
    }

    public static void formularioPiloto(@NotNull Context context) {

        Map<String, Object> model = new HashMap<>();

        Map<String, String> pathParams = context.pathParamMap();
        if(pathParams.containsKey("id")){
            int id = Integer.parseInt(context.pathParam("id"));
            Piloto piloto = PilotosDao.obtenerPiloto(id);
            model.put("piloto", piloto);
        }

        context.render("/templates/editar-piloto.ftl", model);

    }
}
