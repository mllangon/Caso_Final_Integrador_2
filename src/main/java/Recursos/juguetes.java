package Recursos;

public class juguetes extends Recursos {
    public static final juguetes RUEDA = new juguetes("Rueda", "Juguete", 79, "Rueda");
    public static final juguetes PELOTA = new juguetes("Pelota", "Juguete", 100, "Pelota");
    public static final juguetes CUERDA = new juguetes("Cuerda", "Juguete", 58, "Cuerda");
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
