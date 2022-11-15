package co.edu.unisabana.gestionpedidomicroservicio.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unisabana.gestionpedidomicroservicio.dto.PedidoDTO;
import co.edu.unisabana.gestionpedidomicroservicio.entity.Pedido;
import co.edu.unisabana.gestionpedidomicroservicio.repository.PedidoRepository;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    public String guardarPedido(@RequestBody PedidoDTO pedidoDTO)
    {
        Pedido pedido = new Pedido();

        pedido.setPedidoNo(UUID.randomUUID().toString());
        pedido.setPedidoItem(pedidoDTO.getPedidoItem());
       
        pedidoRepository.save(pedido);

        return "Pedido guardado";
    }
    
}
