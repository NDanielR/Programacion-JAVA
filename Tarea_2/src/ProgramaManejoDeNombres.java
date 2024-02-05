import javax.swing.*;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null, "ingrese el primer nombre");//ingresar datos por teclado
        String nombre2 = JOptionPane.showInputDialog(null, "ingrese el segundo nombre");
        String nombre3 = JOptionPane.showInputDialog(null, "ingrese el tercer nombre");

        char resultado1= Character.toUpperCase(nombre1.charAt(1));//imprime el caracter segun el indice que yo indique
        char resultado2= Character.toUpperCase(nombre2.charAt(1));
        char resultado3= Character.toUpperCase(nombre3.charAt(1));
        String resultado4=nombre1.substring(nombre1.length()-2);// imprime los ultimos dos caracteres del nombre
        String resultado5=nombre2.substring(nombre2.length()-2);
        String resultado6=nombre3.substring(nombre3.length()-2);
        System.out.println("resultado = " + resultado1 + "." + resultado4 + "_" + resultado2 + "." + resultado5 + "_" + resultado3 + "." + resultado6);

    }
}
/*
ejemplo 1
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);
        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
}

ejemplo 2
import java.util.*;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        int longitud;
        StringBuilder resultado_final = new StringBuilder();
        String[] cadena_nombres = new String[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de 3 personas:");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1)+".- ");
            cadena_nombres[i] = scanner.nextLine();
            longitud = cadena_nombres[i].length();
            resultado_final.append(String.valueOf(cadena_nombres[i].charAt(1)).toUpperCase().concat(".").concat(cadena_nombres[i].substring(longitud - 2)));
            if(i<2){
                resultado_final.append("_");
            }
        }
        System.out.println("\nResultado final: "+resultado_final);
    }
}
 */