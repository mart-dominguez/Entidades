/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.liquidacion;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author hzanuzzi
 */
@Entity()
@Table(name = "LIQUI.LIQUIDACION_PASO")
public class LiquidacionPaso implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_LIQUIDACION")
    private LiquidacionEstado liquidacionEstado;
    
    @Column(name="ID_PASO")
    private PasoLiquidacion pasoLiquidacion;
    
    @Column(name="FECHA_INICIO")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaInicio;
    
    @Column(name="FECHA_FIN")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @Column(name="ESTADO")
    private EstadoLiquidacion estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public EstadoLiquidacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoLiquidacion estado) {
        this.estado = estado;
    } 

    public LiquidacionEstado getLiquidacionEstado() {
        return liquidacionEstado;
    }

    public void setLiquidacionEstado(LiquidacionEstado liquidacionEstado) {
        this.liquidacionEstado = liquidacionEstado;
    }

    public PasoLiquidacion getPasoLiquidacion() {
        return pasoLiquidacion;
    }

    public void setPasoLiquidacion(PasoLiquidacion pasoLiquidacion) {
        this.pasoLiquidacion = pasoLiquidacion;
    }
}
