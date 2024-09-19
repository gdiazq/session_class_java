public class StringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "imagen.jpg";
        int i = archivo.lastIndexOf(".");
        System.out.println("La longitud del nombre del archivo es " + archivo.length());
        System.err.println("El formato del archivo es: " + archivo.substring(i + 1));
    }
}
