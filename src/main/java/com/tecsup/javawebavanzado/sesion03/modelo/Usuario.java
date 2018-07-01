package com.tecsup.javawebavanzado.sesion03.modelo;

public class Usuario {
	Integer id;
	String nombres;
	String paterno;
	String materno;
	String correo;

	public Usuario(Integer id, String nombres, String paterno, String materno, String correo) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.paterno = paterno;
		this.materno = materno;
		this.correo = correo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
