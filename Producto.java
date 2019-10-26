
/**
 * Modela un producto. Todo producto tiene un nombre y un precio unidad 
 * 
 * @author Daniel Marín
 */

public class Producto
{
    /** ------- Atributos ------- **/
    
    private String nombre; // Nombre del producto
    private double precio; // Precio unidad del producto

    /** ------- Constructor ------- **/
    
    /**
     * Constructor de la clase "Producto"
     * 
     * @param nombre Valor (String) para el atributo "nombre"
     * @param precio Valor (double) para el atributo "precio"
     */
    
    public Producto(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    /** ------- Métodos Accesores ------- **/
    
    /**
     * Accesor para el atributo "nombre"
     * 
     * @return El atributo "nombre"
     */
    
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Accesor para el atributo "precio"
     * 
     * @return El atributo "precio"
     */
    
    public double getPrecio()
    {
        return precio;
    }
    
    /** ------- Métodos Varios ------- **/
    
    /**
     * Obtiene un nuevo producto copia idéntica del actual
     * 
     * @return Un nuevo objeto idéntico al actual
     */
    
    public Producto obtenerCopia()
    {
         return new Producto(nombre, precio);
    }

    /** ------- Método toString ------- **/
    
    /**
     * Representación textual de un producto
     * (ver enunciado)
     * 
     * @return Representación textual de un producto
     */
    
    public String toString()
    {
        String returnString;
        
        returnString  = String.format("%30s | %8.2f€ unidad", nombre, precio);
        
        return returnString;
    }
    
    /** ------- ------- ------- **/
}



