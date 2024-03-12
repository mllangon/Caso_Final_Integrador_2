package Recursos;

public class comida extends Recursos {
    public static final comida CARNE = new comida("Carne", "Comida", 1000, "Carne");
    public static final comida PESCADO = new comida("Pescado", "Comida", 1000, "Pescado");
    public static final comida FRUTA = new comida("Fruta", "Comida", 1000, "Fruta");
    public String tipoComida;

    public comida(String nombre, String tipo, int cantidad, String tipoComida) {
        super(nombre, tipo, cantidad);
        this.tipoComida = tipoComida;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
}
