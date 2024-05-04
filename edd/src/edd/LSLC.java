/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Estrada
 */
public class LSLC
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

    public boolean insertar(Nodo n)
    {
        if (n == null)
        {
            return false;

        } else
        {
            if (r == null)
            {
                r = n;
                r.setSiguiente(r);
            } else
            {
                if (n.getEtiqueta().compareTo(r.getSiguiente().getEtiqueta()) <= 0 || n.getEtiqueta().compareTo(r.getEtiqueta()) >= 0)
                {
                    n.setSiguiente(r.getSiguiente());
                    r.setSiguiente(n);
                    if (n.getEtiqueta().compareTo(r.getEtiqueta()) >= 0)
                    {
                        r = n;
                    }
                } else
                {
                    Nodo aux = r;
                    while (true)
                    {
                        if (n.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta()) < 0)
                        {
                            n.setSiguiente(aux.getSiguiente());
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

    public Nodo eliminar(String etiqueta)
    {
        if (r == null)
        {
            return null;
        } else
        {
            Nodo eliminado = null;
            if (etiqueta.compareTo(r.getSiguiente().getEtiqueta()) >= 0 && etiqueta.compareTo(r.getEtiqueta()) <= 0)
            {
                if (r.getSiguiente().getEtiqueta().equals(etiqueta))
                {
                    eliminado = r.getSiguiente();
                    r.setSiguiente(eliminado.getSiguiente());
                    eliminado.setSiguiente(null);
                    if (r == eliminado)
                    {
                        r = null;
                    }
                } else
                {
                    Nodo aux2 = r.getSiguiente();
                    while (true)
                    {
                        if (etiqueta.compareTo(aux2.getSiguiente().getEtiqueta()) <= 0)
                        {
                            if (aux2.getSiguiente().getEtiqueta().equals(etiqueta))
                            {
                                eliminado = aux2.getSiguiente();
                                aux2.setSiguiente(eliminado.getSiguiente());
                                eliminado.setSiguiente(null);
                                
                                if (eliminado == r)
                                {
                                    r = aux2;
                                }
                                break;
                            } else
                            {
                                if (eliminado.getSiguiente().getEtiqueta().compareTo(etiqueta) > 0)
                                {
                                    System.out.println("Dato no encontrado");
                                    break;
                                }
                                aux2 = aux2.getSiguiente();
                            }
                        } else
                        {
                            break;
                        }
                    }
                }
            }
            return eliminado;
        }
    }

    public String desp(Nodo aux)
    {
        String s = "";
        do
        {
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
        } while (aux != r.getSiguiente());

        return s;
    }

    public void despR2(Nodo aux)
    {
        if (aux != r)
        {
            System.out.println(aux.getEtiqueta());
            despR2(aux.getSiguiente());

        } else
        {
            if (aux == null)
            {
                System.out.println("Lista vacía");
            } else
            {
                System.out.println(aux.getEtiqueta());
            }
        }
    }
}
