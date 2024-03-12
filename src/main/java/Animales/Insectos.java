package Animales;

public class Insectos extends Animales {
public static final Insectos VIUDA_NEGRA = new Insectos("Viuda negra", 1, "Saludable", "Carnívoro", "Calmada");
public static final Insectos MARIPOSA_R = new Insectos("Mariposa rosa", 1, "Saludable", "Herbívoro", "Sociable");
public static final Insectos MARIPOSA_A = new Insectos("Mariposa azul", 2, "Saludable", "Herbívoro", "Sociable");
public static final Insectos ESCARABAJO = new Insectos("Escarabajo", 4, "Saludable", "Herbívoro", "Curioso");
public static final Insectos HORMIGA_B = new Insectos("Hormiga bala", 1, "Saludable", "Herbívoro", "Trabajadora");

    public Insectos(String  nombre, int edad, String salud, String alimentacion, String comportamiento) {
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