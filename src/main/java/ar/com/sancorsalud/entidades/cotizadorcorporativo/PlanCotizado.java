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
@Table(name = "COTIZADORC.COTIZACION_PLAN")
public class PlanCotizado implements Serializable  {
	
        public PlanCotizado()
        {
        }
    
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name = "IdCotizacion")
        private Cotizacion Cotizacion;
    
        @Id()
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name = "Id")
	private int Id;
        
        @ManyToOne()
        @JoinColumn(name = "IdPlan")
        private Plan Plan;

        @Column(name = "ValorParaGravado")
	private Float ValorParaGravado;
	
        @Column(name = "ValorParaNoGravado")
	private Float ValorParaNoGravado;
	
        @Column(name = "CostoSalud")
	private Float CostoSalud;
	
        @Column(name = "ValorConModuloGravado")
	private Float ValorConModuloGravado;
	
        @Column(name = "ValorConModuloNoGravado")
	private Float ValorConModuloNoGravado;
	
        @Column(name = "CostoInversion")
	private Float CostoInversion;

    public Cotizacion getCotizacion() {
        return Cotizacion;
    }

    public void setCotizacion(Cotizacion Cotizacion) {
        this.Cotizacion = Cotizacion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Plan getPlan() {
        return Plan;
    }

    public void setPlan(Plan Plan) {
        this.Plan = Plan;
    }

    public Float getValorParaGravado() {
        return ValorParaGravado;
    }

    public void setValorParaGravado(Float ValorParaGravado) {
        this.ValorParaGravado = ValorParaGravado;
    }

    public Float getValorParaNoGravado() {
        return ValorParaNoGravado;
    }

    public void setValorParaNoGravado(Float ValorParaNoGravado) {
        this.ValorParaNoGravado = ValorParaNoGravado;
    }

    public Float getCostoSalud() {
        return CostoSalud;
    }

    public void setCostoSalud(Float CostoSalud) {
        this.CostoSalud = CostoSalud;
    }

    public Float getValorConModuloGravado() {
        return ValorConModuloGravado;
    }

    public void setValorConModuloGravado(Float ValorConModuloGravado) {
        this.ValorConModuloGravado = ValorConModuloGravado;
    }

    public Float getValorConModuloNoGravado() {
        return ValorConModuloNoGravado;
    }

    public void setValorConModuloNoGravado(Float ValorConModuloNoGravado) {
        this.ValorConModuloNoGravado = ValorConModuloNoGravado;
    }

    public Float getCostoInversion() {
        return CostoInversion;
    }

    public void setCostoInversion(Float CostoInversion) {
        this.CostoInversion = CostoInversion;
    }
}
