package proyecto.banco;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class CuentaSueldo extends CuentaAhorro {

    private String nombreEmpresa;
    private List<MovimientoCuenta> movimientos;
    private int retirosEnCajero;
    private List<String> beneficios;
    private Cliente cliente; 
    private double maxRetiro;
    
    public CuentaSueldo(String nombreEmpresa, Cliente cliente, double saldoInicial, double maxRetiro) {
        super(0.03, new String[]{});
        this.nombreEmpresa = nombreEmpresa;
        this.cliente = cliente; 
        this.maxRetiro = maxRetiro;
        this.movimientos = new ArrayList<>();
        this.retirosEnCajero = 0;
        this.beneficios = new ArrayList<>();
        this.setSaldoDisponible(saldoInicial);
    }

    public double getMaxRetiro() {
        return maxRetiro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getRetirosEnCajero() {
        return retirosEnCajero;
    }

    public String[] getBeneficios() {
        return beneficios.toArray(new String[0]);
    }

    public void registrarRetiroCajero(double monto) {
        if (retirosEnCajero < 5) {
            if (monto <= getSaldoDisponible()) {
                setSaldoDisponible(getSaldoDisponible() - monto);
                movimientos.add(new MovimientoCuenta("Operación en cajero", "Retiro en cajero", new Date(), monto, "Débito"));
                retirosEnCajero++;
            } else {
                System.out.println("Saldo insuficiente para el retiro en cajero.");
            }
        } else {
            System.out.println("Se ha alcanzado el límite de retiros en cajero.");
        }
    }

    public void agregarBeneficio(String beneficio) {
        if (beneficios.size() < 5) {
            beneficios.add(beneficio);
            System.out.println("Beneficio agregado: " + beneficio);
        } else {
            System.out.println("Se ha alcanzado el límite de beneficios para la cuenta.");
        }
    }

    public List<MovimientoCuenta> getMovimientos() {
        return movimientos;
    }
}

