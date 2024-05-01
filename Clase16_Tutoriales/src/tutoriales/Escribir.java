package tutoriales;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

	public static void main(String[] args) throws IOException {
		String contenido = "Texto de pruebas";
		
		FileWriter fw = new FileWriter ("archivoescrito.txt");
		
		BufferedWriter bw = new BufferedWriter (fw);
		
		for (int i=0; i<400; i++) {
			bw.write(i + "-" + contenido);
			bw.newLine();
		}
		bw.close();
		System.out.println("Finalizado");
	}
}