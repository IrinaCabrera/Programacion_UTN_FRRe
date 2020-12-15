package Ej3;

public class Main {
    public static void main(String[]args){
        //creacion del arreglo
        Electrodomestico[] array=new Electrodomestico[3];
        //cada elemento del arreglo
        array[0]=new Electrodomestico(5000, "azul", 'H', 15);
        array[1]=new Electrodomestico();
        array[2]= new Lavarropa();



        for(int i =0; i<2;i++){
            System.out.print(array[i].precioFinal(array[i].getConsumoEnergetico(),array[i].getPeso()));
            System.out.print(" "+array[i].comprobarColor(array[i].getColor()));
            System.out.print("\n");
            if(array[i] instanceof Lavarropa){
            }else{
            }

        }
        Television[] arrTEL= new Television[2];
        arrTEL[0]= new Television();
        arrTEL[0]= new Television(70, "gris", 'B', 15, 20, true);

        for(int i =0; i<2;i++){
            System.out.print(arrTEL[i].precioFinalT(arrTEL[i].getConsumoEnergetico(),arrTEL[i].getPeso(),arrTEL[i].getResolucion(),arrTEL[i].isTDT()));
            System.out.print(" "+arrTEL[i].comprobarColor(arrTEL[i].getColor()));
            System.out.print("\n");
        }
    }
}
