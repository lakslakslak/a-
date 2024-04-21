package ar.edu.unju.fi.ejercicio12;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (DD/MM/YYYY):");
        String fechaString = scanner.nextLine();
        String[] partesFecha = fechaString.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // Restamos 1 porque Calendar.MONTH comienza en 0 para enero
        int anio = Integer.parseInt(partesFecha[2]);
        
        scanner.close();


        // Crear el objeto Persona
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio, mes, dia);
        Persona persona = new Persona(nombre, fechaNacimiento);

        // Mostrar los datos de la persona y los resultados de los métodos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + anio); // Sumamos 1 a mes para mostrar correctamente el mes
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.SignoZodiaco());
        System.out.println("Estación: " + persona.determinarEstacion());
    }
}