/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Estrada
 */
public class LSL
{

    private Nodo r = null;

    /**
     * @return the r
     */
    public Nodo getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Nodo r)
    {
        this.r = r;
    }

    public boolean insertar (Nodo n)
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
                    r = n;
                } else
                {
                    
                    Nodo aux = r;
                    boolean b = true;
                    while (aux.getSiguiente() != null && b)
                    {
                        if (n.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta())<0)
                        {
                            n.setSiguiente(aux.getSiguiente());
                            aux.setSiguiente(n);
                            b = false;
                        } else
                        {
                            aux = aux.getSiguiente();
                        }
                    }
                    if (b)
                    {
                        aux.setSiguiente(n);
                    }
                }
            }
            return true;
        }
    }

    public Nodo eliminar(String etiqueta)
    {
        if (r == null)
        {
            return null;
        } else
        {
            Nodo aux = null;
            if (etiqueta.compareTo(r.getEtiqueta()) >= 0)
            {
                if (r.getEtiqueta().equals(etiqueta))
                {
                    aux = r;
                    r = aux.getSiguiente();
                    aux.setSiguiente(null);
                } else
                {
                    Nodo aux2 = r;
                    boolean b = true;
                    while (aux2.getSiguiente() != null && b)
                    {
                        if (etiqueta.compareTo(aux2.getSiguiente().getEtiqueta()) >= 0)
                        {
                            if (aux2.getSiguiente().getEtiqueta().equals(etiqueta))
                            {
                                aux = aux2.getSiguiente();
                                aux2.setSiguiente(aux.getSiguiente());
                                aux.setSiguiente(null);
                                b = false;
                            } else
                            {
                                aux2 = aux2.getSiguiente();
                            }
                        }else
                        {
                            break;
                        }
                    }
                }

            }
            return aux;
        }
    }

    public String desp(Nodo aux)
    {
        String s = "";

        while (aux != null)
        {
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
        }

        return s;
    }
    
    public String despR(Nodo aux, String s)
    {
        while (aux != null)
        {
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
            despR(aux, s);
        }
        return s;
    }
    
    public Nodo busca(String d)
    {
        Nodo aux = r;
        while (aux != null)
        {            
            if (aux.getEtiqueta().equals(d))
            {
                return aux; //encontró el dato
            }
            aux = aux.getSiguiente();
        }
        System.out.println("Dato no encotrado");
        return null; // no encontró el dato
    }

}
