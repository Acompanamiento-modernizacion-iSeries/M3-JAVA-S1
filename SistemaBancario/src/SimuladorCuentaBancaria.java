import java.util.Scanner;

public class SimuladorCuentaBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su número de cuenta:");
        int numeroCuenta = scanner.nextInt();

        System.out.println("Ingrese su saldo inicial:");
        double saldo = scanner.nextDouble();


        for (int i = 1; i <= 5; i++) {
            System.out.println("Transacción " + i + ":");
            System.out.println("¿Es un depósito o retiro? (1 para depósito, 2 para retiro):");
            int tipoTransaccion = scanner.nextInt();

            System.out.println("Ingrese el monto:");
            double monto = scanner.nextDouble();

            if (tipoTransaccion == 1) {
                saldo += monto;
                System.out.println("Se ha realizado un depósito de " + monto);
            } else if (tipoTransaccion == 2) {
                if (monto <= saldo) {
                    saldo -= monto;
                    System.out.println("Se ha realizado un retiro de " + monto);
                } else {
                    System.out.println("Saldo insuficiente para realizar el retiro.");
                }
            } else {
                System.out.println("Opción no válida.");
            }
            System.out.println("Saldo actual: " + saldo);
        }

        System.out.println("El saldo final de la cuenta es: " + saldo);
        System.out.println("Gracias por utilizar nuestro sistema bancario, " + nombre + ".");

        scanner.close();
    }
}
