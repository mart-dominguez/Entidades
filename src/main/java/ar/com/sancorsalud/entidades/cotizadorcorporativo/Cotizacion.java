package ar.com.sancorsalud.entidades.cotizadorcorporativo;
import java.math.BigDecimal;
import java.util.ArrayList;
import ar.com.sancorsalud.entidades.producto.ZonaPromocion;
import ar.com.sancorsalud.entidades.empresa.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity()
@Table(name = "COTIZACION")
public class Cotizacion implements Serializable {
	
	public Cotizacion() 
	{
	}
	
	@Id
	@Column(name="Id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	       
        @ManyToOne()
        @JoinColumn(name = "IdEmpresa")
	private Empresa EmpresaCotizada;

	private PerfilCotizacion Perfil;
	
	@Column(name="Ace")
	private BigDecimal Ace;
	
	@Column(name="CapitasCotizadas")
	private short CapitasCotizadas;
	
	@Column(name="EdadPromedio")
	private float EdadPromedio;
	
	@Column(name="ValorCuota")
	private short ValorCuota;
	
        @OneToMany(mappedBy = "Cotizacion")
	private ArrayList<PlanCotizado> PlanesCotizados;
	
        @OneToMany(mappedBy = "Cotizacion")
	private ArrayList<Modulo> ModulosCotizados;
        
        @OneToMany(mappedBy = "Cotizacion")
	private ArrayList<CapitaRango> CapitaRangos;
	
        @ManyToOne()
        @JoinColumn(name = "IdZonaPromocion")
	private ZonaPromocion ZonaPromocion;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Empresa getEmpresaCotizada() {
        return EmpresaCotizada;
    }

    public void setEmpresaCotizada(Empresa EmpresaCotizada) {
        this.EmpresaCotizada = EmpresaCotizada;
    }

    public PerfilCotizacion getPerfil() {
        return Perfil;
    }

    public void setPerfil(PerfilCotizacion Perfil) {
        this.Perfil = Perfil;
    }

    public BigDecimal getAce() {
        return Ace;
    }

    public void setAce(BigDecimal Ace) {
        this.Ace = Ace;
    }

    public short getCapitasCotizadas() {
        return CapitasCotizadas;
    }

    public void setCapitasCotizadas(short CapitasCotizadas) {
        this.CapitasCotizadas = CapitasCotizadas;
    }

    public float getEdadPromedio() {
        return EdadPromedio;
    }

    public void setEdadPromedio(float EdadPromedio) {
        this.EdadPromedio = EdadPromedio;
    }

    public short getValorCuota() {
        return ValorCuota;
    }

    public void setValorCuota(short ValorCuota) {
        this.ValorCuota = ValorCuota;
    }

    public ArrayList<PlanCotizado> getPlanesCotizados() {
        return PlanesCotizados;
    }

    public void setPlanesCotizados(ArrayList<PlanCotizado> PlanesCotizados) {
        this.PlanesCotizados = PlanesCotizados;
    }

    public ArrayList<Modulo> getModulosCotizados() {
        return ModulosCotizados;
    }

    public void setModulosCotizados(ArrayList<Modulo> ModulosCotizados) {
        this.ModulosCotizados = ModulosCotizados;
    }

    public ZonaPromocion getZonaPromocion() {
        return ZonaPromocion;
    }

    public void setZonaPromocion(ZonaPromocion ZonaPromocion) {
        this.ZonaPromocion = ZonaPromocion;
    }

    public ArrayList<CapitaRango> getCapitaRangos() {
        return CapitaRangos;
    }

    public void setCapitaRangos(ArrayList<CapitaRango> CapitaRangos) {
        this.CapitaRangos = CapitaRangos;
    }
    
    
}
