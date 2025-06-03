package claseobjetos;

public class Termometro {
    private double temperaturaActual;

    public Termometro(){
        this.temperaturaActual = 25.0;
    }
    public double leerTemperatura(){
        this.temperaturaActual += (Math.random()*2 - 1); //Rango -1 y 1
        return this.temperaturaActual;
    }
}
