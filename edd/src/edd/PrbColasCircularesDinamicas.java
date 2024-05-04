/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author LSE1
 */
public class PrbColasCircularesDinamicas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ColasCircularesDinamicas obj = new ColasCircularesDinamicas();
        
        Nodo obj1 = new Nodo("Carro", "Ford");
        Nodo obj2 = new Nodo("Carro", "Pontiac");
        Nodo obj3 = new Nodo("Carro", "MG");
        Nodo obj4 = new Nodo("Carro", "Nissan");
        
        obj.inserta(obj1);
        obj.inserta(obj2);
        obj.inserta(obj3);
        obj.inserta(obj4);
        
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        
        obj.inserta(obj1);
        obj.inserta(obj2);
        obj.inserta(obj3);
        obj.inserta(obj4);
        
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        
    }

}
