package ar.edu.davinci.dvds20201cg3.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name="S_PRODUCTOS", sequenceName="S_PRODUCTOS")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_PRODUCTOS")
	@Column(name = "pro_id")
	private Long id;
	
	@Column(name = "pro_nombre")
	@NotBlank(message = "*El nombre es obligatorio")
	@NotEmpty(message = "*Por favor ingrese su nombre")
	@NotNull
	@Size(min=2, max=45)
	private String name;
	
	@Column(name = "pro_precio")
	//@NotBlank(message = "*El precio es obligatorio")
	//@NotEmpty(message = "*Por favor ingrese el precio")
	@NotNull
	private BigDecimal price;
}
