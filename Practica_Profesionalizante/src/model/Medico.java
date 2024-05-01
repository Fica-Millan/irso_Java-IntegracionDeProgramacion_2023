package model;

public class Medico {
	private String matricula;
	private String nombre;
	private String domicilio;
	private String Localidad;
	private String Codigo_Postal;
	private String Celular;
	private String email;
	private String pass;

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		this.Localidad = localidad;
	}

	public String getCodigo_Postal() {
		return Codigo_Postal;
	}
	public void setCodigo_Postal(String codigo_Postal) {
		this.Codigo_Postal = codigo_Postal;
	}

	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		this.Celular = celular;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
