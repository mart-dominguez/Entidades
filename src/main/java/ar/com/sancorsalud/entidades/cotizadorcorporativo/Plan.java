/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.cotizadorcorporativo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author hzanuzzi
 */
@Entity()
@Table(name="PLANES_DISP")
public class Plan extends ar.com.sancorsalud.entidades.producto.Plan implements Serializable {

    @Id()
    @Column(name = "ID")
    public int Id;
}
