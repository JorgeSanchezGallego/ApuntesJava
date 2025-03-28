package clase6;

import java.util.Scanner;

public class probandoclase6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*🟨 Ejercicio 5 – Dividir dos números con try-catch
        Haz un programa que divida dos números enteros introducidos por el usuario.
        Usa try-catch para evitar que el programa se rompa si el divisor es 0.*/
            int a, b; //Declaramos enteros
        System.out.println("Dime un numero"); // Pedimos un numero
        a = teclado.nextInt(); // Guardamos el numero
        System.out.println("Dime otro numero"); // Pedimos otro numero
        b = teclado.nextInt(); // Guardamos otro numero
        try { //Abrimos el try
            int resultado = a/b; // Declaramos resultado
            System.out.println("Resultado:" +resultado); // Mostramos el resultado
        } catch (ArithmeticException j){ //Declaramos en el catch que si hay una excepcion aritmetica, lo publique
            System.out.println("Division por cero imposible"); // Resultado de una excepcion aritmetica
        }
teclado.nextLine();

        /*🟨 Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción
        Solicita una palabra al usuario y pide una posición. Intenta mostrar el carácter en
        esa posición usando try-catch. Si se produce un error, muestra un mensaje.*/
        try { //Abrimos el bloque try
            System.out.println("Dime una palabra"); // Pedimos una palabra
            String palabra = teclado.nextLine(); //Guardamos la palabra
            System.out.println("Dime una posicion"); // Pedimos una posicion
            int poscion = teclado.nextInt(); // Guardamos la posicion
            char letra = palabra.charAt(poscion); //Declaramos el caracter mediante la posicion declarada
            System.out.println("El caracter en la posicion " + poscion + " es " + letra); // Resultado
        } catch (StringIndexOutOfBoundsException j) { // Si pides una posicion que no existe dentro del string, catch
            System.out.println("Tu declaracion de posicion no existe"); // Resultado de que tu posicion no existe
        }

        }

    }

