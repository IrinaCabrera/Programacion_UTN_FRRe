import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        float compra,descuento;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese el monto que pagará suponiendo que no tenga descuento");
        compra = sc.nextFloat();

        if(compra > 1000){
            descuento = 1000 * 0.2f;
            descuento = compra - descuento;
            System.out.println("\nTiene descuento. Pagara: "+descuento);
        }
        else {
            System.out.println("\nNo tiene descuento. Pagara: " +compra);
        }
    }
}
