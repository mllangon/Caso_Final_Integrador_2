package Animales;

public abstract class Animales {
    protected String nombre;
    protected int edad;
    protected String salud;
    protected String alimentacion;
    protected String comportamiento;

    public Animales(String nombre, int edad, String salud, String alimentacion, String comportamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
        this.alimentacion = alimentacion;
        this.comportamiento = comportamiento;
    }

    public abstract void comer();
    public abstract void dormir();
    public abstract void moverse();
    public abstract void comportarse();
}