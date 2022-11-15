package co.edu.unisabana.gestionpedidomicroservicio.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pedido")
@Getter
@Setter
@NoArgsConstructor
public class Pedido {
    private Long id;
    private String pedidoNo;
    private List<PedidoItem> pedidoItem;

}