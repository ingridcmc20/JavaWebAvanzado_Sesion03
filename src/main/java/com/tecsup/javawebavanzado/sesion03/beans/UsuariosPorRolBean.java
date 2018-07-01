package com.tecsup.javawebavanzado.sesion03.beans;

import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.tecsup.javawebavanzado.sesion03.excepcion.DAOExcepcion;
import com.tecsup.javawebavanzado.sesion03.modelo.Rol;
import com.tecsup.javawebavanzado.sesion03.modelo.Usuario;
import com.tecsup.javawebavanzado.sesion03.negocio.GestionRoles;
import com.tecsup.javawebavanzado.sesion03.negocio.GestionUsuarios;

@ManagedBean(name = "usuariosPorRolBean")
@RequestScoped
public class UsuariosPorRolBean {
	private Collection<Rol> roles;
	private Collection<Usuario> usuarios;

	public UsuariosPorRolBean() {
		GestionRoles negocio = new GestionRoles();
		try {
			roles = negocio.listar();
			System.out.println("Total de roles: " + roles.size());

		} catch (DAOExcepcion e) {
			e.printStackTrace();
		}
	}

	public void cargarUsuarios(int idRol) {
		System.out.println("Dentro de cargarUsuarios()");
		GestionUsuarios negocio = new GestionUsuarios();
		try {
			usuarios = negocio.listarPorRol(idRol);
			System.out.println("Total de usuarios: " + usuarios.size());
		} catch (DAOExcepcion e) {
			e.printStackTrace();
		}
	}

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
