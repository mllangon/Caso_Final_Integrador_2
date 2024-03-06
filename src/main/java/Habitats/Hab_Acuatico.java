package Habitats;

public class Hab_Acuatico extends Habitat {
    private double nivelAgua;

    public Hab_Acuatico(double temperatura, double humedad, boolean limpieza, double nivelAgua) {
        super(temperatura, humedad, limpieza);
        this.nivelAgua = nivelAgua;
    }

    public double getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }
}