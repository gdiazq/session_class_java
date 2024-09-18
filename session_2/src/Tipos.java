public class Tipos {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("Numero byte: " + numeroByte);
        System.out.println("tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = 30767;
        System.out.println("Numero short: " + numeroShort);
        System.out.println("tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a: " + Short.SIZE);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);
    }
}
