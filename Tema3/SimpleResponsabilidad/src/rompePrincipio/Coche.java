/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rompePrincipio;

import comun.TipoVehiculo;
import comun.Color;

/**
 *
 * @author Carlos
 */
public class Coche {
    private Color color;
    private String placa;
    private String marca;
    private TipoVehiculo tipovehiculo;

    public Coche(Color color, String placa, String marca, TipoVehiculo tipovehiculo) {
        this.color = color;
        this.placa = placa;
        this.marca = marca;
        this.tipovehiculo = tipovehiculo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(TipoVehiculo tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }
    
     public void guardarDB()
    {
        System.out.print("Guardar en la Base de Datos"+this);
                
    }
    public void eliminarDB()
    {
        //
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", placa=" + placa + ", marca=" + marca + ", tipovehiculo=" + tipovehiculo + '}';
    }
    

}
