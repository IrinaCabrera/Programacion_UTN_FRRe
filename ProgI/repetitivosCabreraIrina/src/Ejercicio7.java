import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n, edad, edadMA = 0, edadMB = 0, edadMC = 0, contMA = 0, contMB = 0, contMC = 0, edadFA = 0, edadFB = 0, edadFC = 0, contFA = 0, contFB = 0, contFC = 0;
        String sexo, carrera;
        float promMA, promMB, promMC, promFA, promFB, promFC;
        int promMAA, promMBB, promMCC, promFAA, promFBB, promFCC;

        System.out.println("Cuantos alumnos quiere ingresar?:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            Scanner scc = new Scanner(System.in);
            System.out.println("sexo: (M,F)");
            sexo = scc.nextLine();

            if (sexo.equals("m") || sexo.equals("M")) {
                //carrera
                System.out.println("Carrera: (A,B,C)");
                carrera = scc.nextLine();

                switch (carrera) {
                    case "A":
                    case "a":
                        System.out.println("Edad:");
                        edad = scc.nextInt();
                        edadMA = edadMA + edad;
                        contMA++;

                        break;
                    case "B":
                    case "b":
                        System.out.println("Edad:");
                        edad = scc.nextInt();
                        edadMB = edadMB + edad;
                        contMB++;

                        break;
                    case "C":
                    case "c":
                        System.out.println("Edad:");
                        edad = scc.nextInt();
                        edadMC = edadMC + edad;
                        contMC++;
                        break;
                    default:
                        System.out.println("el valor ingresado no es correcto");
                        break;
                }

            } else if (sexo.equals("f") || sexo.equals("F")) {
                //carrera
                System.out.println("Carrera: (A,B,C)");
                carrera = scc.nextLine();

                switch (carrera) {
                    case "A":
                    case "a":
                        System.out.println("Edad:");
                        edad = scc.nextInt();
                        edadFA = edadFA + edad;
                        contFA++;

                        break;
                    case "B":
                    case "b":
                        System.out.println("Edad:");
                        edad = scc.nextInt();
                        edadFB = edadFB + edad;
                        contFB++;

                        break;
                    case "C":
                    case "c":
                        System.out.println("Edad:");
                        edad = scc.nextInt();
                        edadFC = edadFC + edad;
                        contFC++;
                        break;
                    default:
                        System.out.println("el valor ingresado no es correcto");
                        break;
                }
            } else {
                System.out.println("Ingreso incorrecto.");
            }
        }
        //promedio masculino
        promMA = edadMA / contMA;
        promMAA = (int) promMA;

        promMB = edadMB / contMB;
        promMBB = (int) promMB;

        promMC = edadMC / contMC;
        promMCC = (int) promMC;

        //carrera de menor promedio Maculino:
        if (promMAA == promMBB) {
            if (promMAA != 0) {
                if (promMAA < promMCC) {
                    System.out.println("La carrera A y B en el sexo masculino, lleva el promedio mas bajo en edades");
                } else {
                    System.out.println("La carrera C en el sexo masculino, lleva el promedio mas bajo en edades");
                }
            } else {
                System.out.println("La carrera C en el sexo masculino, lleva el promedio mas bajo en edades");
            }
        }
        if (promMBB == promMCC) {
            if (promMBB != 0) {
                if (promMBB < promMAA) {
                    System.out.println("La carrera B y C en el sexo masculino, lleva el promedio mas bajo en edades");
                } else {
                    System.out.println("La carrera A en el sexo masculino, lleva el promedio mas bajo en edades");
                }
            } else {
                System.out.println("La carrera A en el sexo masculino, lleva el promedio mas bajo en edades");
            }

        }
        if (promMAA == promMCC) {
            if (promMCC != 0) {
                if (promMCC < promMBB) {
                    System.out.println("La carrera A y C en el sexo masculino, lleva el promedio mas bajo en edades");
                } else {
                    System.out.println("La carrera B en el sexo masculino, lleva el promedio mas bajo en edades");
                }
            } else {
                System.out.println("La carrera B en el sexo masculino, lleva el promedio mas bajo en edades");
            }

        }
        if (promMAA < promMBB && promMBB < promMCC) {
            if (promMAA != 0) {
                System.out.println("La carrera A en el sexo masculino, lleva el promedio mas bajo en edades");
            } else {
                System.out.println("La carrera B en el sexo masculino, lleva el promedio mas bajo en edades");
        }
        }if(promMBB < promMAA && promMAA < promMCC){
            if (promMBB!=0){
                System.out.println("La carrera B en el sexo masculino, lleva el promedio mas bajo en edades");
            }else{
                System.out.println("La carrera A en el sexo masculino, lleva el promedio mas bajo en edades");
            }

        }if (promMCC < promMAA && promMAA < promMBB){
            if(promMCC!=0){
                System.out.println("La carrera C en el sexo masculino, lleva el promedio mas bajo en edades");
            }else{
                System.out.println("La carrera A en el sexo masculino, lleva el promedio mas bajo en edades");
            }

            //promedio femenino
            promFA = edadFA / contFA;
            promFAA = (int) promFA;

            promFB = edadFB / contFB;
            promFBB = (int) promFB;

            promFC = edadFC / contFC;
            promFCC = (int) promFC;

            //solo se podra mostrar el promedio de las edades de cada carrera en el sexo femenino:
            System.out.println("el promedio de edades en la carrera A del sexo femenino es: "+promFAA);
            System.out.println("el promedio de edades en la carrera B del sexo femenino es: "+promFBB);
            System.out.println("el promedio de edades en la carrera C del sexo femenino es: "+promFCC);
        }


    }
}