import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        float presAnual, montoUrgencias,montoPediatria,montoTraumatologia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el presupuesto anual para saber cuanto le corresponde a cada area: ");
        presAnual = sc.nextFloat();

        /*Urgencias*/
        montoUrgencias = presAnual*0.37f;

        /*Pediatria*/
        montoPediatria =presAnual*0.42f;

        /*Traumatologia*/
        montoTraumatologia = presAnual*0.21f;

        System.out.println("A cada area le correspondera: \n" +
                "Urgencias ________ "+montoUrgencias+"\n"+
                "Pediatria ________" +montoPediatria+"\n"+
                "Traumatologia ____"+montoTraumatologia);
    }
}
