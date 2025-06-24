package Herencia.ejercicio3Herencia;

public class Main {
    public static void main(String[] args) {
        Empleado a = new Gerente();
        Empleado b = new Programador();

        System.out.println("Salario total del gerente: " + a.calcularSalarioTotal());
        System.out.println("Salario total del programador: " + b.calcularSalarioTotal());
    }
}
