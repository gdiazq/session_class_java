public class SentenciaSwitch {
    public static void main(String[] args) {
        System.out.println("Sentencia switch");
        int numero = 10;
        switch (numero) {
            case 0:
                System.out.println("El numero es 0");
                break;
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            case 4:
                System.out.println("El numero es 4");
                break;
            case 5:
                System.out.println("El numero es 5");
                break;
            default:
                System.out.println("El numero es mayor a 5");
        }
    }
}
