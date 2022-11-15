package co.edu.unisabana.gestionpedidomicroservicio.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import co.edu.unisabana.gestionpedidomicroservicio.dto.PedidoDTO;
import co.edu.unisabana.gestionpedidomicroservicio.entity.Pedido;
import co.edu.unisabana.gestionpedidomicroservicio.entity.PedidoItem;
import co.edu.unisabana.gestionpedidomicroservicio.repository.PedidoRepository;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    private static final String PATH_LOOKFOR = "/api/pedido";
    
    @Test
    public void Given_pedido_When_guardarPedido_Then_return_perdidoGuardado (){
        PedidoDTO pedidoDTO = new PedidoDTO();
        ResponseEntity<String> result = restTemplate.postForEntity(PATH_LOOKFOR,pedidoDTO, String.class);
        assertEquals("Pedido guardado", result.getBody() );
    }
}
