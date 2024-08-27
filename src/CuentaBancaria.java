import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese su saldo inicial: ");
        double saldo = scanner.nextDouble();

        int i = 1;

        for ( ; i <= 5; i++) {
            System.out.println("\nTransacción " + i);
            System.out.print("¿Depósito (D) o un retiro (R)? ");
            char tipoTransaccion = scanner.next().toUpperCase().charAt(0);

            if (tipoTransaccion == 'D') {
                System.out.print("Ingrese el monto de la transacción: ");
                double monto = scanner.nextDouble();
                saldo += monto;
                System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
            } else if (tipoTransaccion == 'R') {
                System.out.print("Ingrese el monto de la transacción: ");
                double monto = scanner.nextDouble();
                if (monto <= saldo) {
                    saldo -= monto;
                    System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
                } else {
                    System.out.println("Fondos insuficientes");
                }
            } else {
                System.out.println("Tipo de transacción no válido");
                if (i >  0)
                    i--;
            }
        }

        System.out.println("\n--- Resumen de la cuenta ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo final: " + saldo);

        scanner.close();
    }
}