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
@Table(name = "trabajador")
public class Trabajador implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="fNacimiento")
	private String fNacimiento;
	@Column(name="tDocumento")
	private String tDocumento;
	@Column(name="nDocumento")
	private int nDocumento;
	@Column(name="sexo")
	private String sexo;
	@Column(name="eCivil")
	private String eCivil;
	@Column(name="telefono")
	private String telefono;
	@Column(name="email")
	private String email;
	@Column(name="direccion")
	private String direccion;
	@Column(name="fRegistro")
	private String fRegistro;
	@Column(name="login")
	private String login;
	@Column(name="clave")
	private String clave;
	@Column(name="visible")
	private int visible;
	@JoinColumn(name ="cargo" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Cargo cargo;
	@JoinColumn(name ="distrito" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Distrito distrito;
	@JoinColumn(name ="cliente" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Cliente cliente;
	
	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trabajador(int id, String nombres, String apellidos, String fNacimiento, String tDocumento, int nDocumento,
			String sexo, String eCivil, String telefono, String email, String direccion, String fRegistro, String login,
			String clave, int visible, Cargo cargo, Distrito distrito, Cliente cliente) {
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
		this.cargo = cargo;
		this.distrito = distrito;
		this.cliente = cliente;
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
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Distrito getDistrito() {
		return distrito;
	}
	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
