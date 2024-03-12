package Mantenimiento;

public class RayosX extends Seguridad {
    public static final RayosX ENTRADA;
    public static final RayosX SALIDA;

    static {
        ENTRADA = new RayosX("Entrada");
        ENTRADA.setUbicacion("Puertas de entrada");
        ENTRADA.setEstado("Ejecutando");
        SALIDA = new RayosX("Salida");
        SALIDA.setEstado("No ejecutando");
        SALIDA.setUbicacion("Puertas de salida");
    }

    private String tipoRayosX;

    public RayosX(String tipoRayosX) {
        super();
        this.tipoRayosX = tipoRayosX;
    }

    @Override
    public void setTipo(String tipo) {
    }

    @Override
    public void setUbicacion(String ubicacion) {
    }

    @Override
    public void setEstado(String estado) {
    }
}