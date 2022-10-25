/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author Carlos
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IFabricaAbstracta fabricaBD = ProductorFabrica.getFactory("BD");
        
        IConexionBD cxBD1 = fabricaBD.getBD("ORACLE");

        cxBD1.conectar();

        IFabricaAbstracta fabricaREST = ProductorFabrica.getFactory("REST");
        IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

        cxRS1.leerURL("https://www.youtube.com");
    }
    
}
