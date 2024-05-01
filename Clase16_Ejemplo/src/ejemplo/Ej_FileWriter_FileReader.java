package ejemplo;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej_FileWriter_FileReader {
	public static void main(String args[]) throws IOException {
		File file = new File("Ej_FileWriter_FileReader.txt");
		file.createNewFile(); // crea el fichero
		FileWriter writer = new FileWriter(file);
		writer.write("Game\n Thrones\n");
		writer.flush();
		writer.close();
		FileReader fr = new FileReader(file);
		char[] a = new char[50];
		fr.read(a); // lee el contenido del array
		for (char c : a)
		System.out.print(c);
		fr.close();
	}
}