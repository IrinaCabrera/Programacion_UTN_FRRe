import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        int numero;
        String dia ="";
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero del dia de la semana para saber su correspondiente en dia: ");
        numero = sc.nextInt();

        switch(numero){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                System.out.println("El numero ingresado es incorrecto, intente nuevamente...");
                break;
        }
        System.out.println("Su equivalente en dia de la semana es: "+ dia);
    }
}