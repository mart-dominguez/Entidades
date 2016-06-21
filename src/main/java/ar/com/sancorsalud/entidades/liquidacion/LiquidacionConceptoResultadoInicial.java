package ar.com.sancorsalud.entidades.liquidacion;

import ar.com.sancorsalud.entidades.asociado.Asociado;

public class LiquidacionConceptoResultadoInicial {
	
	public LiquidacionConceptoResultadoInicial()
	{
		this.Asociado = new Asociado();
		
	}

	public Asociado Asociado;
	
	public Bonificacion BonificacionGrupoNumeroso;
	
	public Bonificacion BonificacionPorHijo;
	
	public Bonificacion BonificacionPorPermanencia;
	
	public Bonificacion BonificacionPorCategoria;
	
	public Bonificacion BonificacionPyme;
	
	public Bonificacion BonificacionGrupoAfinidad;
	
	public Bonificacion BonificacionIva;
}
