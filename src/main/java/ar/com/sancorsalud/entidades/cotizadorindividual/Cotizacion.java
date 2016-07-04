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
   
    private short cantidadIntegrantes;
   
    @OneToMany(mappedBy = "Cotizacion")
    private List<Grilla> grillas;
    
    @OneToMany(mappedBy = "Cotizacion")
    private List<CapitaRango> capitas;

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

    public List<Grilla> getGrillas() {
        return grillas;
    }

    public void setGrillas(List<Grilla> grillas) {
        this.grillas = grillas;
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
}
