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
public class PrbPilasT
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Carros arr[] = new Carros[5];

        PilasT<Carros> obj = new PilasT<>(arr);

        Carros c1 = new Carros("Nissan");
        Carros c2 = new Carros("Ford");
        Carros c3 = new Carros("Chevrolet");

        obj.inserta(c1);
        obj.inserta(c2);
        obj.inserta(c3);

        c1 = obj.elimina();

        if (c1 != null)
        {
            System.out.println(c1.toString());
        }
    }
}
