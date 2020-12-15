package parcial1Prog2;

public class Repartidor extends Empleado{
    protected int zona;

    public Repartidor(String nombre, int edad, double sueldo, int zona) {
        super(nombre, edad, sueldo);
        this.zona = zona;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    @Override
    public double getPlus() {
        double plus;
        double sueldoFinal;
        plus=(10*sueldo)/100;

        if (edad <25 && zona ==3){
            sueldoFinal= sueldo+plus;
        }else{
            sueldoFinal=sueldo+plus;
        }
        return sueldoFinal;
    }
    @Override
    public String toString() {
        return "Repartidor{" +
                "zona=" + zona +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }


}
