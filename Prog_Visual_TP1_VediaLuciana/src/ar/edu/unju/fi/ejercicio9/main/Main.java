package ar.edu.unju.fi.ejercicio9.main;

import ar.edu.unju.fi.ejercicio9.model.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear 3 objetos de la clase Producto
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del producto " + i + ":");
            Producto producto = crearProducto(scanner);
            mostrarDatosProducto(producto);
        }

        scanner.close();
    }

    // solicitar datos de un producto y crear un objeto Producto
    private static Producto crearProducto(Scanner scanner) {
        Producto producto = new Producto();

        System.out.print("Nombre: ");
        producto.setNombre(scanner.nextLine());

        System.out.print("Código: ");
        producto.setCodigo(scanner.nextLine());

        System.out.print("Precio: ");
        producto.setPrecio(Double.parseDouble(scanner.nextLine()));

        System.out.print("Descuento (%): ");
        producto.setDescuento(Integer.parseInt(scanner.nextLine()));

        return producto;
    }

    // mostrar los datos de un producto y el descuento aplicado
    private static void mostrarDatosProducto(Producto producto) {
        System.out.println("\nDatos del producto:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Descuento (%): " + producto.getDescuento());
        System.out.println("Precio con descuento: $" + producto.calcularDescuento());
    }
}