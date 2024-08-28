package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el numero de cuenta: ");
        String cuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scanner.nextDouble();
        final int numeroTransacciones = 5;
        scanner.nextLine();
        for (int i = 0; i < numeroTransacciones; i++) {
            System.out.println("Transacción " + (i + 1));
            System.out.print("Ingrese tipo de transacción: 1.deposito o 2.retiro): ");
            String transaccion = scanner.nextLine();
            System.out.print("Ingrese el monto: ");
            double monto = scanner.nextDouble();
            scanner.nextLine();
            if (transaccion.equals("1")) {
                saldo += monto;
            } else if (transaccion.equals("2")) {
                saldo -= monto;
            } else {
                System.out.println("Tipo de transacción no reconocido. Intente de nuevo.");
                i--;
            }
        }
        System.out.println("");
        System.out.println("Resumen:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de cuenta: " + cuenta);
        System.out.println("Saldo final: " + saldo);

        scanner.close();
    }
}
