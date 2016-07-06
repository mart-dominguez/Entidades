package ar.com.sancorsalud.entidades.producto;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Table;

public class Producto {

	public short Codigo;
	
	public String Descripcion;
	
	public EmpresaFacturadora EmpresaFacturadora;
}
