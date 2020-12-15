package esructurasLineales.Grafos;

public class G_ej {
    int[][] A; //matriz adyacencia
    String[] conjV;

    public G_ej(String[] conjV) {
        this.conjV = conjV;
        this.A= new int[conjV.length][conjV.length];
    }
    //conectar los vertices mediante aristas
    public void conectar(String v1, String v2, int existArista){
        int lugarv1=busqueda(v1);
        int lugarv2=busqueda(v2);

        if(lugarv1 != -1 && lugarv2 !=-1){
            A[lugarv1][lugarv2]= existArista;
            A[lugarv2][lugarv1]= existArista;
        }
    }
    //busqueda
    public int busqueda(String v){
        int position=-1;
        for(int i=0; i< conjV.length;i++){
            if(conjV[i].equals(v)){
                position=i;
            }
        }
        return position;
    }

    //mostrar los vertices
    public void mostrarVertices(){
        for(int i=0; i<conjV.length;i++){
            System.out.println(conjV[i]);
        }
    }

    //mostrar matriz de adyacencia
    public void mostrarAdy(){
        for(int i=0; i<conjV.length; i++){
            for(int j=0; j<conjV.length; j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }

    }
    //arraylist
    public void arrayList(){
        for(int i=0; i<conjV.length; i++){
            for(int j=0; j<conjV.length; j++) {
                if(A[i][j]==1){

                }
            }
        } //luego quizas
    }
}
