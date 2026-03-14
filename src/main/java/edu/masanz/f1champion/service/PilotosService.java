package edu.masanz.f1champion.service;

import edu.masanz.f1champion.dao.PilotosDao;
import edu.masanz.f1champion.model.Piloto;

import java.util.List;

public class PilotosService {

    public static Piloto obtenerPiloto(int idPiloto) {
        return PilotosDao.obtenerPiloto(idPiloto);
    }

    public static List<Piloto> obtenerPilotos() {
        return PilotosDao.obtenerPilotos();
    }

    public static void crearPiloto(String nombre, int edad, int victorias, int idEquipo, String imagen) {
        PilotosDao.crearPiloto(nombre, edad, victorias, idEquipo, imagen);
    }

    public static void actualizarPiloto(Piloto piloto) {
        PilotosDao.actualizarPiloto(piloto);
    }

    public static void eliminarPiloto(int id) {
        PilotosDao.eliminarPiloto(id);
    }
}
