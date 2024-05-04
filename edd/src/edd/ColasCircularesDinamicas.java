/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import java.io.Serializable;

/**
 *
 * @author Estrada
 */
public class ColasCircularesDinamicas implements Serializable
{

    private Nodo atras;

    public void inserta(Nodo n)
    {
        if (n != null)
        {
            if (getAtras() == null)
            {
                setAtras(n);
                getAtras().setSiguiente(getAtras());
            } else
            {
                n.setSiguiente(getAtras().getSiguiente());
                getAtras().setSiguiente(n);
            }
            setAtras(n);
        } else
        {
            System.out.println("No se puede insertar");
        }
    }

    public Nodo elimina()
    {
        Nodo n = null;

        if (getAtras() != null)
        {
            n = getAtras().getSiguiente();

            if (getAtras() == n)
            {
                n.setSiguiente(null);
                setAtras(null);
            } else
            {
                getAtras().setSiguiente(n.getSiguiente());
                n.setSiguiente(null);
            }
        }else
        {
            System.out.println("Cola vacia");
        }
        return n;
    }

    /**
     * @return the atras
     */
    public Nodo getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Nodo atras)
    {
        this.atras = atras;
    }
    
}
