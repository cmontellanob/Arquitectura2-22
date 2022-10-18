/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rompePrincipio;

import comun.Color;
import comun.TipoVehiculo;

/**
 *
 * @author Carlos
 */
public class rompePrincipio {
    
     public static void main(String[] args) {
            Coche[] arregloCoches = {
            new Coche(Color.Rojo, "111-CFC", "Toyota", TipoVehiculo.Auto),
            new Coche(Color.Azul, "134-CFC", "Nisan", TipoVehiculo.Auto),
            new Coche(Color.Azul, "134-CFC", "Renault", TipoVehiculo.Auto)
        };
        imprimirpreciomedio(arregloCoches);
     }

    private static void imprimirpreciomedio(Coche[] arregloCoches) {
       for (Coche coche : arregloCoches) {
            if (coche.getMarca().equals("Toyota")) {
                System.out.println(45654);
            }
            if (coche.getMarca().equals("Nisan")) {
                System.out.println(20025);
            }
            if (coche.getMarca().equals("Renault")) {
                System.out.println(30000);
            }
        }
    }
}
