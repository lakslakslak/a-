package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamaño;
        do {
            System.out.print("Ingrese un número entero en el rango [5, 10]: ");
            tamaño = scanner.nextInt();
        } while (tamaño < 5 || tamaño > 10);


        String[] nombres = new String[tamaño];

        // Solicitar nombres de personas
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el nombre de la persona: ");
            nombres[i] = scanner.next();
        }

        // Mostrar comenzando desde el primer índice (0)
        System.out.println("\nContenido del array (comenzando desde el primer índice):");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Índice " + i + ": " + nombres[i]);
        }

        // Mostrar comenzando desde el último índice
        System.out.println("\nContenido del array (comenzando desde el último índice):");
        for (int i = tamaño - 1; i >= 0; i--) {
            System.out.println("Índice " + i + ": " + nombres[i]);
        }

        scanner.close();
    }
}
