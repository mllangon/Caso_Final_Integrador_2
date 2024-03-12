package Mantenimiento;

public class Camara extends Seguridad{
    public static final Camara INTERIOR;
    public static final Camara EXTERIOR;

    static {
        INTERIOR = new Camara("Interior");
        INTERIOR.setUbicacion("Edificios");
        INTERIOR.setEstado("Encendidas");
        EXTERIOR = new Camara("Exterior");
        EXTERIOR.setEstado("Encendidas");
        EXTERIOR.setUbicacion("Farolas");
    }

    private String tipoCamara;

    public Camara(String tipoCamara) {
        super();
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

    }

    @Override
    public void setUbicacion(String ubicacion) {

    }

    @Override
    public void setEstado(String estado) {

    }
}