package Herencia.ejercicio5Herencia;

public class Main {
    public static void main(String[] args) {
        Electrodomestico a = new Televisor();
        Electrodomestico b = new Lavadora();

        a.apagar();
        a.encender();

        b.apagar();
        b.encender();
    }
}
