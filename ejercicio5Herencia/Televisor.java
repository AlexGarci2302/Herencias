package Herencia.ejercicio5Herencia;

public class Televisor extends Electrodomestico{
    @Override
    public void encender() {
        System.out.println("Encender con mando");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar con mando");
    }
}
