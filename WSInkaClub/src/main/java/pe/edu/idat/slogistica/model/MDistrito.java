package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Distrito;

public class MDistrito {
	private int id;
	private String nombre;
	private int visible;
	public MDistrito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MDistrito(Distrito distrito) {
		super();
		this.id = distrito.getId();
		this.nombre = distrito.getNombre();
		this.visible = distrito.getVisible();
	}
	public MDistrito(int id, String nombre, int visible) {
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
