package ar.edu.unju.fi.ejercicio5;

/*Declare las variables necesarias para solicitar al usuario que ingrese por consola un número
entero que esté comprendido entre [1,9], mostrar por consola la tabla de multiplicar
correspondiente al número ingresado. (usar la estructura de control iterativa for)*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            // Solicitar al usuario que ingrese un número entre 1 y 9
            System.out.println("Ingrese un número entre 1 y 9:");
            numero = scanner.nextInt();

            // Verificar si el número está dentro del rango [1, 9]
            if (numero < 1 || numero > 9) {
                System.out.println("El número debe estar dentro del rango [1, 9]. Inténtelo de nuevo.");
            }
        } while (numero < 1 || numero > 9);

        // Mostrar la tabla de multiplicar correspondiente 
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}