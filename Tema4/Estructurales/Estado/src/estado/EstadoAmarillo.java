/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

/**
 *
 * @author Carlos
 */
public class EstadoAmarillo implements IEstadoSemaforo {

    @Override
    public void mostrar() {
        System.out.println("Amarillo"); 
    }
    
}
