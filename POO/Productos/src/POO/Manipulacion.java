/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.lang.reflect.Array;
import java.util.Scanner;
import poo.Lecturas;

/**
 *
 * @author chemy
 */
public class Manipulacion
{
    public static int pintamenu(String []mnu, String s)
    {
        System.out.println("===MENU"+s+"===");
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println((i+1)+".-"+mnu[i]);
        }
        System.out.println("elige una opcion");
        return Lecturas.leerEntero(true);
        
        
    }
    public static Productos [] inserta (Productos []p, Productos obj)
        {
            if (p==null)
            {
                p= new Productos[1];
                
            }else
            {
                Productos nvo[]=new Productos[p.length+1];
                System.arraycopy(p, 0, nvo, 0, p.length);
                p=nvo;
            }
            p[p.length-1]=obj;
            return p;
        }
    
    public static Productos creobj(int opc)
    {
        String id;
        String nombre; 
        double precio;
        int existencias;
        int lote;
        String cad_date;
        
        System.out.println("Dame el nombre del producto : ");
        nombre=Lecturas.leerCadena();
        System.out.println("Dame el precio del producto : ");
        precio=Lecturas.leerDouble();
        System.out.println("Dame la existencia del producto : ");
        existencias=Lecturas.leerEntero(true);
        System.out.println("dame el id del producto");
        id=Lecturas.leerCadena();
        if (opc==1)
        {
            System.out.println("Dame la fecha de caducidad del producto");
            cad_date=Lecturas.leerCadena();
            return new Perecederos(cad_date, id, nombre, precio, existencias);
        } else
        {
            System.out.println("Dame el lote del producto");
            lote=Lecturas.leerEntero(true);
            return new NoPerecederos(lote, id, nombre, precio, existencias);
        }
        
        
    }
    
    public static String ConsultaGeneral (Productos[]p )
    {
        String s=" ";
        try
        {
            System.out.println("id\tnom\tprecio\texistencias\tlote\\cad_date");
            for (int i = 0; i < p.length; i++)
            {
                s+=p[i].toString();
            }
        } catch (Exception e)
        {
            s="no hay datos de productos";
        }
        return s;
   
    }
    
    public static String Consultas (Productos[]p, int opc, String mnu[])
    {
       String s="";
        try
        {
            //*s+="==CONSULTA"+mnu[opc-1]+"==\";*/
            if (opc==1)
            {
               System.out.println("id\tnom\tprecio\texistencias\tcad_date");

            } else
            {
               System.out.println("id\tnom\tprecio\texistencias\tlote");

            }
            for (int i = 0; i < p.length; i++)
            {
                if (opc==1 && p[i] instanceof Perecederos)
                {
                   s+=p[i].toString();
                }else
                {
                    if (opc==2 && p[i]instanceof NoPerecederos)
                    {
                        s+=p[i].toString();
                    }
 
                }
            }
        } catch (Exception e)
        {
            s="No hay datos "+mnu[opc-1];
        }
        return s;
    }
    
    public static void Preciototal (JFrame jf,Productos p[])
    {
        if (p!=null)
        {
            String s=Mensaje.entradaDatos(jf,"Dame el Id del producto:");
            int pos= buscaid(s, p, jf);
            if (pos==-1)
            {
                Mensaje.error(jf,"dato no encontrado");
            } else
            {
                System.out.println("dame la cantidad a presupuestar");
                int cant=Lecturas.leerEntero(true);
                System.out.println("Cantidad = "+cant);
                System.out.println("Precio ="+ p[pos].getPrecio());
                double monto=cant*p[pos].getPrecio();
                System.out.println("Monto ="+monto);
                double iva=p[pos].caliva(cant, p[pos].getPrecio());
                System.out.println("IVA ="+iva);
                System.out.println("TOTAL ="+ (monto+iva));
                
            }
        } else
        {
            Mensaje.error(jf,"no hay productos");
        }
    }
    
    public static int buscaid (JFrame jf, String id, Productos p[])
    {
        if (p!=null)
        {
            for (int i = 0; i < p.length; i++)
            {
                if(p[i].getId()==id)
                 return i;
            }
            
                   
        } else
        {
            Mensaje.error(jf, "no nay productos registrados");
        }
        return -1;
    } 
    
    public static void modificar (Productos p[])
    {
        if (p!=null)
        {
            System.out.println("Dame el Id del producto");
            String s=Lecturas.leerCadena();
            int pos= buscaid(s, p);
            if (pos==-1)
            {
                System.out.println("dato no encontrado");
            } else
            {
                System.out.println("Dame el nuevo nombre del producto : ");
                String nvonombre = Lecturas.leerCadena();
                System.out.println("Dame el nuevo precio del producto : ");
                double nvoprecio = Lecturas.leerDouble();
                System.out.println("Dame la nueva existencia del producto : ");
                int existencias = Lecturas.leerEntero(true);
                System.out.println("dame el nuevo id del producto");
                int id = Lecturas.leerEntero(true);
             
            }
            System.out.println("Datos corregidos");
        } else
        {
            System.out.println("no hay productos");
        }
    }
  
}
