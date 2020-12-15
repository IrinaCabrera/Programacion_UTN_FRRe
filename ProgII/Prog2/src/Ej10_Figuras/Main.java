package Ej10_Figuras;

import Ej1_Circulo.circulo;

public class Main {
    public static void main(String[]args){
        Circle objeto1 = new Circle(32);
        Circle objeto2 = new Circle("rojo",true,66);

        System.out.println(objeto1.toString());
        System.out.println(objeto2.toString());
    }
}
