import java.time.LocalDateTime;

public class RegistroDePartida {

    private String NombreUsuario;
    private LocalDateTime fecha;
    private int RespuestasCorrectas;
    private int RespuestasIncorrectas;
    private double porcentaje;

    public RegistroDePartida(String nombreUsuario, LocalDateTime fecha, int RespuestasCorrectas, int RespuestasIncorrectas, double porcentaje) {
        this.NombreUsuario = nombreUsuario;
        this.fecha = fecha;
        this.RespuestasCorrectas = RespuestasCorrectas;
        this.RespuestasIncorrectas = RespuestasIncorrectas;
        this.porcentaje = porcentaje;
    }
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getRespuestasCorrectas() {
        return RespuestasCorrectas;
    }

    public int getRespuestasIncorrectas() {
        return RespuestasIncorrectas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}

