package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
    // Atributos
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    // Constantes
    private static final double ADICIONAL_20 = 500;
    private static final double ADICIONAL_30 = 750;
    private static final double ADICIONAL_40 = 1000;

    // Constructor por defecto
    public Pizza() {
    }

    // Métodos para los atributos
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public double getArea() {
        return area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    //calcular el precio de la pizza
    public void calcularPrecio() {
        switch (diametro) {
            case 20:
                if (ingredientesEspeciales) {
                    precio = 4500 + ADICIONAL_20;
                } else {
                    precio = 4500;
                }
                break;
            case 30:
                if (ingredientesEspeciales) {
                    precio = 4800 + ADICIONAL_30;
                } else {
                    precio = 4800;
                }
                break;
            case 40:
                if (ingredientesEspeciales) {
                    precio = 5500 + ADICIONAL_40;
                } else {
                    precio = 5500;
                }
                break;
            default:
                System.out.println("Error: Diámetro de pizza no válido.");
        }
    }

    //calcular el área de la pizza
    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}