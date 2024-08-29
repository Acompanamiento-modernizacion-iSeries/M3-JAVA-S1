import java.util.Scanner;

public class Main {
    /*
        Objetivo.
        Los asistentes deben crear un programa en Java que permita a un usuario ingresar su nombre, número de cuenta,
        saldo inicial y luego registrar una serie de transacciones (depósitos y retiros). El programa debe calcular y
        mostrar el saldo final del cliente.

        Instrucciones.
        Pedir al usuario que ingrese su nombre, número de cuenta y saldo inicial.
        El programa debe utilizar tipos de datos primitivos (String, int, double).
        Permitir al usuario registrar cinco transacciones, especificando si es un depósito o un retiro.
        Actualizar el saldo después de cada transacción.
        Mostrar el saldo final después de registrar todas las transacciones.
        Nota: Los talleres deben entregarse por medio de la estrategia establecida para la formación, por medio de un
        Pull Request desde el repositorio Fork hacia la rama main del repositorio del taller.
     */
    public static void main(String[] args) {
        // capturar datos del cliente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // capturar numero cuenta y saldo
        System.out.println("Ingrese su número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese su saldo inicial: ");
        double saldo = scanner.nextDouble();

        // capturar transacciones
        System.out.println("Cual va a ser el numero de trasacciones a realizar: ");
        int numeroTransacciones = scanner.nextInt();

        for (int i = 0; i < numeroTransacciones; i++) {
            System.out.println("Ingrese el tipo de transacción (depósito o retiro): ");
            String tipoTransaccion = scanner.next();
            System.out.println("Ingrese el monto de la transacción: ");
            double monto = scanner.nextDouble();
            if (tipoTransaccion.equals("depósito")) {
                saldo += monto;
            } else if (tipoTransaccion.equals("retiro")) {
                saldo -= monto;
            }
        }

        // mostrar saldo final
        System.out.println("El saldo final de " + nombre + " con número de cuenta " + numeroCuenta + " es: " + saldo);

        scanner.close();
    }
}