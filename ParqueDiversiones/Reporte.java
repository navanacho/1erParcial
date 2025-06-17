import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reporte {
    private int id;
    private String detalles;
    private LocalDate fechaEmision;
    private List<Incidente> incidentes;

    public Reporte(int id, String detalles, LocalDate fechaEmision) {
        this.id = id;
        this.detalles = detalles;
        this.fechaEmision = fechaEmision;
        this.incidentes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getDetalles() {
        return detalles;
    }



    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }



    public LocalDate getFechaEmision() {
        return fechaEmision;
    }



    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }



    public List<Incidente> getIncidentes() {
        return incidentes;
    }



    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }



    public void agregarIncidente(Incidente incidente) {
        incidentes.add(incidente);
    }
}
