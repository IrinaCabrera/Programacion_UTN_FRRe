import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido, se mostrara una tabla: ");

        for(int f = 0; f <121; f = f+10) {
           float llamr = Ejercicio9.cel(f);
            System.out.println(f+" °F sera: "+llamr+" °C");
        }
    }

}
