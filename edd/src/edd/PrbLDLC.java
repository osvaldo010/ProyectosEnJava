/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author HEstrada
 */
public class PrbLDLC
{
    
    public static void main(String[] args)
    {
        LDLC obj = new LDLC();
        
        NodoL n1 = new NodoL("f", null);
        NodoL n2 = new NodoL("a", null);
        NodoL n3 = new NodoL("b", null);
        NodoL n4 = new NodoL("h", null);
        
        obj.insertar(n1);
//        obj.despR2(obj.getR());
        obj.insertar(n2);
//        obj.despR2(obj.getR());
        obj.insertar(n3);
        obj.insertar(n4);
//        obj.despR2(obj.getR().getSiguiente());

    }
}
