package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Proveedor;

public class MProveedor {
	private int id;
	private int ruc;
	private String rSocial;
	private int cFacturacion;
	private String iContrato;
	private String fContrato;
	private String telefono;
	private String direccion;
	private String email;
	private String representante;
	private int visible;
	private int idDistrito;
	public MProveedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MProveedor(Proveedor proveedor) {
		super();
		this.id = proveedor.getId();
		this.ruc = proveedor.getRuc();
		this.rSocial = proveedor.getrSocial();
		this.cFacturacion = proveedor.getcFacturacion();
		this.iContrato = proveedor.getiContrato();
		this.fContrato = proveedor.getfContrato();
		this.telefono = proveedor.getTelefono();
		this.direccion = proveedor.getDireccion();
		this.email = proveedor.getEmail();
		this.representante = proveedor.getRepresentante();
		this.visible = proveedor.getVisible();
		this.idDistrito = proveedor.getDistrito().getId();
	}
	public MProveedor(int id, int ruc, String rSocial, int cFacturacion, String iContrato, String fContrato,
			String telefono, String direccion, String email, String representante, int visible, int distrito) {
		super();
		this.id = id;
		this.ruc = ruc;
		this.rSocial = rSocial;
		this.cFacturacion = cFacturacion;
		this.iContrato = iContrato;
		this.fContrato = fContrato;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.representante = representante;
		this.visible = visible;
		this.idDistrito = distrito;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRuc() {
		return ruc;
	}
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}
	public String getrSocial() {
		return rSocial;
	}
	public void setrSocial(String rSocial) {
		this.rSocial = rSocial;
	}
	public int getcFacturacion() {
		return cFacturacion;
	}
	public void setcFacturacion(int cFacturacion) {
		this.cFacturacion = cFacturacion;
	}
	public String getiContrato() {
		return iContrato;
	}
	public void setiContrato(String iContrato) {
		this.iContrato = iContrato;
	}
	public String getfContrato() {
		return fContrato;
	}
	public void setfContrato(String fContrato) {
		this.fContrato = fContrato;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
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
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
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
