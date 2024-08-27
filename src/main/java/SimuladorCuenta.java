import java.util.Scanner;

public class SimuladorCuenta {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            //Capturar datos del cliente
            System.out.println("Digite nombre del titutla dela cuenta: ");
            String nombre = sc.nextLine();

            //Capturar numero de cuenta y saldo
            System.out.println("Digite el numero de la cuenta:");
            int numeroCuenta = sc.nextInt();
            System.out.println("Digite el saldo de la cuenta:");
            double saldo = sc.nextDouble();

            //Registrar transacciones
            for (int i = 0; i < 5; i++) {
                System.out.println("Escoja el tipo de transaccion a realizar: \n" +
                             "1. Depositar\n" +
                             "2. Retirar\n");
                int tipoTransaccion = sc.nextInt();
                System.out.println("Digite el valor de la transacción: ");
                double valorTransaccion = sc.nextDouble();

                if (tipoTransaccion == 1) {
                    System.out.println("Deposito realizado\n");
                    saldo += valorTransaccion;
                } else if (tipoTransaccion == 2) {
                    System.out.println("Retiro Realizado\n");
                    saldo -= valorTransaccion;
                } else {
                    System.out.println("Transaccion no exitosa.\n");
                }
                System.out.println("Saldo actualizado: " + saldo);
            }

            System.out.println("\nInformacion de la Cuenta Bancaria");
            System.out.println("Titular: " + nombre);
            System.out.println("Numero de cuenta: " + numeroCuenta);
            System.out.println("Saldo final: $ " + saldo);

        }

}
