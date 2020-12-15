package Parcial2;

public class Cliente {
    private String nombre;
    private String CUIT;
    private int edad;
    private double montoTotalCompra;

    //defecto
    final double montoTotalCompraDEF=0;
    //constructores
    public Cliente(String nombre, String CUIT, int edad, double montoTotalCompra) {
        this.nombre = nombre;
        this.CUIT = CUIT;
        this.edad = edad;
        this.montoTotalCompra = montoTotalCompra;
    }
    public Cliente(String nombre, String CUIT, int edad) {
        this.nombre = nombre;
        this.CUIT = CUIT;
        this.edad = edad;
        this.montoTotalCompra=montoTotalCompraDEF;
    }
    //metodos
    int rango=0;
    public int getRango(double montoTotalCompra){
        if(montoTotalCompra<=5000){
            rango=1;
        }if(montoTotalCompra >5000 && montoTotalCompra<=10000){
            rango=2;
        }if(montoTotalCompra >10000){
            rango=3;
        }
        return rango;
    }
    double porcentaje=0;
    public double getDescuento(double montoTotalCompra){
        int result=getRango(montoTotalCompra);
        switch (result){
            case 1:
                porcentaje=0.05;
                break;
            case 2:
                porcentaje=0.01;
                break;
            case 3:
                porcentaje=0.02;
                break;
            default:
                System.out.print("Algo ha pasado");
                break;
        }
        return porcentaje;
    }

    public double getMontoTotalCompra() {
        return montoTotalCompra;
    }

}
