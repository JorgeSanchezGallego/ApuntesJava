package clase3;

public class clase3 {
    public static void main(String[] args) {
        //1. Conversion implícita de int a double
        int numeroEntero = 25;
        double numeroDecimal = numeroEntero;
        System.out.println("numero entero: " + numeroEntero);
        System.out.println("numero convertido a double: " + numeroDecimal);

        //2.Conversion explicita double a int con truncamiento
        double valorDecimal = 8.80;
        //conversion explicita, casting
        int valorEntero = (int)valorDecimal;
        System.out.println("valor original, double : " +valorDecimal);
        System.out.println("valor convertido con el int: " + valorEntero);

        //3. Desbordamiento de int a byte
        int numeroGrande = 190;
        //conversion explicita a byte
        byte numeroPequeño = (byte)numeroGrande;
        System.out.println("numero original en int: " + numeroGrande);
        System.out.println("numero convertido en byte: " + numeroPequeño);

        //4. Conversion de String a int con Integer.parseInt()
        String texto = "123";
        int numero = Integer.parseInt(texto);
        System.out.println("texto: " + texto);
        System.out.println("numero convertido: " + numero);

        //5. Convertir un int a String
        int numerito = 456;
        String textito = String.valueOf(numerito);
        System.out.println("numero : " + numerito);
        System.out.println("texto convertido: " + textito);

        //6. Conversion double a String
        double precio = 99.99;
        String textoPrecio = Double.toString(precio);
        System.out.println("Precio como String:" + textoPrecio);

        //7. Conversion del booleano a String
        boolean activo = true;
        //conversion a String
        String estado = String.valueOf(activo);
        System.out.println("Estado convertido: " + estado);

        //8. Conversion para operaciones matematicas
        int a = 5, b = 2;
        System.out.println("division entera: " + (a/b));
        //conversion a double para tener decimales
        double resultado = (double)a/b;
        System.out.println("Division con casting: " + resultado);

        //10. Conversion de un long a int y de float a int
        long numeroLargo = 1_000_000_000L;
        //convertir del long al int
        int numeroEnterito = (int)numeroLargo;
        System.out.println("numero con cambio de long a int: " + numeroEnterito);
    }
}
