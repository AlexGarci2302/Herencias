package Herencia.ejercicio10Herencia;

public class CuentaCorriente extends CuentaBancaria implements Transferible{

    public CuentaCorriente() {
        super(5000, "Antonio", 12345678);
    }

    @Override
    public void transferir(double dineroTransferido) {
        if (dineroTransferido > dinero || dineroTransferido < 0){
            System.out.println("Ha habido un error...");
        } else {
            System.out.println(dinero - dineroTransferido);
        }
    }
}
