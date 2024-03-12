package Recursos;

public class medicinas extends Recursos {
    public static final medicinas IBUPROFENO = new medicinas("Ibuprofeno", "Pastillas", 1000, "Analgésico", "Dolor");
    public static final medicinas MORFINA = new medicinas("Morfina", "Pastillas", 1000, "calmante", "Dolor");
    public static final medicinas IVERMECTINA = new medicinas("Ivermectina", "Crema", 1000, "Antiparasitario", "Parásitos");
    public String tipo;
    public String uso;

    public medicinas(String nombre, String tipo, int cantidad, String tipo2, String uso) {
        super(nombre, tipo, cantidad);
        this.tipo = tipo2;
        this.uso = uso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
}
