package clase5;

import java.util.Scanner;

public class clase5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        //1.Estructura del if-else
        //Pedir un número al usuario y determinar si es positivo, negativo o cero.
        System.out.println("Dame un numero");
        int numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("Tu numero es negativo");
        } else {
            System.out.println("Tu numero es 0");
        }


        //2.Creame un menu interactivo donde el usuario elija una opcion y muestra el mensaje (Switch)
        //menu
        //Evaluar con switch
        System.out.println("Menu de opciones");
        System.out.println("1. Saludar");
        System.out.println("2. Mensaje motivacional");
        System.out.println("3. Salir");
        System.out.println("Selecciona una opcion");
        int opcion = teclado.nextInt(); //Leemos la opcion del usuario


        switch (opcion) {
            case 1:
                System.out.println("Hola, bienvenido");
                break;
            case 2:
                System.out.println("Bro, esa panza");
                break;
            case 3:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Macho, me has dado algo que no te he pedido");
        }


        //3. Imprimir los numeros del 1 al 10 con FOR
        //Bucle para contar del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero:" + i); //Mostramos cada iteracion
        }


        //4. Usa el WHILE para pedir numeros hasta que ponga 0
        System.out.println("Dame un numero y pon 0 para salir");
        int numero1 = teclado.nextInt();
        //Mientras que no sea cero, sigue pidiendo
        while (numero1 != 0) {
            System.out.println("Has introducido: " + numero1);
            System.out.println("introduce otro numero");
            numero1 = teclado.nextInt();
        }
        System.out.println("Programa finalizado");


        //5. Pide contraseña y que no pueda entrar el usuario hasta que ponga java123
        //DO WHILE

        String password;
        do {
            System.out.println("introduce tu contraseña");
            password = teclado.nextLine();
        } while (!password.equals("java123"));
        System.out.println("Acceso concedido");
    }
}
