package Habitats;

public class Hab_Acuatico extends Habitat {
    static final Hab_Acuatico OCEANO = new Hab_Acuatico(25, 80, true, 100, 35, 100);
    private double nivelAgua;
    private double salinidad;
    private double profundidad;

    public Hab_Acuatico(double temperatura, double humedad, boolean limpieza, double nivelAgua, double salinidad, double profundidad) {
        super(temperatura, humedad, limpieza);
        this.nivelAgua = nivelAgua;
        this.salinidad = salinidad;
        this.profundidad = profundidad;
    }

    public double getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
}