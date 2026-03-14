package edu.masanz.f1champion.controller;

import edu.masanz.f1champion.dao.EquiposDao;
import edu.masanz.f1champion.model.Equipo;
import edu.masanz.f1champion.model.Piloto;
import edu.masanz.f1champion.service.EquiposService;
import io.javalin.http.Context;
import io.javalin.http.UploadedFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquiposController {

    private static final Logger logger = LogManager.getLogger(EquiposController.class);

    public static void listarEquipos(Context context) {
        Map<String, Object> model = new HashMap<>();

        List<Equipo> equipos = EquiposService.obtenerEquipos();

        for (Equipo equipo : equipos) {
            if(equipo.getImagen() == null || equipo.getImagen().trim().isEmpty()){
                equipo.setImagen("logooo.png");
            }
        }

        model.put("equipos", equipos);

        context.render("/templates/equipos.ftl", model);
    }

    public static void servirEquipo(Context context) {
        Map<String, Object> model = new HashMap<>();

        int id = Integer.parseInt(context.pathParam("id"));
        Equipo equipo = EquiposService.obtenerEquipo(id);

        if(equipo.getImagen() == null || equipo.getImagen().trim().isEmpty()){
            equipo.setImagen("logooo.png");
        }

        model.put("equipo", equipo);

        context.render("/templates/equipo.ftl", model);
    }

    public static void crearEquipo(Context context) {

        String nombre = "";
        String fundador = "";
        String nacionalidad = "";
        String origen = "";
        String exitos = "";

        nombre = context.formParam("nombre");
        if (nombre == null || nombre.isEmpty()){
            logger.info("nombre = " + nombre);
            context.redirect("/inicio");
        }
        fundador = context.formParam("fundador");
        if (fundador == null || fundador.isEmpty()){
            logger.info("fundador = " + fundador);
            context.redirect("/inicio");
        }
        nacionalidad = context.formParam("nacionalidad");
        if (nacionalidad == null || nacionalidad.isEmpty()){
            logger.info("nacionalidad = " + nacionalidad);
            context.redirect("/inicio");
        }
        origen = context.formParam("origen");
        if (origen == null || origen.isEmpty()){
            logger.info("origen = " + origen);
            context.redirect("/inicio");
        }
        exitos = context.formParam("exitos");
        if (exitos == null || exitos.isEmpty()){
            logger.info("exitos = " + exitos);
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

        EquiposService.crearEquipo(nombre, fundador, nacionalidad, origen, exitos, nombreImagenFinal);

        context.redirect("/equipos");
    }

    public static void editarEquipo(Context context) {

        int id = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");
        String fundador = context.formParam("fundador");
        String nacionalidad = context.formParam("nacionalidad");
        String origen = context.formParam("origen");
        String exitos = context.formParam("exitos");


        String imagenActual = context.formParam("imagenActual");

        UploadedFile imagen = context.uploadedFile("imagen");
        String nombreImagenFinal;

        if (imagen != null && !imagen.filename().isEmpty()) {
            nombreImagenFinal = imagen.filename();
        } else {
            nombreImagenFinal = imagenActual;
        }

        Equipo equipo = new Equipo();
        equipo.setId(id);
        equipo.setNombre(nombre);
        equipo.setFundador(fundador);
        equipo.setNacionalidad(nacionalidad);
        equipo.setOrigen(origen);
        equipo.setExitos(exitos);
        equipo.setImagen(nombreImagenFinal);

        EquiposService.actualizarEquipo(equipo);

        context.redirect("/equipos");
    }

    public static void eliminarEquipo(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));

        EquiposService.eliminarEquipo(id);

        context.redirect("/equipos");
    }

    public static void formularioEquipo(@NotNull Context context) {

        Map<String, Object> model = new HashMap<>();

        Map<String, String> pathParams = context.pathParamMap();
        if(pathParams.containsKey("id")){
            int id = Integer.parseInt(context.pathParam("id"));
            Equipo equipo = EquiposService.obtenerEquipo(id);
            model.put("equipo", equipo);
        }

        context.render("/templates/editar-equipo.ftl", model);

    }
}
