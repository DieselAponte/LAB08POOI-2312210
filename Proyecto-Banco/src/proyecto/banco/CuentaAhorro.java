package proyecto.banco;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteresAnual = 0.03;
    private String[] beneficios;

    public CuentaAhorro(double tasaInteresAnual, String[] beneficios) {
        super("NumeroCuenta", "DescripcionCuenta", "CuentaCCI", new Cliente("idCliente"));
        this.tasaInteresAnual = tasaInteresAnual;
        this.beneficios = beneficios;
    }

    public String[] getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    
    public void calcularInteresMensual() {
        double interesMensual = (getSaldoDisponible() * tasaInteresAnual) / 12;
        setSaldoDisponible(getSaldoDisponible() + interesMensual);
    }

    @Override
    public String toString() {
        return "CuentaAhorro [tasaInteresAnual=" + tasaInteresAnual + ", beneficios=" + beneficios + "]";
    }
}
.
