package clase10;

public class arraysbidimensionales {
    public static void main(String[] args) {


        int [][] matriz1 = new int[3][4];

        int [][] matriz2 = {
                {1,2,3,10},
                {4,5,6,11},
                {7,8,9,13}
        };

        System.out.println("filas" + matriz2.length);
        System.out.println("columnas" + matriz2[0].length);

        //Recorrido
        for (int i = 0 ; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        //Cambiar un valor
        matriz2 [1][1] = 30; //Empezamos de 0 como las posiciones

        //Recorrido con for each
        for (int [] fila : matriz2) {
            for (int valor : fila){
                System.out.print(valor + " ");
            }
            System.out.println();
        }



    }
}
