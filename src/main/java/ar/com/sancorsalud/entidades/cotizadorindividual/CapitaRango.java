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
    
    private Byte EdadDesde;
	
    private Byte EdadHasta;
	
    private Short Cantidad;
    
    private Parentesco Parentesco;

    public Byte getEdadDesde() {
        return EdadDesde;
    }

    public void setEdadDesde(byte EdadDesde) {
        this.EdadDesde = EdadDesde;
    }

    public byte getEdadHasta() {
        return EdadHasta;
    }

    public void setEdadHasta(byte EdadHasta) {
        this.EdadHasta = EdadHasta;
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
