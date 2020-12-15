import java.util.Scanner;
public class jjjj {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double peso,altura,imc;
        System.out.println("ingrese el peso");
        peso=sc.nextDouble();
        System.out.println("ingrese la altura");
        altura=sc.nextDouble();

        imc=peso/(Math.pow(altura,2));
        System.out.println("el imc es: "+imc);

        if(imc<20){System.out.println("-1 Usted tiene el peso lalala ideal");}
        if(imc>=20 && imc<=25){System.out.println("0 Usted está por debajo del peso ideal");}
        if(imc>25){System.out.println("1 Usted tiene sobrepeso");}
    }
}
