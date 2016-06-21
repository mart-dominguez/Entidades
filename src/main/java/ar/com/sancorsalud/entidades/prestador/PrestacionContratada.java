package ar.com.sancorsalud.entidades.prestador;

import java.util.Date;

import ar.com.sancorsalud.entidades.prestacion.Prestacion;
import ar.com.sancorsalud.entidades.producto.Plan;

public class PrestacionContratada {
	
	public PrestacionContratada()
	{
		this.Prestador= new Prestador();
		this.Plan = new Plan();
		this.Prestacion= new Prestacion();
	}
	
	public Prestador Prestador;

	public Prestacion Prestacion;
	
	public Plan Plan;
	
	public Date FechaVigenciaDesde;
	
	public Date FechaVigenciaHasta;
}
