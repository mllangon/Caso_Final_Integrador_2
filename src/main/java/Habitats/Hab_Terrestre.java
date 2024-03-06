package Habitats;

public class Hab_Terrestre extends Habitat {
    private String tipoSuelo;
    private String vegetacion;
    private boolean disponibilidadRefugio;

    public Hab_Terrestre(double temperatura, double humedad, boolean limpieza, String tipoSuelo, String vegetacion, boolean disponibilidadRefugio) {
        super(temperatura, humedad, limpieza);
        this.tipoSuelo = tipoSuelo;
        this.vegetacion = vegetacion;
        this.disponibilidadRefugio = disponibilidadRefugio;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public String getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }

    public boolean isDisponibilidadRefugio() {
        return disponibilidadRefugio;
    }

    public void setDisponibilidadRefugio(boolean disponibilidadRefugio) {
        this.disponibilidadRefugio = disponibilidadRefugio;
    }
}