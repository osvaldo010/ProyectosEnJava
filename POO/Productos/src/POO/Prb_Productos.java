/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author niky
 */
public class Prb_Productos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int opc, opc2;
        Productos p[]=null;
        try
        {
            Productos.setFolio((Integer)ManipulaciondeArchivos.carga(null,"folio.dat"));
            
        } catch (Exception e)
        {
            Productos.setFolio(0);
        }
        
        p=(Productos[]) ManipulaciondeArchivos.cargaArr(null,"Productos.dat");
        String mnu[]={"Perecederos","No Perecederos","Consulta General","Presuspuesto Producto","Salir"};
        String mnu2[]={"Altas", "Bajas","Consultas", "Modificaciones","Regresar"};
        
        do
        {
            opc=Manipulacion.pintamenu(mnu, "Principal");
            switch (opc)
            {
                case 1:
                case 2:
                    do
                    {
                        opc2=Manipulacion.pintamenu(mnu2, mnu[opc-1]);
                        switch (opc2)
                        {
                            case 1:
                                p=Manipulacion.inserta(p, Manipulacion.creobj(opc));
                                break;
                            case 2:
                                Mensaje.exito(null,"en construccion...");  //Importar en casa, null cuando es consola 
                                break;
                            case 3:
                                System.out.println(Manipulacion.Consultas(p, opc, mnu));
                                break;
                            case 4:
                                Manipulacion.modificar(p);
                                break;
                            case 5:
                                break;
                            default:
                                Mensaje.error(null,"opcion incorrectas");
          
                        }
                    } while (opc2!=mnu2.length);
                                        
                    break;
                case 3:
                    System.out.println(Manipulacion.ConsultaGeneral(p));
                    break;
                case 4:
                    Manipulacion.Preciototal(null,p);
                    break;
                case 5:
                    Mensaje.exito(null,"saliendo...");
                    break;
                default:
                    Mensaje.error(null,"opcion incorrectas");

            }
            
        } while (opc!=mnu.length);
        ManipulaciondeArchivos.guarda(null,p, "Productos.dat");
        ManipulaciondeArchivos.guarda(null,Productos.getFolio(), "folio.dat");
    }
    
}
