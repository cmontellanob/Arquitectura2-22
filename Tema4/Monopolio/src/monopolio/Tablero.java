/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopolio;

/**
 *
 * @author Carlos
 */
public class Tablero {

    private static Tablero instancia;
    Casilla[] primeraLinea; 
    Casilla[] segundaLinea;
    Casilla[] terceraLinea; 
    Casilla[] cuartaLinea;

    private Tablero() {
        CasillaFactory fabrica=new CasillaFactory(); 
        
        primeraLinea =new Casilla[10];
        primeraLinea[1]=fabrica.getCasilla("Propiedad");
        primeraLinea[2]=fabrica.getCasilla("Ingreso");
        primeraLinea[3]=fabrica.getCasilla("Propiedad");
        
        
        
        
        segundaLinea =new Casilla[10];
        terceraLinea =new Casilla[10];
        cuartaLinea =new Casilla[10];
        
        
        
        
    }

    public static Tablero getInstancia() {
        if (instancia == null) {
            instancia = new Tablero();
        }

        return instancia;
    }

}
