import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

       //estructura del operador ternario variable = condicion ? si es verdadero: si no falso;
        String variable = 7==7 ? "la condicion es verdadera" : "es falso";
        boolean variable1 = 7==9 ? true : false ;
        System.out.println("variable = " + variable);
        System.out.println("variable1 = " + variable1);
        String estado;
        double promedio =0.0, matematicas = 0.0, ciencias = 0.0, historia =0.0;
        Scanner s = new Scanner(System.in);

        System.out.println("ingresa la nota de matematicas");
        String m = s.next();
        matematicas = Double.parseDouble(m);

        System.out.println("ingresa la nota de historia");
        String h = s.next();
        historia = Double.parseDouble(h);

        System.out.println("ingresa la nota de ciencias");
        String c = s.next();
        ciencias = Double.parseDouble(c);

        promedio = (matematicas + historia + ciencias)/3;

        estado = promedio >= 5.9 ? "Aprobado": "Rechazado";
        System.out.println("estado = " + estado);
    }

}
