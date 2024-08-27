import java.util.Scanner;

public class SimuladorCuentaBancaria {
    public static void main(String[] args){
        //capturar datos del cliente

        //Capturar numero de cuenta y saldo

        //Registrar transacciones

        //Mostrar saldo final

        System.out.println("Nombre del cliente");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre: \n");
        String nombre = scanner.next();

        System.out.println("Numero de cuenta: \n");
        int numero_de_cuenta = scanner.nextInt();


        System.out.println("Saldo inicial: \n");
        double saldo_inicial = scanner.nextDouble();

        for (int i = 0; i < 5; i++) {
            System.out.println("Depósito 1\nRetiro 2");
            System.out.println("Digite el tipo de transacción:");
            int tipoTransaccion = scanner.nextInt();

            if (tipoTransaccion == 1) {
                System.out.println("Ingrese el monto a depositar:");
                double monto = scanner.nextDouble();
                saldo_inicial += monto;
                System.out.println("Depósito realizado. Saldo actual: " + saldo_inicial + "\n");
            } else if (tipoTransaccion == 2) {
                System.out.println("Ingrese el monto a retirar:");
                double monto = scanner.nextDouble();
                if (monto <= saldo_inicial) {
                    saldo_inicial -= monto;
                    System.out.println("Retiro realizado. Saldo actual: " + saldo_inicial + "\n");
                } else {
                    System.out.println("Saldo insuficiente para realizar el retiro.\n");
                }
            } else {
                System.out.println("Tipo de transacción no válido. Intente nuevamente.\n");
                i--;
            }
        }

        System.out.println("Su saldo final es : " + saldo_inicial);

    }
}
