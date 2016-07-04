/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.cotizadorindividual;

import ar.com.sancorsalud.entidades.general.Parentesco;

/**
 *
 * @author hzanuzzi
 */
public class CapitaRango {
    
    private Byte Edad;
	
    private Short Cantidad;
    
    private Parentesco Parentesco;

    public Byte getEdad() {
        return Edad;
    }

    public void setEdad(byte Edad) {
        this.Edad = Edad;
    }

    public Short getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Short Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Parentesco getParentesco() {
        return Parentesco;
    }

    public void setParentesco(Parentesco Parentesco) {
        this.Parentesco = Parentesco;
    }       
}
