package ar.edu.davinci.dvds20201cg3.servicio;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import ar.edu.davinci.dvds20201cg3.modelo.Cliente;
import ar.edu.davinci.dvds20201cg3.repositorio.ClienteRepositorio;

@Service
public class ClienteServicio {

	
	@Autowired
	ClienteRepositorio clienteRepositorio;
	
	public Page<Cliente> listar() {
		Pageable pageable = PageRequest.of(0, 10);
		return clienteRepositorio.findAll(pageable);
	}
	
	public List<Cliente> buscarClienterPorApellido(String apellido) {
		List<Cliente> clientes = clienteRepositorio.searchByLastName(apellido);
		if (CollectionUtils.isNotEmpty(clientes)) {
			return clientes;
		} else {
			return (List<Cliente>) CollectionUtils.EMPTY_COLLECTION;
		}
	}


	
}
