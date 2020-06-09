package ar.edu.davinci.dvds20201cg3.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20201cg3.modelo.Cliente;

@Repository("clienteRepositorio")
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}
