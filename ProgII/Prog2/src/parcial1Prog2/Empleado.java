package parcial1Prog2;

abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    public abstract double getPlus();
}
