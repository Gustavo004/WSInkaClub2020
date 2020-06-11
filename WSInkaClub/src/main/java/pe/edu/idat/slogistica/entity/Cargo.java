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
@Table(name = "cargo")
public class Cargo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int id;
	@Column(name="cargo")
	private String cargo;
	@Column(name="visible")
	private int visible;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cargo")
	private List<Trabajador> listaTrabajador;
	public Cargo() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Cargo(int id, String cargo, int visible) {
		super();
		this.id = id;
		this.cargo = cargo;
		this.visible = visible;
	}
	public Cargo(int id, String cargo, int visible, List<Trabajador> listaTrabajador) {
		super();
		this.id = id;
		this.cargo = cargo;
		this.visible = visible;
		this.listaTrabajador = listaTrabajador;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	public List<Trabajador> getListaTrabajador() {
		return listaTrabajador;
	}
	public void setListaTrabajador(List<Trabajador> listaTrabajador) {
		this.listaTrabajador = listaTrabajador;
	}
	
}
