package edu.masanz.f1champion.service;


import edu.masanz.f1champion.dao.EquiposDao;
import edu.masanz.f1champion.model.Equipo;

import java.util.List;

public class EquiposService {

    public static Equipo obtenerEquipo(int idEquipo) {
        return EquiposDao.obtenerEquipo(idEquipo);
    }

    public static List<Equipo> obtenerEquipos() {
        return EquiposDao.obtenerEquipos();
    }

    public static void crearEquipo(String nombre, String fundador, String nacionalidad, String origen, String exitos, String imagen) {
        EquiposDao.crearEquipo(nombre, fundador, nacionalidad, origen, exitos, imagen);
    }

    public static void actualizarEquipo(Equipo equipo) {
        EquiposDao.actualizarEquipo(equipo);
    }

    public static void eliminarEquipo(int id) {
        EquiposDao.eliminarEquipo(id);
    }

}
