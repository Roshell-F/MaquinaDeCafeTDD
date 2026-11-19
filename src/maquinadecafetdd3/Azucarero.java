package maquinadecafetdd3;


public class Azucarero {

    private int cantidadDeAzucar;

    public Azucarero(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public void setCantidadDeAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public int getCantidadDeAzucar() {
        return cantidadDeAzucar;
    }
    public int getCantidadAzucar() {
        return cantidadDeAzucar;
    }
    public boolean hasAzucar(int cantidadDeAzucar) {
        return this.cantidadDeAzucar >= cantidadDeAzucar;
    }

    public void giveAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar -= cantidadDeAzucar;
    }
}
