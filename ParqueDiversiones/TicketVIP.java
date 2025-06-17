import java.time.LocalDate;

public class TicketVIP extends Ticket{
        private String beneficios;

    public TicketVIP(String codigo, double precio, LocalDate fechaEmision, String beneficios) {
        super(codigo, precio, fechaEmision);
        this.beneficios = beneficios;
    }

    
    public String getBeneficios() {
        return beneficios;
    }
}
