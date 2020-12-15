package esructurasLineales.Arbol.Ejemplo;

public class Arbol {
    Nodo raiz;
    public Arbol(){
        raiz = null;
    }

    //CREAMOS UN METODO PARA INSERTAR FRUTAS EN EL ARBOL
    public void insertar(int i) {
        Nodo n = new Nodo(i);


        //SI LA RAIZ ES NULA SIGNIFICA QUE NO HA EMPEZADO A CRECER EL ARBOL
        if (raiz == null) {
            raiz = n;
        } else {
            // DE LO CONTRARIO CREAMO UN NO AUXILIAR ARA BUSCAR EN DONDE COLOCARLO, SI A LA DER O IZQ
            Nodo aux = raiz;
            //MIENTRAS EL AUXILIAR NO SEA NULO HAGAMOS QUE EL PADRE DEL NODO SEA EL AUXILIAR,
            //ASI VAMOS SUBIENDO EN EL ARBOL
            while (aux != null) {

                n.padre = aux;
                //VALIDAMOS, SI EL INDICE ES MAYOR ENTONCES VA A LA DERECHA
                if (n.llave >= aux.llave) {
                    aux = aux.derecha;
                } else {
                    //SI NO VA A LA IZQUIERDA
                    aux = aux.izquierda;
                }
            }
            //si la llave del nodo actual es menor al indice del nodo padre entonces enlazo la direccion
            //dentro del arbol
            if (n.llave < n.padre.llave) {
                n.padre.izquierda = n;
            } else {
                n.padre.derecha = n;
            }
        }
    }
    public void recorrerIzquierda(Nodo n){
        if (n != null) {
            recorrerIzquierda(n.izquierda);
            System.out.println("Indice " +n.llave+" fruta " + n.contenido);
            recorrerIzquierda(n.derecha);
        }
    }
    public void recorrerDerecha(Nodo n){
        if (n != null) {
            recorrerDerecha(n.derecha);
            System.out.println("Indice " +n.llave+" fruta " + n.contenido);
            recorrerDerecha(n.izquierda);
        }
    }
    public void recorrerPostOrden(Nodo n){
        if (n != null) {
            recorrerPostOrden(n.izquierda);
            recorrerPostOrden(n.derecha);
            System.out.println("Indice " +n.llave);
        }
    }
}
