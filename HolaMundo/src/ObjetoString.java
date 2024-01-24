public class ObjetoString {
    public static void main(String[] args) {
        String nombre="nelson daniel ramirez";
        String nombre2 = new String("nelson daniel ramirez");

        boolean comparacion = nombre == nombre2;// si comparo de la siguiente manera, no me toma los valores dentro de la variable sino compara el tipo de variable
        boolean comparacion2= nombre.equals(nombre2);//con esta funcion si hago la comparacion de lo que esta dentro de la variable, tambien puedo ignorar las mayusculas si lo necesito.

        System.out.println("son iguales los string = " + "\ncomparacion de tipo de variables " + comparacion + "\ncomparacion del interior de la variable " + comparacion2);
    }
}
