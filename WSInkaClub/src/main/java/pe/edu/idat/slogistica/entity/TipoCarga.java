package pe.edu.idat.slogistica.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipoCarga")
public class TipoCarga implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="visible")
	private int visible;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoCarga")
	private List<Producto> listaProducto;
	public TipoCarga() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoCarga(int id, String nombre, int visible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.visible = visible;
	}
	public TipoCarga(int id, String nombre, int visible, List<Producto> listaProducto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.visible = visible;
		this.listaProducto = listaProducto;
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
	public List<Producto> getListaProducto() {
		return listaProducto;
	}
	public void setListaProducto(List<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}
	
}
