/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author osval
 */
public class MultiListas
{
    public Nodo inserta(Nodo r, int nivel, String s[], Nodo n)
    {
        if (s.length-1 == nivel)
        {
            LSL obj = new LSL(); //tecnico
            obj.setR(r);
            obj.insertar(n);
            return obj.getR();
        }else
        {
            Nodo aux = busca(r, s[nivel]);
            if (aux != null)
            {
                aux.setAbajo(inserta(aux.getAbajo(), nivel +1, s, n));
            }
            return r;
        }
    }
    
    public Nodo busca(Nodo r, String s)
    {
        LSL obj = new LSL();
        obj.setR(r);
        return obj.busca(s);
    }
    
    public void desp(Nodo r, String s)
    {
        while (r != null)
        {            
            System.out.println(s + r.getEtiqueta());
            desp(r.getAbajo(), s+"\t");
            r = r.getSiguiente();
        }
    }
}
