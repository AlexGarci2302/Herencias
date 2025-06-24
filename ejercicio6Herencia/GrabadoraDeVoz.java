package Herencia.ejercicio6Herencia;

public class GrabadoraDeVoz extends Reproductor implements Grabable{

    @Override
    public void apagar(){
        System.out.println("STOP");
    }

    @Override
    public void encender(){
        System.out.println("PLAY");
    }

    @Override
    public void grabar() {
        System.out.println("Grabando...");
    }
}
