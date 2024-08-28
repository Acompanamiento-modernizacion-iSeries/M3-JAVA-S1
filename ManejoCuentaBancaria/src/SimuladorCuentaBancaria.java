import java.util.Scanner;

public class SimuladorCuentaBancaria {
    public static void main(String[] args) {
        //Captur datos del cliente.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su Nombre: \n");
        String nombre = scanner.nextLine();

        //Capturar numero de cuenta y saldo.
        System.out.println("Ingrese su número de cuenta: \n");
        int cuenta = scanner.nextInt();

        System.out.println("Ingrese su saldo inicial: \n");
        double saldo = scanner.nextDouble();

        //Registrar transacciones.
        for (int i = 0; i < 5; i ++)
        {
            System.out.println("Ingrese tipo de transacción (1 - Depósito / 2 - Retiro.): \n");
            int tipoTransaccion = scanner.nextInt();

            switch (tipoTransaccion) {
                case 1:
                    System.out.println("Ingrese valor del depósito: \n");
                    double deposito = scanner.nextDouble();
                    if (deposito < 0){
                        System.out.println("Saldo a depositar no puede ser negativo. \n");
                    }else{
                        saldo  = saldo + deposito;
                        System.out.println("Depósito realizado exitosamente.\nSaldo actual: $" +saldo );
                    }
                    break;
                case 2:
                    System.out.println("Ingrese valor del retiro: \n");
                    double retiro = scanner.nextDouble();
                    if (saldo < retiro){
                        System.out.println("Saldo a retirar no es válido" + "\nSaldo actual: $" + saldo + " \nValor a retirar: $" +retiro);
                    }else {
                        saldo  = saldo - retiro;
                        System.out.println("Retiro realizado exitosamente. \nSaldo actual: $" +saldo);
                    }
                    break;
                default:
                    System.out.println("Tipo de transacción inválida: \n");
            }

        }

        //Mostrar saldo.
        System.out.println("\nLuego de las transacciones, su saldo final es: $" +saldo);

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}