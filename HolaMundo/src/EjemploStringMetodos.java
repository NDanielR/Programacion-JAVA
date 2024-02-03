public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "daniel";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Daniel\") = " + nombre.equals("Daniel"));//compara los valores del string dando como salida true
        System.out.println("nombre.equals(\"daniel\") = " + nombre.equals("daniel"));//compara los caracteres del string
        System.out.println("nombre.compareTo(\"daniel\") = " + nombre.compareTo("daniel"));//si es igual dara un valor 0 por que compara los unicode
        System.out.println("nombre.compareTo(\"Nelson\") = " + nombre.compareTo("Nelson"));//si es igual dara un valor 0 por que compara los unicode
        System.out.println("nombre.charArt(0) = "+ nombre.charAt(0));// imprime el caracter del indice seleccionado
        System.out.println("nombre.charArt(1) = "+ nombre.charAt(1));
        System.out.println("nombre.charArt(2) = "+ nombre.charAt(2));
        System.out.println("nombre.charArt(3) = "+ nombre.charAt(3));
        System.out.println("nombre.charArt(4) = "+ nombre.charAt(4));
        System.out.println("nombre.charArt(5) = "+ nombre.charAt(5));
        System.out.println("nombre.charArt(nombre.length()-1) = "+ nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = "+nombre.substring(1));
        System.out.println("nombre.substring(2,4) = "+nombre.substring(2,4));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace = (\"a\",\"*\") = " + trabalenguas.replace("a","*"));
        System.out.println("trabalenguas.indexOf = "+trabalenguas.indexOf("a"));// muestra la posicion de la primera ocurrencia
        System.out.println("trabalenguas.lastIndexOf = "+trabalenguas.lastIndexOf("a"));// muestra la posicion de la ultima ocurrencia
        System.out.println("trabalenguas.contains(\"t\") = "+trabalenguas.contains("t"));// muestra si contiene la letra "t"
        System.out.println("trabalenguas.contains(\"lenguas\") = "+trabalenguas.contains("lenguas"));// muestra si contiene la palabra "lenguas"
        System.out.println("trabalenguas.startsWith(\"lenguas\") = "+trabalenguas.startsWith("traba"));// muestra si empieza con esta palabra el string
        System.out.println("trabalenguas.endWith(\"lenguas\") = "+trabalenguas.endsWith("lenguas"));// muestra si termina con esta palabra el string
        System.out.println("  trabalenguas = ".trim());// quita los espacios de los laterales
        System.out.println("  trabalenguas = ");


    }
}
