package Herencia.ejercicio3Herencia;

public class Programador extends Empleado{

    private static final double PORCENTAJE_APLICACADO = 1.1;

    public Programador() {
        super("Alex", 1000.0);
    }

    @Override
    public double calcularSalarioTotal(){
        return salarioBase*1.1;
    }
}
