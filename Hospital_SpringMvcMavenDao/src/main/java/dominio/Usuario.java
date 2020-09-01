package dominio;

import java.sql.Date;

public class Usuario {
	
	private String id,nombre, edad, direccion, telefono, rfc,  especialidad, sexo, email, password, usuario_no; 
	private Date date;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario( String id,String nombre, String edad, String direccion, String telefono, String rfc, String especialidad, String sexo, String email,
			String password) {
		this.id=id;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono= telefono;
		this.especialidad = especialidad;
		this.rfc=rfc;
		this.sexo = sexo;
		this.email = email;
		this.password = password;
		
		
	}
	
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario_no() {
		return usuario_no;
	}

	public void setUsuario_no(String usuario_no) {
		this.usuario_no = usuario_no;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
