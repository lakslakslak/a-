package ar.edu.unju.fi.ejercicio1;

/*Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
Declare 5 variables de tipo entero para almacenar valores numéricos.
Asigne valores numéricos a cada una de las variables.
Calcule el promedio y guarde el resultado en otra variable. Muestre por consola el resultado
obtenido.*/

public class Main {

	public static void main(String[] args) {
		float primerNumero = 8;
		float segundoNumero = 5;
		float tercerNumero = 1;
		float cuartoNumero = 20;
		float quintoNumero = 9;
		float promedio = (primerNumero + segundoNumero + tercerNumero + cuartoNumero + quintoNumero)/ 5;
		System.out.println("El promedio es: "+ promedio );
	}

}