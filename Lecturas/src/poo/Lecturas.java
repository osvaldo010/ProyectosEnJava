/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Lecturas
{
    public  static InputStreamReader isc = new InputStreamReader(System.in);
            
    private static BufferedReader br = new BufferedReader(isc);
    
    
    //metodo de clase
    public static int leerEntero()
    {
        
        //la clase madre va al final
        // si hay un return hace la accion de ese 
        try
        {
            return Integer.parseInt(br.readLine()); //sirve para leer cualquier tipo de dato, solo eso se cambia
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontró el periferico de entrada");
            return 0;
        } catch (NumberFormatException error)
        {
            System.out.println("Se esperaba un entero");
            return 0;
        } catch (Exception obj)
        {
            System.out.println("Error..."+ obj.toString());  //en el get message solo va el mensaje y el el toString es mas completa la info.
        }
        return 0;
    }
    
    
    
    public static int leerEntero(boolean b)
    {
        do
        {            
            try
        {
            return Integer.parseInt(br.readLine()); //sirve para leer cualquier tipo de dato, solo eso se cambia
        } catch (Exception obj)
        {
            System.out.println("Error..."+ obj.toString());  //en el get message solo va el mensaje y el el toString es mas completa la info.
            System.out.println("Reintentar");
        }
        } while (true);
        
        

    }
    
    
    
    public static double leerDouble()
    {
        
        //la clase madre va al final
        // si hay un return hace la accion de ese 
        try
        {
            return Double.parseDouble(br.readLine()); //sirve para leer cualquier tipo de dato, solo eso se cambia
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontró el periferico de entrada");
        } catch (NumberFormatException error)
        {
            System.out.println("Se esperaba un entero");
    
        } catch (Exception obj)
        {
            System.out.println("Error..."+ obj.toString());  //en el get message solo va el mensaje y el el toString es mas completa la info.
        }
        return 0;
    }
    
    
    
    
    
    public static char leerChar()
    {
        char c = ' ';
        //la clase madre va al final
        // si hay un return hace la accion de ese 
        try
        {
            c = (char) br.read();
            String s = br.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontró el periferico de entrada");
        } catch (NumberFormatException error)
        {
            System.out.println("Se esperaba un caracter");
    
        } catch (Exception obj)
        {
            System.out.println("Error..."+ obj.toString());  //en el get message solo va el mensaje y el el toString es mas completa la info.
        }
        return c;
    }
    
    
    
    
    public static String leerString()
    {
        String s = "";
        //la clase madre va al final
        // si hay un return hace la accion de ese 
        try
        {
            br.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontró el periferico de entrada");
        } catch (NumberFormatException error)
        {
            System.out.println("Se esperaba una cadena");
    
        } catch (Exception obj)
        {
            System.out.println("Error..."+ obj.toString());  //en el get message solo va el mensaje y el el toString es mas completa la info.
        }
        return s;
    }
    
}
