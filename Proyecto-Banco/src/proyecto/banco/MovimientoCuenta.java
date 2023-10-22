package proyecto.banco;

import java.util.Date;

public class MovimientoCuenta {
    private String numOperacion;
    private String descripcion;
    private Date fecha;
    private double importe;
    private String tipoOperacion;

    public MovimientoCuenta(String numOperacion, String descripcion, Date fecha, double importe, String tipoOperacion) {
        this.numOperacion = numOperacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.importe = importe;
        this.tipoOperacion = tipoOperacion;
    
}
