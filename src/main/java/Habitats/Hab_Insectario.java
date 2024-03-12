package Habitats;

public class Hab_Insectario extends Habitat {
    public static final Hab_Insectario ZONA_1 = new Hab_Insectario(25, 60, true, 0.6, 0.8, 0.9);
    public static final Hab_Insectario ZONA_2 = new Hab_Insectario(25, 60, true, 0.5, 0.7, 1.5);
    public static final Hab_Insectario ZONA_3 = new Hab_Insectario(25, 60, true, 0.4, 0.9, 1.5);
    public static final Hab_Insectario ZONA_4 = new Hab_Insectario(25, 60, true, 0.7, 1.0, 0.7);
    public static final Hab_Insectario ZONA_5 = new Hab_Insectario(25, 60, true, 0.8, 0.5, 0.5);
    public double nivelTierra;
    public double humedadTierra;
    public double profundidadTierra;

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