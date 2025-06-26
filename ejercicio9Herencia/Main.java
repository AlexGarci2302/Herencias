package Herencia.ejercicio9Herencia;

public class Main {
    public static void main(String[] args) {
        DispositivoInteligente a = new SmartTV();
        DispositivoInteligente b = new AireAcondicionadoInteligente();

        ((SmartTV)a).controlar();
        ((AireAcondicionadoInteligente)b).controlar();
    }
}
