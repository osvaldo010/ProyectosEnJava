/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import java.io.Serializable;

public class LDLC implements Serializable
{

    private NodoL r = null;

    /**
     * @return the r
     */
    public NodoL getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoL r)
    {
        this.r = r;
    }

    public boolean insertar(NodoL n)
    {
        if (n == null)
        {
            return false;
        } else
        {
            if (r == null)  //si es el primer dato
            {
                r = n;
                r.setSiguiente(r);
                r.setAnterior(r);
            } else
            {
                if (n.getEtiqueta().compareTo(r.getSiguiente().getEtiqueta()) <= 0 || n.getEtiqueta().compareTo(r.getEtiqueta()) >= 0)  //si esta en el rango
                {

                    n.setSiguiente(r.getSiguiente());   //si llega antes
                    n.getSiguiente().setAnterior(n);
                    r.setSiguiente(n);
                    n.setAnterior(r);

                    if (n.getEtiqueta().compareTo(r.getEtiqueta()) >= 0)  //si es el ultimo dato
                    {
                        r = n;
                    }
                } else //va dentro
                {

                    NodoL aux = r;
                    while (true)
                    {
                        if (n.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta()) < 0)
                        {
                            n.setSiguiente(aux.getSiguiente());
                            n.setAnterior(aux);
                            aux.getSiguiente().setAnterior(n);
                            aux.setSiguiente(n);
                            break;
                        } else
                        {
                            aux = aux.getSiguiente();
                        }
                    }

                }
            }
            return true;
        }
    }

    public NodoL eliminar(String etiqueta)
    {
        if (r == null)
        {
            return null;
        } else
        {
            NodoL aux = null;
            if (etiqueta.compareTo(r.getSiguiente().getEtiqueta()) >= 0 && etiqueta.compareTo(r.getEtiqueta()) <= 0)
            {
                if (r.getSiguiente().getEtiqueta().equals(etiqueta)) //si est aen l aprimer pos o la final
                {
                    aux = r.getSiguiente();
                    r.setSiguiente(aux.getSiguiente());
                    aux.getSiguiente().setAnterior(r);
                    aux.setSiguiente(null);
                    aux.setAnterior(null);

                    if (r == aux)  //si es el unico elemento en la lista
                    {
                        r = null;
                    }
                } else
                {
                    NodoL aux2 = r.getSiguiente();
                    while (true)
                    {
                        if (etiqueta.compareTo(aux2.getSiguiente().getEtiqueta()) >= 0)
                        {
                            if (aux2.getSiguiente().getEtiqueta().equals(etiqueta))
                            {

                                aux = aux2.getSiguiente();
                                aux2.setSiguiente(aux.getSiguiente());
                                aux.getSiguiente().setAnterior(aux2);
                                aux.setSiguiente(null);
                                aux.setAnterior(null);

                                if (r == aux)
                                {
                                    r = aux2;
                                }

                                break;
                            } else
                            {
                                aux2 = aux2.getSiguiente();
                            }
                        } else
                        {
                            break;
                        }

                    }
                }
            }
            return aux;
        }
    }

    public String desp(NodoL aux)
    {
        String s = "";

        do
        {
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
        } while (aux != r.getSiguiente());

        return s;
    }

    public String despp(NodoL r)   //escrito por Mauro
    {
        String s = "";
        if (r != null)
        {
            NodoL aux = r.getSiguiente();
            do
            {
                s += aux.getEtiqueta();
                aux = aux.getSiguiente();
            } while (aux != r.getSiguiente());
        }
        return s;
    }
    
    public String desppR(NodoL aux, NodoL r)   
    {
        if (aux == r)
        {
            System.out.println(aux.getEtiqueta());
            return aux.getEtiqueta();
            
        }
        else
        {
            System.out.println(aux.getEtiqueta());
            return aux.getEtiqueta() + desppR(aux.getSiguiente(), r);
        }

    }

    public String despR(NodoL aux, String s)
    {
        if (aux.getSiguiente() != r.getSiguiente())
        {
            System.out.println(aux.getEtiqueta());
            s += aux.getEtiqueta();

            despR(aux.getSiguiente(), s);
            System.out.println(aux.getEtiqueta());

        } else
        {
            System.out.println(aux.getEtiqueta());  
            System.out.println(aux.getEtiqueta());  
        }
        return s;
    }
}
