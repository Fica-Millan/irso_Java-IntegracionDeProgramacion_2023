package ejemplo;
import java.io.File;
import java.io.IOException;

public class Ej_File {
	public static void main(String[] args) throws IOException {
		File myDir = new File("myDir");
		// No crea el directorio mydir.
		System.out.println("Creando directorio: " + myDir.mkdir()); // true
		System.out.println("Elementos dentro del directorio: " + myDir.list().length); //0
		File f = new File(myDir, "fich1.txt");
		if (!f.exists()) {
		System.out.println("Create file f: " + f.createNewFile()); // true
		}
		System.out.println("Eliminar fichero f: " + f.delete());
		// true
		System.out.println("Eliminar directorio mydir: " + myDir.delete());
		// true
		File newDir = new File("newDir");
		System.out.println("Rename mydir: " + myDir.renameTo(newDir));
		// false
		File newf = new File("Ej_File.txt");
		System.out.println("Rename file:" + f.renameTo(newf));
		// false
	}
}
		