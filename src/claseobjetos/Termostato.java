package claseobjetos;

import java.util.ArrayList;

public class Termostato {

    private double temperaturaDeseada;
    private Termometro termometro;
    private ArrayList<Split> splits;

    public Termostato(double temperaturaDeseada, Termometro termometro){
        this.temperaturaDeseada = temperaturaDeseada;
        this.termometro = termometro;
        this.splits = new ArrayList<>();
    }

    public void añadirSplit(Split split){
        this.splits.add(split);
    }
    public void comprobarTemperatura(){
        double actual = termometro.leerTemperatura();
        System.out.println("Temperatura actual: " + actual + "temperatura deseada: " +this.temperaturaDeseada);

        if ( actual > this.temperaturaDeseada) {
            for (Split s : splits) {
                s.encender();
            }
        } else {
                for (Split s : splits){
                    s.apagar();
                }
            }
        }
    }


