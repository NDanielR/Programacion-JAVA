public class Caracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 65;
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);

        System.out.println("\nlos caracteres decimal y caracter son iguales " + "\n" + (decimal==caracter));
        System.out.println("los caracteres simbolo y caracter son iguales " + "\n" + (simbolo==caracter));

        System.out.println("\ntipo char corresponde en byte a  = " + Character.BYTES);
        System.out.println("tipo char corresponde en bites a  = " + Character.SIZE);
        System.out.println("valor maximo de un char = " + Character.MAX_VALUE);
        System.out.println("valor minimo de un char = " + Character.MIN_VALUE);

    }
}
