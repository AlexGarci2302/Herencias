package Herencia.ejercicio3Herencia;

public class Gerente extends Empleado{
    private static final double PORCENTAJE_APLICADO = 1.4;

    public Gerente() {
        super("Antonio", 2000.0);
    }

    @Override
    public double calcularSalarioTotal(){
        return salarioBase*1.40;
    }
}
