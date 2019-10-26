
/**
 *  Representa a un cliente que hace un pedido 
 *  
 *  @author Daniel Marín
 */

public class Cliente
{
    /** ------- Atributos ------- **/
    
    private String nombre;
    private String direccion;
    private String ciudad;
    private String provincia;
    
    /** ------- Constructor ------- **/

    /**
     * Constructor de la clase "Cliente"
     * 
     * @param nombre Valor (String) para el atributo "nombre"
     * @param direccion Valor (String) para el atributo "direccion"
     * @param ciudad Valor (String) para el atributo "ciudad"
     * @param provincia Valor (String) para el atributo "provincia"
     */
    
    public Cliente(String nombre, String direccion, String ciudad, String provincia)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    /** ------- Métodos Accesores ------- **/
    
    /**
     * Accesor para el nombre del cliente
     * 
     * @return El atributo "nombre"
     */
    
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Accesor para la dirección del cliente
     * 
     * @return El atributo "direccion"
     */
    
    public String getDireccion()
    {
        return direccion;
    }

    /**
     * Accesor para la ciudad
     * 
     * @return El atributo "ciudad"
     */
    
    public String getCiudad()
    {
        return ciudad;
    }

    /**
     * Accesor para la provincia
     * 
     * @return El atributo "provincia"
     */
    
    public String getProvincia()
    {
        return provincia;
    }

    /** ------- Método toString ------- **/
    
    /**
     * Representación textual del cliente
     * 
     * @return Representación textual del cliente
     */
    
    public String toString()
    {
        String returnString;
        
        returnString  = String.format("%10s: %-10s \n",    "NOMBRE", nombre);
        returnString += String.format("%10s: %-10s \n", "DIRECCION", direccion);
        returnString += String.format("%10s: %-10s \n",    "CIUDAD", ciudad);
        returnString += String.format("%10s: %-10s \n", "PROVINCIA", provincia);
        
        return returnString;
    }
    
    /** ------- Método print ------- **/
    
    /**
     * Imprime en pantalla el resultado del método "toString"
     */
    
    public void print()
    {
        System.out.println(this.toString());
    }
    
    /** ------- ------- ------- **/
}
