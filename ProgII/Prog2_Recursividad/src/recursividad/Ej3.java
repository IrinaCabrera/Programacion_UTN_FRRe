package recursividad;

public class Ej3 {
    public static void main(String[]args){
        /*vector*/
        int i=0,numMayor=0;
        int [] arreglo={3,67,21,49,90,65,100,56,84,12};
        mayor(arreglo,i,numMayor);
    }
    public static void mayor(int[] arreglo,int i,int numMayor){

        if(i <=9 && i >=0){
            if(numMayor==0){
                numMayor=arreglo[i];
            }else{
                if(numMayor <= arreglo[i]){
                    numMayor=arreglo[i];
                }
            }
            mayor(arreglo,i+1,numMayor);
        }
        if(i==9)System.out.println(numMayor);
    }
}
