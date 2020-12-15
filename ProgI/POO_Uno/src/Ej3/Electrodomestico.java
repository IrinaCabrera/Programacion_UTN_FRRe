package Ej3;
import java.util.Objects;
import java.util.Set;


public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    //valores por defecto
    final String colorDEF="blanco";
    final char consumoEnergeticoDEF='F';
    final double precioBaseDEF=100.00;
    final double pesoDEF= 5;

    //constructor por defecto
    public Electrodomestico() {
        this.precioBase = precioBaseDEF;
        this.color = colorDEF;
        this.consumoEnergetico = consumoEnergeticoDEF;
        this.peso = pesoDEF;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color=colorDEF;
        this.consumoEnergetico=consumoEnergeticoDEF;
        this.peso = peso;

    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    //metodos
    public void comprobarConsumoEnergetico(char consumoEnergetico){
        switch(consumoEnergetico){
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            case 'F':
                break;
            default:
                consumoEnergetico=consumoEnergeticoDEF;
                break;
        }
    }
    public String comprobarColor(String color) {
        switch(color){
            case "azul":
                break;
            case "blanco":
                break;
            case "negro":
                break;
            case "rojo":
                break;
            case "gris":
                break;
            default:
                color=colorDEF;
               break;
        }
        return color;
    }
    public double precioFinal(char consumoEnergetico, double peso){
        switch(consumoEnergetico){
            case 'A':
                precioBase += 100;
                break;
            case 'B':
                precioBase += 80;
                break;
            case 'C':
                precioBase += 60;
                break;
            case 'D':
                precioBase += 50;
                break;
            case 'E':
                precioBase += 30;
                break;
            case 'F':
                precioBase += 10;
                break;
            default:
                System.out.println("No definido");
                break;
        }
        if(peso >= 0 && peso < 20){precioBase += 10;}
        if(peso >= 20 && peso < 50){precioBase += 50;}
        if(peso >= 50 && peso < 80){precioBase += 80;}
        if(peso > 80){precioBase += 100;}

        return precioBase;
    }

    //gets
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

}

