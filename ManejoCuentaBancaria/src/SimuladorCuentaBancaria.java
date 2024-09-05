import javax.swing.*;

public class SimuladorCuentaBancaria {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Nombre del cliente?");
        int cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
        String operacion = null;
        double transaccion = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Index->"+i);
            transaccion = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese valor de la transaccion "+i));
            System.out.println("Valor transacción->"+transaccion);
            operacion = JOptionPane.showInputDialog("D:Deposito - R:Retiro para transacción "+i);
            System.out.println("Depósito o Retiro->"+operacion);
            saldo += operacion.equals("D") ? transaccion : -transaccion;
            System.out.println("Saldo actual->"+saldo);
        }
        JOptionPane.showMessageDialog(null,nombre +" con el número de cuenta "+
                cuenta + " tiene un saldo final de "+saldo);
    }
}
