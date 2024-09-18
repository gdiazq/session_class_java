public class TipoChar {
    public static void main(String[] args) {
        char caracter = 'a';
        System.out.println("Caracter: " + caracter);
        System.out.println("tipo char corresponde en byte a: " + Character.BYTES);
        System.out.println("tipo char corresponde en bits a: " + Character.SIZE);
        System.out.println("valor minimo char: " + Character.MIN_VALUE);
        System.out.println("valor maximo char: " + Character.MAX_VALUE);

        char caracterUnicode = '\u0021';
        System.out.println("Caracter Unicode: " + caracterUnicode);
        
    }
}
