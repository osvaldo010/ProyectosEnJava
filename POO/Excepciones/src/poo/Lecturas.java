/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lizoc
 */
public class Lecturas
{

    //Scanner sc=new Scanner(); NO OBLIGA A ATRAPAR ERROREE O USAR EL EXCEPTION
    private static InputStreamReader ISC = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(ISC);

    //METODO DE CLASE
  

    public static int leerEnteroPositivo() {
        do {
            try {
                int x = Integer.parseInt(br.readLine());

                // Verificar si el número es positivo
                if (x >= 0) {
                    return x;
                } else {
                    System.out.println("--SE ESPERABA UN ENTERO POSITIVO--");
                    System.out.println("REINTENTAR");
                }
            } catch (IOException ex) {
                Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("--NO SE ENCONTRO EL PERIFERICO DE ENTRADA--");
                System.out.println("REINTENTAR");
            } catch (NumberFormatException error) {
                System.out.println("--SE ESPERABA UN ENTERO--");
                System.out.println("REINTENTAR");
            } catch (Exception err) {
                System.out.println("ERROR..." + err.toString());
                System.out.println("REINTENTAR");
            }
        } while (true);
    }

    public static int leerEntero(boolean b)
    {
        do
        {
            try//se asemeja a un switch
            {
                //La manera de convertir lo que leo del buffer BR es a traves del metodo ReadLine
                return Integer.parseInt(br.readLine());
            } catch (IOException ex)//ex es un objeto que trae info del error, puedo cambiar nombre a error
            {
                Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex); //getLogger saca info del error
                System.out.println("--NO SE ENCONTRO EL PERIFERICO DE ENTRADA--");
                System.out.println("REINTENTAR");
            } catch (NumberFormatException error) //funciona como else de un if en los parentesis va la excepciona a atrapar
            {
                System.out.println("--SE ESPERABA UN ENTERO--");
                System.out.println("REINTENTAR");
            } catch (Exception err) //va de ultimo
            {
                System.out.println("ERROR..." + err.toString()); //El toString es más completo (da clase y msj), el getMessage es más estetico(solo da msj)
                System.out.println("REINTENTAR");

            } finally//es forzoso y se ejecuta al último// evita que el return corte el método y pueda llegar aqui
            {

            }

        } while (true);

    }

    public static int leerEntero(boolean b, boolean v)
    {

        do
        {
            try//se asemeja a un switch
            {
                //La manera de convertir lo que leo del buffer BR es a traves del metodo ReadLine
                return Integer.parseInt(br.readLine());
            } catch (IOException ex)//ex es un objeto que trae info del error, puedo cambiar nombre a error
            {
                Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex); //getLogger saca info del error
                System.out.println("--NO SE ENCONTRO EL PREIFERICO DE ENTRADA--");
                System.out.println("REINTENTAR");
            } catch (NumberFormatException error) //funciona como else de un if en los parentesis va la excepciona a atrapar
            {
                System.out.println("--SE ESPERABA UN ENTERO--");
                System.out.println("REINTENTAR");
            } catch (Exception err) //va de ultimo
            {
                System.out.println("ERROR..." + err.toString()); //El toString es más completo (da clase y msj), el getMessage es más estetico(solo da msj)
                System.out.println("REINTENTAR");

            } finally//es forzoso y se ejecuta al último// evita que el return corte el método y pueda llegar aqui
            {

            }

        } while (true);
    }

    public static double leerDouble(boolean b)
    {
        do
        {
            try//se asemeja a un switch
            {
                //La manera de convertir lo que leo del buffer BR es a traves del metodo ReadLine
                return Double.parseDouble(br.readLine());
            } catch (IOException ex)//ex es un objeto que trae info del error, puedo cambiar nombre a error
            {
                Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex); //getLogger saca info del error
                System.out.println("--NO SE ENCONTRO EL PREIFERICO DE ENTRADA--");
                System.out.println("REINTENTAR");
            } catch (NumberFormatException error) //funciona como else de un if en los parentesis va la excepciona a atrapar
            {
                System.out.println("--SE ESPERABA UN DOUBLE--");
                System.out.println("REINTENTAR");
            } catch (Exception err) //va de ultimo
            {
                System.out.println("ERROR..." + err.toString()); //El toString es más completo (da clase y msj), el getMessage es más estetico(solo da msj)
                System.out.println("REINTENTAR");
            } finally//es forzoso y se ejecuta al último// evita que el return corte el método y pueda llegar aqui
            {

            }

        } while (true);

    }

    public static char leerChar()
    {
        char c = ' ';
        try//se asemeja a un switch
        {
            c = (char) br.read();
            String s = br.readLine();
            //La manera de convertir lo que leo del buffer BR es a traves del metodo ReadLine

        } catch (IOException ex)//ex es un objeto que trae info del error, puedo cambiar nombre a error
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex); //getLogger saca info del error
            System.out.println("--NO SE ENCONTRO EL PREIFERICO DE ENTRADA--");

        } catch (NumberFormatException error) //funciona como else de un if en los parentesis va la excepciona a atrapar
        {
            System.out.println("--SE ESPERABA UN CARÁCTER--");

        } catch (Exception err) //va de ultimo
        {
            System.out.println("ERROR..." + err.toString()); //El toString es más completo (da clase y msj), el getMessage es más estetico(solo da msj)

        } finally//es forzoso y se ejecuta al último// evita que el return corte el método y pueda llegar aqui
        {

        }
        return c;
    }

    public static String leerString()
    {
        String s = "";
        try//se asemeja a un switch
        {

            s = br.readLine();

//        } catch (IOException ex)//ex es un objeto que trae info del error, puedo cambiar nombre a error
//        {
//            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex); //getLogger saca info del error
//            System.out.println("--NO SE ENCONTRO EL PREIFERICO DE ENTRADA--");
//           
//        } catch (NumberFormatException error) //funciona como else de un if en los parentesis va la excepciona a atrapar
//        {
//            System.out.println("--SE ESPERABA UNA CADENA--");
//           
        } catch (Exception err) //va de ultimo
        {
            System.out.println("ERROR..." + err.toString()); //El toString es más completo (da clase y msj), el getMessage es más estetico(solo da msj)

        }
        return s;
    }
    
    public static boolean leerBoolean()
    {
        do
        {
            try
            {
                String input = br.readLine().toLowerCase();

                if (input.equals("true") || input.equals("t"))
                {
                    return true;
                } else if (input.equals("false") || input.equals("f"))
                {
                    return false;
                } else
                {
                    System.out.println("--SE ESPERABA UN VALOR BOOLEANO (true/false o t/f)--");
                    System.out.println("REINTENTAR");
                }
            } catch (IOException ex)
            {
                Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE,null,ex);
                System.out.println("--NO SE ENCONTRÓ EL PERIFERICO DE ENTRADA--");
                System.out.println("REINTENTAR");
            }catch (Exception e)
            {
                System.out.println("ERROR..." + e.getMessage());
                System.out.println("REINTENTAR");
            }
        } while (true);
    }

}
