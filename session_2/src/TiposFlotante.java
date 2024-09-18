public class TiposFlotante {  
    public static void main(String[] args) {
        float numeroFloat = 3.4028235E38f;
        System.out.println("Numero float: " + numeroFloat);
        System.out.println("tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("valor minimo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo float: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("Numero double: " + numeroDouble);
        System.out.println("tipo double corresponde en byte a: " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("valor minimo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo double: " + Double.MAX_VALUE);
    }
}
