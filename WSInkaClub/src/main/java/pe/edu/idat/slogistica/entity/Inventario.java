package pe.edu.idat.slogistica.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="inventario")
public class Inventario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "motivo")
	private String motivo;
	@Column(name = "fFisica")
	private String fFisica;
	@Column(name = "fModificacion")
	private String fModificacion;
	@Column(name = "estado")
	private int estado;
	@Column(name = "visible")
	private int visible;
	@JoinColumn(name="trabajador",referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Trabajador trabajador;
	
	public Inventario() {
		
	}
	
	public Inventario(int id, String lugar, String motivo, String fFisica, String fModificacion, int estado,
			int visible, Trabajador trabajador) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.motivo = motivo;
		this.fFisica = fFisica;
		this.fModificacion = fModificacion;
		this.estado = estado;
		this.visible = visible;
		this.trabajador = trabajador;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getfFisica() {
		return fFisica;
	}
	public void setfFisica(String fFisica) {
		this.fFisica = fFisica;
	}
	public String getfModificacion() {
		return fModificacion;
	}
	public void setfModificacion(String fModificacion) {
		this.fModificacion = fModificacion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	
	

}
