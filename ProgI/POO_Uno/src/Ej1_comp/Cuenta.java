package Ej1_comp;

public class Cuenta {
    String titular;
    double cantidad;

    //constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public Cuenta(String titular) {
        this.titular = titular;
    }
    //metodos
    public double ingresar(double cantidad){
        if(cantidad >0){
            setCantidad(cantidad);
        }else{
            setCantidad(0);
        }
        return cantidad;
    }
    public double retirar(double cantidadR){
        cantidad=cantidad-cantidadR;
        if(cantidadR<0){
            setCantidad(0);
        }
        return cantidad;
    }
    //get
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    //set
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
