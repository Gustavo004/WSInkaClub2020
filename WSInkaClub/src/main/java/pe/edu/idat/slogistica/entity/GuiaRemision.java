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
@Table(name = "guiaRemision")
public class GuiaRemision implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "fRegistro")
	private String fRegistro;
	@Column(name = "pPartida")
	private String pPartida;
	@Column(name = "pLlegada")
	private String pLlegada;
	@Column(name = "motivo")
	private String motivo;
	@Column(name = "dniTransportista")
	private String dniTransportista;
	@Column(name = "nTransportista")
	private String nTransportista;
	@Column(name = "licencia")
	private String licencia;
	@Column(name = "placa")
	private String placa;
	@Column(name = "marca")
	private String marca;
	@Column(name = "visible")
	private int visible;
	@JoinColumn(name ="factura" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Factura factura;
	
	public GuiaRemision() {
		
	}
	
	public GuiaRemision(int id, String fRegistro, String pPartida, String pLlegada, String motivo,
			String dniTransportista, String nTransportista, String licencia, String placa, String marca, int visible,
			Factura factura) {
		super();
		this.id = id;
		this.fRegistro = fRegistro;
		this.pPartida = pPartida;
		this.pLlegada = pLlegada;
		this.motivo = motivo;
		this.dniTransportista = dniTransportista;
		this.nTransportista = nTransportista;
		this.licencia = licencia;
		this.placa = placa;
		this.marca = marca;
		this.visible = visible;
		this.factura = factura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfRegistro() {
		return fRegistro;
	}
	public void setfRegistro(String fRegistro) {
		this.fRegistro = fRegistro;
	}
	public String getpPartida() {
		return pPartida;
	}
	public void setpPartida(String pPartida) {
		this.pPartida = pPartida;
	}
	public String getpLlegada() {
		return pLlegada;
	}
	public void setpLlegada(String pLlegada) {
		this.pLlegada = pLlegada;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDniTransportista() {
		return dniTransportista;
	}
	public void setDniTransportista(String dniTransportista) {
		this.dniTransportista = dniTransportista;
	}
	public String getnTransportista() {
		return nTransportista;
	}
	public void setnTransportista(String nTransportista) {
		this.nTransportista = nTransportista;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
}
