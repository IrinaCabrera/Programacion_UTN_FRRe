package Ej1;

public class Main {
    public static void main(String [] args){

        /*objeto 1*/
        Cuenta t1=new Cuenta("Marcelino");
        System.out.println("Estado actual de la cuenta: "+t1.toString());
        t1.ingresar(21000);
        System.out.println("Estado actual de la cuenta: "+t1.toString());
        t1.retirar(10000);
        System.out.println("Estado actual de la cuenta: "+t1.toString());

        /*objeto 2*/
        Cuenta t2=new Cuenta("María",10000);
        //quiero retirar
        t2.retirar(15000);
        System.out.println("Estado actual de la cuenta: "+t2.toString());

        /*objeto 3*/
        Cuenta t3=new Cuenta("Carlos",-900);
        //quiero retirar
        t3.retirar(20);
        System.out.println("Estado actual de la cuenta: "+t3.toString());

    }
}
