package tutoriales;
import java.time.LocalDate;

public class Apocrifos {
	Long cuit;
	LocalDate condicion_desde;
	LocalDate publicado;
	public Apocrifos(Long cuit, LocalDate condicion_desde, LocalDate publicado) {
		super();
		this.cuit = cuit;
		this.condicion_desde = condicion_desde;
		this.publicado = publicado;
	}
	public Long getCuit() {
		return cuit;
	}
	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
	public LocalDate getCondicion_desde() {
		return condicion_desde;
	}
	public void setCondicion_desde(LocalDate condicion_desde) {
		this.condicion_desde = condicion_desde;
	}
	public LocalDate getPublicado() {
		return publicado;
	}
	public void setPublicado(LocalDate publicado) {
		this.publicado = publicado;
	}
}