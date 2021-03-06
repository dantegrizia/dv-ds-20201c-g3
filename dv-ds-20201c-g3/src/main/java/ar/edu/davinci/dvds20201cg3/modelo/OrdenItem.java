package ar.edu.davinci.dvds20201cg3.modelo;
/*

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orden_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name="S_ORDEN_ITEMS", sequenceName="S_ORDEN_ITEMS")
public class OrdenItem {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_ORDEN_ITEMS")
	@Column(name = "odi_id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ori_ord_id")
    private Orden orden;
	
	@ManyToOne(targetEntity = Producto.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="odi_pro_id", referencedColumnName="pro_id")
	private Producto product;
	
	@Column(name = "odi_cantidad")
	@NotBlank(message = "*La cantidad es obligatorio")
	@NotEmpty(message = "*Por favor ingrese la cantidad")
	@NotNull
	private BigDecimal quantity;

}
*/