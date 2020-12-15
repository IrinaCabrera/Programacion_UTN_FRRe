import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lista = {6,1,8,9};
        int j=lista.length-1;

        listaInversa(lista,j);

    }
    public static void listaInversa(int lista[], int j){
        for(int i=lista.length-1;i>=0; i--){
            lista[j]=lista[i];
            System.out.println(lista[j]);
            j--;
        }
    }
}