public class AtraccionTecnico {
    private String nombre;
    private String especialidad;

    public AtraccionTecnico (String nombre, String especialidad ){
        this.especialidad = especialidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    

    
}
