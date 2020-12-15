package Ej2_comp;

public class Libro {
    int ISBN,numPagina;
    String titulo,autor;

    public Libro(int ISBN, int numPagina, String autor) {
        this.ISBN = ISBN;
        this.numPagina = numPagina;
        this.autor = autor;
    }

    //get
    public int getISBN() {
        return ISBN;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    //set
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //toString
    @Override
    public String toString() {
        return "el Libro con ISBN = " + ISBN +
                " creado por el autor = " + autor+
                " tiene " + numPagina +" paginas\n";
    }
    //numero de paginas mayor
    int mayor=0;
    public void numPaginas(int numPagina){
        if(numPagina>mayor){
            mayor=numPagina;
        }
        System.out.print("El libro con mayor numeros de paginas hasta este momento es el que tiene "+mayor+" paginas\n");
    }
}
