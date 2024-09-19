public class OperadorTernario {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Uso básico del operador ternario
        int max = (a > b) ? a : b;
        System.out.println("El valor máximo es: " + max);

        // Uso del operador ternario con booleanos
        boolean esMayor = (a > b) ? true : false;
        System.out.println("¿a es mayor que b? " + esMayor);

        // Uso del operador ternario para asignar cadenas
        String resultado = (a % 2 == 0) ? "a es par" : "a es impar";
        System.out.println(resultado);

        // Uso del operador ternario anidado
        int c = 15;
        String comparacion = (a > b) ? "a es mayor que b" : (a < c) ? "a es menor que c" : "a es igual a c";
        System.out.println(comparacion);
    }
}