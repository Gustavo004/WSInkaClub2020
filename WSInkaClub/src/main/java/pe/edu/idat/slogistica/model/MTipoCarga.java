package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.TipoCarga;

public class MTipoCarga {
	private int id;
	private String nombre;
	private int visible;
	public MTipoCarga() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MTipoCarga(TipoCarga tipoCarga) {
		super();
		this.id = tipoCarga.getId();
		this.nombre = tipoCarga.getNombre();
		this.visible = tipoCarga.getVisible();
	}
	public MTipoCarga(int id, String nombre, int visible) {
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
