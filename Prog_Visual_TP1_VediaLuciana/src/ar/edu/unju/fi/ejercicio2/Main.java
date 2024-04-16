package ar.edu.unju.fi.ejercicio2;

/*Declare variables que permitan almacenar los siguientes datos en el lenguaje Java:
 El nombre de un país.
 La edad de una persona.
 La altura de un edificio.
 El precio de un producto de supermercado.
 Número de teléfono.
 El cálculo de coseno de 0.5
Asigne valores a cada variable y muéstrelas por consola.*/

public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        String nombrePais;
        int edadPersona;
        double alturaEdificio;
        double precioProducto;
        String numeroTelefono;
        double cosenoDeCinco;

        // Asignación de valores
        nombrePais = "Argentina";
        edadPersona = 30;
        alturaEdificio = 50.5; // en metros
        precioProducto = 500; // en pesos
        numeroTelefono = "+54 11 223344";
        cosenoDeCinco = Math.cos(0.5);

        // Mostrar variables por consola
        System.out.println("País: " + nombrePais);
        System.out.println("Edad: " + edadPersona + " años");
        System.out.println("Altura del edificio: " + alturaEdificio + " metros");
        System.out.println("Precio del producto: " + precioProducto + " pesos");
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Coseno de 0.5: " + cosenoDeCinco);
    }
}