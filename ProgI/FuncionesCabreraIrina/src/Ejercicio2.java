import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        int hora, minuto, segundo, opcion, funSeg;
        String funHMS;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 para ver la duracion en seg., 2 para ver la duracion en hs, min y seg.");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("ingresa la cantidad de horas");
                hora= sc.nextInt();
                System.out.println("ingresa la cantidad de minutos");
                minuto= sc.nextInt();
                System.out.println("ingresa la cantidad de segundos");
                segundo= sc.nextInt();

                funSeg = segundos(hora, minuto, segundo);
                System.out.println("el intervalos de tiempo ingresado es: " +funSeg+" en segundos");

                break;
            case 2:
                System.out.println("Ingrese la cantidad de segundos: ");
                segundo= sc.nextInt();

                funHMS = HMS(segundo);
                System.out.println(funHMS);
                break;
            default:
                System.out.println("El valor ingresado no es correcto");
                break;
        }
    }
    public static int segundos(int hora, int minutos, int segundos){
        int opSeg = hora * 3600 + minutos *60 + segundos;
        return opSeg;
    }
    public static String HMS(int segundo){
        int horas = segundo /3600;
        segundo = segundo % 3600;
        int m = segundo / 60;
        int s = segundo %60;
        return "Horas: "+horas+" Minutos "+m+" segundos: " +s;
    }
}
