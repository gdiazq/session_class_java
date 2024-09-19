public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);

        // Operador de asignación simple
        int b = 5;
        System.out.println("b = " + b);

        // Operadores de asignación compuesta
        a += 5; // a = a + 5
        System.out.println("a += 5: " + a);

        a -= 3; // a = a - 3
        System.out.println("a -= 3: " + a);

        a *= 2; // a = a * 2
        System.out.println("a *= 2: " + a);

        a /= 4; // a = a / 4
        System.out.println("a /= 4: " + a);

        a %= 3; // a = a % 3
        System.out.println("a %= 3: " + a);

        // Operadores de asignación con otras variables
        b += a; // b = b + a
        System.out.println("b += a: " + b);

        b -= a; // b = b - a
        System.out.println("b -= a: " + b);

        b *= a; // b = b * a
        System.out.println("b *= a: " + b);

        b /= a; // b = b / a
        System.out.println("b /= a: " + b);

        b %= a; // b = b % a
        System.out.println("b %= a: " + b);
    }
}
