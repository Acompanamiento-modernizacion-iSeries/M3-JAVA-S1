import java.util.Scanner;

public class SimuladorCuentasBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Captura el nombre del cliente
        System.out.println("Ingrese su Nombre:");
        String nombre = scanner.next();

        //Captura el Numero de Cuenta
        System.out.println("Ingrese su Numero de Cuenta:");
        int numerocuenta = scanner.nextInt();

        //Captura el Numero de Cuenta
        System.out.println("Ingrese su Saldo Inicial:");
        double saldo = scanner.nextDouble();

        // Procesar transacciones
        for (int i = 1; i <= 5; i++) {
            System.out.print("""
                    Ingrese el tipo de transacción:
                    Depósito = 1
                    Retiro = 2\s
                    """);
            String tipoTransaccion = scanner.next();

            System.out.print("Ingrese el monto de la transacción: ");
            double monto = scanner.nextDouble();

            // Actualizar saldo basado en el tipo de transacción
            if (tipoTransaccion.equals("1")) {
                saldo += monto;
            } else if (tipoTransaccion.equals("2")) {
                saldo -= monto;
            } else {
                System.out.println("Tipo de transacción no válido.");
            }
        }

        //Muestra el Saldo Final
        System.out.println("\nNombre del Cliente:" + nombre);
        System.out.println("Cuenta del Cliente:" + numerocuenta);
        System.out.println("Saldo Final:" + saldo);

        scanner.close();

    }
}