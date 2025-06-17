import java.time.LocalDate;

public class Mantenimiento {
    private LocalDate fecha;
    private String observaciones;

    public Mantenimiento(LocalDate fecha, String observaciones) {
        this.fecha = fecha;
        this.observaciones = observaciones;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}
