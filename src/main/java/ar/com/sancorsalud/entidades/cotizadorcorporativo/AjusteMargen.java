package ar.com.sancorsalud.entidades.cotizadorcorporativo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="COTIZADORC.AJ_MARGENES")
public class AjusteMargen implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AjusteMargen()
	{}
	
	public AjusteMargen(int id)
	{
		this.Id=id;
	}

	@Id
	@Column(name="ID")
	public int Id;
	
	@Id
	@Column(name="FECHA00001")
	public Date FechaVigencia;
	
	@Column(name="IIBB")
	public short IIBB;
	
	@Column(name="INCOB")
	public short Incobrabilidad;
	
	@Column(name="COMISION")
	public short Comision;
	
	@Column(name="MARGE00001")
	public short MargenBase;
	
	@Column(name="ESTRUCTURA")
	public short Estructura;
	
}
