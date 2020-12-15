package esructurasLineales.Arbol.Ejemplo;

public class Nodo {
    public Nodo padre;
    public Nodo derecha;
    public Nodo izquierda;
    public int llave;
    public Object contenido;

    //CREAMOS UN CONSTRUCTOR QUE RECIBA UN INDICE PERO NO LOS DEMAS ATRIBUTOS
    public Nodo(int indice){
        llave = indice;
        derecha=null;
        izquierda=null;
        padre=null;
        contenido=null;
    }
}
