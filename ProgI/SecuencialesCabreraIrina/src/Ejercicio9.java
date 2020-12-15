import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int femenino, masculino, total;
        float porsFem, porsMas, promedioMas, promedioFem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la catidad de estudiantes femeninos: \n");
        femenino = sc.nextInt();
        System.out.println("Ingrese la catidad de estudiantes masculinos: \n");
        masculino = sc.nextInt();

        total = femenino + masculino;

        porsFem = (femenino*100)/total;
        System.out.println("El porsentaje de estudiantes femeninos es del : %"+porsFem+"\n");

        porsMas = (masculino*100)/total;
        System.out.println("El porsentaje de estudiantes masculinos es del : %"+porsMas+"\n");

        if(femenino !=0 && masculino !=0){
            promedioMas = masculino / femenino;
            promedioFem = femenino / masculino;
            System.out.println("El promedio de estudiantes femeninos es del: "+promedioFem+"\n"+
                    "El promedio de estudiantes masculinos es del:" +promedioMas);
        }
        else if(femenino == 0){
            promedioMas = masculino / total;
            System.out.println("El promedio de estudiantes masculinos es del:" +promedioMas);
        }
        else{
            promedioFem = femenino / total;
            System.out.println("El promedio de estudiantes femeninos es del: "+promedioFem);
        }

    }
}
