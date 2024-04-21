package ar.edu.unju.fi.ejercicio18.main;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ArrayList<Pais> paises = new ArrayList<>();
        paises.add(new Pais(1, "Argentina"));
        paises.add(new Pais(2, "Brasil"));
        paises.add(new Pais(3, "Chile"));

        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        try {
            int opcion;
            do {
                System.out.println("\nMenú:");
                System.out.println("1 - Alta de destino turístico");
                System.out.println("2 - Mostrar todos los destinos turísticos");
                System.out.println("3 - Modificar el país de un destino turístico");
                System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
                System.out.println("5 - Eliminar un destino turístico");
                System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
                System.out.println("7 - Mostrar todos los países");
                System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
                System.out.println("9 - Salir");
                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                    	System.out.print("Ingrese el código del país: ");
                        int codigoPais = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        System.out.print("Ingrese el nombre del destino: ");
                        String nombreDestino = scanner.nextLine();
                        System.out.print("Ingrese el precio del destino: ");
                        double precioDestino = scanner.nextDouble();
                        System.out.print("Ingrese la cantidad de días del destino: ");
                        int cantidadDias = scanner.nextInt();
                        Pais pais = null;
                        for (Pais p : paises) {
                            if (p.getCodigo() == codigoPais) {
                                pais = p;
                                break;
                            }
                        }
                        if (pais != null) {
                            destinos.add(new DestinoTuristico(nombreDestino, precioDestino, pais, cantidadDias));
                            System.out.println("Destino turístico agregado correctamente.");
                        } else {
                            System.out.println("No se encontró un país con el código ingresado.");
                        }
                        break;
                    case 2:
                        // Mostrar todos los destinos turísticos
                        if (destinos.isEmpty()) {
                            System.out.println("No hay destinos turísticos cargados.");
                        } else {
                            System.out.println("Destinos turísticos:");
                            for (DestinoTuristico d : destinos) {
                                System.out.println(d);
                            }
                        }
                        break;
                    case 3:
                        // Modificar el país de un destino turístico
                        if (destinos.isEmpty()) {
                            System.out.println("No hay destinos turísticos cargados.");
                        } else {
                            System.out.print("Ingrese el nombre del destino turístico a modificar: ");
                            scanner.nextLine(); // Limpiar el buffer
                            String nombreModificar = scanner.nextLine();
                            boolean encontrado = false;
                            for (DestinoTuristico d : destinos) {
                                if (d.getNombre().equalsIgnoreCase(nombreModificar)) {
                                    System.out.print("Ingrese el nuevo código de país: ");
                                    int nuevoCodigoPais = scanner.nextInt();
                                    for (Pais p : paises) {
                                        if (p.getCodigo() == nuevoCodigoPais) {
                                            d.setPais(p);
                                            System.out.println("País modificado correctamente.");
                                            encontrado = true;
                                            break;
                                        }
                                    }
                                    if (!encontrado) {
                                        System.out.println("No se encontró un país con el código ingresado.");
                                    }
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("No se encontró un destino turístico con el nombre ingresado.");
                            }
                        }
                        break;
                    case 4:
                        // Limpiar el ArrayList de destinos turísticos
                        destinos.clear();
                        System.out.println("Lista de destinos turísticos vaciada.");
                        break;
                    case 5:
                        // Eliminar un destino turístico
                        if (destinos.isEmpty()) {
                            System.out.println("No hay destinos turísticos cargados.");
                        } else {
                            System.out.print("Ingrese el nombre del destino turístico a eliminar: ");
                            scanner.nextLine(); // Limpiar el buffer
                            String nombreEliminar = scanner.nextLine();
                            Iterator<DestinoTuristico> iter = destinos.iterator();
                            boolean encontrado = false;
                            while (iter.hasNext()) {
                                DestinoTuristico d = iter.next();
                                if (d.getNombre().equalsIgnoreCase(nombreEliminar)) {
                                    iter.remove();
                                    System.out.println("Destino turístico eliminado correctamente.");
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("No se encontró un destino turístico con el nombre ingresado.");
                            }
                        }
                        break;
                    case 6:
                        // Mostrar los destinos turísticos ordenados por nombre
                        if (destinos.isEmpty()) {
                            System.out.println("No hay destinos turísticos cargados.");
                        } else {
                            Collections.sort(destinos);
                            System.out.println("Destinos turísticos ordenados por nombre:");
                            for (DestinoTuristico d : destinos) {
                                System.out.println(d);
                            }
                        }
                        break;
                    case 7:
                        // Mostrar todos los países
                        System.out.println("Países:");
                        for (Pais p : paises) {
                            System.out.println(p);
                        }
                        break;
                    case 8:
                        // Mostrar los destinos turísticos que pertenecen a un país
                        if (destinos.isEmpty()) {
                            System.out.println("No hay destinos turísticos cargados.");
                        } else {
                            System.out.print("Ingrese el código del país: ");
                            int codigoPaisMostrar = scanner.nextInt();
                            boolean encontrado = false;
                            System.out.println("Destinos turísticos del país:");
                            for (DestinoTuristico d : destinos) {
                                if (d.getPais().getCodigo() == codigoPaisMostrar) {
                                    System.out.println(d);
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("No se encontraron destinos turísticos para el país ingresado.");
                            }
                        }
                        break;
                    case 9:
                        // Salir
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 9);
        } catch (InputMismatchException e) {
            System.out.println("Error: Se esperaba un número entero.");
        } finally {
            scanner.close();
        }
    }
}