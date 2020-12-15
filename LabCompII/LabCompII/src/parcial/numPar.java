package parcial;
import java.util.Scanner;
public class numPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo= new int[4];
        int cont1=0, cont2=0;

        System.out.println("Ingrese el pimer valor: ");

    //carga de datos
        for(int i=0; i<arreglo.length;i++){
            System.out.print("Ingrese el "+(i+1)+" valor: ");
            arreglo[i]= sc.nextInt();
        }

    //si son todos pares o si son todos impares
        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i]%2==0){
                cont1++;
            }else{
                cont2++;
            }
        }
        //quiere decir si cont1 ==4, si cambia el tamaño del arreglo en algun momento, entonces este código no funcionaría
        int aux;
        //método burbuja de mayor a menor
        if(cont1==arreglo.length){
            for(int i = 0; i < arreglo.length; i++){
                for (int j = 0; j < arreglo.length - i - 1; j++) {
                    if (arreglo[j + 1] > arreglo[j]) {
                        aux = arreglo[j + 1];
                        arreglo[j + 1] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
            //muestra el arreglo de mayor a menor
            System.out.println("Arreglo de mayor a menor:");
            for(int i=0; i<arreglo.length;i++){
                System.out.print(arreglo[i]+"\t");
            }
        }else if(cont2==arreglo.length){
            //ordena de menor a mayor, tambien se puede usar Array.sort().
            for(int i = 0; i < arreglo.length; i++){
                for (int j = 0; j < arreglo.length - i - 1; j++) {
                    if (arreglo[j + 1] < arreglo[j]) {
                        aux = arreglo[j + 1];
                        arreglo[j + 1] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
            //muestra el arreglo de menor a mayor
            System.out.println("Arreglo de menor a mayor:");
            for(int i=0; i<arreglo.length;i++){
                System.out.print(arreglo[i]+"\t");
            }
        }else{
            //sino, muestra ya que inicialmente el arreglo está ordenado de acuerdo a los números fueron ingresando.
            System.out.println("Arreglo:");
            for(int i=0; i<arreglo.length;i++){
                System.out.print(arreglo[i]+"\t");
            }
        }
    }

}
