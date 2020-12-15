import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2;
        String llamSUMA, llamRESTA;
        System.out.println("Ingrese x1:");
        x1=sc.nextInt();
        System.out.println("Ingrese y1:");
        y1=sc.nextInt();

        System.out.println("Ingrese x2:");
        x2=sc.nextInt();
        System.out.println("Ingrese y2:");
        y2=sc.nextInt();

        llamSUMA= suma(x1,y1,x2,y2);
        System.out.println(llamSUMA);

        llamRESTA= resta(x1,y1,x2,y2);
        System.out.println(llamRESTA);
    }
    public static String suma(int x1, int y1, int x2, int y2){
        int sumx= x1+x2;
        int sumy = y1 + y2;
        return "La suma será: ("+sumx+ ","+sumy+")";
    }
    public static String resta(int x1, int y1, int x2, int y2){
        int resx= x1-(x2);
        int resy = y1-(y2);
        return "La resta será: ("+resx+ ","+resy+")";
    }
}
