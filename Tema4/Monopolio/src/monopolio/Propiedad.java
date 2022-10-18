/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopolio;

/**
 *
 * @author Carlos
 */
public class Propiedad extends Casilla{
    Color color;
    Double precioCompra;
    Double precioHipoteca;
    Double precioAlquier;
    Double precioAlquier1Casa;
    Double precioAlquier2Casas;
    Double precioAlquier3Casas;
    Double precioAlquier4Casas;
    Double precioAlquierHotel;

    public Propiedad()
    {
        
    }
    public Propiedad(Color color, Double precioCompra, Double precioHipoteca, Double precioAlquier, Double precioAlquier1Casa, Double precioAlquier2Casas, Double precioAlquier3Casas, Double precioAlquier4Casas, Double precioAlquierHotel) {
        this.color = color;
        this.precioCompra = precioCompra;
        this.precioHipoteca = precioHipoteca;
        this.precioAlquier = precioAlquier;
        this.precioAlquier1Casa = precioAlquier1Casa;
        this.precioAlquier2Casas = precioAlquier2Casas;
        this.precioAlquier3Casas = precioAlquier3Casas;
        this.precioAlquier4Casas = precioAlquier4Casas;
        this.precioAlquierHotel = precioAlquierHotel;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public Double getPrecioAlquier() {
        return precioAlquier;
    }

    public void setPrecioAlquier(Double precioAlquier) {
        this.precioAlquier = precioAlquier;
    }

    public Double getPrecioAlquier1Casa() {
        return precioAlquier1Casa;
    }

    public void setPrecioAlquier1Casa(Double precioAlquier1Casa) {
        this.precioAlquier1Casa = precioAlquier1Casa;
    }

    public Double getPrecioAlquier2Casas() {
        return precioAlquier2Casas;
    }

    public void setPrecioAlquier2Casas(Double precioAlquier2Casas) {
        this.precioAlquier2Casas = precioAlquier2Casas;
    }

    public Double getPrecioAlquier3Casas() {
        return precioAlquier3Casas;
    }

    public void setPrecioAlquier3Casas(Double precioAlquier3Casas) {
        this.precioAlquier3Casas = precioAlquier3Casas;
    }

    public Double getPrecioAlquier4Casas() {
        return precioAlquier4Casas;
    }

    public void setPrecioAlquier4Casas(Double precioAlquier4Casas) {
        this.precioAlquier4Casas = precioAlquier4Casas;
    }

    public Double getPrecioAlquierHotel() {
        return precioAlquierHotel;
    }

    public void setPrecioAlquierHotel(Double precioAlquierHotel) {
        this.precioAlquierHotel = precioAlquierHotel;
    }
    
    
    
    
    
    
}
