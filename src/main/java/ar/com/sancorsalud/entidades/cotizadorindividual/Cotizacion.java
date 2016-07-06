/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.cotizadorindividual;
import ar.com.sancorsalud.entidades.producto.Grilla;
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

/**
 *
 * @author hzanuzzi
 */
@Entity()
@Table(name = "COTIZADOR.COTIZACION")
public class Cotizacion implements Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;
    
    @Column(name="Fecha")
    private Date fecha;
    
    @Column(name="FechaVigencia")
    private Date fechaVigencia;
   
    private short cantidadIntegrantes;
   
    @OneToMany(mappedBy = "Cotizacion")
    private List<PlanCotizadoIndividual> planesCotizados;
    
    @OneToMany(mappedBy = "Cotizacion")
    private List<CapitaRango> capitas;
    
    @Column(name="Remuneracion")
    private Float remuneracion;
    
    @Column(name="USUARIO")
    private String usuario;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public short getCantidadIntegrantes() {
        return cantidadIntegrantes;
    }

    public void setCantidadIntegrantes(short cantidadIntegrantes) {
        this.cantidadIntegrantes = cantidadIntegrantes;
    }

    public List<PlanCotizadoIndividual> getPlanesCotizados() {
        return planesCotizados;
    }

    public void setPlanesCotizados(List<PlanCotizadoIndividual> planesCotizados) {
        this.planesCotizados = planesCotizados;
    }

    public List<CapitaRango> getCapitas() {
        return capitas;
    }

    public void setCapitas(List<CapitaRango> capitas) {
        this.capitas = capitas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Float getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Float remuneracion) {
        this.remuneracion = remuneracion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
