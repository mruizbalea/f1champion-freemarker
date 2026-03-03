package edu.masanz.f1champion.model;

public class Piloto {

    private int id;
    private String nombre;
    private int edad;
    private int id_equipo;
    private String imagen;

    public Piloto() {
    }

    public Piloto(int id, String nombre, int edad, int id_equipo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.id_equipo = id_equipo;
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
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
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
                ", id_equipo=" + id_equipo +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
