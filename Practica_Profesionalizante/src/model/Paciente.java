package model;

public class Paciente {

	private int DNI_Paciente;
	private String nombre;
	private int nroAfiliado;
	private String domicilio;
	private String Localidad;
	private String Codigo_Postal;
	private String Celular;
	private String email;
	private String pass;
	

	public int getDNI_Paciente() {
		return DNI_Paciente;
	}

	public void setDNI_Paciente(int DNI_Paciente) {
		this.DNI_Paciente = DNI_Paciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroAfiliado() {
		return nroAfiliado;
	}

	public void setNroAfiliado(int nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
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
		Localidad = localidad;
	}

	public String getCodigo_Postal() {
		return Codigo_Postal;
	}

	public void setCodigo_Postal(String codigo_Postal) {
		Codigo_Postal = codigo_Postal;
	}

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		Celular = celular;
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
