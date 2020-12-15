import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        int clave;
        String nombre= "";
        float precio, descuento = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del producto: ");
        nombre = sc.nextLine();

        System.out.println("Clave del producto (01 o 02): ");
        clave = sc.nextInt();

        if(clave == 01 || clave == 02){
            System.out.println("Precio del producto: $");
            precio = sc.nextFloat();

            switch (clave){
                case 01:
                    descuento = precio - (precio * 0.1f);

                    break;
                case 02:
                    descuento = precio - (precio * 0.2f);
                    break;
                default:
                    break;
            }
            System.out.println("Nombre: "+nombre+"\nClave: "+clave+"\nPrecio original: $"+precio+"\nPrecio con descuento: $"+descuento);
        }
        else{
            System.out.println("Clave erronea");
        }

    }
}

