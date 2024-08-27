import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre:\n");
        String nombre = scanner.next();

        System.out.println("Cedula:\n");
        String cedula = scanner.next();

        System.out.println("Saldo:\n");
        Double saldo = scanner.nextDouble();

        for (int i = 0; i < 5; i++){
            System.out.println("Digite el tipo de transaccion que quiere realizar: ");
            System.out.println(" 1.Deposito\n" +
                               " 2.Retiro");
            int opcion = scanner.nextInt();
            if ( opcion == 1){
                System.out.println("Ingrese el valor a depositar");
                Double deposito = scanner.nextDouble();
                saldo = saldo + deposito;
            } else if (opcion == 2) {
                System.out.println("Ingrese el valor a retirar");
                Double retiro = scanner.nextDouble();
                saldo = saldo - retiro;
            } else if (opcion != 1 && opcion != 2) {
                System.out.println("Ingrese una opcion valida");

            }

        }
        System.out.println("Su nuevo saldo es :" + saldo);
        scanner.close();

    }


}

