package Animales;

public class Reptiles extends Animales {
    public static final Reptiles COCODRILO = new Reptiles("Cocodrilo", 10, "Saludable", "Carnívoro", "Agresivo");
    public static final Reptiles SERPIENTE = new Reptiles("Serpiente", 5, "Saludable", "Carnívoro", "Sigilosa");
    public static final Reptiles LAGARTIJA = new Reptiles("Lagartija", 2, "Saludable", "Omnívoro", "Miedosa");
    public static final Reptiles TORTUGA_M = new Reptiles("Tortuga macho", 75, "Saludable", "Herbívoro", "Lenta");
    public static final Reptiles TORTUGA_H = new Reptiles("Tortuga hembra", 63, "Saludable", "Herbívoro", "Lenta");
    public static final Reptiles CAMALEON = new Reptiles("Camaleón", 3, "Saludable", "Omnívoro", "Camuflaje");

    public Reptiles(String nombre, int edad, String salud, String alimentacion, String comportamiento) {
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
        System.out.println(nombre + " se está moviendo.");
    }

    @Override
    public void comportarse() {
        System.out.println("Comportamiento de " + nombre + ": " + comportamiento);
    }
}