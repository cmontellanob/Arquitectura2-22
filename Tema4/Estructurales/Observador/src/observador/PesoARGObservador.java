package observador;

public class PesoARGObservador extends Observador {

	private double valorCambio = 296;
	
	public PesoARGObservador(SubjectCasa sujeto) {
		this.sujeto =   sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("ARG: " + (sujeto.getMonto() * valorCambio));
	}
}
