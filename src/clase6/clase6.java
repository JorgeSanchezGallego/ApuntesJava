package clase6;

import java.util.Scanner;

public class clase6 {
    public static void main(String[] args) {
        //📝 ENUNCIADOS
/*🟨 Ejercicio 1 – Salir de un bucle while con break
                Haz un programa que pida al usuario números enteros positivos. El programa debe
        terminar cuando el usuario introduzca el número 0. Usa un bucle while con break.*/
        Scanner teclado = new Scanner(System.in);
        int numero;
        while (true){
            System.out.println("Introduce un numero y pon 0 para salir");
            numero = teclado.nextInt();
            if (numero == 0) {
                //Si es 0 salgo del bucle
                break;
            }
            System.out.println("Has introducido: " +numero);
        }
        System.out.println("Programa finalizado");


/*🟨 Ejercicio 2 – Saltarse los múltiplos de 3 con continue
                Escribe un programa que muestre los números del 1 al 10,
            excepto los múltiplos de 3. Usa un bucle for con continue.*/
        //Recorrer ese intervalo de numeros
        for (int i = 1; i<=10; i++){
            if (i%3 == 0){
                //Si es multiplo de 3, saltamé
                continue;
            }
            System.out.println(i);
        }


/*🟨 Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
        Haz un programa que busque el número 7 entre los números del 1 al 20. Cuando
        lo encuentre, debe mostrar un mensaje y terminar el bucle con break.*/
    for (int e=1; e<=20;e++){
        if (e==7){
            System.out.println("Has encontrado el numero 7");
            break;
        }
        System.out.println("Probando que se ve con: " +e);
    }


/*🟨 Ejercicio 4 – Evitar mostrar letras vocales con continue
                Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.*/
    String palabra = "programacion";
    for (int b = 0; b<palabra.length();b++){
        char letra = palabra.charAt(b);
        if (letra =='a' || letra =='e' || letra== 'o' || letra == 'u' || letra == 'i'){
            continue;
        }
        System.out.println(letra);
    }


/*🟨 Ejercicio 5 – Dividir dos números con try-catch
        Haz un programa que divida dos números enteros introducidos por el usuario.
        Usa try-catch para evitar que el programa se rompa si el divisor es 0.*/


/*🟨 Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción
        Solicita una palabra al usuario y pide una posición. Intenta mostrar el carácter en
        esa posición usando try-catch. Si se produce un error, muestra un mensaje.*/


/*🟨 Ejercicio 7 – Mensaje de fin con finally
        Haz un programa que intente dividir dos números. Usa try-catch-finally
        para mostrar siempre un mensaje final que diga "Operación terminada".*/



/*🟨 Ejercicio 8 – Leer números y sumar los positivos, ignorando los negativos con continue
                Pide al usuario 5 números enteros. Suma solo los positivos usando continue para ignorar los negativos.*/



/*🟨 Ejercicio 9 – Detectar si se ha introducido texto en lugar de número (try-catch)
        Pide al usuario que introduzca un número. Si escribe una palabra u otro texto,
                el programa debe capturar la excepción y mostrar "Eso no es un número".*/



/*🟨 Ejercicio 10 – Salir de un bucle do-while cuando se adivina un número secreto
        Crea un número secreto entre 1 y 10. El usuario tiene que adivinarlo.
                Usa do-while y break para salir cuando acierte.*/


    }
}
