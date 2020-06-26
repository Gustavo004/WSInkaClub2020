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
@Table(name = "distrito")
public class Distrito implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="visible")
	private int visible;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "distrito")
	private List<Cliente> listaCliente;	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "distrito")
	private List<Proveedor> listaProveedor;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "distrito")
	private List<Trabajador> listaTrabajador;
	
	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Distrito(int id, String nombre, int visible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.visible = visible;
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
	
}
