package recursividad;

public class ej1 {
    public static void main(String[]args){
        int numero=1;
        suma(numero);
    }
    public static void suma(int numero){
        if(numero<=10){
            System.out.println(numero);
            suma(numero+1);
        }
    }
}
