import java.util.Scanner;
public class TransaccionBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre Cliente: \n");
        String nombre = scanner.next();
        System.out.println("Numero de cuenta: \n");
        double cuenta = scanner.nextDouble();
        System.out.println("Saldo inicial de la cuenta: \n");
        double saldo = scanner.nextDouble();
        double vlr_transaccion;
        for(int i = 0; i < 5; i ++) {
            System.out.println("Tipo transaccion, 1-Deposito, 2-Retiro: \n");
            int tipo = scanner.nextInt();
            if (tipo > 2 || tipo < 1) {
                System.out.println("Error tipo transacción: \n");
            }else{
                System.out.println("Valor transacción: \n");
                vlr_transaccion = scanner.nextDouble();
                if (tipo == 1) {
                    saldo = saldo + vlr_transaccion;
                }else{
                    if (vlr_transaccion > saldo){
                        System.out.println("Saldo menor al retiro: \n");
                    }else{
                        saldo = saldo - vlr_transaccion ;
                    }

                }

            }

        }

    }



}
