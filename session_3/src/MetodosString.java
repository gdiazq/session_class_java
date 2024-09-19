public class MetodosString {
    public static void main(String[] args) {
        String texto = "Hola";
        System.out.println("texto.length() = " + texto.length());
        System.out.println("texto.toUpperCase() = " + texto.toUpperCase());
        System.out.println("texto.toLowerCase() = " + texto.toLowerCase());
        System.out.println("texto.concat(\" Mundo\") = " + texto.concat(" Mundo"));
        System.out.println("texto = " + texto);
        texto = texto.concat(" Mundo");
        System.out.println("texto = " + texto);
        System.out.println("texto.equals(\"Hola\") = " + texto.equals("Hola"));
        System.out.println("texto.equals(\"Hola Mundo\") = " + texto.equals("Hola Mundo"));
        System.out.println("texto.equals(\"hola mundo\") = " + texto.equals("hola mundo"));
        System.out.println("texto.equalsIgnoreCase(\"hola mundo\") = " + texto.equalsIgnoreCase("hola mundo"));
        System.out.println("texto.compareTo(\"Hola Mundo\") = " + texto.compareTo("Hola Mundo"));
        System.out.println("texto.compareTo(\"hola mundo\") = " + texto.compareTo("hola mundo"));
        System.out.println("texto.charAt(1) = " + texto.charAt(1));
        System.out.println("texto.charAt(0) = " + texto.charAt(0));
        System.out.println("texto.charAt(texto.length() - 1) = " + texto.charAt(texto.length() - 1));
    }
}
