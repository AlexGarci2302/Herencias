package Herencia.ejercicio10Herencia;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente a = new CuentaCorriente();
        CuentaDeAhorros b = new CuentaDeAhorros();

        a.transferir(7000);
        a.transferir(-100);
        a.transferir(1000);

        System.out.println("-----");

        b.transferir(100);
        b.transferir(1000);
    }
}
