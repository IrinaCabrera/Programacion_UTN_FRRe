package Ej2;

import java.util.Objects;

public class Persona {
    /*Atributos*/
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private String sexo;
    private double peso;
    private double altura;

    /*métodos constructores*/
    public Persona(int DNI, String nombre){
        this.nombre= nombre;
        this.apellido="";
        this.edad=0;
        this.DNI=DNI;
        this.sexo= String.valueOf('H');
        this.peso=0;
        this.altura=0;
    }
    public Persona(int DNI,String nombre,String apellido, int edad, String sexo){
        this.nombre= nombre;
        this.DNI=DNI;
        this.apellido=apellido;
        this.edad= edad;
        this.sexo= sexo;
        this.peso=0;
        this.altura=0;
    }
    public Persona(int DNI,String nombre, String apellido, int edad, String sexo,double peso,double altura){
        this.nombre=nombre;
        this.DNI=DNI;
        this.apellido=apellido;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }
    /*otros métodos*/
    //cálculo de índice de masa corporal
    public int calcularIMC(double peso, double altura){
        double IMC;
        int r=0;
        IMC= peso/(Math.pow(altura,2));
        if(IMC<20){r= -1;}
        if(IMC>=20 && IMC<=25){r= 0;}
        if(IMC>25){ r= 1;}
        if(peso== 0 && altura ==0){r = 2;}
        return r;
    }
    //calculo de mayoría de edad
    public boolean esMayorDeEdad(int edad){
        boolean validacion=false;
        if(edad >17){
            validacion = true;
        }
        return validacion;
    }
    //comprobación de valor introducido respecto al sexo
    public String comprobarSexo(String sexo){
        if(Objects.equals(sexo, "M") || Objects.equals(sexo, "m")){
            sexo= String.valueOf('M');
        }else{
            sexo= String.valueOf('H');}
        return sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
