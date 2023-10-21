
package proyecto.banco;
import java.util.ArrayList;

public class CuentaBancaria {
    private String numeroCuenta;
    private String descripcionCuenta;
    private String cuentaCCI;
    private double saldoDisponible = 0;
    private ArrayList<MovimientoCuenta> movimientos;
    private String estado; // Restringido, Bloqueado y Activo

    // Constructor
    public CuentaBancaria(String numeroCuenta, String descripcionCuenta, String cuentaCCI, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.descripcionCuenta = descripcionCuenta;
        this.cuentaCCI = cuentaCCI;
        this.movimientos = new ArrayList<>();
        this.estado = "Activo"; // Por defecto, la cuenta se crea como "Activo"
    }
    
}

