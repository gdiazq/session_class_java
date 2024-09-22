public class EjemploBisiesto {
    public static void main(String[] args) {
        System.out.println("Ejemplo de año bisiesto");
        int anio = 2020;
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    System.out.println("El año " + anio + " es bisiesto");
                } else {
                    System.out.println("El año " + anio + " no es bisiesto");
                }
            } else {
                System.out.println("El año " + anio + " es bisiesto");
            }
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
}
