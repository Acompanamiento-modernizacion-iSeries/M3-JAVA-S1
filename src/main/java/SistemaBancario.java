import java.util.Scanner;

public class SistemaBancario {

    private static String nombre = "";
    private static int numeroCuenta = 0;
    private static double saldo = 0.0;

    Scanner scanner = new Scanner(System.in);

    public void solicitarInfo(){
        System.out.println("Ingrese Nombre:");
        nombre = scanner.nextLine();

        System.out.println("Ingrese Numero de cuenta:");
        numeroCuenta = scanner.nextInt();

        System.out.println("Ingrese Saldo de cuenta:");
        saldo = scanner.nextDouble();
    }

    public void ingresarTransaccion(){
        System.out.println("Ingrese Tipo de transacción:");
        String tipo = scanner.next();

        System.out.println("Ingrese Valor de transacción:");
        double valor  = scanner.nextDouble();

        if("depósito".equals(tipo)){
            saldo += valor;
        } else if("retiro".equals(tipo)){
            saldo -= valor;
        }
        System.out.println("Su saldo es: " + saldo);
    }

    public double findSaldo(){
        return saldo;
    }
}
