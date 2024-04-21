package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
    
       try {
    	   int opcion;
       
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Alta de jugador
                    System.out.println("\nIngrese los datos del jugador:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Apellido: ");
                    String apellido = scanner.next();
                    System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
                    String fechaStr = scanner.next();
                    LocalDate fechaNacimiento = LocalDate.parse(fechaStr);
                    System.out.print("Nacionalidad: ");
                    String nacionalidad = scanner.next();
                    System.out.print("Estatura: ");
                    double estatura = scanner.nextDouble();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Posición: ");
                    String posicion = scanner.next();

                    Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso,
                            posicion);
                    jugadores.add(jugador);
                    System.out.println("Jugador agregado correctamente.");
                    break;
                case 2:
                    // Mostrar los datos del jugador
                    System.out.println("\nIngrese el nombre y apellido del jugador:");
                    System.out.print("Nombre: ");
                    String nombreBusqueda = scanner.next();
                    System.out.print("Apellido: ");
                    String apellidoBusqueda = scanner.next();

                    for (Jugador j : jugadores) {
                        if (j.getNombre().equals(nombreBusqueda) && j.getApellido().equals(apellidoBusqueda)) {
                            System.out.println("\nDatos del jugador:");
                            System.out.println("Nombre: " + j.getNombre());
                            System.out.println("Apellido: " + j.getApellido());
                            System.out.println("Fecha de nacimiento: " + j.getFechaNacimiento());
                            System.out.println("Nacionalidad: " + j.getNacionalidad());
                            System.out.println("Estatura: " + j.getEstatura());
                            System.out.println("Peso: " + j.getPeso());
                            System.out.println("Posición: " + j.getPosicion());
                            System.out.println("Edad: " + j.calcularEdad() + " años");
                            break;
                        }
                    }
                    break;
                case 3:
                    // Mostrar todos los jugadores ordenados por apellido
                    Collections.sort(jugadores, Comparator.comparing(Jugador::getApellido));
                    System.out.println("\nJugadores ordenados por apellido:");
                    for (Jugador j : jugadores) {
                        System.out.println(j.getApellido() + ", " + j.getNombre());
                    }
                    break;
                case 4:
                    // Modificar los datos de un jugador
                    System.out.println("\nIngrese el nombre y apellido del jugador a modificar:");
                    System.out.print("Nombre: ");
                    String nombreMod = scanner.next();
                    System.out.print("Apellido: ");
                    String apellidoMod = scanner.next();

                    for (Jugador j : jugadores) {
                        if (j.getNombre().equals(nombreMod) && j.getApellido().equals(apellidoMod)) {
                            System.out.println("Ingrese los nuevos datos del jugador:");
                            System.out.print("Nombre: ");
                            j.setNombre(scanner.next());
                            System.out.print("Apellido: ");
                            j.setApellido(scanner.next());
                            System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
                            String fechaModStr = scanner.next();
                            j.setFechaNacimiento(LocalDate.parse(fechaModStr));
                            System.out.print("Nacionalidad: ");
                            j.setNacionalidad(scanner.next());
                            System.out.print("Estatura: ");
                            j.setEstatura(scanner.nextDouble());
                            System.out.print("Peso: ");
                            j.setPeso(scanner.nextDouble());
                            System.out.print("Posición: ");
                            j.setPosicion(scanner.next());
                            System.out.println("Datos modificados correctamente.");
                            break;
                        }
                    }
                    break;
                case 5:
                    // Eliminar un jugador
                    System.out.println("\nIngrese el nombre y apellido del jugador a eliminar:");
                    System.out.print("Nombre: ");
                    String nombreEliminar = scanner.next();
                    System.out.print("Apellido: ");
                    String apellidoEliminar = scanner.next();

                    Iterator<Jugador> iter = jugadores.iterator();
                    while (iter.hasNext()) {
                        Jugador j = iter.next();
                        if (j.getNombre().equals(nombreEliminar) && j.getApellido().equals(apellidoEliminar)) {
                            iter.remove();
                            System.out.println("Jugador eliminado correctamente.");
                            break;
                        }
                    }
                    break;
                case 6:
                    // Mostrar la cantidad total de jugadores
                    System.out.println("\nCantidad total de jugadores: " + jugadores.size());
                    break;
                case 7:
                    // Mostrar la cantidad de jugadores que pertenecen a una nacionalidad
                    System.out.print("\nIngrese la nacionalidad: ");
                    String nacionalidadBuscar = scanner.next();
                    int contador = 0;
                    for (Jugador j : jugadores) {
                        if (j.getNacionalidad().equals(nacionalidadBuscar)) {
                            contador++;
                        }
                    }
                    System.out.println("Cantidad de jugadores de la nacionalidad '" + nacionalidadBuscar + "': "
                            + contador);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);
        
       }catch(Exception e) {
           System.out.println("Se produjo un error: " + e.getMessage());
       } finally {
           scanner.close();
       }
   }
}