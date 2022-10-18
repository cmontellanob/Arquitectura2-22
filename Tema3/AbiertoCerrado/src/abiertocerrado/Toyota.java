/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abiertocerrado;

import comun.Color;
import comun.TipoVehiculo;

/**
 *
 * @author Carlos
 */
public class Toyota extends Coche {

    public Toyota(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }

    @Override
    public double precioMedio() {
        return 18325;
    }
    
}
