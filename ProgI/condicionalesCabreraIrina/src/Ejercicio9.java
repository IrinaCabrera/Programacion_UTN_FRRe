import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        float sueldoHora,horasTrabajadas,salarioTotal,horasExtras;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el salario por hora trabajada: ");
        sueldoHora = sc.nextFloat();
        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas = sc.nextFloat();
        if (horasTrabajadas > 40){
            horasExtras = horasTrabajadas - 40;

            if(horasExtras <= 8){
                salarioTotal = (sueldoHora * horasExtras)*2 + ((horasTrabajadas-horasExtras) * sueldoHora);
                System.out.println("le corresponde: "+salarioTotal);
            }
            else{
                horasExtras = horasTrabajadas - 48;
                salarioTotal =((sueldoHora * 40) + (horasExtras * sueldoHora * 3) + (sueldoHora*8*2));
                System.out.println("le corresponde: "+salarioTotal);
            }
        }
        else if(horasTrabajadas < 0){
            System.out.println("La cantidad de horas trabajadas es incorrecta, intentelo mas tarde...");
        }
        else{
            salarioTotal = horasTrabajadas * sueldoHora;
            System.out.println("le corresponde: "+salarioTotal);
        }
    }
}