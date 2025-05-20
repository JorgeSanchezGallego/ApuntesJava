package clase11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class mapas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Mapas hashmap desordenado
        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Jorge", 9.5);
        notas.put("Jorge", 7.0);// Machaca el 9.5
        notas.put("Luis", 10.0);
        notas.put("APepe", 11.0);
        //Recorrer mapa con for each
        for ( Map.Entry<String, Double> entrada : notas.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
        System.out.println("Introduce nombre");
        String nombre = teclado.nextLine();
        if ( notas.containsKey(nombre)){
            System.out.println(nombre + " tiene una nota de : " + notas.get(nombre));
        } else {
            System.out.println("Estudiante no encontrado");
        }

        //Cambiar el hashmap a treemap
        TreeMap<String, Double> ordenado = new TreeMap<>(notas);
        for (Map.Entry<String, Double> entrada : ordenado.entrySet()){
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

    }
}
