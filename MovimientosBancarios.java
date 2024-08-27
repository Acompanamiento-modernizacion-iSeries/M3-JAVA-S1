import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MovimientosBancarios {
    public static void main(String[] args) {
        String nombre;
        String cuenta;
        double saldo;
        double valor_transaccion;
        boolean valida_entrada = false;
        int tipo_transación;
        String descrip_transaccion;
        ArrayList<String> LogTransacciones = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = scan.next();
        System.out.println("\n");
        System.out.println("Ingrese su número de cuenta:");
        cuenta = scan.next();
        System.out.println("\n");
        System.out.println("Ingrese el saldo inicial de la cuenta:");
        saldo = scan.nextDouble();

        System.out.println("---------------Bienvenido al sistema bancario---------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
            System.out.println("Transacción número: " + (i + 1));
            System.out.println("Por favor ingrese 1 para deposito y 2 para retiro");
            tipo_transación = scan.nextInt();
            System.out.println("Por favor ingrese el valor del la transacción");
            valor_transaccion = scan.nextDouble();
            System.out.println("\n");

            System.out.println("---------------Actualizando saldo---------------");
            if(saldo - valor_transaccion <= 0 && tipo_transación == 2){
                System.out.println("Saldo insuficiente. El saldo doisponible es de: " + saldo);
            }else{
                if(tipo_transación==1) {
                    descrip_transaccion = "DEPOSITO";
                    saldo += valor_transaccion;
                }else{
                    saldo -= valor_transaccion;
                    descrip_transaccion = "RETIRO  ";
                }

                LogTransacciones.add(descrip_transaccion + "               " + valor_transaccion + "       " + saldo);
            }
        }
        System.out.println("\n");
        System.out.println("---------------Finalizando transacción---------------");
        System.out.println("Tipo transacción       valor         saldo");
        LogTransacciones.forEach(System.out::println);

    }
}
