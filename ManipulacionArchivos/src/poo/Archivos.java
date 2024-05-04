/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import cjb.ci.Mensajes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;

/**
 *
 * @author medra
 */
public class Archivos
{

    public static void guarda(JFrame jf, Object obj, String s)
    {
        try
        {
            FileOutputStream fis = new FileOutputStream("Datos/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fis);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
    }

    public static void guarda(JFrame jf, Object obj[], String s)
    {
        try
        {
            FileOutputStream fis = new FileOutputStream("Datos/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fis);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
    }
    public static void guarda(JFrame jf, Object obj[][], String s)
    {
        try
        {
            FileOutputStream fis = new FileOutputStream("Datos/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fis);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
    }

    public static Object carga(JFrame jf, String s)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("Datos/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
        return obj;
    }

    public static Object[] cargaArr(JFrame jf, String s)
    {
        Object obj[] = null;
        try
        {
            FileInputStream fis = new FileInputStream("Datos/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = (Object[]) arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
        return obj;
    }
    public static Object[][] cargaMat(JFrame jf, String s)
    {
        Object obj[][] = null;
        try
        {
            FileInputStream fis = new FileInputStream("Datos/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = (Object[][]) arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
        return obj;
    }
}