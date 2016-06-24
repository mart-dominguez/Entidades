package ar.com.sancorsalud.entidades.asociado;

import ar.com.sancorsalud.entidades.general.Parentesco;
import ar.com.sancorsalud.entidades.general.Persona;
import ar.com.sancorsalud.entidades.producto.Plan;

public class Asociado extends Persona {

	public Asociado()
	{
	}
	
	public Cuenta Cuenta;
	
	public int SubnumeroCuenta;
	
	public int NumeroSecuencia;
	
	public Carnet Carnet;
	
	public Cuenta CuentaALaQueSeFactura;
	
	public Parentesco Parentesco;
	
	public Plan Plan;
}
