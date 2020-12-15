package esructurasLineales.Grafos;

public class Nodo {
    int dato;
    Nodo nextNodo;

    public Nodo(int dato, Nodo nextNodo) {
        this.dato = dato;
        this.nextNodo = nextNodo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNextNodo() {
        return nextNodo;
    }

    public void setNextNodo(Nodo nextNodo) {
        this.nextNodo = nextNodo;
    }
}
