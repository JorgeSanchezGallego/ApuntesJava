package clase1;

public class clase1 {
    public static void main(String[] args) {
        System.out.println("TIPOS PRIMITIVOS DE JAVA");

        byte numeroByte = 127; //8 bits rango de -127 a 127
        System.out.println("quiero imprimir mi numero: " + numeroByte);

        short numeroShort = 30000; //16 bits rango de -32768 a 32 767
        System.out.println("quiero mi numero " + numeroShort);

        int numeroInt = 1000000; // 32 bits rango de -2 147 483 648 a 2 147 483 647
        System.out.println("quiero ver mi entero: " + numeroInt);

        long numeroLong = 20000000000L; //64 bits rango de -9223372036854775808 a 9223372036854775807
        System.out.println("mi numero long es .: " + numeroLong);


        System.out.println("NUMEROS FLOTANTES ");

        float numeroFloat = 0.2f; // 32 bits precision de 6-7 decimales
        System.out.println("imprimi mi numero float " + numeroFloat);

        double numeroDoble = 2342345.3; //64 bits precision de 15-16 decimales
        System.out.println("dame mi double " + numeroDoble);


        System.out.println("BOOLEANS");
        boolean esVerdadero = true;
        boolean esFalso = false;
        System.out.println("es mayor de edad?" + esVerdadero);
        System.out.println("es mayor de edad?" + esFalso);


        System.out.println("CARACTERES, CHAR");
        char letra = 'A'; // 16 bits caracteres unicode 0 a 65 535
        char simbolo = '#';
        char unicode = '\u2764';
        System.out.println("la letra de mi dni es " + letra);
        System.out.println("que simbolo uso " + simbolo);
        System.out.println("que soy " + unicode);


        System.out.println("TIPOS DE REFERENCIA EN JAVA");
        System.out.println("STRINGS");
        String texto = "Hola soy un string";
        System.out.println("que soy?" + texto);


        System.out.println("ARRAYS");
        int[] numerosArray = {10, 20, 30, 40, 50};
        //posiciones             0  1  2  3  4
        //longitud               1  2  3  4  5
        System.out.println("te imprimo la primera posicion " + numerosArray[0]);
    }
}
