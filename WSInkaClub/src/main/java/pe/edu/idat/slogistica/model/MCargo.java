package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Cargo;

public class MCargo {
	private int id;
	private String cargo;
	private int visible;
	public MCargo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MCargo(Cargo cargo) {
		super();
		this.id = cargo.getId();
		this.cargo = cargo.getCargo();
		this.visible = cargo.getVisible();
	}
	public MCargo(int id, String cargo, int visible) {
		super();
		this.id = id;
		this.cargo = cargo;
		this.visible = visible;
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
	
}
