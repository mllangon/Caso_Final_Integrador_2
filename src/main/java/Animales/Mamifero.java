package Animales;

public class Mamifero extends Animales {

    public static final Mamifero LEON_M = new Mamifero("León macho", 7, "Saludable", "Carnívoro", "Agresivo", "Pelaje Largo y dorado");
    public static final Mamifero LEON_H = new Mamifero ("León hembra", 5, "Saludable", "Carnívoro", "Juguetona", "Pelaje corto y sucio");
    public static final Mamifero TIGRE_M = new Mamifero("Tigre", 4, "Enfermo", "Carnívoro", "Agresivo", "Pelaje corto rayado");
    public static final Mamifero TIGRE_H = new Mamifero("Tigresa", 3, "Saludable", "Carnívoro", "Agresiva", "Pelaje blanco y a rayas");
    public static final Mamifero OSO = new Mamifero("Oso", 10, "Saludable", "Omnívoro", "Pacífico", "Pelaje largo y marrón");
    public static final Mamifero CHIMPANCE_P = new Mamifero("Chimpancé madre", 12, "Saludable", "Omnívoro", "Sociable", "Pelaje corto y gris oscuro");
    public static final Mamifero CHIMPANCE_H = new Mamifero("Chimpancé cría", 2, "Saludable", "Omnívoro", "Sociable", "Pelaje corto y negro");
    public static final Mamifero JIRAFA_M = new Mamifero("Jirafa macho", 7, "Saludable", "Herbívoro", "Pacífico", "Pelaje manchado");
    public static final Mamifero JIRAFA_H = new Mamifero("Jirafa hembra", 9, "Enferma", "Herbíbora", "Sociable" ,"Pelaje manchado");

    public Mamifero(String nombre, int edad, String salud, String alimentacion, String comportamiento, String tipoPelaje) {
        super(nombre, edad, salud, alimentacion, comportamiento);
        this.tipoPelaje = tipoPelaje;
    }

    public String tipoPelaje;

    public String getTipoPelaje() {
        return tipoPelaje;
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

    public void tipoPelaje() {
        System.out.println("Tipo de pelaje de " + nombre + ": " + tipoPelaje);
    }
}
