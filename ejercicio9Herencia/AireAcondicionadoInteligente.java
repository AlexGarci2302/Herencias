package Herencia.ejercicio9Herencia;

public class AireAcondicionadoInteligente extends DispositivoInteligente implements ControlRemoto{
    @Override
    public void controlar() {
        System.out.println("Ajustando temperatura...");
    }
}
