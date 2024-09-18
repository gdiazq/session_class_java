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

        //Caracteres especiales
        char retornoCarro = '\r';
        char nuevaLinea = '\n';
        char tabulador = '\t';
        char comillaSimple = '\'';
        char comillaDoble = '\"';
        char barraInvertida = '\\';
        char retroceso = '\b';

        System.out.println("Retorno de carro: " + retornoCarro);
        System.out.println("Nueva linea: " + nuevaLinea);
        System.out.println("Tabulador: " + tabulador);
        System.out.println("Comilla simple: " + comillaSimple);
        System.out.println("Comilla doble: " + comillaDoble);
        System.out.println("Barra invertida: " + barraInvertida);
        System.out.println("Retroceso: " + retroceso);
        
    }
}
