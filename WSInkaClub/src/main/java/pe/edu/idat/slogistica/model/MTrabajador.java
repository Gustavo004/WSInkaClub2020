package pe.edu.idat.slogistica.model;

import pe.edu.idat.slogistica.entity.Trabajador;

public class MTrabajador {
	private int id;
	private String nombres;
	private String apellidos;
	private String fNacimiento;
	private String tDocumento;
	private int nDocumento;
	private String sexo;
	private String eCivil;
	private String telefono;
	private String email;
	private String direccion;
	private String fRegistro;
	private String login;
	private String clave;
	private int visible;
	private int idCargo;
	private int idDistrito;
	private int idCliente;
	public MTrabajador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MTrabajador(Trabajador trabajador) {
		super();
		this.id = trabajador.getId();
		this.nombres = trabajador.getNombres();
		this.apellidos = trabajador.getApellidos();
		this.fNacimiento = trabajador.getfNacimiento();
		this.tDocumento = trabajador.gettDocumento();
		this.nDocumento = trabajador.getnDocumento();
		this.sexo = trabajador.getSexo();
		this.eCivil = trabajador.geteCivil();
		this.telefono = trabajador.getTelefono();
		this.email = trabajador.getEmail();
		this.direccion = trabajador.getDireccion();
		this.fRegistro = trabajador.getfRegistro();
		this.login = trabajador.getLogin();
		this.clave = trabajador.getClave();
		this.visible = trabajador.getVisible();
		this.idCargo = trabajador.getCargo().getId();
		this.idDistrito = trabajador.getDistrito().getId();
		this.idCliente = trabajador.getCliente().getId();
	}
	public MTrabajador(int id, String nombres, String apellidos, String fNacimiento, String tDocumento, int nDocumento,
			String sexo, String eCivil, String telefono, String email, String direccion, String fRegistro, String login,
			String clave, int visible, int idCargo, int idDistrito, int idCliente) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fNacimiento = fNacimiento;
		this.tDocumento = tDocumento;
		this.nDocumento = nDocumento;
		this.sexo = sexo;
		this.eCivil = eCivil;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.fRegistro = fRegistro;
		this.login = login;
		this.clave = clave;
		this.visible = visible;
		this.idCargo = idCargo;
		this.idDistrito = idDistrito;
		this.idCliente = idCliente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(String fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	public String gettDocumento() {
		return tDocumento;
	}
	public void settDocumento(String tDocumento) {
		this.tDocumento = tDocumento;
	}
	public int getnDocumento() {
		return nDocumento;
	}
	public void setnDocumento(int nDocumento) {
		this.nDocumento = nDocumento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String geteCivil() {
		return eCivil;
	}
	public void seteCivil(String eCivil) {
		this.eCivil = eCivil;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getfRegistro() {
		return fRegistro;
	}
	public void setfRegistro(String fRegistro) {
		this.fRegistro = fRegistro;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	public int getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
}
