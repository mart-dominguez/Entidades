/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.liquidacion;

import ar.com.sancorsalud.entidades.asociado.Cuenta;
import ar.com.sancorsalud.entidades.cotizadorindividual.Cotizacion;
import ar.com.sancorsalud.entidades.empresa.Empresa;
import ar.com.sancorsalud.entidades.producto.Producto;

/**
 *
 * @author hzanuzzi
 */
public class ParametroLiquidacion {
    
    public Integer PeriodoLiquidacion;
            
    public Empresa Empresa;
    
    public Cuenta Cuenta;
    
    public Producto Producto;
    
    public Cotizacion Cotizacion;
    
    public Integer FechaInicialPeriodoLiquidacion()
    {
        return Integer.valueOf(this.PeriodoLiquidacion.toString() + "01");
    }
}
