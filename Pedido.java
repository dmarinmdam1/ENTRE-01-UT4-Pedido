
/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 * 
 * @author Daniel Marín
 */

public class Pedido
{
    /** ------- Constantes ------- **/
    
    private final double IVA = 0.21;  // iva a aplicar
    
    /** ------- Atributos ------- **/
    
    private Fecha fecha; // Fecha del pedido
    private Cliente cliente; // Cliente que ha realizado el pedido
    private LineaPedido linea1; // Linea 1 del pedido
    private LineaPedido linea2; // Linea 2 del pedido
    
    /** ------- Constructor ------- **/

    /**
     * Constructor de la clase "Pedido"
     * 
     * @param fecha Valor (Fecha) para el atributo "fecha"
     * @param cliente Valor (Cliente) para el atributo "cliente"
     * @param linea1 Valor (LineaPedido) para el atributo "linea1"
     * @param linea2 Valor (LineaPedido) para el atributo "linea2"
     */
    
    public Pedido(Fecha fecha, Cliente cliente, LineaPedido linea1, LineaPedido linea2)
    {
         this.fecha = fecha;
         this.cliente = cliente;
         this.linea1 = linea1;
         this.linea2 = linea2;
    }

    /** ------- Métodos Accesores ------- **/
    
    /**
     * Accesor para la fecha del pedido
     * 
     * @return El atributo "fecha"
     */
    
    public Fecha getFecha()
    {
         return fecha;
    }

    /**
     * Accesor para el cliente
     * 
     * @return El atributo "cliente"
     */
    
    public Cliente getCliente()
    {
         return cliente;
    }
    
    /** ------- Métodos de Cálculo ------- **/
    
    /**
     * Calcular y devolver el importe total del pedido sin Iva
     * 
     * @return El importe total del pedido sin Iva
     */
    
    public double getImporteAntesIva()
    {
        double importeAntesIva;
        
        importeAntesIva  = linea1.getProducto().getPrecio() * linea1.getCantidad();
        importeAntesIva += linea2.getProducto().getPrecio() * linea2.getCantidad();
        
        return importeAntesIva;
    }

    /**
     * Calcular y devolver el iva a aplicar
     * 
     * @return El iva a aplicar
     */
    
    public double getIva()
    {
         return getImporteAntesIva() * IVA;
    }

    /**
     * Calcular y devolver el importe total del pedido con Iva
     * 
     * @return El importe total del pedido con Iva
     */
    
    public double getImporteTotal()
    {
         return getImporteAntesIva() + getIva();
    }

    /** ------- Método toString ------- **/
    
    /**
     * Representación textual del pedido
     * (ver enunciado)
     * 
     * @return Representación textual del pedido
     */
    
    public String toString()
    {
        String returnString;
        
        returnString  = String.format("FECHA PEDIDO: %s \n", fecha.toString()); // También se puede utilizar el método "fecha.print()"
        returnString += String.format("DATOS DEL CLIENTE \n%s \n", cliente.toString()); // También se puede utilizar el método "cliente.print()"
        
        returnString += String.format("**** Artículos en el pedido **** \n\n%s\n%s\n\n", linea1.toString(), linea2.toString());
        
        returnString += String.format("**** A pagar **** \n\n");
        returnString += String.format("%20s: %8.2f€\n", "IMPORTE SIN IVA", getImporteAntesIva());
        returnString += String.format("%20s: %8.2f€\n",             "IVA", getIva());
        returnString += String.format("%20s: %8.2f€\n",   "IMPORTE TOTAL", getImporteTotal());
        
        return returnString;
    }
    
    /** ------- Métodos Varios ------- **/
    
    /**
     * Devuelve true si el pedido actual es más
     * antiguo que el recibido como parámetro
     * 
     * @return True si el pedido actual es más
     * antiguo que el recibido como parámetro
     */
    
    public boolean masAntiguoQue(Pedido otro)
    {
         return fecha.antesQue(otro.getFecha());
    }
    
    /**
     * Devuelve una referencia al pedido actual
     * 
     * @return Una referencia al pedido actual
     */
    
    public Pedido getPedidoActual()
    {
        return this;
    }
    
    /** ------- ------- ------- **/
}



