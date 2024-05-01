package ejercicio_2;

public class Destinatario {
	private String empresa;
	private String domicilio;
	private String codigoPostal;
	private String localidad;
	private String pais;
	
	public Destinatario (String empresa, String domicilio, String codigoPostal, String localidad, String pais) {
		this.empresa = empresa;
		this.domicilio = domicilio;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.pais = pais;
	}
	
	public void imprimirDestino() {
		System.out.println("Empresa: " + empresa);
		System.out.println("Domicilio: " + domicilio);
		System.out.println("CP (" + codigoPostal+") - " + localidad);
		System.out.println(pais + "\n");
	}
}
