package esructurasLineales.Xfa;

public class List {
    Node inicio;
    Node fin;

    public List() {
        this.inicio = null;
        this.fin = null;
    }

    //agregar al inicio
    public void agregarInicio(int dataNList){
        //crear Nodo
        inicio = new Node(dataNList,inicio);
        if(fin == null){
            fin=inicio;
        }
    }
    //agregar al final
    public void agregarFin(int dataNList){
        Node newNode= new Node(dataNList);
        if(inicio==null){
            inicio= newNode;
        }else{
            Node aux=inicio;
            while(aux.getNextNode() != null){
                aux = aux.getNextNode();
            }
            aux.setNextNode(newNode);
        }
    }
    //eliminar del inicio
    public void delateInicio(){
        Node recorrer= inicio;
        inicio= recorrer.nextNode;
    }
    //eliminar al final
    public void delateFin(){
        int cont =0;
        Node anterior=inicio;
        Node recorrer= inicio;
        while(recorrer.getNextNode() != null){
            recorrer=recorrer.nextNode;
            cont++;
            if(cont >1){
                anterior=anterior.nextNode;
            }
        }
        anterior.nextNode=null;
    }
    //mostrar
    public void mostrar(){
        Node recorrer= inicio;
        while(recorrer!=null){
            System.out.print("["+recorrer.dataNode+"]--->");
            recorrer=recorrer.nextNode;
        }
    }

    public void add(int i) {
    }

    public void remove(int i) {
    }
}
