package Herencia.ejercicio4Herencia;

public class Circulo extends Figura{

    private static final double PI = 3.1416;
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return PI*(radio*radio);
    }
}
