package tutoriales;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Leer {

	public static void main(String[] args) throws IOException {
		String lineas = ""; //se declara vacia al inicio
		
		String vectorFinal[];
		FileReader Fr = new FileReader ("FacturasApocrifas.csv");
		BufferedReader br = new BufferedReader (Fr);
		int nlineas=0;
		int i=0;
		while ((lineas=br.readLine())!=null) {
			nlineas++;
		}
		System.out.println(nlineas);
		Fr.close();
		Apocrifos[] Apo = new Apocrifos[nlineas];
		Fr = new FileReader("FacturasApocrifas.csv");
		br = new BufferedReader(Fr);
		while ((lineas=br.readLine())!=null) {
			vectorFinal = lineas.split(";");
			Apocrifos C = new Apocrifos (Long.parseLong(vectorFinal[0]),LocalDate.parse(vectorFinal[1]),LocalDate.parse(vectorFinal[2])); 
			Apo [i] = C;
			i++;			
		}
		br.close();
		Fr.close();
		
		for (int y=0; y<nlineas; y++) {
			LocalDate fechaLimite =LocalDate.of(2022,12,31);
			if (Apo [y].getPublicado().isAfter(fechaLimite)) {
			System.out.println(Apo[y].getCuit());
			}
		}
	}
}