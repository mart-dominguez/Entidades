/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.general;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author hzanuzzi
 */
@Entity()
public class Parentesco implements Serializable {
  
    @Id()
    private byte codigo;
    
    private String descripcion;

    public byte getCodigo() {
        return codigo;
    }

    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
