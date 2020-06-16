package ar.edu.davinci.dvds20201cg3.controlador.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.davinci.dvds20201cg3.controlador.MyRestApp;
import ar.edu.davinci.dvds20201cg3.modelo.Cliente;
import ar.edu.davinci.dvds20201cg3.repositorio.ClienteRepositorio;

@RestController
public class ClienteRestControlador extends MyRestApp {
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@GetMapping(path="/clientes/listar")
	public @ResponseBody Iterable<Cliente> getClientes() {
		return clienteRepositorio.findAll();
	}
}

