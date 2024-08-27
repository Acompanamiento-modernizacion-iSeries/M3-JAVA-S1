import java.util.Scanner;


// Entrega taller número 1 CAMILO ANDRES GARCIA CRUZ
public class SimuladorCuentaBancaria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el nombre del titular de la cuenta: ");
        String nombre = sc.nextLine();
        System.out.println("\nIngrese el numero de la cuenta: ");
        int numeroCuenta = sc.nextInt();
        System.out.println("\nIngrese el saldo inicial de la cuenta: ");
        double saldo = sc.nextDouble();

        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese el tipo de transacción (1 para depósito, 2 para retiro): ");
            int tipoTransaccion = sc.nextInt();
            System.out.println("Ingrese el monto de la transacción: ");
            double monto = sc.nextDouble();

            if (tipoTransaccion == 1) {
                saldo += monto;
            } else if (tipoTransaccion == 2) {
                saldo -= monto;
            } else {
                System.out.println("Tipo de transacción no válido.");
            }

            System.out.println("Saldo actualizado: " + saldo);
        }

        System.out.println("\nInformacion de la Cuenta Bancaria");
        System.out.println("Titular: " + nombre);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo final: $ " + saldo);

    }
}
