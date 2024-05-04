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
public class Pilas  implements Machote
{
    public Object pila[];
    public int tope = -1;
    
    
   
    public Pilas(int n)
    {
        pila = new Object[n];
    }

    public Object[] getPila()
    {
        return pila;
    }

    public void setPila(Object[] pila)
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

    @Override
    public boolean llena()
    {
        return tope == pila.length -1;
    }

    @Override
    public boolean vacia()
    {
        return tope == -1;
    }

    @Override
    public void inserta(Object obj)
    {
        if (!llena())
        {
            pila[++tope] = obj;
        }else
        {
            System.out.println("Pila llena");
        }
    }

    @Override
    public Object elimina()
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
