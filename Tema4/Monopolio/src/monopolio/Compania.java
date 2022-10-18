/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopolio;

/**
 *
 * @author Carlos
 */
public class Compania extends Casilla{
    Double precioCompra;
    Double precioHipoteca;
    Double precioFactor;

    public Compania() {
        
    }

    public Compania(Double precioCompra, Double precioHipoteca, Double precioFactor) {
        this.precioCompra = precioCompra;
        this.precioHipoteca = precioHipoteca;
        this.precioFactor = precioFactor;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioHipoteca() {
        return precioHipoteca;
    }

    public void setPrecioHipoteca(Double precioHipoteca) {
        this.precioHipoteca = precioHipoteca;
    }

    public Double getPrecioFactor() {
        return precioFactor;
    }

    public void setPrecioFactor(Double precioFactor) {
        this.precioFactor = precioFactor;
    }
    
    
        
    
}
