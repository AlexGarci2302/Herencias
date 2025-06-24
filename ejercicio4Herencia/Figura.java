package Herencia.ejercicio4Herencia;

public class Figura {
    protected double base;
    protected double altura;
    protected double diametro;

    public Figura(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Figura(double diametro){
        this.diametro = diametro;
    }

    public double calcularArea(){
        return 0.0;
    }
}
