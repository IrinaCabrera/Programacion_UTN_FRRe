package Ej3_Autor;

public class Main {
    public static void main(String[]args){
        Autor[] ARREGLO=new Autor[4];
        ARREGLO[0] = new  Autor("aaaaa","@@@@@",'m');
        ARREGLO[1] = new  Autor("bbbbb","*****",'f');
        ARREGLO[2] = new  Autor("ccccc","xxxxx",'m');
        ARREGLO[3] = new  Autor("ddddd","-----",'f');


        System.out.println();
        for(int i=0; i<=3;i++){
            System.out.println(ARREGLO[i].toString());
        }

    }
}
