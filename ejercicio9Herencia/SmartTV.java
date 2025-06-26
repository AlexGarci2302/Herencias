package Herencia.ejercicio9Herencia;

public class SmartTV extends DispositivoInteligente implements ControlRemoto{
    @Override
    public void controlar() {
        System.out.println("Encendiendo tele...");
    }
}
