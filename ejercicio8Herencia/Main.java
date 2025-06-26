package Herencia.ejercicio8Herencia;

public class Main {
    public static void main(String[] args) {
        Personaje a = new Mago();
        Personaje b = new Guerrero();

        ((Mago)a).recibirDanyo();
        ((Guerrero)b).recibirDanyo();
    }
}
