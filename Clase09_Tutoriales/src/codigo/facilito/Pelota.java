package codigo.facilito;

public class Pelota {
	// variables nativas de la clase
	float radio;
	float peso;
	
	// constructores
	public Pelota() {
		radio=100;
		peso=250;
	}
	
	public Pelota(float radio, float peso) {
		this.radio=100;
		this.peso=250;
	}
	// termina constructores
	
	// metodos
	public float obtenerRadio() {
		return this.radio;
	}
	
	public float obtenerPeso() {
		return this.peso;
	}
	
	public void patearPelota() {
		System.out.println("Haz pateado la pelota");
	}
	
	public void atraparPelota() {
		System.out.println("Haz atrapado la pelota");
	}
	
}

