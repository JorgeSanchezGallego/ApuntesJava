package clase8;

import java.util.Arrays;
import java.util.Scanner;

public class clase8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int indice = 1;
        int ind = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el numero " + (i+1) + ":");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Contenido :");
       /* for (int i = 0; i < numeros.length; i++){
            System.out.println("Numero " + (i+1) + ": " + numeros[i]);
        }


        for (int num : numeros) {

            System.out.println("Elemento " + indice + ":" + num);
            indice++;
        }

        while (ind < numeros.length) {
            System.out.println("Posicion" + (ind+1) + ": " + numeros[ind]);
            ind ++;
        }

        Arrays.stream(numeros).forEach( num ->System.out.println("Elemento: " + num));*/

    }
}