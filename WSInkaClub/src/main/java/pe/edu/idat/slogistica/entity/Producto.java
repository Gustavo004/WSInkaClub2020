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
@Table(name = "producto")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="visible")
	private int visible;
	@JoinColumn(name ="categoria" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Categoria categoria;
	@JoinColumn(name ="tipoCarga" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private TipoCarga tipoCarga;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(int id, String nombre, int visible, Categoria categoria, TipoCarga tipoCarga) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.visible = visible;
		this.categoria = categoria;
		this.tipoCarga = tipoCarga;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public TipoCarga getTipocarga() {
		return tipoCarga;
	}
	public void setTipocarga(TipoCarga tipocarga) {
		this.tipoCarga = tipocarga;
	}
	
}
