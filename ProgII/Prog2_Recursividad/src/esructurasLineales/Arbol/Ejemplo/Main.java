package esructurasLineales.Arbol.Ejemplo;

public class Main {
    public static void main(String[] args) {

        Arbol arbol = new Arbol();

        arbol.insertar (4);
        arbol.insertar(2);
        arbol.insertar(5);
        arbol.insertar(1);
        arbol.insertar(3);
        arbol.insertar(6);

        System.out.println("de izquierda a derecha");
        arbol.recorrerIzquierda(arbol.raiz);
        System.out.println("de derecha a izquierda");
        arbol.recorrerDerecha(arbol.raiz);
        System.out.println("nuevo:");
        arbol.recorrerPostOrden(arbol.raiz);


    }
}
