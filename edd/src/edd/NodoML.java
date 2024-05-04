/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

import java.io.Serializable;

/**
 *
 * @author LSE
 */
public class NodoML <T> implements Serializable
{
    private String etiqueta;
    private T obj;
    private NodoML siguiente, anterior, abajo;
    public NodoML()
    {
    }

      public NodoML(String etiqueta, T obj)
    {
        this.etiqueta = etiqueta;
        this.obj = obj;
        siguiente = null;
        anterior = null;
        abajo = null; // raiz del siguiente nivel
    }

    /**
     * @return the etiqueta
     */
    public String getEtiqueta()
    {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the obj
     */
    public T getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T obj)
    {
        this.obj = obj;
    }

    /**
     * @return the siguiente
     */
    public NodoML getSiguiente()
    {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoML siguiente)
    {
        this.siguiente = siguiente;
    }

    /**
     * @return the abajo
     */
    public NodoML getAbajo()
    {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoML abajo)
    {
        this.abajo = abajo;
    }
    
    
}
