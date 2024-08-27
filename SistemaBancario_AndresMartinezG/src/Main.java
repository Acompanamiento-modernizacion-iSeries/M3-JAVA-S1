import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calcule su saldo actual");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su Nombre:");
        String nombre = scanner.next();

        System.out.println("Ingrese su Numero de Cuenta:");
        int numCuenta = scanner.nextInt();

        System.out.println("Ingrese el Saldo Inicial:");
        double saldoActual = scanner.nextDouble();

        System.out.println("Ingrese el Numero de Transacciones a Ingresar:");
        int numTransacc = scanner.nextInt();

        String tipoTransacc;
        boolean transccValida;
        double vlrTransacc;

        for (int i = 1; i <= numTransacc; i++) {
            do {
                System.out.println("Ingrese el Tipo de la Transaccion " + i + " (Deposito / Retiro):");
                tipoTransacc = scanner.next().toLowerCase();

                transccValida = (tipoTransacc.equals("deposito") || tipoTransacc.equals("retiro"));
                if (!transccValida) {
                    System.out.println("Tipo de transaccion no reconocida!");
                }
            } while (!transccValida);

            System.out.println("Ingrese el Valor de la Transaccion:");
            vlrTransacc = scanner.nextDouble();

            switch (tipoTransacc) {
                case "deposito":
                    saldoActual += vlrTransacc;
                case "retiro":
                    saldoActual -= vlrTransacc;
            }
        }

        scanner.close();
        System.out.println("El cliente " + nombre +
                " tiene en la cuenta " + numCuenta +
                " un saldo actual de: " + saldoActual);
    }
}
