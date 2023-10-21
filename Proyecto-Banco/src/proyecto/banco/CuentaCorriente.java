
package proyecto.banco;

public class CuentaCorriente {
    private double tasaInteresAnual = 0.02;
    private double COMISIONfija = 2.0;
    private int maxRetiro;

    public CuentaCorriente(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }

    public int getMaxRetiro() {
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }
    
}
