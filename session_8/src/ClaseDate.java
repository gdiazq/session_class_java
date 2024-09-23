import java.util.Date;
import java.util.Calendar;

public class ClaseDate {
    public static void main(String[] args) {
        System.out.println("Ejemplo de clase Date");

        // Crear una instancia de Calendar
        Calendar calendar = Calendar.getInstance();

        // Generar una serie de fechas (los próximos 10 días)
        for (int i = 0; i < 10; i++) {
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            Date fecha = calendar.getTime();
            System.out.println("Fecha generada: " + fecha);

            // Verificar si la fecha es un fin de semana
            int diaDeLaSemana = calendar.get(Calendar.DAY_OF_WEEK);
            if (diaDeLaSemana == Calendar.SATURDAY || diaDeLaSemana == Calendar.SUNDAY) {
                System.out.println(fecha + " es un fin de semana.");
            } else {
                System.out.println(fecha + " no es un fin de semana.");
            }
        }
    }
}