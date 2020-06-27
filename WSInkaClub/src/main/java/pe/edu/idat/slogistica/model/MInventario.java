package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Inventario;

public class MInventario {

	private int id;
	private String lugar;
	private String motivo;
	private String fFisica;
	private String fModificacion;
	private int estado;
	private int visible;
	private int idTrabajador;
	
	public MInventario() {
		
	}
	public MInventario(Inventario inventario) {
		this.id = inventario.getId();
		this.lugar = inventario.getLugar();
		this.motivo = inventario.getMotivo();
		this.fFisica = inventario.getfFisica();
		this.fModificacion = inventario.getfModificacion();
		this.estado = inventario.getEstado();
		this.visible = inventario.getVisible();
		this.idTrabajador = inventario.getTrabajador().getId();
	}
	
	public MInventario(int id, String lugar, String motivo, String fFisica, String fModificacion, int estado,
			int visible, int idTrabajador) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.motivo = motivo;
		this.fFisica = fFisica;
		this.fModificacion = fModificacion;
		this.estado = estado;
		this.visible = visible;
		this.idTrabajador = idTrabajador;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getfFisica() {
		return fFisica;
	}
	public void setfFisica(String fFisica) {
		this.fFisica = fFisica;
	}
	public String getfModificacion() {
		return fModificacion;
	}
	public void setfModificacion(String fModificacion) {
		this.fModificacion = fModificacion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	public int getIdTrabajador() {
		return idTrabajador;
	}
	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}
	
	
}
