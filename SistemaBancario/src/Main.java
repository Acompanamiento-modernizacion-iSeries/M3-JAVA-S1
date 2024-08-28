import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*".repeat(24));
        System.out.println(" OPERACIONES");
        System.out.println("*".repeat(24));

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu cuenta: ");
        String cuenta = scanner.nextLine();

        System.out.print("saldo inicial      : ");
        int Saldo = scanner.nextInt();

        System.out.println("*".repeat(24));
        System.out.print(" TIPO OPERACION \n");
        System.out.println("*".repeat(24));

        for (int i = 0; i < 5; i ++){

            System.out.print("1. Deposito  2. Retiro ");
            int tipo_op = scanner.nextInt();
            System.out.println("*".repeat(24));

            System.out.print("Valor operacion: ");
            int valor_operacion = scanner.nextInt();
            System.out.println("*".repeat(24));

            switch (tipo_op) {
                case 1:
                    System.out.println("*".repeat(24));
                    System.out.println("Depositando Valor: " + valor_operacion);
                    Saldo = Saldo + valor_operacion;
                    System.out.println("*".repeat(24));
                    break;
                case 2:
                    System.out.println("*".repeat(24));
                    System.out.println("Retirando Valor: " + Saldo);
                    Saldo = Saldo - valor_operacion;
                    System.out.println("*".repeat(24));
                    break;
                default:
                    System.out.println("*".repeat(24));
                    System.out.println("Opcion invalida. Debe seleccionar 1 para Deposito o 2 para Retiro. ");
                    System.out.println("*".repeat(24));
                    break;
            }
            System.out.println("*".repeat(24));
            System.out.println("Saldo Actual   : " + Saldo);
            System.out.println("*".repeat(24));
        }
    }
}
