/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Usuario
 */
public class PrbLecturas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Dame un entero");
        int z = Lecturas.leerEntero(true);
        System.out.println(z);
        
        
        
        System.out.println("Dame un entero");
        int x = Lecturas.leerEntero();
        System.out.println(x);
        
        
        
        System.out.println("Dame un numero double");
        double y = Lecturas.leerDouble();
        System.out.println(y);
        
        
        
        
        
        
    }
    
}
