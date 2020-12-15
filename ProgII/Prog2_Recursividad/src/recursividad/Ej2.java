package recursividad;

public class Ej2 {
    public static void main(String[]args){
        /*tabla del nueve*/
        int numerador=9, denominador=1, resultado=0;
        tabla(numerador,denominador,resultado);

    }
    public static void tabla(int numerador, int denominador, int resultado){
        resultado= numerador * denominador;
        if(denominador <=10){
            System.out.println(numerador+" x "+denominador+" = "+resultado);
            tabla(numerador,denominador+1,resultado);
        }

    }
}
