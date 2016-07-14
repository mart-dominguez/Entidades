package ar.com.sancorsalud.entidades.producto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="T11FZPR")
public class ZonaPromocion implements Serializable {

        @Id
        @Column(name="M05EMP")
	public int Id;
	
	public String Descripcion;
}
