public class ClasesSystem {
    public static void main(String[] args)  {
        System.out.println("Ejemplo de clase System");

        // Obtener la hora actual
        long tiempoActual = System.currentTimeMillis();
        System.out.println("Tiempo actual: " + tiempoActual);

        // Obtener la hora actual en nanosegundos
        long tiempoActualNano = System.nanoTime();
        System.out.println("Tiempo actual en nanosegundos: " + tiempoActualNano);

        // Obtener la versión de Java
        String versionJava = System.getProperty("java.version");
        System.out.println("Versión de Java: " + versionJava);

        // Obtener el directorio de trabajo
        String directorioTrabajo = System.getProperty("user.dir");
        System.out.println("Directorio de trabajo: " + directorioTrabajo);

        // Obtener el nombre del sistema operativo
        String sistemaOperativo = System.getProperty("os.name");
        System.out.println("Sistema operativo: " + sistemaOperativo);

        // Obtener el nombre del usuario
        String usuario = System.getProperty("user.name");
        System.out.println("Usuario: " + usuario);

        // Obtener el nombre del país
        String pais = System.getProperty("user.country");
        System.out.println("País: " + pais);
    }
}
