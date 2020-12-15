package Ej1_comp;

public class main {
    public static void main (String[]args){
        Cuenta t1=new Cuenta("sultanito");
        Cuenta t2=new Cuenta("menganito");
        Cuenta t3=new Cuenta("sultanita",10);
        Cuenta t4=new Cuenta("menganita", 70);

        t1.ingresar(300);
        t1.retirar(30);
        System.out.print(t1.getCantidad());
    }
}
