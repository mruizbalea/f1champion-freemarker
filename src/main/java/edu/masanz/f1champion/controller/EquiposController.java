package edu.masanz.f1champion.controller;

import edu.masanz.f1champion.dao.EquiposDao;
import edu.masanz.f1champion.model.Equipo;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquiposController {

    public static void listarEquipos(Context context) {
        Map<String, Object> model = new HashMap<>();

        List<Equipo> equipos = EquiposDao.obtenerEquipos();

        model.put("equipos", equipos);

        context.render("/templates/equipos.ftl", model);
    }

    public static void servirEquipo(Context context) {
        Map<String, Object> model = new HashMap<>();

        int id = Integer.parseInt(context.pathParam("id"));
        Equipo equipo = EquiposDao.obtenerEquipo(id);

        model.put("equipo", equipo);

        context.render("/templates/equipo.ftl", model);
    }

    public static void crearEquipo(Context context) {

        String nombre = "";

        nombre = context.formParam("nombre");
        if (nombre == null || nombre.isEmpty()){
            System.out.println("nombre = " + nombre);
            context.redirect("/inicio");
        }

        EquiposDao.crearEquipo(nombre, "");

        context.redirect("/equipos");
    }

    public static void editarEquipo(Context context) {

        int id = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");

        Equipo equipo = new Equipo();
        equipo.setId(id);
        equipo.setNombre(nombre);

        EquiposDao.actualizarEquipo(equipo);

        context.redirect("/lista-equipos");
    }

    public static void eliminarEquipo(Context context) {
        int id = Integer.parseInt(context.pathParam("id"));

        EquiposDao.eliminarEquipo(id);

        context.redirect("/equipos");
    }

    public static void formularioEquipo(@NotNull Context context) {

        Map<String, Object> model = new HashMap<>();

        Map<String, String> pathParams = context.pathParamMap();
        if(pathParams.containsKey("id")){
            int id = Integer.parseInt(context.pathParam("id"));
            Equipo equipo = EquiposDao.obtenerEquipo(id);
            model.put("equipo", equipo);
        }

        context.render("/templates/editar-equipo.ftl", model);

    }
}
