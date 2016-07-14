package ar.com.sancorsalud.entidades.liquidacion;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SMPLIBD.T47FCON")
public class Concepto implements Serializable {

    @Id()
    @Column(name = "T47COD")        
    int codigo;
    
    @Column(name = "T47DES")
    String descripcion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int Codigo) {
        this.codigo = Codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }   
}
