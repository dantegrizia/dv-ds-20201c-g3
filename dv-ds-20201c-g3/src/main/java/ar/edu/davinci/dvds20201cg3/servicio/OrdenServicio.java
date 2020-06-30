package ar.edu.davinci.dvds20201cg3.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ar.edu.davinci.dvds20201cg3.modelo.Orden;
import ar.edu.davinci.dvds20201cg3.modelo.OrdenItem;
import ar.edu.davinci.dvds20201cg3.repositorio.OrdenItemRepositorio;
import ar.edu.davinci.dvds20201cg3.repositorio.OrdenRepositorio;

@Service
public class OrdenServicio {

	private final OrdenRepositorio ordenRepositorio;
	
	private final OrdenItemRepositorio  ordenItemRepositorio;
	
	@Autowired
	public OrdenServicio(final OrdenRepositorio ordenRepositorio, OrdenItemRepositorio  ordenItemRepositorio) {
		this.ordenItemRepositorio = ordenItemRepositorio;
		this.ordenRepositorio = ordenRepositorio;
	}
	
	
	public Page<Orden> listarOrden(Pageable pageable){
		ordenRepositorio.findAll(pageable); 
		return null;
	}
	
	public Orden buscarPorId(Long Id) {
		return null;
	}
	
	public Orden grabarProducto(Orden producto) {
		return null;
	}
	
	
	public void agregarOrdenItem(Orden orden, OrdenItem item) {
		
 	}
	
	public void borrarOrdenItem(Orden orden, OrdenItem item) {
		
 	}
}


