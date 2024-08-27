import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cuenta Bancaria");
        // Capturar datos del cliente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo documento: \n");
        String tipoDoc = scanner.next();
        System.out.println("Documento: \n");
        int documento = scanner.nextInt();
        System.out.println("Nombre: \n");
        String nombre = scanner.next();
        System.out.println("Teléfono: \n");
        String telefono = scanner.next();
        System.out.println("Email: \n");
        String email = scanner.next();

        // Capturar número de cuenta y saldo
        System.out.println("Saldo: \n");
        Double saldo = scanner.nextDouble();
        System.out.println("Cuenta: \n");
        String numCuenta = scanner.next();
        // Registrar transacciones
        double valTransaccion = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Deposito 1\n" + "Retiro 2");
            System.out.println("Digite el tipo de transacción");
            int tipoTransaccion = scanner.nextInt();
            System.out.println("Digite el valor de la transacción: \n");
            double valTran = scanner.nextDouble();
            if (tipoTransaccion == 1) {
                saldo = saldo + valTran;
                System.out.println("Deposito realizado... \n");
            }
            if (tipoTransaccion == 2) {
                saldo = saldo - valTran;
                System.out.println("Retiro realizado... \n");
            }
        }

        // Mostrar saldo final
        System.out.println("Saldo final =  $" + saldo);

        // git fetch upstream

        //git mere upstream/main
    }
}
