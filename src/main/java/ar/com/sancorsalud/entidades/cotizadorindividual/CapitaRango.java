/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.cotizadorindividual;

import ar.com.sancorsalud.entidades.general.Parentesco;
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

/**
 *
 * @author hzanuzzi
 */
@Entity()
@Table(name = "COTIZADOR.COTIZACION_CAPITAS")
public class CapitaRango implements Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ID_COTIZACION")
    private Cotizacion Cotizacion;
    
    @Column(name="EDAD")
    private Byte Edad;
	
    @Column(name="Cantidad")
    private Short Cantidad;
    
    @ManyToOne()
    @JoinColumn(name = "IdParentesco")
    private Parentesco Parentesco;

    public Byte getEdad() {
        return Edad;
    }
    
    public void setEdad(Byte Edad) {
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

    public Cotizacion getCotizacion() {
        return Cotizacion;
    }

    public void setCotizacion(Cotizacion Cotizacion) {
        this.Cotizacion = Cotizacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
