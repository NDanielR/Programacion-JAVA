import java.util.Scanner;

public class EjemploDeLoginOperadorTernario {
    public static void main(String[] args) {
       /*
        De esta forma tambien puedo crear un array de string

        String[] usernames = new String[2];
        String[] passwords = new String[2];
        
        usernames[0] = "Daniel";
        usernames[1] = "Admin";

        passwords[0] = "3103739573";
        passwords[1] = "1234";*/

        String[] usernames = {"Daniel","Admin"};
        String[] passwords = {"123","1234"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username = ");
        String u = scanner.next();
        System.out.println("ingresa el password = ");
        String p = scanner.next();
        boolean esAutenticado = false;

        for(int i=0; i<usernames.length; i++)
        {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
        }

        String mensaje = esAutenticado ? "bienvenido usuario ".concat(u).concat("!"): "username y password incorrectos \nlo siento, se requiere autenticacion.";
        System.out.println(mensaje);
    }
}
