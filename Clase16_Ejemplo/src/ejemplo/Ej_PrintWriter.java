package ejemplo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ej_PrintWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fichero = null;
		PrintWriter pw = null;
		fichero = new FileWriter("Ej_PrintWriter.txt");
		pw = new PrintWriter(fichero);
		for (int i = 0; i < 2; i++)
		pw.println("Linea " + i);
		//Escribe en el fichero:
		//Linea 0
		//Linea 1
		pw.close();
	}
}