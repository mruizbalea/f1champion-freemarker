package edu.masanz.f1champion.model;

public class Piloto {

    private int id;
    private String nombre;
    private int edad;
    private int idEquipo;
    private String imagen;

    public Piloto() {
    }

    public Piloto(int id, String nombre, int edad, int idEquipo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.idEquipo = idEquipo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId_equipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
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
                ", edad=" + edad +
                ", idEquipo=" + idEquipo +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
