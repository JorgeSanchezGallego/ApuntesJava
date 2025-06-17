package claseobjetos2;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre){
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente c){
        clientes.add(c);
        System.out.println("Cliente añadido con éxito");
    }

    public Cliente buscarClientePorDni(String dni){
        for (Cliente c : clientes){
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    public void mostrarTodosLosClientes(){
        for (Cliente c : clientes){
            c.mostrarInfo();
        }
    }

    public void transferir(String dniOrigen, String dniDestino, double cantidad){
        Cliente origen = buscarClientePorDni(dniOrigen);
        Cliente destino = buscarClientePorDni(dniDestino);
        if ( origen != null && destino != null){
            if (origen.retirar(cantidad)){
                destino.depositar(cantidad);
                System.out.println("Transferencia realizada con éxito");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Uno o los dos no existen");
        }
    }
}
