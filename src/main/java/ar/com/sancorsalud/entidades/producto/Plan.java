package ar.com.sancorsalud.entidades.producto;


public class Plan {
	
	public Plan()
	{
		this.Producto= new Producto();
	}
	
	public Producto Producto;

	public String Codigo;
	
	public String DescripcionComercial;
	
	public String DescripcionParaSocio;
}
