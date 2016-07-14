/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.producto;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hzanuzzi
 */
@Entity()
public class Grilla implements Serializable {
    
    public Grilla()
    {
        this.id = new IdGrilla();
    }
    
    @EmbeddedId IdGrilla id;
    
    Integer idGrilla;
    
    Plan plan;

    public Integer getIdGrilla() {
        return idGrilla;
    }

    public void setIdGrilla(Integer idGrilla) {
        this.idGrilla = idGrilla;
        this.id.idGrilla= idGrilla;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
        this.id.idPlan = plan.Codigo;
        this.id.idProducto = plan.Producto.Codigo;
    }

    public IdGrilla getId() {
        return id;
    }

    public void setId(IdGrilla id) {
        this.id = id;
    }
}
