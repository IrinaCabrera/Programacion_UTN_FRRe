package Parcial2;

public class Main {
    public static void main(String[]args){
        Cliente array[]=new Cliente[3];
        array[0]=new Cliente("Marcelo","36,12200.00",26,6000);
        array[1]=new Cliente("Hernestina","35,11100.11",20);
        array[2]=new Cliente("Abel","34,00000.22",35,15000);


        for(int i=0; i<3;i++){
            System.out.println("*Cliente n° "+(i+1)+":");
            System.out.println("Descuento: "+array[i].getDescuento(array[i].getMontoTotalCompra()));
            System.out.println("Rango: "+array[i].getRango(array[i].getMontoTotalCompra()));
        }
    }
}
