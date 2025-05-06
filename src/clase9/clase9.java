package clase9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class clase9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Array list
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres y escribe salir para finalizar");
        String nombre;
        do {
            System.out.println("Nombre: ");
             nombre= teclado.nextLine();
             if (!nombre.equalsIgnoreCase("salir")){
                 nombres.add(nombre);
             }
        } while(!nombre.equalsIgnoreCase("salir"));

        int opcion;
        do {
            System.out.println("\n Menu de opciones: ");
            System.out.println("1. mostrar todos los nombres");
            System.out.println("2. obtener nombre por posicion ");
            System.out.println("3. reemplazar nombres ");
            System.out.println("4. eliminar por posicion ");
            System.out.println("5. verificar si existe un nombre ");
            System.out.println("6. Saber el indice ");
            System.out.println("7. vaciar la lista ");
            System.out.println("8. ordenar alfabeticamente");
            System.out.println("0. para salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1 -> {
                    if (nombres.isEmpty()){
                        System.out.println("La lista está vacia");
                    } else {
                    for ( String name : nombres) {
                        System.out.println(name);
                    }
                    }
                }
                case 2 -> {
                    System.out.println("introduce la posicion");
                    int posicion = teclado.nextInt();
                    if (posicion < nombres.size() && posicion>= 0) {
                        System.out.println(nombres.get(posicion));
                    } else {
                        System.out.println("introduce una posicion valida");
                    }
                }
                case 3 -> {
                    System.out.println("Introduce la posicion");
                    int posicion = teclado.nextInt();
                    teclado.nextLine();
                    posicion--;
                    if (posicion >= 0 && posicion < nombres.size()) {
                        System.out.println("Escribe nombre: ");
                        String nuevoNombre = teclado.nextLine();
                        nombres.set(posicion, nuevoNombre);
                        System.out.println("Nombre reemplazado");
                    } else {
                        System.out.println("Posicion no valida");
                    }

                }
                case 4 -> {
                    System.out.println("Introduce la posicion");
                    int posicion = teclado.nextInt();
                    teclado.nextLine();
                    posicion--;
                    if (posicion >= 0 && posicion < nombres.size()) {
                        nombres.remove(posicion);
                        System.out.println("Borrado");
                    } else {
                        System.out.println("Posicion no valida");
                    }
                }
                case 5 -> {
                    System.out.println("Introduce el nombre");
                    String nombreAux = teclado.nextLine();
                    if (nombres.contains(nombreAux)){
                        System.out.println("El nombre esta en la lista");
                    } else {
                        System.out.println("No estas en la lista");
                    }

                }
                case 6 -> {
                    System.out.println("Introduce el nombre");
                    String nombreAux = teclado.nextLine();
                    int indice = nombres.indexOf(nombreAux);
                    if (indice!= -1){
                        System.out.println("El nombre esta en la posicion: " + (indice+1));
                    }
                }
                case 7 -> {
                    nombres.clear();
                    System.out.println("Lista vaciada");
                }
                case 8 -> {
                    Collections.sort(nombres);
                    System.out.println("Has ordenado la lista");
                }
                case 0 -> System.out.println("FIN");
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    teclado.close();
    }
}
