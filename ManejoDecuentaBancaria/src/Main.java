import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su número de cuenta: ");
        int numeroDeCuenta = scanner.nextInt();

        System.out.println("Ingrese su saldo: ");
        double saldo = scanner.nextDouble();

        for (int i = 0; i < 5; i++) {
            System.out.println("Transacción # " + (i+1) + " Ingrese el tipo de movimiento a realizar 1 para deposito, 2 para retiro: ");
            int tipoMovimiento = scanner.nextInt();


            if (tipoMovimiento == 1) {
                System.out.println("Ingrese el monto a depositar o retirar: ");
                double monto = scanner.nextDouble();
                saldo += monto;
                System.out.println("Movimiento realizado correctamente");
            } else if (tipoMovimiento == 2) {
                System.out.println("Ingrese el monto a depositar o retirar: ");
                double monto = scanner.nextDouble();
                saldo -= monto;
                System.out.println("Movimiento realizado correctamente");
            } else {
                System.out.println("Tipo de movimiento no válido");
            }

        }

        System.out.println("El saldo final de la cuenta  " + numeroDeCuenta + " del cliente " + nombre + " es " + saldo );
    }
}