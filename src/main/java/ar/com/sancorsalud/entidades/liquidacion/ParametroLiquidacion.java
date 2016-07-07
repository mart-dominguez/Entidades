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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    private LiquidacionEstado liquidacionEstado;
    
    public Integer FechaInicialPeriodoLiquidacion()
    {
        return Integer.valueOf(this.PeriodoLiquidacion.toString() + "01");
    }
    
    public Date getFechaInicialPeriodoLiquidacion()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        
        Date fecha = null;
        try {
            fecha = sdf.parse(this.PeriodoLiquidacion.toString() + "01");
        } catch (ParseException ex) {
            Logger.getLogger(ParametroLiquidacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fecha;
    }

    public LiquidacionEstado getLiquidacionEstado() {
        return liquidacionEstado;
    }

    public void setLiquidacionEstado(LiquidacionEstado liquidacionEstado) {
        this.liquidacionEstado = liquidacionEstado;
    }
}
