import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        float c, x; // c = cant. pesos x= tasa de interes.
        int n; //años.
        double llamFormula;

        System.out.println("Ingrese la cantidad de pesos:");
        c=sc.nextFloat();
        System.out.println("Ingrese la tasa de interes:");
        x=sc.nextFloat();
        System.out.println("Ingrese la cantidad de anios:");
        n=sc.nextInt();

        llamFormula = formula(c,x,n);
        System.out.println(df.format(llamFormula)+ " Es el monto final");
    }
    public static double formula(float c, float x, int n){
        x = x / 100;
        double cn = c * Math.pow(1+x,n); //monto final
        return cn;
    }
}
