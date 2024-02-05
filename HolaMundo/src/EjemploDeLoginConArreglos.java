import java.util.Scanner;

public class EjemploDeLoginConArreglos {
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
            if (usernames[i].equals(u) && passwords[i].equals(p))
            {
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado)
        {
            System.out.println("Bienvenido usuario ".concat(u).concat("!") );
        }

        else
        {
            System.out.println("username y password incorrectos");
            System.out.println("lo siento, el usuario es incorrecto.");
        }

    }
}
