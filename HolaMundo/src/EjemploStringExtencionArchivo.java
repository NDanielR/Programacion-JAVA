public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "algun archivo.pdf";
        int i=archivo.indexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));//si el archivo tiene extencion de 3 caracteres funciona pero si cambia falla

        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));//si el archivo tiene extencion de 3 caracteres funciona pero si cambia falla

    }
}
