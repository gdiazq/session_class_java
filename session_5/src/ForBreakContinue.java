public class ForBreakContinue {
    public static void main(String[] args) {
        System.out.println("Ejemplo de for con break y continue");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("El numero es 5");
                break;
            }
            if (i == 3) {
                System.out.println("El numero es 3");
                continue;
            }
            System.out.println("El numero es " + i);
        }
    }
}
