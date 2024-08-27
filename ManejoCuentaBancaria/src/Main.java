import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //Captura datos cliente
        System.out.println("Ingrese los datos del cliente \n");
        System.out.println("Nombre: \n");
        String nombre = scanner.next();
        System.out.println("Numero de cuenta: \n");
        int cuenta = scanner.nextInt();
        System.out.println("Saldo inicial: \n");
        double saldo = scanner.nextDouble();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese transaccion num: " + (i + 1));
            System.out.println("Tipo transaccion: ");
            String tip_tx = scanner.next();
            System.out.println("Valor: ");
            double valor = scanner.nextDouble();
            if (tip_tx.equals("deposito") || tip_tx.equals("retiro")) {
                if (tip_tx.equals("deposito")){
                    saldo = saldo + valor;
                }
                else{
                    if(tip_tx.equals("retiro")){
                        saldo = saldo - valor;
                    }
                }

            }
            else {
                System.out.println("Tipo de transaccion incorrecto");
                i = i - 1;
            }
        }
        System.out.println("Saldo final es: " + saldo);
    }
}