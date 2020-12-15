package esructurasLineales.Grafos;
import java.util.Scanner;

public class Grafo {
    int[][] matrizAdyacencia;
    Vertice[] vertices; //conjunto de vertices

    //contructor

    public Grafo(int cantVertices) {
        this.vertices = new Vertice[cantVertices];
        this.matrizAdyacencia = new int[cantVertices][cantVertices];
    }

    //getter & setter

    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }

    public void setMatrizAdyacencia(int[][] matrizAdyacencia) {
        this.matrizAdyacencia = matrizAdyacencia;
    }

    public Vertice[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertice[] vertices) {
        this.vertices = vertices;
    }

    //métodos y procedimientos
    //cargar el conjunto de grafos
    public void cargar(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<vertices.length;i++){
            System.out.println( "vertice: "+(i+1));
            int aux = sc.nextInt();

        }
    }
    //conectar
    public void conectar(int v1, int v2, int ady){
        int index1 = busqueda(v1);
        int index2= busqueda(v2);

        if(index1 != -1 && index2 !=-1){
            matrizAdyacencia[index1][index2]= ady;
            matrizAdyacencia[index2][index1]= ady;
        }
    }
    //busqueda
    public int busqueda(int v) {
        int resultado = -1;
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].equals(v)) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }
    //agregar vértices y aristas a mi matriz de adyacencia
    public void agregar(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<vertices.length;i++){
            for(int j=0; j<vertices.length;j++){
                System.out.print("Agregue la relacion de adyacencia del vértice "+ (i+1)+" con el vértice "+(j+1)+": ");
                matrizAdyacencia[i][j]=sc.nextInt();
            }
        }
    }
    //mostrar
    public void mostrarMatrizAdy(){

        for(int i=0; i<vertices.length;i++){
            for(int j=0; j<vertices.length;j++){
                System.out.print(matrizAdyacencia[i][j]+"\t");
            }
            System.out.println("");
        }
        for(int k=0; k<vertices.length;k++){
            System.out.print(vertices[k]+"\t");
        }

    }
}
