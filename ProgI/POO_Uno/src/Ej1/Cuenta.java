package Ej1;

public class Cuenta {
    //atributos
    private String titular;
    private double cantidad;

    //metodos
    public Cuenta(String titular){
        this.titular=titular;
    }
    public Cuenta(String titular,double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidad){
        if(cantidad >0){
            setCantidad(cantidad);
        }
    }

    public void retirar(double cantidad){
        double resta= getCantidad() - cantidad;
        if(resta <0){
            resta=0;
        }
        setCantidad(resta);
    }

}
