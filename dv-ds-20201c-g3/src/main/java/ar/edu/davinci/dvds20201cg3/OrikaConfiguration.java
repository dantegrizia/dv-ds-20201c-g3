package ar.edu.davinci.dvds20201cg3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.edu.davinci.dvds20201cg3.controlador.rest.request.ClienteInsertRequest;
import ar.edu.davinci.dvds20201cg3.controlador.rest.request.ClienteUpdateRequest;
import ar.edu.davinci.dvds20201cg3.controlador.rest.request.ProductoInsertRequest;
import ar.edu.davinci.dvds20201cg3.controlador.rest.request.ProductoUpdateRequest;
import ar.edu.davinci.dvds20201cg3.controlador.rest.response.ClienteResponse;
import ar.edu.davinci.dvds20201cg3.controlador.rest.response.ProductoResponse;
import ar.edu.davinci.dvds20201cg3.modelo.Cliente;
import ar.edu.davinci.dvds20201cg3.modelo.Producto;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;


@Configuration
public class OrikaConfiguration {

	private final ObjectMapper objectMapper;
	
	public OrikaConfiguration() {
		objectMapper = new ObjectMapper();
	}
	
	@Bean
	public MapperFacade mapper() {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		
		mapperFactory.classMap(Cliente.class, ClienteResponse.class).byDefault().register();
		mapperFactory.classMap(Cliente.class, ClienteInsertRequest.class).byDefault().register();
		mapperFactory.classMap(Cliente.class, ClienteUpdateRequest.class).byDefault().register();
		//mapperFactory.classMap(Cliente.class, OrdenClienteResponse.class).byDefault().register();
		
		
		mapperFactory.classMap(Producto.class, ProductoResponse.class).byDefault().register();
		mapperFactory.classMap(Cliente.class, ProductoInsertRequest.class).byDefault().register();
		mapperFactory.classMap(Cliente.class, ProductoUpdateRequest.class).byDefault().register();
		//mapperFactory.classMap(Cliente.class, OrdenProductoResponse.class).byDefault().register();
		
		//mapperFactory.classMap(Orden.class, OrdenResponse.class).byDefault().register();
		//mapperFactory.classMap(OrdenItem.class, OrdenItemResponse.class).byDefault().register();
		
		
		return mapperFactory.getMapperFacade();
	}
}
