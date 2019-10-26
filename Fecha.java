
import java.time.LocalDate;

/**
 *  Clase que representa una fecha 
 */

public class Fecha
{
    /** ------- Atributos ------- **/
    
    private LocalDate date;

    /** ------- Constructor ------- **/
    
    /**
     * Constructor de la clase "Fecha"
     * 
     * @param dia Día para inicializar el atributo "date"
     * @param mes Mes para inicializar el atributo "date"
     * @param year Año para inicializar el atributo "date"
     */
    
    public Fecha(int dia, int mes, int year)
    {
        date = LocalDate.of(year, mes, dia);
    }
    
    /** ------- Métodos Accesores ------- **/

    /**
     * Accesor para el atributo "dia"
     * 
     * @return El atributo "dia"
     */
    
    public int getDia()
    {
        return date.getDayOfMonth();
    }

    /**
     * Accesor para el atributo "mes"
     * 
     * @return El atributo "mes"
     */
    
    public int getMes()
    {
        return date.getMonthValue();
    }

    /**
     * Accesor para el atributo "year"
     * 
     * @return El atributo "year"
     */
    
    public int getYear()
    {
        return date.getYear();
    }

    /** ------- Métodos Varios ------- **/
    
    /**
     * Devuelve true si la fecha actual es más antigua
     * (va antes) que la recibida como parámetro
     * 
     * @param fecha Objeto de tipo "Fecha" con el que comparar el atributo "fecha"
     * @return true si la fecha actual es más antigua 
     * (va antes) que la recibida como parámetro
     */
    
    public boolean antesQue(Fecha fecha)
    {
        return this.date.isBefore(LocalDate.of(fecha.getYear(),
                                  fecha.getMes(), fecha.getDia()));
    }

    /** ------- Método toString ------- **/
    
    /**
     * Representación textual de la fecha
     * 
     * @return Representación textual de la fecha
     */
    
    public String toString()
    {
        return date.getDayOfMonth() + "/" + date.getMonthValue() +  
        "/" + date.getYear();
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



