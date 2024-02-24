public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "creando un objeto de la clase string... que tal!";

        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String= " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Objecto= " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer= " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number= " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Objecto= " + b1);

        Double decimal = 45.45;

        b1 = decimal instanceof Double;
        System.out.println("Decimal es del tipo Integer= " + b1);

        b1 = decimal instanceof Number;
        System.out.println("Decimal es del tipo Number= " + b1);

        b1 = decimal instanceof Object;
        System.out.println("Decimal es del tipo Objecto= " + b1);

        Object texto1 = "hola mundo";
        b1= texto1 instanceof Integer;
        System.out.println("texto1 es del tipo Integer = " + b1);

        Number num1=5.3;
        b1 = num1 instanceof Integer;
        System.out.println("num1 es del tipo integer = " + b1);

        b1 = num1 instanceof Double;
        System.out.println("num1 es del tipo Double = " + b1);
    }
}
