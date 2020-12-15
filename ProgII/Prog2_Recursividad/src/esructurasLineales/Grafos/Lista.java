package esructurasLineales.Grafos;

import esructurasLineales.Xfa.Node;

public class Lista {
    Nodo inicio;
    Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }

    //agregar al inicio
    public void agregarInicio(int dataNList){
        //crear Nodo
        inicio = new Nodo(dataNList,inicio);
        if(fin == null){
            fin=inicio;
        }
    }
}
