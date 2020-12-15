import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, contrasenia;
        boolean llamado;
        int anio, mes, dia;
        float sueldo=0, montoFijo=0, llamado2;
        //System.out.println("");
        //item a:
       do{
            System.out.println("Ingrese usuario: ");
            usuario=sc.nextLine();
            System.out.println("Ingrese contraseña: ");
            contrasenia=sc.nextLine();
            llamado = A(usuario,contrasenia);

        }while(!llamado);

        //item b
        System.out.println("Ingrese el DIA que ingreso a la empresa: ");
        dia=sc.nextInt();
        System.out.println("Ingrese el MES que ingreso a la empresa: ");
        mes=sc.nextInt();
        System.out.println("Ingrese el ANIO que ingreso a la empresa: ");
        anio=sc.nextInt();
        llamado= B(dia, mes, anio);
        System.out.println(llamado);

        //item c
        if(llamado){
            llamado2= calcularSueldo(sueldo,montoFijo);
            System.out.println("Su sueldo sera de: "+llamado2);
        }else{
            System.out.println("Usted no tiene aumento Salarial");
        }


    }
    //funcion item a
    public static boolean A(String usuario, String contrasenia){
        boolean R;
        if(usuario.equals("ADMIN") && contrasenia.equals("PASS")){
            R = true;
        }else{
            //si es false, en la funcion main vuelve a preguntar con un do while.
            R = false;
        }
        return R;
    }
    //funcion item b
    public static boolean B(int dia, int mes, int anio){
        boolean R;
        int anio2 = Parcial.anio();

        //antiguedad:
        int antAnio = (anio2)-(anio);
        if(antAnio == 3 && mes <= 11 || antAnio > 3 && mes <= 12){
            R=true;
        }else{
            R=false;
        }
        return R;
    }
    //funcion item c
    public static float calcularSueldo(float sueldo, float montoFijo){
        for(int i=0; i <13; i++){
            if (i == 1 || i == 6){
                montoFijo= 1000;
            }else{
                montoFijo = 0;
            }
            sueldo= sueldo + (i*1.5f+montoFijo);
        }
        return sueldo;
    }



}