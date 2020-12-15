package Ej1_Circulo;

public class main{
    public static void main (String[]args) {
        circulo objeto1 = new circulo(100);
        circulo objeto2 = new circulo();
        circulo objeto3 = new circulo();


        System.out.println("Objeto 1 = " + objeto1);
        System.out.println("Objeto 2 = " + objeto2.getRadio() + " " + objeto2.getArea(objeto2.getRadio()));
        System.out.println(objeto1.getArea(objeto1.getRadio()));

    }
}
