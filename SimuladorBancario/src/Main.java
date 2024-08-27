import java.math.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Integer IdCliente ;
        double SaldoCliente =0.0;
        String NombreCliente =" ";
        int transacciones=5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simulador sistema bancario - JMSL -\n");
        System.out.println("Ingrese la identificación del cliente :\n");
        IdCliente = scanner.nextInt();
        if (IdCliente != 0)
        {
            System.out.println("Ingrese el nombre del cliente : \n");
            NombreCliente = scanner.next();
            if (NombreCliente != " ")
            {
                System.out.println("Ingrese el saldo inicial : \n");
                SaldoCliente = scanner.nextDouble();
                for (int i=0 ; i < transacciones ;i++)
                {
                    System.out.println("Ingrese tipo transacción (1=Deposito/ 2=Retiro) \n");
                    int tipo = scanner.nextInt();
                    System.out.println("Ingrese el valor de la transacción  \n");
                    if (tipo == 1 )
                    {
                        SaldoCliente += scanner.nextDouble();
                    }
                    else
                    {
                        SaldoCliente -= scanner.nextDouble();

                    }
                }

            }
            else
            {
                System.out.println("Ingrese algo en el nombre \n");
            }
        }
        else
        {
          System.out.println("Ingrese una identificación diferente \n");
        }

        System.out.println("El saldo actual del cliente "+ IdCliente + " " + NombreCliente + " es = " + SaldoCliente);

    }
}
