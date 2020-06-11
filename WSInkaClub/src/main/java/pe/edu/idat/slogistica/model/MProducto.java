package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Producto;

public class MProducto {
	private int id;
	private String nombre;
	private int visible;
	private int idCategoria;
	private int idTipocarga;
	public MProducto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MProducto(Producto producto) {
		super();
		this.id = producto.getId();
		this.nombre = producto.getNombre();
		this.visible = producto.getVisible();
		this.idCategoria = producto.getCategoria().getId();
		this.idTipocarga = producto.getTipocarga().getId();
	}
	public MProducto(int id, String nombre, int visible, int idCategoria, int idTipocarga) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.visible = visible;
		this.idCategoria = idCategoria;
		this.idTipocarga = idTipocarga;
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
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public int getIdTipocarga() {
		return idTipocarga;
	}
	public void setIdTipocarga(int idTipocarga) {
		this.idTipocarga = idTipocarga;
	}
	
}
