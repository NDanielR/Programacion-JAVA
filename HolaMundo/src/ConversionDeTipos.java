public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";
        int numeroEntero = Integer.parseInt(numeroStr);
        System.out.println("numeroEntero = " + numeroEntero);

        String realStr = "96325.25e-3";
        double realDouble=Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean=Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int convertirStr = 5236;
        String conversion= Integer.toString(convertirStr);
        System.out.println("conversion = " + conversion);

        conversion=String.valueOf(convertirStr);
        System.out.println("conversion = " + conversion);

        int numeroDescomponer = 521479;
        char[] numeroDescompuesto=Character.toChars(numeroDescomponer);
        System.out.println("numeroDescompuesto = " + numeroDescompuesto);
    }
}
