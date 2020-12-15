import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        float suma =0,prom;
        //System.out.println();
        int[] arreglo = new int[20];
        int[] arregloLista = new int[20];

        //ingreso de valores
        for(int i=0; i <arreglo.length; i++){
            System.out.print("Ingrese el "+(i+1)+"° valor: ");
            arreglo[i]= sc.nextInt();
        }
        //promedio
        for(int i =0; i <arreglo.length; i++){
            suma = suma + arreglo[i];
        }
        prom = suma / arreglo.length;
        System.out.println("Promedio: "+prom);

        //cantidad de valores mayores al promedio y lista de valores.
        int j=0;
        for(int i =0; i <arreglo.length; i++){
            if(arreglo[i]>prom){
                arregloLista[j]= arreglo[i];
                cont++;
                j++;
            }
        }
        System.out.println("cantidad de valores mayores al promedio: "+cont);

        System.out.println("valores mayores al promedio: ");
        for(int i =0; i <arregloLista.length; i++){
            if(arregloLista[i]==0){
                arregloLista = new int[arregloLista.length-1];
            }else{
                System.out.println(arregloLista[i]);
            }

        }

    }

}