/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author chemy
 */
public class NoPerecederos extends Productos implements Machote
{
    private int lote;

    public NoPerecederos()
    {
    }

    public NoPerecederos(int lote, String id, String nombre, double precio, int existencias)
    {
        super(id, nombre, precio, existencias);
        this.lote = lote;
    }

    

    /**
     * @return the lote
     */
    public int getLote()
    {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(int lote)
    {
        this.lote = lote;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\t"+lote+"\n";
    }

    @Override
    public double caliva(int cant, double precio)
    {
        return (cant*precio)*Productos.iva;
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
