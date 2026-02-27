package edu.masanz.f1champion.model;

public class Piloto {

    private int id;
    private String nombre;
    private Equipo equipo;
    private String imagen;

    public Piloto(int id, String nombre, Equipo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.imagen = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo=" + equipo +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
