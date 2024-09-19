public class App {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = new String("World!");
        System.out.println(hello + " " + world);

        String curso = "Programacion Java";
        String curso2 = "Programacion Java";
        
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);
    }
}
