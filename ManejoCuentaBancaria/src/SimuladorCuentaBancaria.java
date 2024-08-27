import java.util.Scanner;

public class SimuladorCuentaBancaria {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        //capturar Datos del cliente
        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.next();

        //capturar numero de cuenta y saldo
        System.out.println("Ingresa tu número de cuenta:");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingresa el saldo inicial de tu cuenta bancaria:");
        double saldo = scanner.nextDouble();

        //registrar transacciones
        for (int i= 0; i < 5; i ++){
            System.out.println("Digite el tipo de transacción (Depósitos 1 y Retiro 2 : ");
            int tipoTransaccion = scanner.nextInt();

            System.out.println("Ingresa el valor de la transacción: ");
            double valorTransaccion = scanner.nextDouble();

            if (tipoTransaccion == 1){
                saldo = saldo + valorTransaccion;
                System.out.println("Depósito realizado ... \n");
            }
            if (tipoTransaccion == 2){
                saldo = saldo - valorTransaccion;
                System.out.println("Retiro realizado ... \n");
            }
        }

        //Mostrar Saldo Final
        System.out.println("Tu saldo actual después de realizar las transacciones es: " + saldo);
    }
}
