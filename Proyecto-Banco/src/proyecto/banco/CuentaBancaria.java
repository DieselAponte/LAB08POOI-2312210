package proyecto.banco;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CuentaBancaria {
    private String numeroCuenta;
    private String descripcionCuenta;
    private String cuentaCCI;
    private double saldoDisponible = 0;
    private List<MovimientoCuenta> movimientos = new ArrayList<>();
    private String estado;

    public CuentaBancaria(String numeroCuenta, String descripcionCuenta, String cuentaCCI, Cliente cliente) {
    this.numeroCuenta = numeroCuenta;
    this.descripcionCuenta = descripcionCuenta;
    this.cuentaCCI = cuentaCCI;
    cliente.addCuenta(this);
}


    public void calcularInteresMensual() {
        double tasaInteresAnual = 0.03; // Cambiar según la tasa de interés
        double interesMensual = (saldoDisponible * tasaInteresAnual) / 12;
        saldoDisponible += interesMensual;
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

    public List<MovimientoCuenta> getMovimientos() {
        return movimientos;
    }
    
    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", descripcionCuenta=" + descripcionCuenta
                + ", cuentaCCI=" + cuentaCCI + ", saldoDisponible=" + saldoDisponible + ", estado=" + estado + "]";
    }
}
