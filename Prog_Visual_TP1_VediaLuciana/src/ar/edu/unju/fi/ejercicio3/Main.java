package ar.edu.unju.fi.ejercicio3;

/*Declare las variables necesarias para realizar lo siguiente:
Solicitar al usuario que ingrese por consola un número entero que debe ser almacenado en una
variable (Investigue como utilizar la clase Scanner para poder ingresar datos por consola).
Si el número ingresado es impar mostrar el doble del número y si es par mostrar el triple del número.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número entero
        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt(); // Leer el número ingresado
        
        // Verificar si el número ingresado es impar o par
        if (numero % 2 != 0) { // Si el resto  no es 0, entonces es impar
        	
            // Mostrar el doble del número
            int resultado = numero * 2;
            System.out.println("El número ingresado es impar. El doble es: " + resultado);
        } else {
        	
            // Mostrar el triple del número
            int resultado = numero * 3;
            System.out.println("El número ingresado es par. El triple es: " + resultado);
        }

        scanner.close();
    }
}