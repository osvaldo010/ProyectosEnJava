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
public class ColasCirculares implements Machote
{

    public Object[] cola;
    public int frente = -1, atras = -1;

    public ColasCirculares(int n)
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
        return atras + 1 == frente || (atras == cola.length - 1 && frente == 0);
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
            if (atras == -1)
            {
                atras = frente = 0;
            } else
            {
                if (atras == cola.length - 1)
                {
                    atras = 0;
                }else
                {
                    atras++;
                }
            }
            cola[atras] = obj;
        } else
        {
            System.out.println("Cola Circular llena");
        }
    }

    @Override
    public Object elimina()
    {
        Object o = null;
        if (!vacia())
        {
            o = cola[frente];
            if (frente == atras)
            {
                frente = atras = -1;
            }else
            {
                if (frente == cola.length -1)
                {
                    frente = 0;
                }else
                {
                    frente++;
                }
            }
        } else
        {
            System.out.println("Cola Circular vacia");
        }
        return o;
    }
}
