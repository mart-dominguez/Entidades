/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.cotizadorindividual;

import ar.com.sancorsalud.entidades.producto.Grilla;
import java.util.List;

/**
 *
 * @author hzanuzzi
 */
public class Cotizacion {
    
    private Integer Id;
    
    private short cantidadIntegrantes;
    
    private List<Grilla> grillas;
    
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
}
