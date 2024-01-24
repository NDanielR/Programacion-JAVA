public class DiferentesTiposDeConcatenacion {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;
        long tiempoDeInicio = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(a);

        for(int i=0; i<100000; i++){
           //c= c.concat(a).concat(b).concat("\n");//tiempo usado por este elemento es de 5.49
           //c += a+ b + "\n";//tiempo usando este elemento es de 1.76 segundos
           //sb.append(a).append(b).append("\n");//tiempo usado de este elemento es de 5 milisegundos

        }
        long tiempoDeFinalizacion = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println(tiempoDeFinalizacion - tiempoDeInicio);
    }
}
