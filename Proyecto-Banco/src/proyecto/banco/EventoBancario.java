package proyecto.banco;

import java.util.Date;

public class EventoBancario {
    private Date fecha;
    private String tituloEvento;
    private String descripcionEvento;

    public EventoBancario(Date fecha, String tituloEvento, String descripcionEvento) {
        this.fecha = fecha;
        this.tituloEvento = tituloEvento;
        this.descripcionEvento = descripcionEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }
//asdasd
    @Override
    public String toString() {
        return "EventoBancario [fecha=" + fecha + ", tituloEvento=" + tituloEvento + ", descripcionEvento="
                + descripcionEvento + "]";
    }
}
