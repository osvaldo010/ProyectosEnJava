/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author HEstrada
 */
public class PrbLSLC
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LSLC obj = new LSLC();
        
        Nodo n1 = new Nodo("d", null);
        Nodo n2 = new Nodo("g", null);
        Nodo n3 = new Nodo("a", null);
        Nodo n4 = new Nodo("k", null);
        Nodo n5 = new Nodo("c", null);
        
        obj.insertar(n1);
//        obj.despR2(obj.getR());
        obj.insertar(n2);
//        obj.despR2(obj.getR());
        obj.insertar(n3);
//        obj.despR2(obj.getR());
        obj.insertar(n4);
//        obj.despR2(obj.getR());
        obj.insertar(n5);
        obj.despR2(obj.getR().getSiguiente());
        
        System.out.println(obj.eliminar("c"));
        obj.despR2(obj.getR().getSiguiente());
        
        System.out.println(obj.eliminar("d"));
        obj.despR2(obj.getR().getSiguiente());
        
        System.out.println(obj.eliminar("g"));
        obj.despR2(obj.getR().getSiguiente());
        
        System.out.println(obj.eliminar("a"));
        obj.despR2(obj.getR().getSiguiente());
        
        System.out.println(obj.eliminar("k"));
        obj.despR2(obj.getR());
    }
}
