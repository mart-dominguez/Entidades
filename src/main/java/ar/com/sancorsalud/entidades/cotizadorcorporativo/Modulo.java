package ar.com.sancorsalud.entidades.cotizadorcorporativo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "COTIZADORC.COTIZACION_MODULOS")
public class Modulo implements Serializable {
    
        public Modulo()
        {
        }
    
        @Id()
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name = "Id")
        private int Id;

        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name = "IdCotizacion")
        private Cotizacion Cotizacion;
        
        @Column(name = "Modulo")
	private String Descripcion;
	
	private float Porcentaje;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Cotizacion getCotizacion() {
        return Cotizacion;
    }

    public void setCotizacion(Cotizacion Cotizacion) {
        this.Cotizacion = Cotizacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(float Porcentaje) {
        this.Porcentaje = Porcentaje;
    }  
}
