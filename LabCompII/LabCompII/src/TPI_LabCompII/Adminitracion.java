package TPI_LabCompII;
import java.io.*;

public class Adminitracion {

    //LISTAR CADA ARTÍCULO
    public static void listar() throws IOException, ClassNotFoundException {
        //le informo donde buscar
        //MODIFICAR DIRECCION DE ACUERDO AL LUGAR QUE USTED TENGA EL ARCHIVO dataBase.dat, de ser necesario actualiza con 5
        ObjectInputStream recuperando= new ObjectInputStream(new FileInputStream("C:/Users/Irina/Desktop/dataBase.dat"));
        //trae el objeto
        Rodado[] lectura= (Rodado[]) recuperando.readObject();
        //cierra el fichero
        recuperando.close();

        //lee cada objeto
        for(Rodado e: lectura){
            if(e == null){

            }else{
                System.out.println(e);
            }

        }
    }
    //LISTAR SEGÚN MARCA
    public static void filtrarMarca(String marca){
        // filtrar segun marca
        try{
            //MODIFICAR DIRECCION DE ACUERDO AL LUGAR QUE USTED TENGA EL ARCHIVO dataBase.dat, de ser necesario actualiza con 5
            ObjectInputStream recuperando= new ObjectInputStream(new FileInputStream("C:/Users/Irina/Desktop/dataBase.dat"));

            Rodado[] lectura= (Rodado[]) recuperando.readObject();

            //cierra el fichero
            recuperando.close();

            //for que filtra según la marca
            for(Rodado e: lectura){
                if(e.getMarcaRodado().equals(marca)){
                    System.out.println(e);
                }

            }
        }catch (Exception e){}
    }
    //LISTAR SEGÚN DIÁMETRO DE RUEDA
    public static void filtrarDiamRueda(double diametro){
        //filtrar segun diametro de rueda
        try{
            //MODIFICAR DIRECCION DE ACUERDO AL LUGAR QUE USTED TENGA EL ARCHIVO dataBase.dat, de ser necesario actualiza con 5
            ObjectInputStream recuperando= new ObjectInputStream(new FileInputStream("C:/Users/Irina/Desktop/dataBase.dat"));
            Rodado[] lectura= (Rodado[]) recuperando.readObject();

            //cierra el fichero
            recuperando.close();

            for(Rodado e: lectura){
                if(e.getDiametroRueda()==diametro){
                    System.out.println(e);
                }

            }
        }catch (Exception e){}
    }
    //LISTAR SEGÚN TALLE DE CUADRO
    public static void filtrarTalleCuadro(String talle){
        //filtrar segun talle de Cuadro
        try{
            //MODIFICAR DIRECCION DE ACUERDO AL LUGAR QUE USTED TENGA EL ARCHIVO dataBase.dat, de ser necesario actualiza con 5
            ObjectInputStream recuperando= new ObjectInputStream(new FileInputStream("C:/Users/Irina/Desktop/dataBase.dat"));

            Rodado[] lectura= (Rodado[]) recuperando.readObject();

            //cierra el fichero
            recuperando.close();

            for(Rodado e: lectura){
                if(e.getTalleCuadro().equals(talle)){
                    System.out.println(e);
                }

            }
        }catch (Exception e){}
    }

    //AGREGAR ARTÍCULOS AL STOCK
    public static void actualizar(){
        //se pueden agregar 100 instancias de clase Rodado, si se quiere agregar más, se debe modificar aquí
        Rodado [] objeto= new Rodado[100];
        //objetos
        objeto[0]= new Rodado("MTB","COMERCIAL",29,"HIDRAULICO","XL");
        objeto[1]= new Rodado("MTB","COMERCIAL",29,"MECÁNICO","XL");
        objeto[2]= new Rodado("ROAD","FABRICANTE",27.5,"HIDRAULICO","L");
        objeto[3]= new Rodado("ROAD","COMERCIAL",26,"MECÁNICO","S");
        objeto[4]= new Rodado("URBANA","FABRICANTE",27,"HIDRAULICO","XL");
        objeto[5]= new Rodado("INFANTIL","COMERCIAL",26,"HIDRAULICO","S");
        objeto[6]= new Rodado("URBANA","FABRICANTE",27,"MECÁNICO","M");
        objeto[7]= new Rodado("INFANTIL","COMERCIAL",26,"HIDRAULICO","S");

        try{
            //Le informo donde buscar
            //MODIFICAR DIRECCION DE ACUERDO AL LUGAR QUE USTED TENGA EL ARCHIVO dataBase.dat, de ser necesario actualiza con 5
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("C:/Users/Irina/Desktop/dataBase.dat"));
            //hago que escriba el objeto
            escritura.writeObject(objeto);
            //cierro el fichero
            escritura.close();

            //le informo donde buscar
            //MODIFICAR DIRECCION DE ACUERDO AL LUGAR QUE USTED TENGA EL ARCHIVO dataBase.dat, de ser necesario actualiza con 5
            ObjectInputStream recuperando= new ObjectInputStream(new FileInputStream("C:/Users/Irina/Desktop/dataBase.dat"));
            //trae el objeto
            Rodado[] lectura= (Rodado[]) recuperando.readObject();
            //cierra el fichero
            recuperando.close();
        }catch (Exception e){}

    }

}
