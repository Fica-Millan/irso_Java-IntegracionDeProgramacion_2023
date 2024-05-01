package david.hackro;

public class Alumno {

	private String nombre;
	private int matricula;
	private char grupo;
	private int grado;
	
	public Alumno() {
		nombre = "";
		matricula = 0;
		grupo = ' ';
		grado = 0;
	}
	
	public Alumno(String n, int m, char g, int gg) {
		nombre = n;
		matricula = m;
		grupo = g;
		grado = gg;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public char getGrupo() {
		return grupo;
	}

	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}
}
