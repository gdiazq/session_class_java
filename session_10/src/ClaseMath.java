public class ClaseMath {
    public static void main(String[] args) {
        System.out.println("Ejemplo de clase Math");

        // Calcular el valor absoluto de un número
        double numero = -123.45;
        double valorAbsoluto = Math.abs(numero);
        System.out.println("Valor absoluto de " + numero + " es " + valorAbsoluto);

        // Calcular la raíz cuadrada de un número
        double raizCuadrada = Math.sqrt(25);
        System.out.println("Raíz cuadrada de 25 es " + raizCuadrada);

        // Calcular la potencia de un número
        double base = 2;
        double exponente = 3;
        double potencia = Math.pow(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es " + potencia);

        // Calcular el seno de un ángulo
        double angulo = 45;
        double seno = Math.sin(Math.toRadians(angulo));
        System.out.println("Seno de " + angulo + " es " + seno);

        // Calcular el coseno de un ángulo
        double coseno = Math.cos(Math.toRadians(angulo));
        System.out.println("Coseno de " + angulo + " es " + coseno);

        // Calcular el valor máximo de dos números
        double numero1 = 10;
        double numero2 = 20;
        double maximo = Math.max(numero1, numero2);
        System.out.println("El valor máximo entre " + numero1 + " y " + numero2 + " es " + maximo);

        // Calcular el valor mínimo de dos números
        double minimo = Math.min(numero1, numero2);
        System.out.println("El valor mínimo entre " + numero1 + " y " + numero2 + " es " + minimo);

        // Calcular el valor de PI
        double pi = Math.PI;
        System.out.println("El valor de PI es " + pi);

        // Calcular el valor de Euler
        double euler = Math.E;
        System.out.println("El valor de Euler es " + euler);
    }
}
