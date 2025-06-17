import java.util.ArrayList;
import java.util.List;

public class EmpleadoSeguridad {
    private int id;
    private String nombre;
    private List<String> especialidades;
    private List<Incidente> incidentes;

    public EmpleadoSeguridad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.especialidades = new ArrayList<>();
        this.incidentes = new ArrayList<>();
    }

    

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public List<String> getEspecialidades() {
        return especialidades;
    }



    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }



    public List<Incidente> getIncidentes() {
        return incidentes;
    }



    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }



    public void agregarEspecialidad(String especialidad) {
        if (!especialidades.contains(especialidad)) {
            especialidades.add(especialidad);
        }
    }

    public void agregarIncidente(Incidente incidente) {
        incidentes.add(incidente);
    }

    public void mostrarIncidentesReportados() {
        for (Incidente incidente : incidentes) {
            System.out.println("Atracción: " + incidente.getAtraccion().getNombre() +
                               ", Fecha: " + incidente.getFecha() +
                               ", Descripción: " + incidente.getDescripcion() +
                               ", Estado: " + incidente.getEstado());
        }
    }
}
