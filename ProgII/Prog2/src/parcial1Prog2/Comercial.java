package parcial1Prog2;

public class Comercial extends Empleado{
    protected double comision;

    public Comercial(String nombre, int edad, double sueldo, double comision) {
        super(nombre, edad, sueldo);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double getPlus() {
        double sueldoFinal;
        if (edad >30 && comision >5000){
            double plus=(10*sueldo)/100;
            sueldoFinal =sueldo + plus + comision;
            return sueldoFinal;
        }else{
            sueldoFinal= sueldo+comision;
        }
        return sueldoFinal;
    }

    @Override
    public String toString() {
        return "comercial{" +
                "comision=" + comision +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }
}
