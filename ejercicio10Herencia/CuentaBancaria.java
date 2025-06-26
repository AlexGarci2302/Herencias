package Herencia.ejercicio10Herencia;

public abstract class CuentaBancaria {
    protected double dinero;
    protected String nombre;
    protected int numeroCuenta;

    public CuentaBancaria(double dinero, String nombre, int numeroCuenta){
        this.dinero = dinero;
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
    }
}
