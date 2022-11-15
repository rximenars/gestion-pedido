package co.edu.unisabana.gestionpedidomicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unisabana.gestionpedidomicroservicio.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> 
{

}

