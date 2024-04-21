package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamaño;
        do {
            System.out.print("Ingrese un número entero en el rango [3, 10]: ");
            tamaño = scanner.nextInt();
        } while (tamaño < 3 || tamaño > 10);

        int[] array = new int[tamaño];

        // Solicitar al usuario que ingrese valores
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese un número entero: ");
            array[i] = scanner.nextInt();
        }

        // Mostrar el valor de cada posición
        System.out.println("Valores ingresados:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }

        // Calcular la suma de todos los valores del array
        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            suma += array[i];
        }

        // Mostrar la suma de todos los valores del array
        System.out.println("Suma de todos los valores: " + suma);

        scanner.close();
    }
}
