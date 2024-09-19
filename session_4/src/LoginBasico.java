import java.util.Scanner;

public class LoginBasico {
    public static void main(String[] args) {
        String usuario = "admin";
        String password = "admin123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String passwordIngresado = scanner.nextLine();

        boolean esUsuarioValido = usuario.equals(usuarioIngresado);
        boolean esPasswordValido = password.equals(passwordIngresado);

        boolean esLoginValido = esUsuarioValido && esPasswordValido;

        // Uso del operador ternario para determinar el mensaje de login
        String mensaje = esLoginValido ? "Login válido" : "Login inválido";

        System.out.println(mensaje);

        scanner.close();
    }
}