package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Categoria;

public class MCategoria {
	private int id;
	private String nombre;
	private int visible;
	public MCategoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MCategoria(Categoria categoria) {
		super();
		this.id = categoria.getId();
		this.nombre = categoria.getNombre();
		this.visible = categoria.getVisible();
	}
	public MCategoria(int id, String nombre, int visible) {
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
