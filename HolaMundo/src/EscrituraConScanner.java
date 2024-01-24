import java.util.InputMismatchException;
import java.util.Scanner;

public class EscrituraConScanner
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" ingresa numero entero" );
        //String numeroStr = scanner.nextLine();
        int numeroEntero = 0;

        try
        {
            numeroEntero = scanner.nextInt(); // Integer.parseInt(numeroStr);
        }
        catch (InputMismatchException error)//(NumberFormatException error)
        {
            System.out.println("error debes ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println("numero binario de " + numeroEntero + " = " + Integer.toBinaryString(numeroEntero));
        System.out.println("numero octal de " + numeroEntero + " = " + Integer.toOctalString(numeroEntero));
        System.out.println("numero hexadecimal de " + numeroEntero + " = " + Integer.toHexString(numeroEntero));


    }
}
