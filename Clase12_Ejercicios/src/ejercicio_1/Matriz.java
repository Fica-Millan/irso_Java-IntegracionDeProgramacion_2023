package ejercicio_1;

public class Matriz {
	private String [][] matriz; // se define un atributo privado para a clase matriz
	
	public Matriz() { // Constructor para la clase "Matriz" que inicializa la matriz con String vacio 
		matriz = new String[10][10];
		for (int f=0; f<10; f++) {
			for (int c=0; c<10; c++) {
				matriz[f][c] =""; 
			}
		}
	}
	
	public void cargarMatriz(int fila, int columna, String texto) { //Metodo publico para cargar la matriz
        if (fila >= 0 && fila < 10 && columna >= 0 && columna < 10) {
            if (texto.length() <= 15) {
                matriz[fila][columna] = texto;
                System.out.println("El texto se cargo corectamente");
            } else {
                System.out.println("El texto excede los 15 caracteres - no pudo ser cargado\n\n");
            }
        }
    }

    public String obtenerTexto(int fila, int columna) { // Metodo publico para obtener el texto
        if (fila >= 0 && fila < 10 && columna >= 0 && columna < 10) {
            return matriz[fila][columna];
        } else {
            System.out.println("Fila o columna fuera del rango - Solo se tienen 10 textos.");
            return "";
        }
    }
}

	
	
	
	
	
	
	
	
	
	