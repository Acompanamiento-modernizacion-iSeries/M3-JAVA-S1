import java.util.Scanner;

public class TransaccionesCuentaBancaria {
    public static void main(String[] args) {
        // ingrese su nombre,Titular cuenta, saldo inicial
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Titular de la cuenta: ");
        String nombre  = scanner.nextLine();

        System.out.println("Ingrese Número de la cuenta: ");
        int cuenta  = scanner.nextInt();

        System.out.println("Ingrese Saldo inicial: ");
        double saldo  = scanner.nextDouble();

        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese el tipo de transacción (1 para depósito, 2 para retiro): ");
            int tipoTransaccion = scanner.nextInt();
            System.out.println("Ingrese el monto de la transacción: ");
            double monto = scanner.nextDouble();

            if (tipoTransaccion == 1) {
                saldo += monto;
            } else if (tipoTransaccion == 2) {
                saldo -= monto;
            } else {
                System.out.println("Tipo de transacción no válido.");
            }
            System.out.println("Saldo actualizado: "+ saldo);
        }
        System.out.println("Titular: " + nombre);
        System.out.println("Numero de cuenta: "+ cuenta);
        System.out.println("Saldo cuenta final: $ " + saldo);

        scanner.close();



    }


}