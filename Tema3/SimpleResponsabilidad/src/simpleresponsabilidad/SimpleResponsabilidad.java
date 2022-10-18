/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleresponsabilidad;

import comun.Color;
import comun.TipoVehiculo;

/**
 *
 * @author Carlos
 */
public class SimpleResponsabilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche1 = new Coche(Color.Azul,"1165-ZNE","toyota",TipoVehiculo.Auto );
        System.out.print(coche1);
        CocheDB cocheDB = new CocheDB();
        cocheDB.guardarDB(coche1);
        
        
    }
    
}
