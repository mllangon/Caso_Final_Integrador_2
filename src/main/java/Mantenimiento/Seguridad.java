package Mantenimiento;

public abstract class Seguridad {
    public String tipo;
    public String ubicacion;
    public String estado;

    public Seguridad() {
    }

    public String getTipo() {
        return tipo;
    }

    public abstract void setTipo(String tipo);

    public String getUbicacion() {
        return ubicacion;
    }

    public abstract void setUbicacion(String ubicacion);

    public String getEstado() {
        return estado;
    }

    public abstract void setEstado(String estado);
}