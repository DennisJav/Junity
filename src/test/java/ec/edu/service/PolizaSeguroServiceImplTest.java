package ec.edu.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.modelo.PolizaSeguro;



@SpringBootTest
class PolizaSeguroServiceImplTest {

	@Autowired
	private IPolizaSeguroService polizaSeguroService;

	@Test
	void testCrearPolizaSeguro() {
		// fail("Not yet implemented");
		PolizaSeguro pl = new PolizaSeguro();
		pl.setNumero("123");
		pl.setValor(new BigDecimal(1000));
		pl.setFechaEmision(LocalDateTime.now());
		pl.setFechaVigencia(LocalDateTime.of(2022, Month.DECEMBER, 25, 12, 0));
		pl.setDescripcion("Activo");
		pl.setDescripcion("ninguna");	
		PolizaSeguro pl2 = new PolizaSeguro();
		assertNotEquals(pl2,pl);

		assertThat(this.polizaSeguroService.buscarPolizaSeguro(1)).isNotNull();
	}

	@Test
	void testBuscarPolizaSeguro() {
		// fail("Not yet implemented");
		assertEquals(this.polizaSeguroService.buscarPolizaSeguro(1).getEstado(), "Activo");
		assertThat(this.polizaSeguroService.buscarPolizaSeguro(1).getId()).isNotNull();
	}

	@Test
	void testBorrarPolizaSeguro() {
		// fail("Not yet implemented");

		PolizaSeguro pl2 = new PolizaSeguro();
		assertNotNull(pl2, "nulo");
		assertInstanceOf(PolizaSeguro.class, this.polizaSeguroService.buscarPolizaSeguro(1));

	}

	@Test
	void testActualizarPolizaSeguro() {
		// fail("Not yet implemented");
		assertNotEquals(this.polizaSeguroService.buscarPolizaSeguro(1).getNumero(),
		this.polizaSeguroService.buscarPolizaSeguro(2).getNumero());
		assertNotNull("Nulo", this.polizaSeguroService.buscarPolizaSeguro(1).getId());
	}

}
//