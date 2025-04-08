package clase7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class clase7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.println("1. Saludar\n2. Salir");
        System.out.println("Elige una opcion");
    try {
        int opcion = teclado.nextInt();

        int resultado = 5 / opcion;

        switch (opcion) {
            case 1 -> System.out.println("Hola");
            case 2 -> System.out.println("Saliendo");
            default -> System.out.println("Opcion incorrecta");
            }
        } catch (InputMismatchException e) {
        System.out.println("Debes de escribir un numero");
    } catch (ArithmeticException e) {
        System.out.println("No se puede dividir por 0");
    } finally {
        System.out.println("Fin");
    }
        teclado.close();
    }
}
