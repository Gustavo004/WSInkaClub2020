package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.GuiaRemision;


public class MGuiaRemision {

	private int id;
	private String fRegistro;
	private String pPartida;
	private String pLlegada;
	private String motivo;
	private String dniTransportista;
	private String nTransportista;
	private String licencia;
	private String placa;
	private String marca;
	private int visible;
	private int idFactura;
	
	public MGuiaRemision() {
		
	}
	
	public MGuiaRemision(GuiaRemision gRemision) {
		this.id = gRemision.getId();
		this.fRegistro = gRemision.getfRegistro();
		this.pPartida = gRemision.getpPartida();
		this.pLlegada = gRemision.getpLlegada();
		this.motivo = gRemision.getMotivo();
		this.dniTransportista = gRemision.getDniTransportista();
		this.nTransportista = gRemision.getnTransportista();
		this.licencia = gRemision.getLicencia();
		this.placa = gRemision.getPlaca();
		this.marca = gRemision.getMarca();
		this.visible = gRemision.getVisible();
		this.idFactura = gRemision.getFactura().getId();
	}
	
	public MGuiaRemision(int id, String fRegistro, String pPartida, String pLlegada, String motivo,
			String dniTransportista, String nTransportista, String licencia, String placa, String marca, int visible,
			int idFactura) {
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
		this.idFactura = idFactura;
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

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	
	
}
