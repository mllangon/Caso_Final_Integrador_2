package Visitantes;

import Animales.Animales;
import Habitats.Habitat;

public class Quiosco {
    private Animales animal;
    private Habitat habitat;

    public Quiosco(Animales animal, Habitat habitat) {
        this.animal = animal;
        this.habitat = habitat;
    }

    public void mostrarInformacionAnimal() {
        System.out.println("Nombre del animal: " + animal.getNombre());
        System.out.println("Edad del animal: " + animal.getEdad());
        System.out.println("Salud del animal: " + animal.getSalud());
        System.out.println("Alimentación del animal: " + animal.getAlimentacion());
        System.out.println("Comportamiento del animal: " + animal.getComportamiento());
    }

    public void mostrarInformacionHabitat() {
        System.out.println("Temperatura del hábitat: " + habitat.getTemperatura());
        System.out.println("Humedad del hábitat: " + habitat.getHumedad());
        System.out.println("Limpieza del hábitat: " + (habitat.isLimpieza() ? "Limpio" : "Sucio"));
    }
}