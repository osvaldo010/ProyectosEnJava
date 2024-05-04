/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.Serializable;

/**
 *
 * @author josee
 */
public class Alumnos extends DatosGenerales implements Machote
{
    private int viveCon;
    private int carrera;

    public Alumnos(int viveCon, int carrera, String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes)
    {
        super(cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes);
        this.viveCon = viveCon;
        this.carrera = carrera;
    }

    public int getViveCon()
    {
        return viveCon;
    }

    public void setViveCon(int viveCon)
    {
        this.viveCon = viveCon;
    }

    public int getCarrera()
    {
        return carrera;
    }

    public void setCarrera(int carrera)
    {
        this.carrera = carrera;
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
