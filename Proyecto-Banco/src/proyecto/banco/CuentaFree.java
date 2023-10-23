package proyecto.banco;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class CuentaFree extends CuentaAhorro {
    private boolean numIlimitadoRetiro;
    private double maxRetiro;
    private List<MovimientoCuenta> movimientos;
    private List<String> beneficios;

    public CuentaFree(boolean numIlimitadoRetiro, double saldoInicial, double maxRetiro) {
        super(0.03, new String[]{});
        this.numIlimitadoRetiro = numIlimitadoRetiro;
        this.maxRetiro = maxRetiro;
        this.movimientos = new ArrayList<>();
        this.beneficios = new ArrayList<>();
        this.setSaldoDisponible(saldoInicial);
    }

    public boolean isNumIlimitadoRetiro() {
        return numIlimitadoRetiro;
    }

    public double getMaxRetiro() {
        return maxRetiro;
    }

    public List<MovimientoCuenta> getMovimientos() {
        return movimientos;
    }

    public String[] getBeneficios() {
        return beneficios.toArray(new String[0]);
    }

    public void registrarRetiroCajero(double monto) {
        if (numIlimitadoRetiro || movimientos.size() < 5) {
            if (monto <= getSaldoDisponible() && monto <= maxRetiro) {
                setSaldoDisponible(getSaldoDisponible() - monto);
                movimientos.add(new MovimientoCuenta("Operación en cajero", "Retiro en cajero", new Date(), monto, "Débito"));
            } else {
                System.out.println("Saldo insuficiente o monto de retiro excede el límite.");
            }
        } else {
            System.out.println("Se ha alcanzado el límite de 5 retiros en cajero.");
        }
    }

    public void agregarBeneficio(String beneficio) {
        if (beneficios.size() < 3) {
            beneficios.add(beneficio);
            System.out.println("Beneficio agregado: " + beneficio);
        } else {
            System.out.println("Se ha alcanzado el límite de beneficios para la cuenta.");
        }
    }

    @Override
    public void calcularInteresMensual() {
        double saldo = getSaldoDisponible();
        double tasaInteres = getTasaInteres();
        double interesMensual = saldo * tasaInteres;
        setSaldoDisponible(saldo + interesMensual);
    }
    
    public double getTasaInteres() {
        return 0.03; 
    }
}
