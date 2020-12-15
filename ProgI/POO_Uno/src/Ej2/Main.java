package Ej2;
import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nombre,apellido;
        int edad,DNI;
        String sexo= String.valueOf('H');
        double peso,altura;
        int imc;
        boolean may=false;

        System.out.print("Ingrese el DNI: ");
        DNI=sc.nextInt();
        System.out.print("Ingrese su nombre: ");
        nombre=sc.next();
        System.out.print("Ingrese su apellido: ");
        apellido=sc.next();
        System.out.print("Ingrese su edad: ");
        edad=sc.nextInt();
        System.out.print("Ingrese su sexo: ");
        sexo=sc.next();
        System.out.print("Ingrese su peso: ");
        peso=sc.nextDouble();
        System.out.print("Ingrese su altura: ");
        altura=sc.nextDouble();
        //objetos
        Persona p1= new Persona(DNI,nombre,apellido,edad,sexo,peso,altura);
        Persona p2= new Persona(DNI,nombre,apellido,edad,sexo);
        Persona p3= new Persona(DNI,nombre);
        //p1
        System.out.println("\nObjeto n° 1");
        //peso
        imc= p1.calcularIMC(p1.getPeso(),p1.getAltura());
        pesoIdeal(imc);
        //edad
        may= p1.esMayorDeEdad(p1.getEdad());
        mayorEdad(may);
        //sexo
        System.out.println("Sexo: "+p1.comprobarSexo(p1.getSexo()));

        //p2
        System.out.println("\nObjeto n° 1");
        //peso
        imc= p2.calcularIMC(p2.getPeso(),p2.getAltura());
        pesoIdeal(imc);
        //edad
        may= p2.esMayorDeEdad(p2.getEdad());
        mayorEdad(may);
        //sexo
        System.out.println("Sexo: "+p2.comprobarSexo(p2.getSexo()));

        //p3
        System.out.println("\nObjeto n° 1");
        //peso
        imc= p3.calcularIMC(p3.getPeso(),p3.getAltura());
        pesoIdeal(imc);
        //edad
        may= p3.esMayorDeEdad(p3.getEdad());
        mayorEdad(may);
        //sexo
        System.out.println("Sexo: "+p3.comprobarSexo(p3.getSexo()));

        //toString()
        System.out.println("\ntoString");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
    public static void pesoIdeal(int imc){
        if(imc == -1){System.out.println("Usted está por debajo del peso ideal");}
        if(imc == 0){System.out.println("Usted tiene el peso ideal");}
        if(imc == 1){System.out.println("Usted tiene sobrepeso");}
        if(imc == 2){System.out.println("Sin especificaciones");}
    }
    public static void mayorEdad(boolean may){
        if(may){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("NO es mayor de edad");
        }
    }
}
