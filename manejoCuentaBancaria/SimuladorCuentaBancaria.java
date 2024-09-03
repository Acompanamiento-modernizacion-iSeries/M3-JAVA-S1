import java.util.Scanner;

public class SimuladorCuentaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información del usuario
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su número de cuenta:");
        String numeroCuenta = scanner.nextLine();

        System.out.println("Ingrese el saldo inicial:");
        double saldo = scanner.nextDouble();

        // Limpiar el buffer del scanner
        scanner.nextLine();

        // Registrar transacciones
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el tipo de transacción (depósito/retiro):");
            String tipoTransaccion = scanner.nextLine().toLowerCase();

            System.out.println("Ingrese el monto de la transacción:");
            double monto = scanner.nextDouble();

            // Limpiar el buffer del scanner
            scanner.nextLine();

            // Procesar la transacción
            if (tipoTransaccion.equals("depósito")) {
                saldo += monto;
            } else if (tipoTransaccion.equals("retiro")) {
                saldo -= monto;
            } else {
                System.out.println("Tipo de transacción no válido. Intente nuevamente.");
                i--;
            }
        }

        // Mostrar el saldo final
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo final: " + saldo);

        // Cerrar el scanner
        scanner.close();
    }
}