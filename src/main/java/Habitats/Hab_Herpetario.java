package Habitats;

public class Hab_Herpetario extends Habitat {
    private double nivelUVB;
    private String tipoSuelo;

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
