/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rompePrincipio;

import comun.TipoVehiculo;
import comun.Color;



/**
 *
 * @author Carlos.
 */
public class rompePrincipio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche(Color.Azul,"1165-ZNE","toyota",TipoVehiculo.Auto );
        coche1.guardarDB();
    }
    
}
