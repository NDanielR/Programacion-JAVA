public class ValidacionDeString {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo == true) {
            curso="programación java";
            System.out.println(curso.toUpperCase());
        }
        System.out.println("bienvenidos al curso " + curso);
    }
}
