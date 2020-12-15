package TPI_LabCompII;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException, ClassNotFoundException {
        Scanner sA = new Scanner(System.in);
        Scanner sX = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String x;

        //menu
        int seleccion;
        //do-while para que se ejecute el menú al menos una vez
        do{
            System.out.println("BICICLETERÍA"+"\nMENU"+"\n1.Listar Stock"+
                    "\n2.Filtrar por Marca"+"\n3.Filtrar por diámetro de Rueda"+"\n4.Filtrar por Talle de Cuadro"+"\n5.Actualizar objetos.");
            seleccion=sA.nextInt();
            //switch para ejecutar cada proceso sgun la eleccion del usuario.
            switch(seleccion)
            {
                case 1:
                    //salida: listado completo de objetos almacenado.
                    Rodado.listar();
                    break;

                case 2:
                    //swich para buscar segpun el usuario elija.
                    System.out.println("Ingrese la marca a filtrar: 1.COMERCIAL 2.FABRICANTE");
                    int s=sc.nextInt();
                    switch (s){
                        case 1:
                            Rodado.filtrarMarca("COMERCIAL");
                            break;
                        case 2:
                            Rodado.filtrarMarca("FABRICANTE");
                            break;
                        default:
                            System.out.println("Intente nuevamente, su seleccion no es correcta.");
                            break;
                    }

                    break;

                case 3:
                    System.out.println("Ingrese el diámetro de al rueda a filtrar (pulgadas): 1) 29, 2) 27.5, 3) 26");
                    s=sc.nextInt();
                    switch (s){
                        case 1:
                            Rodado.filtrarDiamRueda(29);
                            break;
                        case 2:
                            Rodado.filtrarDiamRueda(27.5);
                            break;
                        case 3:
                            Rodado.filtrarDiamRueda(26);
                            break;
                        default:
                            System.out.println("Intente nuevamente, su seleccion no es correcta.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el talle de Cuadro: 1.S, 2.M, 3.L, 4.XL");
                    s=sc.nextInt();
                    //swich para filtrar mejor la informacion
                    switch (s){
                        case 1:
                            Rodado.filtrarTalleCuadro("S");
                            break;
                        case 2:
                            Rodado.filtrarTalleCuadro("M");
                            break;
                        case 3:
                            Rodado.filtrarTalleCuadro("L");
                            break;
                        case 4:
                            Rodado.filtrarTalleCuadro("XL");
                            break;
                        default:
                            System.out.println("Intente nuevamente, su seleccion no es correcta.");
                            break;
                    }
                    break;
                case 5:
                    //llamo al método de Administración
                    Rodado.actualizar();
                    //quise agregar mediante teclado pero sobreescribe, por ende solo puedo agregarlo manualmente.
                    System.out.println("Se ha actualizado la lista de objetos. (Se agrega manualmente desde Administración.)");
                    break;

                default:
                    System.out.println("\nIngreso no permitido. Intente nuevamente más tarde.");
                    break;
            }
            System.out.println("¿Desea realizar otra operación? 1.Si, cualquier otra tecla para Salir.");
            x= sX.nextLine();
        }while(x.equals("1"));

    }
}
