/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.cotizadorindividual;
import ar.com.sancorsalud.entidades.liquidacion.Concepto;
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
@Entity
@Table(name = "COTIZACION_PLANES_VALORES")
public class PlanCotizadoIndividualConcepto implements Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ID_COTIZACION_PLAN")
    private PlanCotizadoIndividual planCotizadoIndividual;
    
    @ManyToOne()
    @JoinColumn(name = "ID_CONCEPTO")
    private Concepto concepto;
    
    @Column(name="VALOR")
    private Float valor;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public PlanCotizadoIndividual getPlanCotizadoIndividual() {
        return planCotizadoIndividual;
    }

    public void setPlanCotizadoIndividual(PlanCotizadoIndividual planCotizadoIndividual) {
        this.planCotizadoIndividual = planCotizadoIndividual;
    }

    public Concepto getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
