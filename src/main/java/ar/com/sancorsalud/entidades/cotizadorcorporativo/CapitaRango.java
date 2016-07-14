package ar.com.sancorsalud.entidades.cotizadorcorporativo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "COTIZACION_RANGO")
public class CapitaRango implements Serializable  {
	
        @Id()
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name = "Id")
        private int Id;
        
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name = "IdCotizacion")
        private Cotizacion Cotizacion;
    
        @Column(name = "EdadDesde")
	private byte EdadDesde;
	
        @Column(name = "EdadHasta")
	private byte EdadHasta;
	
        @Column(name = "Sexo")
	private char Sexo;
	
        @Column(name = "Cantidad")
	private byte Cantidad;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Cotizacion getCotizacion() {
        return Cotizacion;
    }

    public void setCotizacion(Cotizacion Cotizacion) {
        this.Cotizacion = Cotizacion;
    }

    public byte getEdadDesde() {
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

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public byte getCantidad() {
        return Cantidad;
    }

    public void setCantidad(byte Cantidad) {
        this.Cantidad = Cantidad;
    }
}
