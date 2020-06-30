package ar.edu.davinci.dvds20201cg3.servicio;

import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ar.edu.davinci.dvds20201cg3.modelo.Producto;
import ar.edu.davinci.dvds20201cg3.repositorio.ProductoRepositorio;

@Service
public class ProductoServicio {
	
	private final Logger LOGGER = LoggerFactory.getLogger(ProductoServicio.class);
	
	private final ProductoRepositorio productoRepositorio;
	
	@Autowired
	public ProductoServicio(final ProductoRepositorio productoRepositorio) {
		this.productoRepositorio = productoRepositorio;
	}
	
	public List<Producto> listarProductos(){
		return productoRepositorio.findAll();
	}
	
	public Page<Producto> listar(Pageable pageable) {
		LOGGER.info("Pagegable: offset: " + pageable.getOffset() + " - pageSize:" + pageable.getPageSize());
		return productoRepositorio.findAll(pageable);
	}
	
	
	public Producto buscarPorId(Long productoId) {
		Optional<Producto> producto = productoRepositorio.findById(productoId);
		if (producto.isPresent()) {
			return producto.get();
		}
		return null;
	}
	
	public List<Producto> buscarProductoPorNombre(String nombre) {
		LOGGER.info("buscarProductoPorNombre: nombre: " + nombre);
		List<Producto> productos = productoRepositorio.searchByName(nombre);
		if (CollectionUtils.isNotEmpty(productos)) {
			LOGGER.info("productos.size: " + productos.size());
			return productos;
		} else {
			LOGGER.info("productos empty");
			return (List<Producto>) CollectionUtils.EMPTY_COLLECTION;
		}
	}
	
	public Producto grabarProducto(Producto producto) {
		
		Producto prod = null;
		try {
			prod = productoRepositorio.save(producto);
		}catch (Exception e){
			LOGGER.info("Mensaje: " + e.getMessage());
			LOGGER.info("Causa: " + e.getCause());
		}
		return productoRepositorio.save(producto);
	}
	
	public void borrarProducto(Long productoId) {
		productoRepositorio.deleteById(productoId);
	}

}
