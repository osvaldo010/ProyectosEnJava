/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;
import poo.Archivos;
import poo.Lecturas;

/**
 *
 * @author osval
 */
public class PrbPP
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String[] mnu = {"Alta de Proceso", "Baja de Proceso", "Procesar", "Consulta de Procesos por Prioridad", "Consulta Próximo", "Salir"};
        
        int opc, sema = 0;
        
        LDLC lista = new LDLC();
        
//        lista = (LDLC)Archivos.carga(null, "Lista.dat");
        
        if (lista == null)
        {
            LDLC lista2 = new LDLC();
            lista = lista2;
        }
        
        do
        {
            opc = Manipulacion.pintaMenú(mnu);
            
            switch (opc)
            {
                case 1:
                    lista = Manipulacion.altaProceso(Manipulacion.menuAltaProceso(), lista);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del proceso: ");
                    lista = Manipulacion.bajaProceso(lista, Lecturas.leerString());
                    break;
                case 3:
                    lista = Manipulacion.procesar2(lista);
                    if (lista.getR() != null)
                    {
                        sema = 1;
                    }else
                    {
                        sema = 0;
                    }
                    break;
                case 4:
                    if (lista.getR() == null)
                    {
                        System.out.println("Lista vacía");
                    }else
                    {
                        System.out.println("Ingrese la prioridad a mostrar");
                        int noPrioridad = Lecturas.leerEnteroPositivo();
                        Manipulacion.desp(lista, lista.getR(), noPrioridad);
                    }
                    break;
                case 5:
                    if (sema == 1)
                    {
                        NodoL aux = lista.getR().getSiguiente();
                        Prioridad aux2 = (Prioridad)aux.getObj();
                        Nodo aux3 = aux2.getCola().getAtras().getSiguiente();
                        Manipulacion.despSigProceso(aux3);
                    }else
                    {
                        System.out.println("No se puede mostrar el siguiente proceso porque no se ha procesado ");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente de nuevo");
            }
            
        } while (opc != mnu.length);
//        Archivos.guarda(null, lista, "Lista.dat");
    }
    
}
