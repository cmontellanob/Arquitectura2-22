/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

/**
 *
 * @author Carlos
 */
public class BolivianosObservador extends Observador {
    private double valorCambio = 6.97;

    public BolivianosObservador(SubjectCasa sujeto) {
		this.sujeto =   sujeto;
		this.sujeto.agregar(this);
	}
    
    @Override
    public void actualizar() {
        System.out.println("Bs: " + (sujeto.getMonto() * valorCambio));
    }
    
}
