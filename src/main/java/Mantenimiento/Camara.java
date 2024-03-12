package Mantenimiento;

public class Camara extends Seguridad{
    public static final Camara INTERIOR;
    public static final Camara EXTERIOR;

    private String tipoCamara;
    private String ubicacion;
    private String estado;

    static {
        INTERIOR = new Camara("Interior");
        INTERIOR.setUbicacion("Edificios");
        INTERIOR.setEstado("Encendidas");
        EXTERIOR = new Camara("Exterior");
        EXTERIOR.setEstado("Encendidas");
        EXTERIOR.setUbicacion("Farolas");
    }

    public Camara(String tipoCamara) {
        this.tipoCamara = tipoCamara;
    }

    public String getTipoCamara() {
        return tipoCamara;
    }

    public void setTipoCamara(String tipoCamara) {
        this.tipoCamara = tipoCamara;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipoCamara = tipo;
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