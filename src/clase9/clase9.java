package clase9;

import java.util.ArrayList;
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
                case 0 -> System.out.println("FIN");
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    teclado.close();
    }
}
