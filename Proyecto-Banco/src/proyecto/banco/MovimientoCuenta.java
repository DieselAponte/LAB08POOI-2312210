
package proyecto.banco;

import java.util.Date;

public class MovimientoCuenta {
    private String numOperacion;
    private String descripcion;
    private Date fecha;
    private double importe;
    private String tipoOperacion;

    // Constructor
    public MovimientoCuenta(String numOperacion, String descripcion, Date fecha, double importe, String tipoOperacion) {
        this.numOperacion = numOperacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.importe = importe;
        this.tipoOperacion = tipoOperacion;
    }

    // Getters y setters
    public String getNumOperacion() {
        return numOperacion;
    }

    public void setNumOperacion(String numOperacion) {
        this.numOperacion = numOperacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    @Override
    public String toString() {
        return "MovimientoCuenta [Número de Operación: " + numOperacion +
               ", Descripción: " + descripcion +
               ", Fecha: " + fecha +
               ", Importe: " + importe +
               ", Tipo de Operación: " + tipoOperacion + "]";
    }
}