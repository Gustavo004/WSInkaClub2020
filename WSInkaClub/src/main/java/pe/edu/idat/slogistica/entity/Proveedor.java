package pe.edu.idat.slogistica.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="ruc")
	private String ruc;
	@Column(name="rSocial")
	private String rSocial;
	@Column(name="cFacturacion")
	private int cFacturacion;
	@Column(name="iContrato")
	private String iContrato;
	@Column(name="fContrato")
	private String fContrato;
	@Column(name="telefono")
	private String telefono;
	@Column(name="direccion")
	private String direccion;
	@Column(name="email")
	private String email;
	@Column(name="representante")
	private String representante;
	@Column(name="visible")
	private int visible;
	@JoinColumn(name ="distrito" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Distrito distrito;
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Proveedor(int id, String ruc, String rSocial, int cFacturacion, String iContrato, String fContrato,
			String telefono, String direccion, String email, String representante, int visible, Distrito distrito) {
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
		this.distrito = distrito;
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
	public Distrito getDistrito() {
		return distrito;
	}
	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	
}
