package Herencia.ejercicio3Herencia;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal(){
        return salarioBase;
    }
}
