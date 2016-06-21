/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.cotizadorindividual;
import ar.com.sancorsalud.entidades.general.Parentesco;
import ar.com.sancorsalud.entidades.producto.Grilla;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hzanuzzi
 */
public class ParametroCalculo {
    
    private List<Grilla> grillas;
    
    private List<CapitaRango> capitas;
    
    private Float remuneracion;
    
    private Date fechaVigencia;
    
    private Parentesco parentesco;

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

    public Float getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Float remuneracion) {
        this.remuneracion = remuneracion;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }
}
