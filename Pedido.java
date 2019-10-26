
/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 * 
 * @author Daniel Marín
 */

public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    
    public Pedido()
    {
         
    }

    /**
     * accesor para la fecha del pedido
     */
    
    public Fecha getFecha()
    {
         return fecha;
    }

    /**
     * accesor para el cliente
     */
    
    public Cliente getCliente()
    {
         return cliente;
    }
    
    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    
    public double getImporteAntesIva()
    {
         return 0;
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    
    public double getIva()
    {
         return 0;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    
    public double getImporteTotal()
    {
         return 0;
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    
    public String toString()
    {
        return "";
    }
    
    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    
    public boolean masAntiguoQue(Pedido otro)
    {
         return false;
    }
    
     /**
     * devuelve una referencia al pedido actual
     */
    
    public Pedido getPedidoActual()
    {
        return this;
    }
}
