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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public abstract void comer();
    public abstract void dormir();
    public abstract void moverse();
    public abstract void comportarse();


}