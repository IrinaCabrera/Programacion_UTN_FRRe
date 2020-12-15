package esructurasLineales.otraLista;
//vaos a recorrer una lista, la cual, agregaremos cada nodo siempre al inicio
//--------------------------------//
//creacion del nodo

public class Nodo {
    //contenido del nodo
    public int dato;
    //hacia donde apuntará el nodo
    public Nodo siguiente;

    //constructores

    //este constructor sirve para agregar el nodo bien al final
    public Nodo(int dato){
        this.dato=dato;
    }
    //este constructor sive para agregar nodos enlazados
    public Nodo(int dato, Nodo siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }
}
