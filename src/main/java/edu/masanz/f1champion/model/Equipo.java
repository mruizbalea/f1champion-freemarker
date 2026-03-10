package edu.masanz.f1champion.model;

public class Equipo {

    private int id;
    private String nombre;
    private String fundador;
    private String nacionalidad;
    private String origen;
    private String exitos;
    private String imagen;

    public Equipo() {
    }

    public Equipo(int id, String nombre, String fundador, String nacionalidad, String origen, String exitos) {
        this.id = id;
        this.nombre = nombre;
        this.fundador = fundador;
        this.nacionalidad = nacionalidad;
        this.origen = origen;
        this.exitos = exitos;
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

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getExitos() {
        return exitos;
    }

    public void setExitos(String exitos) {
        this.exitos = exitos;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fundador='" + fundador + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", origen='" + origen + '\'' +
                ", exitos='" + exitos + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
