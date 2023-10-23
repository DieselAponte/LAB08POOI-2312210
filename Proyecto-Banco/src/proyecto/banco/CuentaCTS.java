package proyecto.banco;
 public class CuentaCTS extends CuentaBancaria {
    private double tasaInteresAnual = 0.07;
    private double puntos;

    public CuentaCTS(double puntos) {
        super("NumeroCuenta", "DescripcionCuenta", "CuentaCCI", new Cliente("idCliente"));
        this.puntos = puntos;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

   
    public void calcularInteresMensual() {
        double interesMensual = (getSaldoDisponible() * tasaInteresAnual) / 12;
        setSaldoDisponible(getSaldoDisponible() + interesMensual);
    }

    @Override
    public String toString() {
        return "CuentaCTS [tasaInteresAnual=" + tasaInteresAnual + ", puntos=" + puntos + "]";
    }
}
