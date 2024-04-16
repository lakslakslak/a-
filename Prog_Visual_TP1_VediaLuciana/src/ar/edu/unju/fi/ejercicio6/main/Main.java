package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de objeto utilizando el constructor por defecto
        System.out.println("Creación de persona utilizando constructor por defecto:");
        Persona persona1 = new Persona();
        ingresarDatosPersona(scanner, persona1);
        persona1.mostrarDatos();

        System.out.println();

        // Creación de objeto utilizando el constructor parametrizado
        System.out.println("Creación de persona utilizando constructor parametrizado:");
        Persona persona2 = crearPersonaParametrizada(scanner);
        persona2.mostrarDatos();

        System.out.println();

        // Creación de objeto utilizando el constructor con dni, nombre y fecha de nacimiento
        System.out.println("Creación de persona utilizando constructor con dni, nombre y fecha de nacimiento:");
        Persona persona3 = crearPersonaConDniNombreFechaNacimiento(scanner);
        persona3.mostrarDatos();

        scanner.close();
    }

    // Método para ingresar datos de persona
    private static void ingresarDatosPersona(Scanner scanner, Persona persona) {
        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();
        persona.setDni(dni);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        persona.setNombre(nombre);

        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        persona.setFechaNacimiento(fechaNacimiento);
    }

    // Método para crear persona utilizando constructor parametrizado
    private static Persona crearPersonaParametrizada(Scanner scanner) {
        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());

        System.out.print("Ingrese la provincia: ");
        String provincia = scanner.nextLine();

        return new Persona(dni, nombre, fechaNacimiento, provincia);
    }

    // Método para crear persona utilizando constructor con dni, nombre y fecha de nacimiento
    private static Persona crearPersonaConDniNombreFechaNacimiento(Scanner scanner) {
        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());

        return new Persona(dni, nombre, fechaNacimiento);
    }
}