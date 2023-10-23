package proyecto.banco;

public class CuentaCorriente extends CuentaBancaria {
    private double tasaInteresAnual = 0.02;
    private static final double COMISION_FIJA = 2.0;
    private int maxRetiro;

    public CuentaCorriente(int maxRetiro) {
        super("NumeroCuenta", "DescripcionCuenta", "CuentaCCI", new Cliente("idCliente"));
        this.maxRetiro = maxRetiro;
    }

    public int getMaxRetiro() {
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }

    @Override
    public void calcularInteresMensual() {
        double interesMensual = (getSaldoDisponible() * tasaInteresAnual) / 12;
        setSaldoDisponible(getSaldoDisponible() + interesMensual);
    }

    @Override
    public String toString() {
        return "CuentaCorriente [tasaInteresAnual=" + tasaInteresAnual + ", maxRetiro=" + maxRetiro + "]";
    }
}
