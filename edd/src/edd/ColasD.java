/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Estrada
 */
public class ColasD
{

    public Nodo atras;
    public Nodo frente;

    public void inserta(Nodo n)
    {
        if (n!= null)
        {
            if (frente == null)
            {
                frente = n;
            }else
            {
                atras.setSiguiente(n);
            }
            atras = n;
        }else
        {
            System.out.println("No se puede insertar");
        }
    }

    public Nodo elimina()
    {
        Nodo n = null;
        if (frente != null)
        {
            n = frente;
            frente = frente.getSiguiente();
            n.setSiguiente(null);
        }else
        {
            atras = null;
            System.out.println("Cola vacia");
        }
        
        return n;
    }
}
