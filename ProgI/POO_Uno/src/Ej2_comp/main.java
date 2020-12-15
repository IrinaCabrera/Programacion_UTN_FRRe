package Ej2_comp;

public class main {
    public static void main(String[]args){
        Libro l1=new Libro(4151278,70,"nana");
        Libro l2=new Libro(1576418,90,"rere");

        l1.numPaginas(l1.getNumPagina());
        l2.numPaginas(l2.getNumPagina());
        System.out.print(l1.toString());
        System.out.print(l2.toString());

    }
}
