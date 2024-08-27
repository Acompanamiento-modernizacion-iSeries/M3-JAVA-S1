import java.util.Scanner;

public class SistemBank {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el Nombre del dueño de la Cuenta Bancaria: ");
            String nombre = scanner.nextLine();

            int numeroCuenta;
            boolean validador = true;
            do {
                if (validador){
                    System.out.print("Ingrese su número de cuenta: ");
                }else {
                    System.out.print("Valor no válido. Ingrese su número de cuenta correcto: ");
                }
                validador= false;
                while (!scanner.hasNextInt()) {
                    System.out.print("Valor no válido. Ingrese su número de cuenta (debe ser un número positivo): ");
                    scanner.next();
                }
                numeroCuenta = scanner.nextInt();
            } while (numeroCuenta < 0);

            double saldo;
            validador = true;
            do {
                if (validador){
                    System.out.print("Ingrese su saldo inicial: ");
                }else {
                    System.out.print("Valor no válido. Ingrese un saldo correcto: ");
                }
                validador= false;
                while (!scanner.hasNextDouble()) {
                    System.out.print("Valor no válido. Ingrese su saldo inicial (debe ser un valor positivo): ");
                    scanner.next();
                }
                saldo = scanner.nextDouble();
            } while (saldo < 0);

            for (int i = 1; i <= 5; i++) {
                System.out.println("\n Transacción:  #" + i);

                int tipoTransaccion;
                validador = true;
                do {

                    if (validador){
                        System.out.print("Ingrese 1:depósito o 2:retiro: ");
                    }else {
                        System.out.print("Valor no válido. Ingrese un valor correcto (1:depósito o 2:retiro): ");
                    }
                    validador= false;
                    while (!scanner.hasNextInt()) {
                        System.out.print("Opción no válida. Ingrese 1 para depósito o 2 para retiro: ");
                        scanner.next();
                    }
                    tipoTransaccion = scanner.nextInt();
                } while (tipoTransaccion != 1 && tipoTransaccion != 2);



                double monto;
                validador = true;
                do {

                    if (validador){
                        System.out.print("Ingrese el monto de la transacción: ");
                    }else {
                        System.out.print("Valor no válido. Ingrese un monto correcto: ");
                    }
                    validador= false;
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Valor no válido. Ingrese el monto de la transacción (debe ser un valor positivo): ");
                        scanner.next();
                    }
                    monto = scanner.nextDouble();
                } while (monto <= 0);

                if (tipoTransaccion == 1) {
                    saldo += monto;
                    System.out.println("Depósito realizado. Saldo actual: " + saldo);
                } else if (tipoTransaccion == 2) {
                    if (monto <= saldo) {
                        saldo -= monto;
                        System.out.println("Retiro realizado. Saldo actual: " + saldo);
                    } else {
                        System.out.println("Fondos insuficientes para realizar el retiro.");
                    }
                } else {
                    System.out.println("Transacción inválida.");
                }
            }

            // Mostrar saldo final
            System.out.println("\nNombre: " + nombre);
            System.out.println("Número de cuenta: " + numeroCuenta);
            System.out.println("Saldo final: " + saldo);

            scanner.close();
        }
}


