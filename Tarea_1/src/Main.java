import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String nombreFactura;
        double producto1=0,producto2=0,subtotal,impuesto= 19,costoDeImpuesto,totalConImpuestos;

        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese nombre de la factura" );
        nombreFactura=scanner.nextLine();
        try {
            System.out.println("ingrese valor del primer producto");
            producto1 = scanner.nextDouble();
            System.out.println("ingrese el valor del segundo producto");
            producto2 = scanner.nextDouble();
        }
        catch(InputMismatchException error){
            System.out.println("error debes ingresar valores correctos");
            main(args);
            System.exit(0);
        }

        subtotal= producto1 + producto2;
        costoDeImpuesto = (subtotal * impuesto) / 100;
        totalConImpuestos = subtotal + costoDeImpuesto;

        System.out.println("la factura " + nombreFactura + "\ntiene un subtotal de = " + Double.toString(subtotal) + "\nel valor del impuesto es de = " + Double.toString(costoDeImpuesto) + "\nel total a pagar de la factura es = " + Double.toString(totalConImpuestos));




    }

}