import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Parque {
    private String nombre;
    private String direccion;
    private String horarioApertura;
    private String horarioCierre;
    private List<Atraccion> listaAtracciones ;

    public Parque (String nombre, String direccion, String horarioApertura, String horarioCierre){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.listaAtracciones = new ArrayList<>();
    }

    

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getHorarioApertura() {
        return horarioApertura;
    }


    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }


    public String getHorarioCierre() {
        return horarioCierre;
    }


    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }


    public List<Atraccion> getListaAtracciones() {
        return listaAtracciones;
    }


    public void setListaAtracciones(List<Atraccion> listaAtracciones) {
        this.listaAtracciones = listaAtracciones;
    }


    public void agregarAtraccion(Atraccion atraccion) {
        listaAtracciones.add(atraccion);
    }
    

    public Atraccion obtenerAtraccionMasVisitada() {
        return listaAtracciones.stream()
                .max(Comparator.comparingInt(Atraccion::getVisitantesEnCola))
                .orElse(null);
    }
    
}
