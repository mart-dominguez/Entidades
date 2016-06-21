package ar.com.sancorsalud.entidades.liquidacion;

import java.util.Date;

import ar.com.sancorsalud.entidades.asociado.*;
import ar.com.sancorsalud.entidades.producto.Producto;

public class LiquidacionConcepto {

	public Asociado Asociado;
	
	public Concepto Concepto;
	
	public Date FechaPrestacion;
	
	public int NumeroConcepto;
	
	public FuenteIngreso FuenteIngreso;
	
	public Producto Producto;
	
	public boolean SeFactura;
	
	public short Estado;
	
	
}
