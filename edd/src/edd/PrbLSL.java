/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author Estrada
 */
public class PrbLSL
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LSL ls = new LSL();
        
        Nodo n1 = new Nodo("5", null);
        Nodo n2 = new Nodo("3", null);
        Nodo n3 = new Nodo("4", null);
        Nodo n4 = new Nodo("6", null);
        Nodo n5 = new Nodo("2", null);
        Nodo n6 = new Nodo("9", null);
        Nodo n7 = new Nodo("1", null);
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
        
        ls.insertar(n1);
        System.out.println(ls.despR(ls.getR(), ""));
        ls.insertar(n2);
        System.out.println(ls.despR(ls.getR(), ""));
        ls.insertar(n3);
        System.out.println(ls.despR(ls.getR(), ""));
        ls.insertar(n4);
        System.out.println(ls.despR(ls.getR(), ""));
        ls.insertar(n5);
        System.out.println(ls.despR(ls.getR(), ""));
        ls.insertar(n6);
        System.out.println(ls.despR(ls.getR(), ""));
        ls.insertar(n7);
        System.out.println(ls.despR(ls.getR(), ""));
        
        System.out.println(ls.eliminar("3"));
        System.out.println(ls.despR(ls.getR(), ""));
        System.out.println(ls.eliminar("5"));
        System.out.println(ls.despR(ls.getR(), ""));
        
        System.out.println(ls.despR(ls.getR(), ""));

    }
    
}
