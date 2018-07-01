package com.tecsup.javawebavanzado.sesion03.negocio;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import com.tecsup.javawebavanzado.sesion03.excepcion.DAOExcepcion;
import com.tecsup.javawebavanzado.sesion03.modelo.Usuario;

public class GestionUsuarios {
	static HashMap<Integer, Collection<Usuario>> usuariosXRoles = new HashMap<Integer, Collection<Usuario>>();

	static {
		usuariosXRoles.put(new Integer(1), Arrays.asList(new Usuario(10, "David", "Rodriguez", "Condezo","rcondezogmail.com")));
		usuariosXRoles.put(new Integer(2), Arrays.asList(new Usuario(20, "Fidel", "Matos", "Perez","fidel@gmail.com")));

	}
	
	public Collection<Usuario> listarPorRol(int idRol) throws DAOExcepcion {
		// TODO Auto-generated method stub
		return usuariosXRoles.get(idRol);
	}
}
