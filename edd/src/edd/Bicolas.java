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
public class Bicolas
{
    public Object[] bc;
    public int atras = -1;
    private int a2;
   
    public Bicolas(int n)
    {
        bc = new Object[n];
        a2 = n;
    }
    
//    char[] vocales =
//    {
//        'a', 'e', 'i', 'o', 'u'
//    };
//    char[] consonantes =
//    {
//        'b', 'c', 'd', 'f', 'g',
//        'h', 'j', 'k', 'l', 'm',
//        'n', 'ñ', 'p', 'q', 'r',
//        's', 't', 'v', 'w', 'x',
//        'y', 'z'
//    };
    
//    public char[] verifica(String cadena, char[] bc)
//    {
//        for (int i = 0; i < cadena.length(); i++)
//        {
//            for (int j = 0; j < vocales.length; j++)
//            {
//                if (cadena.charAt(i) == vocales[j])
//                {
//                    setTope(inserta(cadena.charAt(i), getTope(), bc.length, 1));
//                }
//            }
//            for (int j = 0; j < consonantes.length; j++)
//            {
//                if (cadena.charAt(i) == consonantes[j])
//                {
//                    setA2(inserta(cadena.charAt(i), getA2(), bc.length, -1));
//                }
//            }
//        }
//        return bc;
//    }

    public Object[] getPila()
    {
        return bc;
    }

    public void setPila(Object[] pila)
    {
        this.bc = pila;
    }

    public int getTope()
    {
        return atras;
    }

    public void setTope(int tope)
    {
        this.atras = tope;
    }
    
    public int inserta(char obj, int a, int limite, int factor)
    {
        if (a + factor != limite)
        {
            bc[a+factor] = obj;
            return a + factor;
        }else
        {
            System.out.println("Bicola llena");
            return a;
        }
    }
    
    public Object [] elimina(int a, int limite, int f)
    {
        Object []e = new Object[2];
        if (a != limite)
        {
            e[0] = bc[limite+f];
            for (int i = limite+f; i != a; i+= f)
            {
                bc[i] = bc[i+f];
            }
            bc[1] = (a + f);
        }else
        {
            System.out.println("Cola vacia");
            bc[1] = a;
        }
        return e;
    }

    /**
     * @return the a2
     */
    public int getA2()
    {
        return a2;
    }

    /**
     * @param a2 the a2 to set
     */
    public void setA2(int a2)
    {
        this.a2 = a2;
    }
}
