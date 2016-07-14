/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.cotizadorindividual;

import ar.com.sancorsalud.entidades.producto.Grilla;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hzanuzzi
 */
@Entity
@Table(name = "COTIZACION_PLANES")
public class PlanCotizadoIndividual implements Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_COTIZACION")
    private Cotizacion cotizacion;
    
    @ManyToOne()
    @JoinColumns({@JoinColumn(name = "ID_GRILLA", referencedColumnName = "idGrilla"), 
                @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "idProducto"),
                @JoinColumn(name = "ID_PLAN", referencedColumnName = "idPlan")})
    private Grilla grilla;
    
    @Transient
    @OneToMany(mappedBy = "PlanCotizadoIndividual")
    private List<PlanCotizadoIndividualConcepto> conceptos;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }
    
    public Grilla getGrilla() {
        return grilla;
    }

    public void setGrilla(Grilla grilla) {
        this.grilla = grilla;
    }

    public List<PlanCotizadoIndividualConcepto> getConceptos() {
        return conceptos;
    }

    public void setConceptos(List<PlanCotizadoIndividualConcepto> conceptos) {
        this.conceptos = conceptos;
    }
}
