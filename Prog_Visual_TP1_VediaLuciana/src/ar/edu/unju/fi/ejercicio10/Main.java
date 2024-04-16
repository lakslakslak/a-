package ar.edu.unju.fi.ejercicio10;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear 3 objetos de la clase Pizza
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos de la pizza " + i + ":");
            Pizza pizza = crearPizza(scanner);
            mostrarDatosPizza(pizza);
        }

        scanner.close();
    }

    // solicitar datos de una pizza y crear un objeto Pizza
    private static Pizza crearPizza(Scanner scanner) {
        Pizza pizza = new Pizza();

        System.out.print("Diámetro (20, 30, 40): ");
        pizza.setDiametro(Integer.parseInt(scanner.nextLine()));

        System.out.print("¿Lleva ingredientes especiales? (true/false): ");
        pizza.setIngredientesEspeciales(Boolean.parseBoolean(scanner.nextLine()));

        // precio y el área de la pizza
        pizza.calcularPrecio();
        pizza.calcularArea();

        return pizza;
    }

    // mostrar los datos de una pizza
    private static void mostrarDatosPizza(Pizza pizza) {
        System.out.println("\n** Pizza **");
        System.out.println("Diámetro: " + pizza.getDiametro());
        System.out.println("Ingredientes especiales: " + pizza.isIngredientesEspeciales());
        System.out.println("Precio: $" + pizza.getPrecio());
        System.out.println("Área: " + pizza.getArea());
    }
}