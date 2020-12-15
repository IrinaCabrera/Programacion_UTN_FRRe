package Ej9_Persona;

public class Main {
    public static void main(String[]args){
        Persona[] arreglo=new Estudiante[2];
        arreglo[0]= new Estudiante("aaaaa","aaaaaa","MAT",3,2100);
        arreglo[1]= new Estudiante("bbbbb","bbbbbb","PROG2",3,2100);

        Persona[] arreglo1=new Staff[2];
        arreglo1[0]= new Staff("cccccc","ccccccc","UTN", 2100.3);
        arreglo1[1]= new Staff("dddddd","ddddddd","UTN Frre",2100.3);

        for(int i=0; i<=2 ;i++){
            System.out.println(arreglo[i].toString());
            System.out.println(arreglo1[i].toString());
        }
    }

}
