/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.cotizadorindividual;

/**
 *
 * @author hzanuzzi
 */
public class CapitaRango {
    private Byte EdadDesde;
	
    private Byte EdadHasta;
	
    private Byte Cantidad;

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

    public Byte getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Byte Cantidad) {
        this.Cantidad = Cantidad;
    }
        
        
}
