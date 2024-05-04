/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author osval
 */
public class PrbMultiListas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MultiListas obj = new MultiListas();
        Nodo r = null;
        
        Nodo p1 = new Nodo("Mexico", null);
        Nodo p2 = new Nodo("Alemania", null);
        Nodo p3 = new Nodo("Grecia", null);
        Nodo p4 = new Nodo("Colombia", null);
        
        Nodo e1 = new Nodo("CDMX", null);
        Nodo e2 = new Nodo("Berlin", null);
        Nodo e3 = new Nodo("Atenas", null);
        Nodo e4 = new Nodo("Medellin", null);
        
        Nodo s1 = new Nodo("Argos", null);
        Nodo s2 = new Nodo("Niños heroes", null);
        Nodo s3 = new Nodo("Justo sierra", null);
        Nodo s4 = new Nodo("ABC", null);
        
        String arr[] = new String[1];
        arr[0] = "Mexico";
        r = obj.inserta(r, 0, arr, p1);
        arr[0] = "Alemania";
        r = obj.inserta(r, 0, arr, p2);
        arr[0] = "Grecia";
        r = obj.inserta(r, 0, arr, p3);
        arr[0] = "Colombia";
        r = obj.inserta(r, 0, arr, p4);
        
        String arr2[] = new String[2];
        arr2[0] = "Mexico";
        arr2[1] = "CDMX";
        r = obj.inserta(r, 0, arr2, e1);
        arr2[0] = "Alemania";
        arr2[1] = "Berlin";
        r = obj.inserta(r, 0, arr2, e2);
        arr2[0] = "Grecia";
        arr2[1] = "Atenas";
        r = obj.inserta(r, 0, arr2, e3);
        arr2[0] = "Colombia";
        arr2[1] = "Medellin";
        r = obj.inserta(r, 0, arr2, e4);
        
        String arr3[] = new String[3];
        arr3[0] = "Mexico";
        arr3[1] = "CDMX";
        r = obj.inserta(r, 0, arr3, s1);
        r = obj.inserta(r, 0, arr3, s2);
        r = obj.inserta(r, 0, arr3, s3);
//        arr3[0] = "Alemania";
//        arr3[1] = "Berlin";
//        arr3[0] = "Grecia";
//        arr3[1] = "Atenas";
        arr3[0] = "Colombia";
        arr3[1] = "Medellin";
        r = obj.inserta(r, 0, arr3, s4);
        
        obj.desp(r, "");
    }
    
}
