package clase10;

import java.util.ArrayList;

public class arraylistdearraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> estudiantes = new ArrayList<>();

        ArrayList<String> estudiante1 = new ArrayList<>();
        estudiante1.add("Juan");
        estudiante1.add("9");
        estudiante1.add("8");

        ArrayList<String> estudiante2 = new ArrayList<>();
        estudiante2.add("Raquel");
        estudiante2.add("5");
        estudiante2.add("3");
        estudiante2.add("1");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);

        //Recorrer
        for (ArrayList<String> estudiante : estudiantes){
            int contador = 0;

            for (String valor : estudiante){
                if (contador == 0) {
                    System.out.print("Nombre: " );
                } else {
                    System.out.print("Nota " + contador + ": " );
                }
                System.out.print(valor + " ");
                System.out.println();
                contador++;
            }
            System.out.println();
        }
    }
}
