package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos del empleado
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el legajo del empleado:");
        int legajo = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el salario del empleado:");
        double salario = Double.parseDouble(scanner.nextLine());

        // Crear un objeto Empleado utilizando el constructor parametrizado
        Empleado empleado = new Empleado(nombre, legajo, salario);

        // Mostrar los datos del empleado
        System.out.println("\nDatos del empleado:");
        empleado.mostrarDatos();

     // Dar un aumento al salario del empleado
        empleado.darAumento();

        // Mostrar los datos del empleado después del aumento
        System.out.println("\nDatos del empleado después del aumento:");
        empleado.mostrarDatos();

        scanner.close();
        }
}