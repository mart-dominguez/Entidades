/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.producto;

import javax.persistence.Embeddable;

/**
 *
 * @author hzanuzzi
 */
@Embeddable
public class IdGrilla {
    
    int idProducto;
    
    String idPlan;
    
    int idGrilla;
}
