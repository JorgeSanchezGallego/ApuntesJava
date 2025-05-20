package clase11;

import java.util.Random;

public class clase11 {
    public static void main(String[] args) {
        //Generar una matriz aleatoria y imprimirla
        int[][] matriz = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < 4 ; i++){
            for (int j = 0; j < 4 ; j++){
                matriz[i][j] = random.nextInt(100) +1;
            }
        }
        for (int i = 0; i < 4 ; i++){
            for (int j = 0; j < 4 ; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        //Matriz transpuesta, cambiar los indices verticales a los horizontales y viceversa
            int [][] transpuesta = new int [4][4];
        for (int i = 0; i < 4 ; i++){
            for (int j = 0; j < 4 ; j++){
                transpuesta [j][i] = matriz [i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < 4 ; i++){
            for (int j = 0; j < 4 ; j++){
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
