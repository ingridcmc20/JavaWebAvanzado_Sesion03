package com.tecsup.javawebavanzado.sesion03.negocio;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import com.tecsup.javawebavanzado.sesion03.excepcion.DAOExcepcion;
import com.tecsup.javawebavanzado.sesion03.modelo.Producto;

public class GestionProductos {
	static HashMap<Integer, Collection<Producto>> productosXcategorias = new HashMap<Integer, Collection<Producto>>();

	static {
		productosXcategorias.put(new Integer(1), Arrays.asList(
				new Producto(10, "Smartphone", "Smartphone", "phone",500),
				new Producto(11, "Tablet", "Tablet", "tablet",1000),
				new Producto(12, "Smartwatch", "Smartwatch", "iwatch",450),
				new Producto(13, "SmarTV", "SmarTV", "tv",1450)
				));
		productosXcategorias.put(new Integer(2),
				Arrays.asList(new Producto(20, "La Casa Verde", "La Casa Verde", "verde",15),
						new Producto(21, "El Capitan Grant", "El Capitan Grant", "capitan",15)));
		productosXcategorias.put(new Integer(3), Arrays.asList(new Producto(30, "Futbol", "Futbol", "futbol",0),
				new Producto(31, "Voley", "Voley", "voley",0)));

	}

	public Collection<Producto> listarPorCategoria(int idCategoria) throws DAOExcepcion {
		// TODO Auto-generated method stub
		return productosXcategorias.get(idCategoria);
	}

}
