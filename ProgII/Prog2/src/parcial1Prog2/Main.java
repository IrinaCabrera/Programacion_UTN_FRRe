package parcial1Prog2;

public class Main {
    public static void main(String[]args){
        Empleado[] arreglo1= new Repartidor[3];
        Empleado[] arreglo2= new Comercial[3];

        arreglo1[0]=new Repartidor("Germán",33,10000,7);
        arreglo1[1]=new Repartidor("Isaías",20,7000,3);
        arreglo1[2]=new Repartidor("Felipe",26,5000,3);

        arreglo2[0]=new Comercial("Alejandra",35,20000,700);
        arreglo2[1]=new Comercial("Fernada",25,15000,800);
        arreglo2[2]=new Comercial("Berenice",40,10000,900);


        for(int i=0; i<3;i++){
            System.out.println("*"+arreglo1[i].toString());
            System.out.println("*Sueldo Final: "+arreglo1[i].getPlus()+ " del empleado/a: "+arreglo1[i].nombre);

        }
        System.out.println("\n");
        for(int i=0; i<3;i++){
            System.out.println("+"+arreglo2[i].toString());
            System.out.println("+Sueldo Final: "+arreglo1[i].getPlus()+ " del empleado/a: "+arreglo2[i].nombre);
        }

    }
}
