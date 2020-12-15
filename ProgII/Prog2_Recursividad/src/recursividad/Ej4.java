package recursividad;

import java.util.Scanner;
public class Ej4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x=0,y=1,z=0;
        System.out.print("ingrese el numero enésimo de la secuencia fibonacci: ");
        int n= sc.nextInt();
        fibonacci(x,y,z,n);
    }
    public static void fibonacci(int x, int y, int z,int n){
        if(n>=0){
            z=x+y;
            x=y;
            y=z;
            n--;
            fibonacci(x,y,z,n);
        }
        else{
            System.out.println(z);
        }

    }
}
