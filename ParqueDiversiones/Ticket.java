import java.time.LocalDate;

public abstract class Ticket {
    protected String codigo;
    protected double precio;
    protected LocalDate fechaEmision;

    public Ticket(String codigo, double precio, LocalDate fechaEmision) {
        this.codigo = codigo;
        this.precio = precio;
        this.fechaEmision = fechaEmision;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    
}
