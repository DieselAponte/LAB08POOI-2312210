package proyecto.banco;


public class CuentaSueldo extends CuentaAhorro {
    private String nombreEmpresa;

    public CuentaSueldo(String numeroCuenta, String descripcionCuenta, String cuentaCCI, Cliente cliente,
                        double tasaInteresAnual, String[] beneficios, String nombreEmpresa) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, cliente, tasaInteresAnual, beneficios);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "Cuenta Sueldo [Número de Cuenta: " + getNumeroCuenta() +
               ", Descripción: " + getDescripcionCuenta() +
               ", Cuenta CCI: " + getCuentaCCI() +
               ", Saldo Disponible: " + getSaldoDisponible() +
               ", Tasa de Interés Anual: " + getTasaInteresAnual() +
               ", Beneficios: " + java.util.Arrays.toString(getBeneficios()) +
               ", Nombre de la Empresa: " + nombreEmpresa +
               ", Estado: " + getEstado() + "]";
    }
}
