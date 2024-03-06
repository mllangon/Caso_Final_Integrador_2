package Animales;

public class Reptiles extends Animales {

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