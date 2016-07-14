/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.liquidacion;

import ar.com.sancorsalud.entidades.cotizadorindividual.PlanCotizadoIndividual;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author hzanuzzi
 */
@Entity()
@Table(name = "LIQUIDACION_ESTADO")
public class LiquidacionEstado implements Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
    
    @Column(name="FECHA_INICIO")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaInicio;
    
    @Column(name="FECHA_FIN")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @Column(name="ESTADO")
    private EstadoLiquidacion estadoLiquidacion;
    
    @OneToMany(mappedBy = "LiquidacionEstado")
    private List<LiquidacionPaso> pasos;

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

    public EstadoLiquidacion getEstadoLiquidacion() {
        return estadoLiquidacion;
    }

    public void setEstadoLiquidacion(EstadoLiquidacion estadoLiquidacion) {
        this.estadoLiquidacion = estadoLiquidacion;
    }

    public List<LiquidacionPaso> getPasos() {
        return pasos;
    }

    public void setPasos(List<LiquidacionPaso> pasos) {
        this.pasos = pasos;
    }
}
