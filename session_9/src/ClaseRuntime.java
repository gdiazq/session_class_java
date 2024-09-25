import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClaseRuntime {
    public static void main(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("ls");
            Process process = processBuilder.start();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            
            String line;
            System.out.println("Archivos y directorios:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            int exitCode = process.waitFor();
            System.out.println("Comando terminado con código de salida: " + exitCode);
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
