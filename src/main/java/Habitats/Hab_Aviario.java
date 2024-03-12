package Habitats;

public class Hab_Aviario extends Habitat {
    public static final Hab_Aviario ZONA_1 = new Hab_Aviario(25, 60, true, 30, 3);
    public static final Hab_Aviario ZONA_2 = new Hab_Aviario(23, 70, false, 40, 2);
    public static final Hab_Aviario ZONA_3 = new Hab_Aviario(20, 50, true, 15, 5);
    public static final Hab_Aviario ZONA_4 = new Hab_Aviario(27, 60, false, 60, 1);
    public double altura;
    public int numeroDeNidos;

    public Hab_Aviario(double temperatura, double humedad, boolean limpieza, double altura, int numeroDeNidos) {
        super(temperatura, humedad, limpieza);
        this.altura = altura;
        this.numeroDeNidos = numeroDeNidos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumeroDeNidos() {
        return numeroDeNidos;
    }

    public void setNumeroDeNidos(int numeroDeNidos) {
        this.numeroDeNidos = numeroDeNidos;
    }
}