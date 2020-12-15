package Ej1_Circulo;

public class circulo {
    private double radio;
    final double radius=1.0;
    double Area;
    double Pi=3.14;

    public double getArea(double radio) {
        Area = Pi*(Math.pow(getRadio(),2));
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public circulo(double radio) {
        this.radio = radio;
    }

    public circulo() {
        this.radio = radius;
    }
    public double getRadio() {

        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getCircunferencia() {
        double Circunferencia = Math.pow(radio,2);
        return 0;
    }

    @Override
    public String toString() {
        return "circulo{" +
                "radio=" + radio +
                ", radius=" + radius +
                ", Area=" + getArea(getRadio()) +
                '}';
    }
}
