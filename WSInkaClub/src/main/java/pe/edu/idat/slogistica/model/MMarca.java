package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Marca;

public class MMarca {
	private int id;
	private String nombre;
	private int visible;
	public MMarca() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MMarca(Marca marca) {
		super();
		this.id = marca.getId();
		this.nombre = marca.getNombre();
		this.visible =marca.getVisible();
	}
	public MMarca(int id, String nombre, int visible) {
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
