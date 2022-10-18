/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abiertocerrado;

import comun.Color;
import comun.TipoVehiculo;

/**
 *
 * @author Carlos
 */
public class AbiertoCerrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche[] arregloCoches = {
            new Toyota(Color.Rojo, "111-CFC", TipoVehiculo.Auto),
            new Nisan(Color.Azul, "134-CFC", TipoVehiculo.Auto),
            new Renault(Color.Azul, "134-CFC", TipoVehiculo.Auto)
        };
        imprimirpreciomedio(arregloCoches);
    }

    private static void imprimirpreciomedio(Coche[] arregloCoches) {
         for (Coche coche : arregloCoches) {
            System.out.println(coche.precioMedio());
        }
    }
    
}
