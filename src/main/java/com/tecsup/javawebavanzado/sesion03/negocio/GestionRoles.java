package com.tecsup.javawebavanzado.sesion03.negocio;

import java.util.ArrayList;
import java.util.Collection;

import com.tecsup.javawebavanzado.sesion03.excepcion.DAOExcepcion;
import com.tecsup.javawebavanzado.sesion03.modelo.Rol;

public class GestionRoles {
	static Collection<Rol> roles = new ArrayList<Rol>();

	static {
		roles.add(new Rol(1, "Administrador"));
		roles.add(new Rol(2, "Supervisor"));
		roles.add(new Rol(3, "Terapeuta"));
		roles.add(new Rol(3, "Apoderado"));
	}

	public Collection<Rol> listar() throws DAOExcepcion {
		// TODO Auto-generated method stub
		return roles;
	}
}
