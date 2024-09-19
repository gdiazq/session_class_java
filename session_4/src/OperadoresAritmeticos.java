public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        int b = 5;
        System.out.println("b = " + b);
        
        // Operadores de asignación compuesta
        a += 5; // a = a + 5
        b -= 5; // b = b - 5
        System.out.println("a += 5: " + a);
        System.out.println("b -= 5: " + b);
        
        // Operadores aritméticos básicos
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;
        
        System.out.println("a + b = " + suma);
        System.out.println("a - b = " + resta);
        System.out.println("a * b = " + multiplicacion);
        System.out.println("a / b = " + division);
        System.out.println("a % b = " + modulo);
    }
}