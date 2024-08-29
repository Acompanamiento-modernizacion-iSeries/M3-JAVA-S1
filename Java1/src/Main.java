import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        float salario;

        Scanner scanner = new Scanner(System.in);
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
        scanner.close();




    }
}
