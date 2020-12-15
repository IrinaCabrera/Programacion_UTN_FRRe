package esructurasLineales.examen;

public class main {
    public static void main(String[] args){
        System.out.println("Grafo n°1, matriz de pesos:");
        Grafo grafo1= new Grafo(new String[]{"A","B","C","D","E","F","G"});
        grafo1.conectar("A","B",7);
        grafo1.conectar("A","D",5);
        grafo1.conectar("B","A",7);
        grafo1.conectar("B","C",8);
        grafo1.conectar("B","D",9);
        grafo1.conectar("B","E",7);
        grafo1.conectar("B","A",7);
        grafo1.conectar("C","B",8);
        grafo1.conectar("C","E",8);
        grafo1.conectar("D","A",5);
        grafo1.conectar("D","B",9);
        grafo1.conectar("D","E",15);
        grafo1.conectar("D","F",6);
        grafo1.conectar("E","B",7);
        grafo1.conectar("E","C",5);
        grafo1.conectar("E","D",15);
        grafo1.conectar("E","F",8);
        grafo1.conectar("E","G",9);
        grafo1.conectar("F","E",8);
        grafo1.conectar("F","D",6);
        grafo1.conectar("F","G",9);
        grafo1.conectar("G","E",9);
        grafo1.conectar("G","F",11);
        grafo1.imprimir();

        System.out.println("Grafo n°2, matriz de pesos:");
        Grafo grafo2= new Grafo(new String[]{"A","B","C","D","E","F","G"},
                new int[][]{{0,7,0,5,0,0,0},{7,0,8,9,7,0,0},{0,8,0,0,5,0,0},{5,9,0,0,15,6,0},{0,7,5,15,0,8,9},
                        {0,0,0,6,8,0,11},{0,0,0,0,9,11,0}});

        grafo2.imprimir();


        System.out.println("entre A y G: "+grafo1.conectados("A","G"));
        System.out.println("entre A y B: "+grafo2.conectados("A","B"));
        System.out.println("entre F y G: "+grafo1.conectados("F","G"));
        System.out.println("entre G y C: "+grafo2.conectados("G","C"));
    }
}
