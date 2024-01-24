import javax.swing.*;

public class EscrituraConJOption
{
    public static void main(String[] args)
    {
        String numeroStr = JOptionPane.showInputDialog(null, "ingrese un numero entero");

        int numeroEntero = 0;

        try
        {
            numeroEntero = Integer.parseInt(numeroStr);
        }
        catch (NumberFormatException error)
        {
            JOptionPane.showMessageDialog(null, "error debes ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println("numero binario de " + numeroEntero + " = " + Integer.toBinaryString(numeroEntero));
        System.out.println("numero octal de " + numeroEntero + " = " + Integer.toOctalString(numeroEntero));
        System.out.println("numero hexadecimal de " + numeroEntero + " = " + Integer.toHexString(numeroEntero));

    }
}
