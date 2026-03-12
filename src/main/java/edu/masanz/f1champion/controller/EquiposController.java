package edu.masanz.f1champion.controller;

import edu.masanz.f1champion.dao.EquiposDao;
import edu.masanz.f1champion.model.Equipo;
import edu.masanz.f1champion.model.Piloto;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquiposController {

    public static void listarEquipos(Context context) {
        Map<String, Object> model = new HashMap<>();

        List<Equipo> equipos = EquiposDao.obtenerEquipos();

        for (Equipo equipo : equipos) {
            if(equipo.getImagen() == null || equipo.getImagen().trim().isEmpty()){
                equipo.setImagen("/img/Iconos/logooo.png");
            }
        }

        model.put("equipos", equipos);

        context.render("/templates/equipos.ftl", model);
    }

    public static void servirEquipo(Context context) {
        Map<String, Object> model = new HashMap<>();

        int id = Integer.parseInt(context.pathParam("id"));
        Equipo equipo = EquiposDao.obtenerEquipo(id);

        if(equipo.getImagen() == null || equipo.getImagen().trim().isEmpty()){
            equipo.setImagen("/img/Iconos/logooo.png");
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
            System.out.println("nombre = " + nombre);
            context.redirect("/inicio");
        }
        fundador = context.formParam("fundador");
        if (fundador == null || fundador.isEmpty()){
            System.out.println("fundador = " + fundador);
            context.redirect("/inicio");
        }
        nacionalidad = context.formParam("nacionalidad");
        if (nacionalidad == null || nacionalidad.isEmpty()){
            System.out.println("nacionalidad = " + nacionalidad);
            context.redirect("/inicio");
        }
        origen = context.formParam("origen");
        if (origen == null || origen.isEmpty()){
            System.out.println("origen = " + origen);
            context.redirect("/inicio");
        }
        exitos = context.formParam("exitos");
        if (exitos == null || exitos.isEmpty()){
            System.out.println("exitos = " + exitos);
            context.redirect("/inicio");
        }

        EquiposDao.crearEquipo(nombre, fundador, nacionalidad, origen, exitos, "");

        context.redirect("/equipos");
    }

    public static void editarEquipo(Context context) {

        int id = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");
        String fundador = context.formParam("fundador");
        String nacionalidad = context.formParam("nacionalidad");
        String origen = context.formParam("origen");
        String exitos = context.formParam("exitos");

        Equipo equipo = new Equipo();
        equipo.setId(id);
        equipo.setNombre(nombre);
        equipo.setFundador(fundador);
        equipo.setNacionalidad(nacionalidad);
        equipo.setOrigen(origen);
        equipo.setExitos(exitos);

        EquiposDao.actualizarEquipo(equipo);

        context.redirect("/equipos");
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
