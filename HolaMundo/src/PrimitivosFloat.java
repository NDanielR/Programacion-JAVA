public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 2548e3f;//2548000.0
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a  = " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a  = " + Float.SIZE);
        System.out.println("valor maximo de un float = " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float = " + Float.MIN_VALUE);

        double numeroDouble = 3.4028235E38;// en este no es necesario determinar el valor de la variable ya esta por defeccto
        System.out.println("\nnumeroDouble = " + numeroDouble);
        System.out.println("tipo Double corresponde en byte a  = " + Double.BYTES);
        System.out.println("tipo Double corresponde en bites a  = " + Double.SIZE);
        System.out.println("valor maximo de un Double = " + Double.MAX_VALUE);
        System.out.println("valor minimo de un Double = " + Double.MIN_VALUE);



    }
}

