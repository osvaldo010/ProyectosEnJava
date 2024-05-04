/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author lizoc
 */
public class PrbLecturas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.println("Dame un entero: ");
        //int x= Lecturas.leerEntero();
         int x=Lecturas.leerEntero(true);
        System.out.println(x);
        
        System.out.println("Dame un entero positivo");
         int w=Lecturas.leerEnteroPositivo();
        System.out.println(w);
        
        System.out.println("Dame un double: ");
        double y= Lecturas.leerDouble(true);
        System.out.println(y);
        
        System.out.println("Dame un carácter: ");
        char z= Lecturas.leerChar();
        System.out.println(z);
        
        System.out.println("Dame una cadena: ");
        String v= Lecturas.leerString();
        System.out.println(v);
        
        
    }
    
}
