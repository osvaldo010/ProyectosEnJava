/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author LSE
 */
public class PilasT <T>
{
    public T pila[];
    public int tope = -1;
    
   
    public PilasT(T []arr)
    {
        pila = arr;
    }

    public Object[] getPila()
    {
        return pila;
    }

    public void setPila(T[] pila)
    {
        this.pila = pila;
    }

    public int getTope()
    {
        return tope;
    }

    public void setTope(int tope)
    {
        this.tope = tope;
    }

    
    public boolean llena()
    {
        return tope == pila.length -1;
    }
    
    public boolean vacia()
    {
        return tope == -1;
    }

    
    public void inserta(T obj)
    {
        if (!llena())
        {
            pila[++tope] = obj;
        }else
        {
            System.out.println("Pila llena");
        }
    }

   
    public T elimina()
    {
        if (!vacia())
        {
            return pila[tope--];
        }else
        {
            System.out.println("Pila vacia");
            return null;
        }
    }
}
