package maquinadecafetdd3;


public class MaquinaDeCafe {

    public Cafetera cafe;
    public Vaso vasosPequeno;
    public Vaso vasosMediano;
    public Vaso vasosGrande;
    public Azucarero azucar;

    public void setCafetera(Cafetera cafe) {
        this.cafe = cafe;
    }

    public Cafetera getCafetera() {
        return cafe;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setAzucarero(Azucarero azucar) {
        this.azucar = azucar;
    }

    public Azucarero getAzucarero() {
        return azucar;
    }

    public Vaso getTipoDeVaso(String tipoDeVaso) {

        if (tipoDeVaso.equalsIgnoreCase("pequeno")) {
            return vasosPequeno;
        }

        if (tipoDeVaso.equalsIgnoreCase("mediano")) {
            return vasosMediano;
        }

        if (tipoDeVaso.equalsIgnoreCase("grande")) {
            return vasosGrande;
        }

        return null;
    }

    public String getVasoDeCafe(
            Vaso vaso,
            int cantidadDeVasos,
            int cantidadDeAzucar) {

        if (!vaso.hasVasos(cantidadDeVasos)) {
            return "No hay Vasos";
        }

        int cantidadCafeNecesaria =
            vaso.getContenido() * cantidadDeVasos;

        if (!cafe.hasCafe(cantidadCafeNecesaria)) {
            return "No hay Cafe";
        }

        int cantidadAzucarNecesaria =
            cantidadDeAzucar * cantidadDeVasos;

        if (!azucar.hasAzucar(cantidadAzucarNecesaria)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadDeVasos);

        cafe.giveCafe(cantidadCafeNecesaria);

        azucar.giveAzucar(cantidadAzucarNecesaria);

        return "Felicitaciones";
    }
}
