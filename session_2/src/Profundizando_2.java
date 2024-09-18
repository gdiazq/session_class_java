import java.util.Scanner;

public class Profundizando_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            String numeroStr = scanner.nextLine();
            scanner.close();
            int numeroDec = Integer.parseInt(numeroStr);
            System.out.println("Numero ingresado: " + numeroDec);
            numeroDec++;
            System.out.println("Numero incrementado: " + numeroDec);
        }
}
