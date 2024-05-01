package ejemplo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej_BufferedReader_BufferedWriter {
	public static void main(String[] args) throws IOException {
		File fichero = new File("Ej_BufferedReader_BufferedWriter.txt");
		// FileWriter crea el fichero
		FileWriter fw = new FileWriter(fichero);
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Person of interest");
		bw.close();
		String s;
		// Lee una linea del fichero.
		// Si no hay datos devuelve null.
		while ((s = br.readLine()) != null) {
		System.out.println(s);
		// Person of interest
		}
		fr.close();
	}
}