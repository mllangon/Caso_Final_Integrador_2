package Recursos;

public class juguetes extends Recursos {
    public String tipoJuguete;

    public juguetes(String nombre, String tipo, int cantidad, String tipoJuguete) {
        super(nombre, tipo, cantidad);
        this.tipoJuguete = tipoJuguete;
    }

    public String getTipoJuguete() {
        return tipoJuguete;
    }

    public void setTipoJuguete(String tipoJuguete) {
        this.tipoJuguete = tipoJuguete;
    }
}
