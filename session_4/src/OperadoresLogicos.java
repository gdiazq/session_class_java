public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        int b = 5;
        System.out.println("b = " + b);
        
        // Operadores lógicos
        boolean c = a > b && a != b;
        System.out.println("a > b && a != b: " + c);
        
        boolean d = a < b || a == b;
        System.out.println("a < b || a == b: " + d);
        
        boolean e = !(a > b);
        System.out.println("!(a > b): " + e);
    }
}
