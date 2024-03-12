package Mantenimiento;
public class Mantenimiento {
    private String nombre;
    private String tipo;
    private String estado;
    private String fechaProgramada;
    private String fechaCompletada;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(String fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getFechaCompletada() {
        return fechaCompletada;
    }

    public void setFechaCompletada(String fechaCompletada) {
        this.fechaCompletada = fechaCompletada;
    }
}