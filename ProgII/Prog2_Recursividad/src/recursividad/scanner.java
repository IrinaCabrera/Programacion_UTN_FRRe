package recursividad;

public class scanner {
    /*
    * import java.util.Scanner;
    * Scanner sc = new Scanner(System.in);
    * String name = sc.nextLine();*/

    /*
     /*int respuesta=0;
        for(int i=0; i<objeto.length;i++){
            if(objeto[i] == null){

                System.out.println("¿Desea escribir otro objeto? 1.Si, 2.No");
                respuesta=sA.nextInt();

                if(respuesta==1){

                    objeto[i]= new Rodado();
                    System.out.println("tipoRodado: ");
                    String tipoRodado=sB.nextLine();
                    objeto[i].setTipoRodado(tipoRodado);

                    System.out.println("marcaRodado: ");
                    String marcaRodado=sC.nextLine();
                    objeto[i].setMarcaRodado(marcaRodado);

                    System.out.println("diametroRueda: ");
                    double diametroRueda=sD.nextFloat();
                    objeto[i].setDiametroRueda(diametroRueda);

                    System.out.println("tipoFreno: ");
                    String tipoFreno=sB.nextLine();
                    objeto[i].setTipoFreno(tipoFreno);

                    System.out.println("talleCuadro: ");
                    double talleCuadro=sD.nextFloat();
                    objeto[i].setTalleCuadro(talleCuadro);

                    objeto[i]= new Rodado(tipoRodado,marcaRodado,diametroRueda,tipoFreno,talleCuadro);

                    try{
                        //Le informo donde buscar
                        ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("C:/Users/Irina/Desktop/dataBase.dat"));
                        //hago que escriba el objeto
                        escritura.writeObject(objeto[i]);
                        //cierro el fichero
                        escritura.close();
                    }catch (Exception e){}

                }else{
                    break;
                }

            }else{
                System.out.println("no funciono");
            }

        }*/



    /*int op;
        do{
            for(int i=0; i<objeto.length;i++){

                if(objeto[i] == null){
                    objeto[i]=new Rodado(sE.nextLine(),sF.nextLine(),sG.nextDouble(),sH.nextLine(),sI.nextDouble());
                    //Le informo donde buscar
                    ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("C:/Users/Irina/Desktop/dataBase.dat"));
                    //hago que escriba el objeto
                    escritura.writeObject(objeto);
                    //cierro el fichero
                    escritura.close();
                    //le informo donde buscar
                    ObjectInputStream recuperando= new ObjectInputStream(new FileInputStream("C:/Users/Irina/Desktop/dataBase.dat"));
                    //trae el objeto
                    Rodado[] lectura= (Rodado[]) recuperando.readObject();
                    //cierra el fichero
                    recuperando.close();
                    break;
                }
            }
            System.out.print("Desea agregar más? 1.Si, 2.No");
            op=sC.nextInt();
        }while(op==1);*/
}
