import java.util.Scanner;

public class OperadorLogicoLogin {

    public static void main(String[] args) {
        String username = "Daniel",username2 = "admin";
        String password = "3103739573", password2 = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese el username = ");
        String u = scanner.next();
        System.out.println("ingresa el password = ");
        String p = scanner.next();
        boolean esAutenticado = false;
        if((username.equals(u) && password.equals(p))||(username2.equals(u) && password2.equals(p))){
            esAutenticado = true;
        }
        else {
            System.out.println("username y password incorrectos");
        }
        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!") );
        }
        else{
            System.out.println("el usuario es incorrecto.");
        }
    }
}
