/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author josee
 */
public class Personal extends DatosGenerales implements Machote
{
    private char estatus;  

    public Personal(char estatus, String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes)
    {
        super(cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes);
        this.estatus = estatus;
    }

    public char getEstatus()
    {
        return estatus;
    }

    public void setEstatus(char estatus)
    {
        this.estatus = estatus;
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
