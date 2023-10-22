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

    
}
