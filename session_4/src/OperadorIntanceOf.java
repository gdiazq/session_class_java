public class OperadorIntanceOf {

    public static void main(String[] args) {
        String texto = "Hola Mundo";
        Integer numero = 10;
        Object objeto = texto;

        System.out.println("texto es instancia de String: " + (texto instanceof String));
        System.out.println("numero es instancia de Integer: " + (numero instanceof Integer));
        System.out.println("objeto es instancia de String: " + (objeto instanceof String));
        System.out.println("objeto es instancia de Integer: " + (objeto instanceof Integer));
    }
}