package co.edu.unisabana.gestionpedidomicroservicio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GestionPedidoMicroservicioApplicationTests {

	private final EstadoProducto estadoProducto = new EstadoProducto();
	@Test
	void contextLoads() {
	}

	@Test
	public void Given_cotización_When_setState_Then_stateCotizacion(){
        Cotizacion cotizacion = new Cotizacion();
		estadoProducto.setState(cotizacion);
        assertEquals("El producto ha vuelto a estar en modo COTIZACIÓN", estadoProducto);
    }

	@Test
	public void Given_ordenDeCompra_When_setState_Then_stateOrdenDeCompra(){
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
		estadoProducto.setState(ordenDeCompra);
        assertEquals("Ahora el producto hace parte de una ORDEN DE COMPRA", estadoProducto);
    }
}
