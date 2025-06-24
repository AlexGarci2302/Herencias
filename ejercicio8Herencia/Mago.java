package Herencia.ejercicio8Herencia;

public class Mago extends Personaje implements Atacable{


    public Mago() {
        super(50, 25);
    }

    @Override
    public void recibirDanyo() {
        System.out.println("Has recibido " + ataque + " de daño.");
    }
}
