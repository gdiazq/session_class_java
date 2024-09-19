public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);

        // Operador unario positivo
        int b = +a;
        System.out.println("b = +a: " + b);

        // Operador unario negativo
        int c = -a;
        System.out.println("c = -a: " + c);

        // Operador de incremento (pre-incremento)
        int d = ++a;
        System.out.println("d = ++a: " + d);
        System.out.println("a después de ++a: " + a);

        // Operador de incremento (post-incremento)
        int e = a++;
        System.out.println("e = a++: " + e);
        System.out.println("a después de a++: " + a);

        // Operador de decremento (pre-decremento)
        int f = --a;
        System.out.println("f = --a: " + f);
        System.out.println("a después de --a: " + a);

        // Operador de decremento (post-decremento)
        int g = a--;
        System.out.println("g = a--: " + g);
        System.out.println("a después de a--: " + a);

        // Operador de negación lógica
        boolean h = true;
        System.out.println("h = " + h);
        boolean i = !h;
        System.out.println("i = !h: " + i);
    }
}
