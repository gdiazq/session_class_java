public class WhileDoWhile {
    public static void main(String[] args) {
        System.out.println("Ejemplo de while y do while");
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                System.out.println("El numero es 5");
                break;
            }
            if (i == 3) {
                System.out.println("El numero es 3");
                i++;
                continue;
            }
            System.out.println("El numero es " + i);
            i++;
        }
        i = 0;
        do {
            if (i == 5) {
                System.out.println("El numero es 5");
                break;
            }
            if (i == 3) {
                System.out.println("El numero es 3");
                i++;
                continue;
            }
            System.out.println("El numero es " + i);
            i++;
        } while (i < 10);
    }
}
