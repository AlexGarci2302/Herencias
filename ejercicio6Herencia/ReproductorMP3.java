package Herencia.ejercicio6Herencia;

public class ReproductorMP3 extends Reproductor{
    @Override
    public void apagar(){
        System.out.println("STOP");
    }

    @Override
    public void encender(){
        System.out.println("PLAY");
    }
}
