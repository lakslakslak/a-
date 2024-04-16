package ar.edu.unju.fi.ejercicio4;

/*Declare las variables necesarias para:
realizar el cálculo del factorial de un número que se introduce
por consola y está dentro del rango numérico [0,10]. Utilice una estructura de control iterativa While
para resolver el ejercicio. Muestre el resultado por consola.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            // Solicitar al usuario un número entre 0 y 10
            System.out.println("Ingrese un número entre 0 y 10:");
            numero = scanner.nextInt();

            // Verificar si el número está dentro del rango [0, 10]
            if (numero < 0 || numero > 10) {
                System.out.println("El número debe estar dentro del rango [0, 10]. Inténtelo de nuevo.");
            }
        } while (numero < 0 || numero > 10);

        // Calcular el factorial del número utilizando un bucle while
        int factorial = 1;
        int i = 1;
        
        while (i <= numero) {
            factorial *= i;
            i++;
        }

        // Mostrar el resultado por consola
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}