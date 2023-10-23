package proyecto.banco;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int dni;
    private List<CuentaBancaria> cuentas = new ArrayList<>();
    private List<EventoBancario> eventoBancarios = new ArrayList();

    public Cliente(String idCliente) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }
  //asd
    public void addCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void addEventoBancario(EventoBancario evento) {
        eventoBancarios.add(evento);
    }

    public String getIdCliente() {
        return idCliente;
    }
//metodos
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public List<EventoBancario> getEventoBancarios() {
        return eventoBancarios;
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
                + direccion + ", telefono=" + telefono + ", dni=" + dni + "]";
    }
}
