package esructurasLineales.ColasyPilas;

public class Nodo {
    int valor;
    Nodo siguiente;

    public Nodo(int dato, Nodo nextNodo) {
        this.valor = dato;
        this.siguiente = nextNodo;
    }

    public int getDato() {
        return valor;
    }

    public void setDato(int dato) {
        this.valor = dato;
    }

    public Nodo getNextNodo() {
        return siguiente;
    }

    public void setNextNodo(Nodo nextNodo) {
        this.siguiente = nextNodo;
    }
}
