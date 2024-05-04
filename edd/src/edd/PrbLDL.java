/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author HEstrada
 */
public class PrbLDL
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LDL obj = new LDL();

        NodoL n1 = new NodoL("z", null);
        NodoL n2 = new NodoL("t", null);
        NodoL n3 = new NodoL("a", null);
        NodoL n4 = new NodoL("w", null);
        NodoL n5 = new NodoL("g", null);
        NodoL n6 = new NodoL("r", null);
        NodoL n7 = new NodoL("b", null);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);

        obj.insertar(n1);
//        obj.despR2(obj.getR());
        obj.insertar(n2);
//        obj.despR2(obj.getR());
        obj.insertar(n3);
//        obj.despR2(obj.getR());
        obj.insertar(n4);
//        obj.despR2(obj.getR());
        obj.insertar(n5);
//        obj.despR2(obj.getR()); 
        obj.insertar(n6);
//        obj.despR2(obj.getR()); 
        obj.insertar(n7);
        obj.despR2(obj.getR()); 
        

//        System.out.println(obj.eliminar("4"));
//        obj.despR2(obj.getR());
    }

}
