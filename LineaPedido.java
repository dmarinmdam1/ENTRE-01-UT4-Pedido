
/**
 *  Describe una línea de un pedido
 *  En una línea de pedido se incluye un producto
 *  y el nº de unidades compradas de ese producto
 *   
 *  @author Daniel Marín
 */

public class LineaPedido
{
    /** ------- Atributos ------- **/
    
    private Producto producto; // Producto
    private int cantidad; // Cantidad de ese producto
    
    /** ------- Constructor ------- **/
     
    /**
     * Constructor de la clase "LineaPedido" 
     * 
     * @param producto Valor (Producto) para el atributo "producto"
     * @param cantidad Valor (int) para el atributo "cantidad"
     */
    public LineaPedido(Producto producto, int cantidad)
    {
         this.producto = producto;
         this.cantidad = cantidad;
    }
    
    /** ------- Métodos Accesores ------- **/

    /**
     * Accesor para el producto
     * 
     * @return El atributo "producto"
     */
    
    public Producto getProducto()
    {
        return producto;
    }

    /**
     * Accesor para la cantidad de producto
     * 
     * @return El atributo "cantidad"
     */
    
    public int getCantidad()
    {
        return cantidad;
    }
    
    /** ------- Métodos Varios ------- **/
    
    /**
     * Obtiene una nueva línea de pedido copia idéntica de la actual
     * 
     * @return Un nuevo objeto idéntico al actual
     */
    
    public LineaPedido obtenerCopia()
    {
        return new LineaPedido(new Producto(producto.getNombre(), producto.getPrecio()), cantidad);
    }
    
    /** ------- Método toString ------- **/
    
    /**
     * Representación textual de la línea de pedido
     * (ver enunciado)
     * 
     * @return Representación textual de la línea de pedido
     */
    
    public String toString()
    {
        String returnString;
        
        returnString  = producto.toString();
        returnString += String.format(" | %4d unidades", cantidad);
        
        return returnString;
    }
    
    /** ------- ------- ------- **/
}



