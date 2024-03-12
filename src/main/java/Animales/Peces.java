package Animales;

public class Peces extends Animales {
    public static final Peces TIBURON = new Peces("Tiburón", 5, "Saludable", "Carnívoro", "Agresivo");
    public static final Peces PEZ_PAYASO = new Peces("Pez payaso", 2, "Herido", "Carnívoro", "Calmado");
    public static final Peces PEZ_GLOBO = new Peces("Pez globo", 1, "Saludable", "Carnívoro", "Sociable");
    public static final Peces PEZ_CIRUJANO = new Peces("Pez cirujano", 3, "Enfermo", "Carnívoro", "Tranquilo");
    public static final Peces PEZ_MANDARIN = new Peces("Pez mandarín", 2, "Saludable", "Carnívoro", "Posesivo");
    public static final Peces DELFIN = new Peces("Delfín", 10, "Saludable", "Carnívoro", "Juguetón");

    public Peces(String nombre, int edad, String salud, String alimentacion, String comportamiento) {
        super(nombre, edad, salud, alimentacion, comportamiento);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo. Dieta: " + alimentacion);
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está nadando.");
    }

    @Override
    public void comportarse() {
        System.out.println("Comportamiento de " + nombre + ": " + comportamiento);
    }
}