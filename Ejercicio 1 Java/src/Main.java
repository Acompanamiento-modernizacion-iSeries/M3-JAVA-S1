import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sc.next();
        System.out.println("Hola " + nombre);
        System.out.println("Ingrese su número de cuenta:");
        String numeroCuenta = sc.next();
        System.out.println("El número de cuenta ingresado es: " + numeroCuenta);
        System.out.println("Ingrese su saldo inicial:");
        double saldoInicial =  sc.nextDouble();
        System.out.println("El saldo inicial es: " + saldoInicial);
        for (int i=1; i<5; i++){
            System.out.println("Si desea hacer un DEPÓSITO digite 1 \nSi desea hacer un RETIRO digite 2");
            int select = sc.nextInt();
            if (select == 1){
                System.out.println("Vas a realizar un DEPÓSITO, digite la cantidad a depositar:");
                double dep = sc.nextDouble();
                saldoInicial = saldoInicial + dep;
                System.out.println("Su depósito fue de: " + dep + " Su saldo actual es de: " + saldoInicial);
            }else if(select == 2){
                System.out.println("Vas a realizar un RETIRO, digite la cantidad a retirar:");
                double ret = sc.nextDouble();
                if(saldoInicial < ret){
                    System.out.println("Su saldo es insuficiente");
                }else {
                    saldoInicial = saldoInicial - ret;
                    System.out.println("Su retiro fue de: " + ret + " Su saldo actual es de: " + saldoInicial);
                }
            }else {
                System.out.println("Seleccionaste una opción no válida");

            }

        }
        System.out.println("Sus movimientos han finalizado, el saldo actual es de: " + saldoInicial);
    }
}
