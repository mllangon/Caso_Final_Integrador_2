package Habitats;

public class Hab_Acuatico extends Habitat {
    public static final Hab_Acuatico ZONA_1 = new Hab_Acuatico(16, 80, true, 100, 35, 200);
    public static final Hab_Acuatico ZONA_2 = new Hab_Acuatico(12, 70, true, 200, 30, 200);
    public static final Hab_Acuatico ZONA_3 = new Hab_Acuatico(15, 90, true, 300, 25, 300);
    public static final Hab_Acuatico ZONA_4 = new Hab_Acuatico(15, 80, true, 400, 20, 250);
    public static final Hab_Acuatico ZONA_5 = new Hab_Acuatico(5, 70, true, 500, 25, 300);
    public static final Hab_Acuatico ZONA_6 = new Hab_Acuatico(7, 90, true, 600, 30, 300);
    public double nivelAgua;
    public double salinidad;
    public double profundidad;

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