public class Sentencia {
    public static void main(String[] args) throws Exception {
        System.out.println("Sentencia if-else");
        int numero = 10;
        if (numero > 0) {
            System.out.println("El numero es positivo");
            if (numero % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        } else {
            System.out.println("El numero es negativo");
        }
    }
}
