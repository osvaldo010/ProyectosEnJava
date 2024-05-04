/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author Estrada
 */
public class PrbColasDePrioridades
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ColaDePrioridades obj = new ColaDePrioridades(10);
        
        obj.inserta('z');
        obj.inserta('k');
        obj.inserta('l');
        obj.inserta('e');
        obj.inserta('j');
        obj.inserta('c');
        obj.inserta('x');
        obj.inserta('a');
        obj.inserta('p');
        obj.inserta('s');
        
        obj.colaDePrioridades();
        
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        
    }
    
}
