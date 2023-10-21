
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
    
    // Métodos
    public void calcularInteresMensual() {
        // Implementa el cálculo de intereses mensuales aquí
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public void setDescripcionCuenta(String descripcionCuenta) {
        this.descripcionCuenta = descripcionCuenta;
    }

    public String getCuentaCCI() {
        return cuentaCCI;
    }

    public void setCuentaCCI(String cuentaCCI) {
        this.cuentaCCI = cuentaCCI;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldo) {
        this.saldoDisponible = saldo;
    }

    public ArrayList<MovimientoCuenta> getMovimientos() {
        return movimientos;
    }

    public void agregarMovimiento(MovimientoCuenta movimiento) {
        movimientos.add(movimiento);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Número de Cuenta: " + numeroCuenta +
               ", Descripción: " + descripcionCuenta +
               ", Cuenta CCI: " + cuentaCCI +
               ", Saldo Disponible: " + saldoDisponible +
               ", Estado: " + estado + "]";
    }
}

