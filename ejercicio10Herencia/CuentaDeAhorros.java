package Herencia.ejercicio10Herencia;

public class CuentaDeAhorros extends CuentaBancaria implements Transferible{

    public CuentaDeAhorros() {
        super(2000, "Alex", 87654321);
    }

    @Override
    public void transferir(double dineroTransferido) {
        if (dineroTransferido > dinero || dineroTransferido < 0){
            System.out.println("Ha habido un error...");
        } else if (dineroTransferido < 500) {
            System.out.println("Debes de hacer una transacción mayor a 500 €");
        } else {
            System.out.println(dinero - dineroTransferido);
        }
    }
}
