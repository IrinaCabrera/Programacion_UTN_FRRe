package esructurasLineales.Xfa;

public class Main {
    public static void main(String[]args){
        List lista1= new List();

        lista1.agregarInicio(3);
        lista1.agregarInicio(8);
        lista1.agregarInicio(20);
        lista1.agregarFin(5);
        lista1.mostrar();
        lista1.delateInicio();
        System.out.println("");
        lista1.mostrar();
        lista1.delateFin();
        System.out.println("");
        lista1.mostrar();
    }
}
