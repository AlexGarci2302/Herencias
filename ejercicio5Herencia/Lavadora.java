package Herencia.ejercicio5Herencia;

public class Lavadora extends Electrodomestico{
    @Override
    public void encender() {
        System.out.println("Encender desde la lavadora");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar desde la lavadora");
    }
}
