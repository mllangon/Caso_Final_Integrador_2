package Recursos;

import java.util.List;

public class Inventario {
    private List<Recursos> recursos;

    public Inventario(List<Recursos> recursos) {
        this.recursos = recursos;
    }

    public List<Recursos> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recursos> recursos) {
        this.recursos = recursos;
    }

    public void agregarRecurso(Recursos recurso) {
        recursos.add(recurso);
    }

    public void eliminarRecurso(Recursos recurso) {
        recursos.remove(recurso);
    }
}