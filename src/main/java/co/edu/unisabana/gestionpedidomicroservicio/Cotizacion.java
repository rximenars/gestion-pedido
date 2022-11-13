public class Cotizacion implements State
{
    @Override
    public void executeAction()
    {
        System.out.println("El producto ha vuelto a estar en modo COTIZACIÓN");
    }
}
