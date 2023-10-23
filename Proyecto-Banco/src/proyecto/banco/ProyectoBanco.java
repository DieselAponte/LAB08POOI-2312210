package proyecto.banco;

import java.util.Date;


public class TestPrincipal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Diesel");
        CuentaSueldo cuentaSueldo = new CuentaSueldo("Kion Cola", cliente, 1500.0, 500.0);
        CuentaFree cuentaFree = new CuentaFree(true, 2000.0, 500.0);

        System.out.println("Saldo inicial de la Cuenta Sueldo: S/ " + cuentaSueldo.getSaldoDisponible());
        System.out.println("Saldo inicial de la Cuenta Free: S/ " + cuentaFree.getSaldoDisponible());

        for (int i = 0; i < 12; i++) {
            cuentaSueldo.calcularInteresMensual();
            cuentaFree.calcularInteresMensual();
        }

        System.out.println("El saldo de las cuentas de ahorro luego de 12 meses es:");
        System.out.println("Nuevo saldo de la Cuenta Sueldo: S/ " + cuentaSueldo.getSaldoDisponible());
        System.out.println("Nuevo saldo de la Cuenta Free: S/ " + cuentaFree.getSaldoDisponible());

        System.out.println("Vamos a registrar asistencias Bancarias !!");
        cliente = cuentaSueldo.getCliente();
        for (int i = 0; i < 5; i++) {
            cliente.addEventoBancario(new EventoBancario(new Date(), "Evento " + i, "Descripción del evento " + i));
            System.out.println("Asistencia a evento bancario registrada.");
        }
        if (cliente.getEventoBancarios().size() >= 5) {
            System.out.println("El cliente ha alcanzado el límite de 5 asistencias a eventos.");
        }

        System.out.println("Se van a simular Retiros bancarios");
        for (int i = 0; i < 5; i++) {
            if (cuentaSueldo.getRetirosEnCajero() < cuentaSueldo.getMaxRetiro()) {
                cuentaSueldo.registrarRetiroCajero(100); // Simulación de retiro de S/ 100
                System.out.println("Retiro en cajero exitoso.");
            } else {
                System.out.println("Se ha alcanzado el límite de 5 retiros en cajero.");
            }
        }

        System.out.println("Se agregan los beneficios");
        cuentaSueldo.agregarBeneficio("Ropa");
        cuentaSueldo.agregarBeneficio("Restaurante");
        cuentaSueldo.agregarBeneficio("Gym");
        cuentaSueldo.agregarBeneficio("Conciertos");
        cuentaSueldo.agregarBeneficio("Vuelos");

        for (String beneficio : cuentaSueldo.getBeneficios()) {
            System.out.println("Beneficio agregado: " + beneficio);
        }
        if (cuentaSueldo.getBeneficios().length >= 5) {
            System.out.println("Se ha alcanzado el límite de 5 beneficios para la cuenta.");
        }

        System.out.println("Beneficio agregado: Teatro");
        cuentaFree.agregarBeneficio("Teatro");
        cuentaFree.agregarBeneficio("Restaurante");
        cuentaFree.agregarBeneficio("Cursos");

        for (String beneficio : cuentaFree.getBeneficios()) {
            System.out.println("Beneficio agregado: " + beneficio);
        }
        if (cuentaFree.getBeneficios().length >= 3) {
            System.out.println("Se ha alcanzado el límite de 3 beneficios para la cuenta.");
        }
    }
}

