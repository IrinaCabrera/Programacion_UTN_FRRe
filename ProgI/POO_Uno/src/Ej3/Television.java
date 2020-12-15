package Ej3;
import java.util.Objects;
import java.util.Set;

public class Television extends Electrodomestico {
    protected int resolucion;
    protected boolean TDT;

    final int resolucionDEF=20;
    final boolean TDT_DEF=false;

    //constructor por defecto
    public Television() {
        this.resolucion = resolucionDEF;
        this.TDT = TDT_DEF;
    }

    public Television(double precioBase, double peso, int resolucion, boolean TDT) {
        super(precioBase, peso);
        this.resolucion = resolucionDEF;
        this.TDT = TDT_DEF;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean TDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }
    //metodos

    public double precioFinalT(char consumoEnergetico, double peso, int resolucion,boolean TDT) {
        double porcentaje;
        super.precioFinal(consumoEnergetico, peso);
        if(resolucion > 40){
            if(TDT = true){
                porcentaje=(5000)/precioBase;
            }else{
                porcentaje=(3000)/precioBase;
            }
            precioBase=precioBase+porcentaje;
        }
        return super.precioFinal(consumoEnergetico, peso)+precioBase;
    }

    //get

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }
}
