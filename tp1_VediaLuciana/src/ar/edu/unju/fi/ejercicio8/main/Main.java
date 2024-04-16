package ar.edu.unju.fi.ejercicio8.main;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Solicitar al usuario que ingrese el valor de n
     System.out.println("Ingrese el valor de n:");
     int n = Integer.parseInt(scanner.nextLine());

     // Crear objeto CalculadoraEspecial
     CalculadoraEspecial calculadora = new CalculadoraEspecial();

     // Establecer el valor de 'n'
     calculadora.setN(n);

     // Calcular y mostrar la sumatoria y la productoria
     System.out.println("Sumatoria: " + calculadora.calcularSumatoria());
     System.out.println("Productoria: " + calculadora.calcularProductoria());

     scanner.close();
 }
}
