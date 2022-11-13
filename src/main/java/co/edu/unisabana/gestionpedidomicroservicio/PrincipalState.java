import java.util.Scanner;

public class PrincipalState
{
    public static void main (String... args)
    {
        EstadoProducto estadoProducto = new EstadoProducto();
        Cotizacion cotizacion = new Cotizacion();
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
        int option =0;
        Scanner scan = new Scanner(System.in);

        do
        {
            menuOptions();
            option = scan.nextInt();
            switch (option)
            {
                case 1:
                    estadoProducto.setState(cotizacion);
                    break;
                case 2:
                    estadoProducto.setState(ordenDeCompra);
                    break;
                case 3:
                    System.out.println("El estado del producto es: "+estadoProducto);
                case 0:
                    System.out.println("Cancelando solicitud...");
                default:
                    System.out.println("Esa opción no es válida!");
            }
            estadoProducto.executeAction();
        }   while (option!=0);
    }
    private static void menuOptions()
    {
        StringBuffer menu = new StringBuffer();
        System.out.println(
                "Por favor seleccione una de las siguientes opciones: \n"
                        + "                                        MENÚ                                          \n"
                        + "______________________________________________________________________________________\n"
                        + " 1. Cambiar estado a COTIZACIÓN.\n "
                        + "2. Cambiar estado a ORDEN DE COMPRA.\n "
                        + "3. Ver estado del producto.\n "
                        + "0. Cancelar solicitud.\n "
        );
        System.out.println(menu.toString());
    }
}