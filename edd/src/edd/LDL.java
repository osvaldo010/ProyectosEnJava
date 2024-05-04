/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Estrada
 */
public class LDL
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

    public boolean insertar (NodoL n)
    {
        if (n == null)
        {
            return false;
            
        } else
        {
            if (r == null)
            {
                r=n;
            } else
            {
                if (n.getEtiqueta().compareTo(r.getEtiqueta())<0)
                {
                    n.setSiguiente(r);
                    r.setAnterior(n);
                    r = n;
                } else
                {
                    
                    NodoL aux = r;
                    boolean b = true;
                    while (aux.getSiguiente() != null && b)
                    {
                        if (n.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta())<0)
                        {
                            n.setSiguiente(aux.getSiguiente());
                            n.setAnterior(aux);
                            aux.getSiguiente().setAnterior(n);
                            aux.setSiguiente(n.getSiguiente().getAnterior());
                            b = false;
                        } else
                        {
                            aux = aux.getSiguiente();
                        }
                    }
                    if (b)
                    {
                        aux.setSiguiente(n);
                        n.setAnterior(aux);
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
            NodoL n = null;
            if (etiqueta.compareTo(r.getEtiqueta()) >= 0)
            {
                if (r.getEtiqueta().equals(etiqueta))
                {
                    n = r;
                    r = n.getSiguiente();
                    n.setSiguiente(null);
                    r.setAnterior(null);
                } else
                {
                    NodoL aux = r;
                    boolean b = true;
                    while (aux.getSiguiente() != null && b)
                    {
                        if (etiqueta.compareTo(aux.getSiguiente().getEtiqueta()) >= 0)
                        {
                            if (aux.getSiguiente().getEtiqueta().equals(etiqueta))
                            {
                                n = aux.getSiguiente();
                                if (n.getSiguiente() != null)
                                {
                                    n.getSiguiente().setAnterior(aux);
                                }
                                aux.setSiguiente(n.getSiguiente());
                                n.setSiguiente(null);
                                b = false;
                            } else
                            {
                                aux = aux.getSiguiente();
                            }
                        }else
                        {
                            break;
                        }

                    }
                }
                if (n != null)
                {
                    n.setSiguiente(null);
                    n.setAnterior(null);
                }

            }
            return n;
        }
    }

    public String desp(NodoL aux)
    {
        String s = "";

        while (aux != null)
        {
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
        }

        return s;
    }
    
    public String despR(NodoL aux, String s)
    {
        while (aux != null)
        {
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
            despR(aux, s);
        }
        return s;
    }
    
    public void despR2(NodoL r)
    {
        if (r != null)
        {
            System.out.println(r.getEtiqueta());
            despR2(r.getSiguiente()); 
            System.out.println(r.getEtiqueta());
        }
    }
}
