package claseobjetos2;

public class Main {
    public static void main(String[] args) {
        Banco miBanco = new Banco("Mi banco");

        Cliente c1 = new Cliente("Cristina", "53243606D", 1500.0);
        Cliente c2 = new Cliente("Jorge", "33333306D", 800.0);


        miBanco.agregarCliente(c1);
        miBanco.agregarCliente(c2);

        miBanco.mostrarTodosLosClientes();

        miBanco.transferir("53243606D","33333306D",200 );

        miBanco.mostrarTodosLosClientes();

        miBanco.transferir("53222222606D","33333306D",200 ); // Dni no existe

        miBanco.transferir("53243606D","33333306D",5000 ); // Cantidad sobrepasada

        miBanco.mostrarTodosLosClientes();

    }
}
