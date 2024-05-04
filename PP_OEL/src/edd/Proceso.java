/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import java.io.Serializable;
import poo.Lecturas;

/**
 *
 * @author osval
 */
public class Proceso implements Serializable
{

    private int noPrioridad;
    private int quantums;
    private String nombre;

    public Proceso()
    {
    }

    public Proceso(int noPrioridad, int quantums, String nombre)
    {
        this.noPrioridad = noPrioridad;
        this.quantums = quantums;
        this.nombre = nombre;
    }

    /**
     * @return the noPrioridad
     */
    public int getNoPrioridad()
    {
        return noPrioridad;
    }

    /**
     * @param noPrioridad the noPrioridad to set
     */
    public void setNoPrioridad(int noPrioridad)
    {
        this.noPrioridad = noPrioridad;
    }

    /**
     * @return the quantums
     */
    public int getQuantums()
    {
        return quantums;
    }

    /**
     * @param quantums the quantums to set
     */
    public void setQuantums(int quantums)
    {
        this.quantums = quantums;
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

    @Override
    public String toString()
    {
        return "Proceso{" + "noPrioridad=" + noPrioridad + ", quantums=" + quantums + ", nombre=" + nombre + '}';
    }
    
    

}
