package claseobjetos2;

public class Cliente {
    private String nombre;
    private String dni;
    private double saldo;

    public Cliente(String nombre, String dni, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
    }
    public boolean retirar(double cantidad){
        if (saldo >= cantidad){
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void mostrarInfo(){
        System.out.println("Dni: " + this.dni + "\nNombre: " + this.nombre + "\nSaldo: " + this.saldo);


    }
}
