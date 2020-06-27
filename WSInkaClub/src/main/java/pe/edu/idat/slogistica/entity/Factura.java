package pe.edu.idat.slogistica.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "ruc")
	private String ruc;
	@Column(name = "rSocial")
	private String rSocial;
	@Column(name = "fRegistro")
	private String fRegistro;
	@Column(name = "subtotal")
	private double subtotal;
	@Column(name = "igv")
	private double igv;
	@Column(name = "total")
	private double total;
	@Column(name = "estado")
	private int estado;
	@Column(name = "visible")
	private int visible;
	@JoinColumn(name ="trabajador" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Trabajador trabajador;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "factura")
	private List<GuiaRemision> listaGuiaRemision;
	
	public Factura() {
		
	}
	
	public Factura(int id, String ruc, String rSocial, String fRegistro, double subtotal, double igv, double total,
			int estado, int visible, Trabajador trabajador) {
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
		this.trabajador = trabajador;
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
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	
	

}
