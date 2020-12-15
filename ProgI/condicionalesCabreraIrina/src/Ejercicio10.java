import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        float monto, pago;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto de la fianza a pagar: ");
        monto= sc.nextFloat();

        if(monto <= 50000){
            pago = monto * 0.03f;
            System.out.println("La cuota que debe pagar el cliente sera de: "+pago);
        }
        else{
            pago = monto * 0.02f;
            System.out.println("La cuota que debe pagar el cliente sera de: "+pago);
        }
    }
}