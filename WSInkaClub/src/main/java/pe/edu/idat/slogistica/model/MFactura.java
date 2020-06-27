package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Factura;

public class MFactura {
	
	private int id;
	private String ruc;
	private String rSocial;
	private String fRegistro;
	private double subtotal;
	private double igv;
	private double total;
	private int estado;
	private int visible;
	private int idTrabajador;
	
	public MFactura() {
		
	}
	
	public MFactura(Factura factura) {
		this.id = factura.getId();
		this.ruc = factura.getRuc();
		this.rSocial = factura.getrSocial();
		this.fRegistro = factura.getfRegistro();
		this.subtotal = factura.getSubtotal();
		this.igv = factura.getIgv();
		this.total = factura.getTotal();
		this.estado = factura.getEstado();
		this.visible = factura.getVisible();
		this.idTrabajador = factura.getTrabajador().getId();
	}
	
	public MFactura(int id, String ruc, String rSocial, String fRegistro, double subtotal, double igv, double total,
			int estado, int visible, int idTrabajador) {
		super();
		this.id = id;
		this.ruc = ruc;
		this.rSocial = rSocial;
		this.fRegistro = fRegistro;
		this.subtotal = subtotal;
		this.igv = igv;
		this.total = total;
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
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getrSocial() {
		return rSocial;
	}
	public void setrSocial(String rSocial) {
		this.rSocial = rSocial;
	}
	public String getfRegistro() {
		return fRegistro;
	}
	public void setfRegistro(String fRegistro) {
		this.fRegistro = fRegistro;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
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
