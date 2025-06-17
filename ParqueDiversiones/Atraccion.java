import java.util.ArrayList;
import java.util.List;

public class Atraccion {
    private String nombre;
    private int capacidad;
    private int tiempoDuracion;
    private TipoAtraccion tipo;
    private int visitantesEnCola;
    private List<Horario> horariosDisponibles;
    private List<AtraccionTecnico> tecnicosAtraccion;
    private List<Mantenimiento> mantenimientos;

    public Atraccion(String nombre, int capacidad, int tiempoDuracion, TipoAtraccion tipo, int visitantesEnCola) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tiempoDuracion = tiempoDuracion;
        this.tipo = tipo;
        this.visitantesEnCola = visitantesEnCola;
        this.horariosDisponibles = new ArrayList<>();
        this.tecnicosAtraccion = new ArrayList<>();
        this.mantenimientos = new ArrayList<>();
    }

    
    
    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getCapacidad() {
        return capacidad;
    }



    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }



    public int getTiempoDuracion() {
        return tiempoDuracion;
    }



    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }



    public TipoAtraccion getTipo() {
        return tipo;
    }



    public void setTipo(TipoAtraccion tipo) {
        this.tipo = tipo;
    }



    public int getVisitantesEnCola() {
        return visitantesEnCola;
    }



    public void setVisitantesEnCola(int visitantesEnCola) {
        this.visitantesEnCola = visitantesEnCola;
    }



    public List<Horario> getHorariosDisponibles() {
        return horariosDisponibles;
    }



    public void setHorariosDisponibles(List<Horario> horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }



    public List<AtraccionTecnico> getTecnicosAtraccion() {
        return tecnicosAtraccion;
    }



    public void setTecnicosAtraccion(List<AtraccionTecnico> tecnicosAtraccion) {
        this.tecnicosAtraccion = tecnicosAtraccion;
    }



    public List<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }



    public void setMantenimientos(List<Mantenimiento> mantenimientos) {
        this.mantenimientos = mantenimientos;
    }



    public int calcularTiempoDeEspera() {
        return visitantesEnCola * tiempoDuracion;
    }

}
