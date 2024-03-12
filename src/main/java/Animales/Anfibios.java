package Animales;

public class Anfibios extends Animales {
    public static final Anfibios RANA = new Anfibios("Rana", 2, "Saludable", "Insectos", "Cariñosa");
    public static final Anfibios SALAMANDRA = new Anfibios("Salamandra", 3, "Saludable", "Insectos", "Sociable");
    public static final Anfibios TRITON = new Anfibios("Tritón", 1, "Saludable", "Insectos", "Curioso");

    public Anfibios(String nombre, int edad, String salud, String alimentacion, String comportamiento) {
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
        System.out.println(nombre + " está saltando.");
    }

    @Override
    public void comportarse() {
        System.out.println("Comportamiento de " + nombre + ": " + comportamiento);
    }
}