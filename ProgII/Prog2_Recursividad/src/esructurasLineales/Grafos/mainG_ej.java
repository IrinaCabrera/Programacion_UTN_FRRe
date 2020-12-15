package esructurasLineales.Grafos;

public class mainG_ej {
    public static void main(String[]args){
        G_ej graf = new G_ej(new String[]{"Buenos Aires", "San Pedro", "San Luis", "Bahia Blanca",
                "Mendoza","Rosario","Villa María", "Córdoba"});

        graf.conectar("Buenos Aires","San Pedro",1);
        graf.conectar("Buenos Aires","San Luis",1);
        graf.conectar("Buenos Aires","Bahia Blanca",1);
        graf.conectar("San Pedro","Rosario",1);
        graf.conectar("San Luis","Mendoza",1);
        graf.conectar("San Luis","Villa María",1);
        graf.conectar("San Luis","Bahia Blanca",1);
        graf.conectar("Rosario","Villa María",1);
        graf.conectar("Villa María","Córdoba",1);
        graf.mostrarAdy();


    }


}
