/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.io.Serializable;

/**
 *
 * @author chemy
 */
public abstract class Productos implements Serializable
        
{
    public final static long serialVersionUID=1;
    public final static double iva=0.16;
    private static int folio;
    private String id;
    private String nombre; 
    private double precio;
    private int existencias;

    public Productos(String id, String nombre, double precio, int existencias)
    {
        ++folio;
        String s= String.valueOf(folio);
        for (int i = s.length(); i < 5; i++)
        {
            s="0"+s;
        }
        this.id = s;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }

    public Productos()
    {
    }
    

    /**
     * @return the folio
     */
    public static int getFolio()
    {
        return folio;
    }

    /**
     * @param aFolio the folio to set
     */
    public static void setFolio(int aFolio)
    {
        folio = aFolio;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return the existencias
     */
    public int getExistencias()
    {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(int existencias)
    {
        this.existencias = existencias;
    }

    @Override
    public String toString()
    {
        return id+ "\t"+ nombre+ "\t" + precio+ "\t"+ existencias +"\t";
    }
    
    
    public abstract double caliva (int cant, double precio);

    
    
}
