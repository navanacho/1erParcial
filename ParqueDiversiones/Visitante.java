import java.util.ArrayList;
import java.util.List;

public class Visitante {
    private String nombre;
    private String dni;
    private int edad;
    private List<Entrada> listaEntradas;
    private Ticket ticket;

    public Visitante(String nombre, String dni, int edad, Ticket ticket) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.ticket = ticket;
        this.listaEntradas = new ArrayList<>();
    }

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDni() {
        return dni;
    }



    public void setDni(String dni) {
        this.dni = dni;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public List<Entrada> getListaEntradas() {
        return listaEntradas;
    }



    public void setListaEntradas(List<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }



    public Ticket getTicket() {
        return ticket;
    }



    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }



    public void agregarEntrada(Entrada entrada) {
        listaEntradas.add(entrada);
    }
}
