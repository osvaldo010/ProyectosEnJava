/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author Estrada
 */
public class PrbPilasDinamicas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        PilaD obj = new PilaD();
        Nodo obj2 = new Nodo("Carros", "Mazda");
        Nodo obj3 = new Nodo("Carros", "Nissan");
        
        obj.inserta(obj2);
        obj.inserta(obj3);
        
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
    }
    
}
