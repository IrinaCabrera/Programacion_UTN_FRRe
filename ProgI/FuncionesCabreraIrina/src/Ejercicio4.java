import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h1, h2, m1, m2, s1, s2, n1, n2;
        int llamfunSumaH, llamfunSumaM,llamfunSumaS;

        System.out.println("ingrese la duración del primer intervalo:\nHora:");
        h1=sc.nextInt();
        System.out.println("minuto:");
        m1= sc.nextInt();
        System.out.println("segundo: ");
        s1= sc.nextInt();

        System.out.println("ingrese la duración del segundo intervalo:\nHora:");
        h2=sc.nextInt();
        System.out.println("minuto:");
        m2= sc.nextInt();
        System.out.println("segundo: ");
        s2= sc.nextInt();

        //suma de h1 y h2;
        n1 = h1;
        n2 = h2;
        llamfunSumaH = Ejercicio3.S(n1, n2);

        //suma de m1 y m2:
        n1 = m1;
        n2 = m2;
        llamfunSumaM = Ejercicio3.S(n1, n2);

        //suma de s1 y s2:
        n1 = s1;
        n2 = s2;
        llamfunSumaS = Ejercicio3.S(n1, n2);

        if (llamfunSumaS >= 59){
            llamfunSumaM = llamfunSumaM + 1;
            llamfunSumaS = llamfunSumaS - 59;
        }
        if (llamfunSumaM >= 59){
            llamfunSumaH = llamfunSumaH + 1;
            llamfunSumaM = llamfunSumaM - 60;
        }

        System.out.println("Duracion total del intervalo: ");
        System.out.println("(Horas) "+llamfunSumaH+" hs");
        System.out.println("(Minutos) "+llamfunSumaM+" min");
        System.out.println("(Segundos) "+llamfunSumaS+" s");
    }
}
