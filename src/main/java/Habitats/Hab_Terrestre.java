package Habitats;

public class Hab_Terrestre extends Habitat {
    public static final Hab_Terrestre ZONA_1 = new Hab_Terrestre(25, 80, true, "Tierra", "Sabana", true);
    public static final Hab_Terrestre ZONA_2 = new Hab_Terrestre(30, 70, true, "Tierra", "Jungla", true);
    public static final Hab_Terrestre ZONA_3 = new Hab_Terrestre(33, 60, false, "Tierra", "Montaña", true);
    public static final Hab_Terrestre ZONA_4 = new Hab_Terrestre(27, 50, true, "Tierra", "Jungla", true);
    public static final Hab_Terrestre ZONA_5 = new Hab_Terrestre(30, 40, true, "Tierra", "Sabana", true);
    public String tipoSuelo;
    public String vegetacion;
    public boolean disponibilidadRefugio;

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