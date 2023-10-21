package proyecto.banco;


public class CuentaFree extends CuentaAhorro {
    private boolean numIlimitadoRetiro;

    public CuentaFree(String numeroCuenta, String descripcionCuenta, String cuentaCCI, Cliente cliente,
                      double tasaInteresAnual, String[] beneficios, boolean numIlimitadoRetiro) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, cliente, tasaInteresAnual, beneficios);
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    public boolean isNumIlimitadoRetiro() {
        return numIlimitadoRetiro;
    }

    public void setNumIlimitadoRetiro(boolean numIlimitadoRetiro) {
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    @Override
    public String toString() {
        return "Cuenta Free [Número de Cuenta: " + getNumeroCuenta() +
               ", Descripción: " + getDescripcionCuenta() +
               ", Cuenta CCI: " + getCuentaCCI() +
               ", Saldo Disponible: " + getSaldoDisponible() +
               ", Tasa de Interés Anual: " + getTasaInteresAnual() +
               ", Beneficios: " + java.util.Arrays.toString(getBeneficios()) +
               ", Número Ilimitado de Retiros: " + numIlimitadoRetiro +
               ", Estado: " + getEstado() + "]";
    }
}

