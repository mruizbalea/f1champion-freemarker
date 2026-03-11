package edu.masanz.f1champion.dao;

import edu.masanz.f1champion.database.ConnectionManager;
import edu.masanz.f1champion.model.Equipo;

import java.util.ArrayList;
import java.util.List;

public class EquiposDao {

    public static Equipo obtenerEquipo(int idEquipo) {
        String sql = "SELECT id, nombre, fundador, nacionalidad, origen, exitos, textoImagen FROM equipos WHERE id = ?";
        Object[] params = {idEquipo};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

        if (resultado != null && resultado.length == 1) {
            Equipo equipo = new Equipo();

            equipo.setId((Integer) resultado[0][0]);
            equipo.setNombre((String) resultado[0][1]);
            equipo.setFundador((String) resultado[0][2]);
            equipo.setNacionalidad((String) resultado[0][3]);
            equipo.setOrigen((String) resultado[0][4]);
            equipo.setExitos((String) resultado[0][5]);
            equipo.setImagen((String) resultado[0][6]);

            return equipo;
        }
        return null;
    }

    public static List<Equipo> obtenerEquipos() {
        List<Equipo> equipos = new ArrayList<>();

        String sql = "SELECT id, nombre, fundador, nacionalidad, origen, exitos, textoImagen FROM equipos ORDER BY id DESC";
        Object[] params = {};

        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

        if (resultado != null) {
            for (Object[] objects : resultado) {
                Equipo equipo = new Equipo();

                equipo.setId((Integer) objects[0]);
                equipo.setNombre((String) objects[1]);
                equipo.setFundador((String) objects[2]);
                equipo.setNacionalidad((String) objects[3]);
                equipo.setOrigen((String) objects[4]);
                equipo.setExitos((String) objects[5]);
                equipo.setImagen((String) objects[6]);

                equipos.add(equipo);
            }
        }
        return equipos;
    }

    public static void crearEquipo(String nombre, String fundador, String nacionalidad, String origen, String exitos, String imagen) {
        String sql = "INSERT INTO equipos (nombre, fundador, nacionalidad, origen, exitos, textoImagen) VALUES (?, ?, ?, ?, ?, ?)";
        Object[] params = {nombre, fundador, nacionalidad, origen, exitos, imagen};

        long id = ConnectionManager.ejecutarInsertSQL(sql, params);

        if (id > 0) {
            System.out.println("Equipo insertado correctamente");
        } else {
            System.out.println("Error en el insert de equipo");
        }
    }

    public static void actualizarEquipo(Equipo equipo) {
        String sql = "UPDATE equipos SET nombre = ?, fundador = ?, nacionalidad = ?, origen = ?, exitos = ?, textoImagen = ? WHERE id = ?";
        Object[] params = {
                equipo.getNombre(),
                equipo.getFundador(),
                equipo.getNacionalidad(),
                equipo.getOrigen(),
                equipo.getExitos(),
                equipo.getImagen(),
                equipo.getId()
        };

        ConnectionManager.ejecutarUpdateSQL(sql, params);
    }

    public static void eliminarEquipo(int id) {
        String sql = "DELETE FROM equipos WHERE id = ?";
        Object[] params = {id};

        ConnectionManager.ejecutarUpdateSQL(sql, params);
    }
}
