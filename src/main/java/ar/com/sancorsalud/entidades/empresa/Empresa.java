package ar.com.sancorsalud.entidades.empresa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="SMPLIBD.M05FEMP")
public class Empresa implements Serializable {

        @Id
        @Column(name="M05EMP")
	private int Id;
	
        @Column(name="M05DEN")
	private String Descripcion;
        
        @Column(name="M05CUI")
        private long Cuit;
        
        @Column(name="M05DER")
	private String NombreFantasia;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public long getCuit() {
        return Cuit;
    }

    public void setCuit(long Cuit) {
        this.Cuit = Cuit;
    }

    public String getNombreFantasia() {
        return NombreFantasia;
    }

    public void setNombreFantasia(String NombreFantasia) {
        this.NombreFantasia = NombreFantasia;
    }
}
