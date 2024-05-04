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
public class PrbColaCircular
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ColasCirculares obj = new ColasCirculares(5);

        obj.inserta(1);
        obj.inserta(2);
        obj.inserta(3);
        obj.inserta(4);
        obj.inserta(5);
        obj.inserta(6);

        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
    }

}
