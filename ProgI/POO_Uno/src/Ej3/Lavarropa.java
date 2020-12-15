package Ej3;
import java.util.Objects;
import java.util.Set;
public class Lavarropa extends Electrodomestico {
    protected double carga;

    final double cargaDEF=5;

    //constructor por defecto
    public Lavarropa() {
        this.carga=cargaDEF;
    }
    public Lavarropa(double precioBase, double peso) {
        super(precioBase,peso);
        this.color=colorDEF;
        this.consumoEnergetico=consumoEnergeticoDEF;
        this.carga=cargaDEF;
    }
    public Lavarropa(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double precioFinalL(char consumoEnergetico, double peso,double carga) {
        super.precioFinal(consumoEnergetico, peso);
        if (carga > 30){precioBase +=50;}
        return super.precioFinal(consumoEnergetico, peso)+precioBase;
    }

    //get
    public double getCarga() {
        return carga;
    }

}
