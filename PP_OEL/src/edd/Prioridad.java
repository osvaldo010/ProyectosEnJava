/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import java.io.Serializable;

/**
 *
 * @author osval
 */
public class Prioridad implements Serializable
{

    private int noPrioridad;
    private ColasCircularesDinamicas cola;

    public Prioridad()
    {
    }

    public Prioridad(int noPrioridad, ColasCircularesDinamicas cola)
    {
        this.noPrioridad = noPrioridad;
        this.cola = cola;
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
     * @return the cola
     */
    public ColasCircularesDinamicas getCola()
    {
        return cola;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(ColasCircularesDinamicas cola)
    {
        this.cola = cola;
    }

    @Override
    public String toString()
    {
        return "Prioridad{" + "noPrioridad=" + noPrioridad + ", cola=" + cola + '}';
    }

}
