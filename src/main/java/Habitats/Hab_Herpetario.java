package Habitats;

public class Hab_Herpetario extends Habitat {
    public static final Hab_Herpetario ZONA_1 = new Hab_Herpetario(25, 60, true, 0.5, 12, "Tierra");
    public static final Hab_Herpetario ZONA_2 = new Hab_Herpetario(30, 70, true, 0.7, 12, "Tierra");
    public static final Hab_Herpetario ZONA_3 = new Hab_Herpetario(27, 80, true, 1, 12, "Tierra");
    public static final Hab_Herpetario ZONA_4 = new Hab_Herpetario(30, 60, true, 1.5, 12, "Tierra");
    public static final Hab_Herpetario ZONA_5 = new Hab_Herpetario(28, 50, true, 2, 12, "Tierra");
    public static final Hab_Herpetario ZONA_6 = new Hab_Herpetario(30, 70, true, 2.5, 12, "Tierra");
    public static final Hab_Herpetario ZONA_7 = new Hab_Herpetario(26, 50, true, 3, 12, "Tierra");
    public double nivelUVB;
    public String tipoSuelo;

    public Hab_Herpetario(double temperatura, double humedad, boolean limpieza, double nivelUVB, int cicloLuz, String tipoSuelo) {
        super(temperatura, humedad, limpieza);
        this.nivelUVB = nivelUVB;
        this.tipoSuelo = tipoSuelo;
    }

    public double getNivelUVB() {
        return nivelUVB;
    }

    public void setNivelUVB(double nivelUVB) {
        this.nivelUVB = nivelUVB;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }
}
