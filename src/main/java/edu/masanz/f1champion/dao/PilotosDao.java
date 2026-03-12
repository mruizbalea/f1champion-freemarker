package edu.masanz.f1champion.dao;

import edu.masanz.f1champion.database.ConnectionManager;
import edu.masanz.f1champion.model.Piloto;

import java.util.ArrayList;
import java.util.List;

public class PilotosDao {

    public static Piloto obtenerPiloto(int idPiloto) {
        String sql = "SELECT id, nombre, edad, victorias, id_equipo, textoImagen FROM pilotos WHERE id = ?";
        Object[] params = {idPiloto};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

        if (resultado != null && resultado.length == 1) {
            Piloto piloto = new Piloto();

            piloto.setId((Integer) resultado[0][0]);
            piloto.setNombre((String) resultado[0][1]);
            piloto.setEdad((Integer) resultado[0][2]);
            piloto.setVictorias((Integer) resultado[0][3]);
            piloto.setIdEquipo((Integer) resultado[0][4]);
            piloto.setImagen((String) resultado[0][5]);

            return piloto;
        }
        return null;
    }

    public static List<Piloto> obtenerPilotos() {
        List<Piloto> pilotos = new ArrayList<>();

        String sql = "SELECT id, nombre, edad, victorias, id_equipo, textoImagen FROM pilotos ORDER BY id DESC";
        Object[] params = {};

        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

        if (resultado != null) {
            for (Object[] objects : resultado) {
                Piloto piloto = new Piloto();

                piloto.setId((Integer) objects[0]);
                piloto.setNombre((String) objects[1]);
                piloto.setEdad((Integer) objects[2]);
                piloto.setVictorias((Integer) objects[3]);
                piloto.setIdEquipo((Integer) objects[4]);
                piloto.setImagen((String) objects[5]);

                pilotos.add(piloto);
            }
        }
        return pilotos;
    }

    public static void crearPiloto(String nombre, int edad, int victorias, int idEquipo, String imagen) {
        String sql = "INSERT INTO pilotos (nombre, edad, victorias, id_equipo, textoImagen) VALUES (?, ?, ?, ?, ?)";
        Object[] params = {nombre, edad, victorias, idEquipo, imagen};

        long id = ConnectionManager.ejecutarInsertSQL(sql, params);

        if (id > 0) {
            System.out.println("Piloto insertado correctamente");
        } else {
            System.out.println("Error en el insert de piloto");
        }
    }

    public static void actualizarPiloto(Piloto piloto) {
        String sql = "UPDATE pilotos SET nombre = ?, edad = ?, victorias = ?, id_equipo = ?, textoImagen = ? WHERE id = ?";
        Object[] params = {
                piloto.getNombre(),
                piloto.getEdad(),
                piloto.getVictorias(),
                piloto.getIdEquipo(),
                piloto.getImagen(),
                piloto.getId()
        };

        ConnectionManager.ejecutarUpdateSQL(sql, params);
    }

    public static void eliminarPiloto(int id) {
        String sql = "DELETE FROM pilotos WHERE id = ?";
        Object[] params = {id};

        ConnectionManager.ejecutarUpdateSQL(sql, params);
    }
}
