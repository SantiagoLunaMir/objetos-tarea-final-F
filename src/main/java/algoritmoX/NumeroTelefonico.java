package algoritmoX;

public class NumeroTelefonico implements Dependencia2{
    private int numero;

    public NumeroTelefonico(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
