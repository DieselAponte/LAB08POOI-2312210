
package proyecto.banco;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteresAnual = 0.03; 
    private String[] beneficios;

    public CuentaAhorro(String numeroCuenta, String descripcionCuenta, String cuentaCCI, Cliente cliente,
                        double tasaInteresAnual, String[] beneficios) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, cliente);
        this.tasaInteresAnual = tasaInteresAnual;
        this.beneficios = beneficios;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public String[] getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public void calcularInteresMensual() {
        // Implementa el cálculo de intereses para una cuenta de ahorro aquí
    }

    @Override
    public String toString() {
        return "Cuenta de Ahorro [Número de Cuenta: " + getNumeroCuenta() +
               ", Descripción: " + getDescripcionCuenta() +
               ", Cuenta CCI: " + getCuentaCCI() +
               ", Saldo Disponible: " + getSaldoDisponible() +
               ", Tasa de Interés Anual: " + tasaInteresAnual +
               ", Beneficios: " + java.util.Arrays.toString(beneficios) +
               ", Estado: " + getEstado() + "]";
    }
}