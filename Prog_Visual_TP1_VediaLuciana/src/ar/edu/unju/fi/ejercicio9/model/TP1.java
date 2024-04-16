package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
    // Atributos
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento; // Valor entre [0, 50]

    // Constructor por defecto
    public Producto() {
    }

    // Métodos accesores para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    //calcular el descuento
    public double calcularDescuento() {
        if (descuento > 0 && descuento <= 50) {
            double descuentoAplicado = precio * descuento / 100.0;
            return precio - descuentoAplicado;
        } else {
            return precio;
        }
    }
}