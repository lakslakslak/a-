package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico implements Comparable<DestinoTuristico> {
    private String nombre;
    private double precio;
    private Pais pais;
    private int cantidadDias;

    public DestinoTuristico(String nombre, double precio, Pais pais, int cantidadDias) {
        this.nombre = nombre;
        this.precio = precio;
        this.pais = pais;
        this.cantidadDias = cantidadDias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    @Override
    public int compareTo(DestinoTuristico otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return "DestinoTuristico{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", pais=" + pais +
                ", cantidadDias=" + cantidadDias +
                '}';
    }
}
