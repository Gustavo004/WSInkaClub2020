package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Cliente;

public class MCliente {
	private int id;
	private String tienda;
	private int telefono;
	private String direccion;
	private String email;
	private int visible;
	private int idDistrito;	
	public MCliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MCliente(Cliente cliente) {
		super();
		this.id = cliente.getId();
		this.tienda = cliente.getTienda();
		this.telefono = cliente.getTelefono();
		this.direccion = cliente.getDireccion();
		this.email = cliente.getEmail();
		this.visible = cliente.getVisible();
		this.idDistrito = cliente.getDistrito().getId();
	}
	public MCliente(int id, String tienda, int telefono, String direccion, String email, int visible, int idDistrito) {
		super();
		this.id = id;
		this.tienda = tienda;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.visible = visible;
		this.idDistrito = idDistrito;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	
}
