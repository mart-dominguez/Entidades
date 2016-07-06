package ar.com.sancorsalud.entidades.producto;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Plan {
	
	public Plan()
	{
		this.Producto= new Producto();
	}
	
        @EmbeddedId
	public Producto Producto;

        @Id
	public String Codigo;
	
	public String DescripcionComercial;
	
	public String DescripcionParaSocio;
}
