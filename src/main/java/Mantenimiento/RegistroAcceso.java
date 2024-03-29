package Mantenimiento;

public class RegistroAcceso {
    public static final RegistroAcceso ENTRADA;
    public static final RegistroAcceso SALIDA;

    static {
        ENTRADA = new RegistroAcceso();
        ENTRADA.setHoraEntrada("10:00");
        ENTRADA.setUsuario("Acceso permitido");
        ENTRADA.setUbicacion("Puertas de entrada");
        SALIDA = new RegistroAcceso();
        SALIDA.setHoraSalida("19:00");
        SALIDA.setUsuario("Acceso permitido");
        SALIDA.setUbicacion("Puertas de salida");

    }

    private String usuario;
    private String horaEntrada;
    private String horaSalida;
    private String ubicacion;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}