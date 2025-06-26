package Herencia.ejercicio7Herencia;

public class BicicletaElectrica extends Transporte implements Electricidad{

    public BicicletaElectrica() {
        super(2);
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando...");
    }
}
