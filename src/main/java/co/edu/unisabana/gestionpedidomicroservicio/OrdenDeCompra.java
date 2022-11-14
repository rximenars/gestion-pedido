package co.edu.unisabana.gestionpedidomicroservicio;

public class OrdenDeCompra implements State
{
    @Override
    public void executeAction() {
        System.out.println("Ahora el producto hace parte de una ORDEN DE COMPRA");
    }
}
