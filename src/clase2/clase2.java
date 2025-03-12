package clase2;

import java.util.Scanner;

public class clase2 {
    public static void main(String[] args) {
        //declaras constante con FINAL
        final double pi = 3.1416;
        final int mayoriaEdad = 18;

        System.out.println("el valor Pi es: " + pi);
        System.out.println("la edad minima para ser adulto es:" + mayoriaEdad);


        int numero1 = 5;
        int numero2 = 10;
        int suma = numero1+numero2;


        //operadores relacionales
        int d=10;
        int e =20;

        System.out.println("Es x igual a y ? " + (d== e));
        System.out.println("es x diferente a y? " + (d!= e));
        System.out.println("es x mayor que y " + (d> e));
        System.out.println("es x menor que y " + (d< e) );

        //operadores logicos, es aquel que combina expresiones logicas
        boolean a = true;
        boolean b = false;
        System.out.println("a AND b " + (a&b));
        System.out.println("a OR b " + (a|b));
        System.out.println("NOT a:" + (!a));

        // Expresiones y/o evaluaciones
        int resultado = (10+5) * 2/3;
        int resultado2 = 10+5*2/3;
        System.out.println("el resultado es : " + resultado);
        System.out.println("el resultado es: " + resultado2);



        //ejercicios
        //Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.
        final double gravedad = 9.81;
        System.out.println("¿Cue valor tiene la gravedad? " + gravedad);
        //-----------------------------------------------------------------------------------

        //Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.
        int numA = 25;
        int numB = 7;
        System.out.println("El resultado de 25+7 es: " + (25 + 7));
        System.out.println("El resultado de 25-7 es: " + (25 - 7));
        System.out.println("El resultado de 25/7 es: " + (25 / 7));
        System.out.println("El resto de 25/7 es: " + (25 / 7));
        System.out.println("El resultado de 25*7 es: " + (25 * 7));
        //----------------------------------------------------------------------------------

        //Declara una variable edad e imprime si la persona es mayor de edad (>= 18) o menor de edad (< 18).
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Si quieres beber alcohol, necesito saber tu edad");
        edad = teclado.nextInt();
        if (edad>=18) {
            System.out.println("Enhorabuena, eres mayor de edad y puedes beber alcohol.");
        } else {
            System.out.println("Eres un pokemon, vete a casa");
        }
        //------------------------------------------------------------------------------------

        //Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.
        int numC, numD;
        System.out.println("¿Cual es el numero A?");
        numC = teclado.nextInt();
        System.out.println("¿Y el numero B?");
        numD = teclado.nextInt();
        if(numC>numD) {
            System.out.println("El numero A es mayor que el numero B");
        } else if (numC<numD) {
            System.out.println("El numero A es menor que el numero B");
        } else {
            System.out.println("El numero A y el numero B son iguales");
        }
        //---------------------------------------------------------------------------------------

        //Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?
        boolean bool1 = 5>3;
        boolean bool2 = 10<20;
        System.out.println("El resultado de la expresion logica (5 > 3) && (10 < 20) es: " + (bool1 & bool2));
        //---------------------------------------------------------------------------------------

        //Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.
        bool2 = 10>20;
        System.out.println("El resultado de la expresion logica (5 > 3) || (10 > 20) es: " + (bool1|bool2));
        /*Al cambiar la expresion logica del bool2, nos da false, y bool1 sigue siendo true,
        y el operador | quiere decir que solo necesita que se cumpla una de los 2 booleanos para que devuelva true. */
        //-----------------------------------------------------------------------------------------

        //Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.

        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println("¿La suma de X e Y es igual a Z? " + ((x +y)==z));
        System.out.println("¿La suma de X e Y es mayor que Z? " + ((x +y)>z));
        System.out.println("La suma de X e Y es menor que Z? " + ((x +y)<z));
        System.out.println("La suma de X e Y es distinta que Z? " + ((x +y)!=z));
        //-------------------------------------------------------------------------------------------

        //Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).
        int soyMultiplo1, soyMultiplo2;
        System.out.println("Necesito saber si tu numero es multiplo de 2, ¿Cual es tu numero?");
        soyMultiplo1 = teclado.nextInt();
        System.out.println("Necesito saber si tu numero es multiplo de 2, ¿Cual es tu numero?");
        soyMultiplo2 = teclado.nextInt();
        if (soyMultiplo1 % 2 == 0) {
            System.out.println(soyMultiplo1 + " es multiplo de 2");
        } else {
            System.out.println(soyMultiplo1 + " no es multiplo de 2");
        }
        if (soyMultiplo2 % 2 == 0) {
            System.out.println(soyMultiplo2 + " es multiplo de 2");
        } else {
            System.out.println(soyMultiplo2 + " no es multiplo de 2");
        }
        //-------------------------------------------------------------------------------------

        //Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).
        int soyPar;
        System.out.println("Dime un numero para saber si es par o no");
        soyPar = teclado.nextInt();
        if (soyPar % 2 == 0) {
            System.out.println(soyPar + " es par");
        } else {
            System.out.println(soyPar + " no es par");
        }
        //-----------------------------------------------------------------------------------

        //Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.
        final double tasaCambio = 1.12;
        double euros;
        System.out.println("¿Cuantos euros pasar quieres pasar a dolares?");
        euros = teclado.nextInt();
        System.out.println(euros + " € son " + (euros*tasaCambio) + " $");

    }
}



