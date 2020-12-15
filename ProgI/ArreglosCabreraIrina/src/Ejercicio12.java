import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        String r;
        int cont=0;
        //creo arreglo:
        //posicion 0: respuesta del estudiante.
        //posicion 1: respuesta correcta.
        String[] examen = {"0","0"};

        //5 es el numero de ejercicios que hay en el examen.
        for(int i=1; i<=5;i++){
            Scanner scc = new Scanner(System.in);
            //respuestas correctas del examen.
            switch(i){
                case 1:
                    examen [1]= "A";
                    break;
                case 2:
                    examen [1]= "C";
                    break;
                case 3:
                    examen [1]= "D";
                    break;
                case 4:
                    examen [1]= "B";
                    break;
                case 5:
                    examen [1]= "E";
                    break;
            }
            System.out.println("Ingrese la respuesta del "+(i)+" ejercicio: (A,B,C,D)");
            System.out.println("Solo ingrese mayusculas, de lo contrario no sera valido: ");
            r= scc.nextLine();
            switch(r){
                case "A":
                case "B":
                case "C":
                case "D":
                case "E":
                    examen[0]= r;
                    if(examen[0].equals(examen[1])){
                        cont++;
                    }
                    break;
                default:
                    System.out.println("ingreso no valido");
                    break;
            }
        }
        System.out.println("Su notas es: "+cont);
        if(cont >= 3){
            System.out.println("Usted aprobo el examen.");
        }
    }
}