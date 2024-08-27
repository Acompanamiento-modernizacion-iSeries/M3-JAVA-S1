import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Capturar datos del cliente
        System.out.println("Ingresar nombre del cliente: \n");
        String nombre = scanner.nextLine();

        System.out.println("Ingresar el número de cuenta del cliente: \n");
        int numeroCuenta = scanner.nextInt();

        System.out.println("Ingresar el saldo inicial del cliente: \n");
        double saldo = scanner.nextDouble();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce el monto de la transacción (positivo para depósito, negativo para retiro): \n");
            double transaccion = scanner.nextDouble();

            saldo += transaccion;

            // Mostrar el saldo actualizado después de cada transacción
            System.out.println("Saldo actual: " + saldo);
        }

        scanner.close();
        System.out.println("Saldo final después de las transacciones: " + saldo);

    }
}
