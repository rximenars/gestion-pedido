package co.edu.unisabana.gestionpedidomicroservicio.dto;

import java.util.List;

import co.edu.unisabana.gestionpedidomicroservicio.entity.PedidoItem;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PedidoDTO 
{
    private List<PedidoItem> pedidoItem;
}
