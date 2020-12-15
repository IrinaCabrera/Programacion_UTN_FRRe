import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        int r=0;
        Scanner sc = new Scanner(System.in);
        String[] lista = {"Di","buen","dia","a","papa"};
        String[] listaInversa = new String[lista.length];

        for(int i = lista.length -1; i >=0; i--){
            listaInversa[r] = lista[i];
            r++;
        }
        for(int j = 0; j < listaInversa.length; j++){
            System.out.println(listaInversa[j]);
        }

    }
}