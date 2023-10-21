package proyecto.banco;

public class CuentaCTS extends CuentaBancaria {
    private double tasaInteresAnual = 0.07; // 7%
    private double puntos;

    public CuentaCTS(String numeroCuenta, String descripcionCuenta, String cuentaCCI, Cliente cliente, double puntos) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, cliente);
        this.puntos = puntos;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    @Override
    public void calcularInteresMensual() {
        // Implementa el cálculo de intereses para una cuenta CTS aquí
    }

    @Override
    public String toString() {
        return "Cuenta CTS [Número de Cuenta: " + getNumeroCuenta() +
               ", Descripción: " + getDescripcionCuenta() +
               ", Cuenta CCI: " + getCuentaCCI() +
               ", Saldo Disponible: " + getSaldoDisponible() +
               ", Tasa de Interés Anual: " + tasaInteresAnual +
               ", Puntos: " + puntos +
               ", Estado: " + getEstado() + "]";
    }
}
