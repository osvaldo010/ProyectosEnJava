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
public class Colas implements Machote
{
    public Object[] cola;
    public int atras = -1;
    
   
   
    public Colas(int n)
    {
        cola = new Object[n];
    }
    
    
    public Object[] getPila()
    {
        return cola;
    }

    public void setPila(Object[] pila)
    {
        this.cola = pila;
    }

    public int getTope()
    {
        return atras;
    }

    public void setTope(int tope)
    {
        this.atras = tope;
    }

    @Override
    public boolean llena()
    {
        return atras == cola.length -1;
    }

    @Override
    public boolean vacia()
    {
        return atras == -1;
    }

    @Override
    public void inserta(Object obj)
    {
        if (!llena())
        {
            cola[++atras] = obj;
        }else
        {
            System.out.println("Cola llena");
        }
    }

    @Override
    public Object elimina()
    {
        Object o = null;
        if (! vacia())
        {
            o = cola[0];
            for (int i = 0; i < atras; i++)
            {
                cola[i] = cola[i+1];
            }
            atras--;
        }else
        {
            System.out.println("Cola vacia");
        }
        return o;
    }
}
