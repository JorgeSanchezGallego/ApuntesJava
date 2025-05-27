package funciones;

public class claseFunc {

    public static void main(String[] args) {
        String name = "Maria";

        saludar();
        saludar("Juan");
        saludar(name);
        System.out.println(saludar2(name));
        System.out.println(sumar(5,5));
        System.out.println(sumar(4,5,6,7,8,9,10));
        if (esPar(5)){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar ");
        }
        int [] numeros = {1,4,6,8,10};
        System.out.println(calcularMedia(numeros));
    }

    //1. Imprime un saludo
    public static void saludar(){
        System.out.println("Hola");
    }
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre+"!");
    }
    public static String saludar2(String nombre){
        return ("Hola " +nombre+"!");
    }
    public static int sumar(int n1, int n2){
        return n1 + n2;
    }
    public static int sumar(int ... numeros){
        int suma = 0;
        for (int num : numeros){
            suma += num;
        }
        return suma;
    }
    public static boolean esPar (int n1){
        if (n1%2==0){
            return true;
        } else {
            return false;
        }
    }
    public static double calcularMedia(int[] numeros){
       int suma = 0;
       for (int n : numeros){
           suma += n;
       }
       return (double) suma / numeros.length;
    }

}
