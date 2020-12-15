import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //dada una lista de números enteros:
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        multifuncion(lista);
    }

    //escribir una función que:a)Devuelva una lista con todos los que sean primos.b)Devuelva la sumatoria de los valoresc)Devuelva el promedio de los valores.
    public static void multifuncion(int lista[]) {

        //NUMEROS PRIMOS
        int contprim = 0;

        //recorre elementos del arreglo "lista"
        for (int i = 0; i < lista.length; i++) {
            int cont = 0;

            //este ciclo va desde 1 al valor del elemento que tenga la lista en ese momento.
            for (int l = 1; l <= lista[i]; l++) {
                //divide el elemento de la lista por cada valor que toma l en cada ciclo y cuenta cuantos de ellos cumplen copn la condicion de tener resto cero.
                if ((lista[i] % l) == 0) {
                    cont++;
                }
            }
            //aquí filtra cuantos elementos de la lista solamente tienen dos restos ceros al dividirlos por l y los imprime.
            if (cont == 2) {
                System.out.println("Primo: "+lista[i]);
            }

        }
        //SUMATORIA DE VALORES

        //recorre elementos del arreglo "lista"
        int suma=0;
        for (int i = 0; i < lista.length; i++) {
             suma= suma+ lista[i];
        }
        System.out.println("Suma: "+suma);

        //PROMEDIO DE VALORES

        float prom= suma / (lista.length);
        System.out.println("promedio: "+prom);


    }
}