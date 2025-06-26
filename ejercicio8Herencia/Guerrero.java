package Herencia.ejercicio8Herencia;

public class Guerrero extends Personaje implements Atacable{

    public Guerrero() {
        super(100, 10);
    }


    @Override
    public void recibirDanyo() {
        System.out.println("Has recibido " + ataque + " de daño.");
    }
}
