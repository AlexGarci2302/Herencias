package Herencia.ejercicio4Herencia;

public class Circulo extends Figura{

    protected static final double PI = 3.1416;

    public Circulo() {
        super(10.0);
    }

    @Override
    public double calcularArea(){
        double radio = this.diametro / 2;
        return PI*(radio*radio);
    }
}
