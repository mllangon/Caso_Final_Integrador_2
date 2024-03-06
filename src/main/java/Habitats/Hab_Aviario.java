package Habitats;

public class Hab_Aviario extends Habitat {
    private double altura;
    private int numeroDeNidos;

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