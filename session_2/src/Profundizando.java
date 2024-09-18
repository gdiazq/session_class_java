import javax.swing.*;

public class Profundizando {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
        int numeroDec = Integer.parseInt(numeroStr);
        System.out.println("Numero ingresado: " + numeroDec);
        JOptionPane.showMessageDialog(null, "El numero ingresado en decimal es: " + numeroDec);

    }
}
