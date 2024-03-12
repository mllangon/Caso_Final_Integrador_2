package Mantenimiento;

public class RayosX extends Seguridad {
    public static final RayosX ENTRADA;
    public static final RayosX SALIDA;

    static {
        ENTRADA = new RayosX();
        ENTRADA.setEstado("Encendido");
        ENTRADA.setUbicacion("Puertas de entrada");
        SALIDA = new RayosX();
        SALIDA.setEstado("Apagado");
        SALIDA.setUbicacion("Puertas de salida");
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }
}