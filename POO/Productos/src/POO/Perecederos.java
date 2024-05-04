/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.util.logging.Logger;

/**
 *
 * @author chemy
 */
public class Perecederos extends Productos implements Machote
{
    private String cad_date;
    private static final Logger LOG = Logger.getLogger(Perecederos.class.getName());

    public Perecederos(String cad_date, String id, String nombre, double precio, int existencias)
    {
        super(id,nombre,precio,existencias);
        this.cad_date = cad_date;
    }

    
   
    

    public Perecederos()
    {
    }

    /**
     * @return the cad_date
     */
    public String getCad_date()
    {
        return cad_date;
    }

    /**
     * @param cad_date the cad_date to set
     */
    public void setCad_date(String cad_date)
    {
        this.cad_date = cad_date;
    }

    @Override
    public String toString()
    {
        return super.toString()+ "\t" + cad_date + "\n";
    }

    @Override
    public double caliva(int cant, double precio)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void accion1()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int accion2(int x)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String accion3(int x, double y, Object z)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
