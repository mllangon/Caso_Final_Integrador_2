package Habitats;

public class Hab_Insectario extends Habitat {
    private double nivelTierra;
    private double humedadTierra;
    private double profundidadTierra;

    public Hab_Insectario(double temperatura, double humedad, boolean limpieza, double nivelTierra, double humedadTierra, double profundidadTierra) {
        super(temperatura, humedad, limpieza);
        this.nivelTierra = nivelTierra;
        this.humedadTierra = humedadTierra;
        this.profundidadTierra = profundidadTierra;
    }

    public double getNivelTierra() {
        return nivelTierra;
    }

    public void setNivelTierra(double nivelTierra) {
        this.nivelTierra = nivelTierra;
    }

    public double getHumedadTierra() {
        return humedadTierra;
    }

    public void setHumedadTierra(double humedadTierra) {
        this.humedadTierra = humedadTierra;
    }

    public double getProfundidadTierra() {
        return profundidadTierra;
    }

    public void setProfundidadTierra(double profundidadTierra) {
        this.profundidadTierra = profundidadTierra;
    }
}