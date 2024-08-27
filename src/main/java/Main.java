public class Main {
    public static void main(String[] args){
        System.out.println("Hola");

        SistemaBancario sistemaBancario = new SistemaBancario();

        sistemaBancario.solicitarInfo();

        for (int i = 0; i < 5; i++){
            sistemaBancario.ingresarTransaccion();
        }

        System.out.println("Su saldo final es: " + sistemaBancario.findSaldo());
    }
}
