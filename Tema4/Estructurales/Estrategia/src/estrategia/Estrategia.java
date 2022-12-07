|/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategia;

/**
 *
 * @author Carlos
 */
public class Estrategia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Contexto contexto = new Contexto(new AntivirusSimple());
        contexto.ejecutar();
        Contexto contexto2 = new Contexto(new AntivirusAvanzado());
        contexto2.ejecutar();
    }
    
}
