package Herencia.ejercicio4Herencia;

public class Main {
    public static void main(String[] args) {
        Figura a = new Circulo(7);
        Figura b = new Rectangulo(10, 5);
        Figura c = new Triangulo(10, 5);

        System.out.println("El área del circulo es: " + a.calcularArea());
        System.out.println("El área del rectángulo es: " + b.calcularArea());
        System.out.println("El área del rectángulo es: " + c.calcularArea());
    }
}
