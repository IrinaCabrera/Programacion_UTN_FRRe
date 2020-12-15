package esructurasLineales.otraLista;

public class ListaSimple {
    protected Nodo inicio, fin; //punteros

    //inicializa el primer nodo
    public ListaSimple(){
        inicio=null;
        fin=null;
    }
    //método para agregar al inicio
    public void agregarAlIinicio(int contenido){//contendio es otro nombre para el dato
        //creamos el nodo y lo apuntamos al inicio
        inicio= new Nodo(contenido,inicio);
        //si fin es == null, queire decir que no hay más nodos. caso contrario, entonces solo se agrega un nodo a inicio
        if(fin==null){
            //esto solo entrará una vez.
            fin=inicio;
        }
    }
    //metodo para mostrar los datos
    public void mostrarDatos(){
        Nodo recorrer= inicio;
        while(recorrer != null){
            System.out.print("["+recorrer.dato+"]--->");
            recorrer=recorrer.siguiente;
        }
    }
}
