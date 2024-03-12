package Animales;

public class Aves extends Animales {
    public static final Aves AGUILA_M = new Aves("Águila macho", 2, "Enfermo", "Carnívoro", "Agresiva", "Plumaje blanco y dorado");
    public static final Aves AGUILA_H = new Aves("Águila hembra", 3, "Saludable", "Carnívoro", "Agresiva", "Plumaje blanco y negro");
    public static final Aves PAVO_REAL_M = new Aves("Pavo real macho", 6, "Saludable", "Omnívoro", "Sociable", "Plumaje colorido");
    public static final Aves PAVO_REAL_H = new Aves("Pavo real hembra", 4, "Herida", "Omnívoro", "Calmada", "Plumaje colorido");
    public static final Aves FLAMENCO_M = new Aves("Flamenco macho", 5, "Saludable", "Omnívoro", "Sociable", "Plumaje rosado");
    public static final Aves FLAMENCO_H = new Aves("Flamenco hembra", 3, "Saludable", "Omnívoro", "Agresiva", "Plumaje rosado sucio");
    public static final Aves HALCON = new Aves("Halcón", 4, "Saludable", "Carnívoro", "Agresivo", "Plumaje gris");


    public Aves(String nombre, int edad, String salud, String alimentacion, String comportamiento, String tipoPlumas) {
        super(nombre, edad, salud, alimentacion, comportamiento);
        this.tipoPlumas = tipoPlumas;
    }

    public String tipoPlumas;

    public String getTipoPlumas() {
        return tipoPlumas;
    }

    @Override
    public void comer() {
        System.out.println("El " + nombre + " está comiendo. Dieta: " + alimentacion);
    }

    @Override
    public void dormir() {
        System.out.println("El " + nombre + " está durmiendo.");
    }

    @Override
    public void moverse() {
        System.out.println("El " + nombre + " está volando.");
    }

    @Override
    public void comportarse() {
        System.out.println("El comportamiento de " + nombre + ": " + comportamiento);
    }

    public void tipoPlumas() {
        System.out.println("El " +nombre + " tiene plumaje " + tipoPlumas);
    }
}