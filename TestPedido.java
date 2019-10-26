
/**
 *  Clase para probar el resto de clases
 *  
 *  @author Daniel Marín
 */

public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

    /**
     * Constructor  
     */
    
    public TestPedido()
    {
        pedido1 = new Pedido( 
                              new Fecha(4,9,2019),
                              new Cliente("Juan Soto", "Avda. Pio XII", "Pamplona", "Navarra"),
                              new LineaPedido(new Producto("Rotulador fosforescente", 6.7), 20),
                              new LineaPedido(new Producto("Memoria USB 64GB", 14.8), 10)
                            );
     
        pedido2 = new Pedido( 
                              new Fecha(8,10,2019),
                              new Cliente("Elisa Nuin", "C/ Río Alzania 7", "Pamplona", "Navarra"),
                              new LineaPedido(new Producto("Sacapuntas manual", 16.64), 8),
                              new LineaPedido(new Producto("Corrector tippex", 5.99), 20)
                            );
    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    
    public void mostrarPedidos()
    {
        System.out.print("Pedido 1 \n");
        System.out.print("-------------------- \n");
        System.out.print(pedido1.toString() + "\n\n");
        System.out.print("Pedido 2 \n");
        System.out.print("-------------------- \n");
        System.out.print(pedido2.toString() + "\n");
        
        if(pedido1.masAntiguoQue(pedido2))
        {
            System.out.print("El pedido 1 se ha realizado antes que el pedido 2");
        }
        else
        {
            System.out.print("El pedido 2 se ha realizado antes que el pedido 1");
        }
    }
}
