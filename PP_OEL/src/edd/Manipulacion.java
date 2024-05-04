/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import java.io.Serializable;
import poo.Lecturas;

/**
 *
 * @author osval
 */
public class Manipulacion implements Serializable
{

    public static boolean verificaNombreProceso(LDLC lista, String nom)
    {
        boolean b = false;
        if (lista.getR() != null)
        {
            NodoL aux = lista.getR();
            Nodo aux3;
            do
            {
                ColasCircularesDinamicas cola = new ColasCircularesDinamicas();
                aux = aux.getSiguiente();
                do
                {
                    aux3 = ((Prioridad) aux.getObj()).getCola().elimina();
                    if (aux3.getEtiqueta().equals(nom))
                    {
                        b = true;
                    }
                    cola.inserta(aux3);
                } while (((Prioridad) aux.getObj()).getCola().getAtras() != null);
                ((Prioridad) aux.getObj()).setCola(cola);
            } while (aux != lista.getR());
        } else
        {
            System.out.println("Se puede ingresar el proceso");
        }
        return b;
    }

    public static int pintaMenú(String[] menu)
    {

        for (int i = 0; i < menu.length; i++)
        {
            System.out.println((i + 1) + ".- " + menu[i]);
        }

        System.out.println("Ingrese la opción: ");
        return Lecturas.leerEnteroPositivo();
    }

    public static Proceso menuAltaProceso()
    {
        int prio;
        do
        {
            System.out.println("Ingrese la prioridad del proceso: ");
            prio = Lecturas.leerEnteroPositivo();
        } while (prio < 1 || prio == 0);

        System.out.println("Ingrese los quantums del proceso: ");
        int quan = Lecturas.leerEnteroPositivo();

        System.out.println("Ingrese el nombre del proceso: ");
        String nom = Lecturas.leerString();

        Proceso o = new Proceso(prio, quan, nom);

        return o;
    }

    public static LDLC altaProceso(Proceso obj, LDLC lista)
    {
        if (obj != null)
        {

            Nodo nodoCola = new Nodo(obj.getNombre(), obj);

            if (lista.getR() == null)
            {
                Prioridad prio = new Prioridad(obj.getNoPrioridad(), null);
                ColasCircularesDinamicas cola = new ColasCircularesDinamicas();
                cola.inserta(nodoCola);
                prio.setCola(cola);

                NodoL nodoLista = new NodoL(String.valueOf(prio.getNoPrioridad()), prio);

                lista.insertar(nodoLista);
            } else
            {
                if (obj.getNoPrioridad() < ((Prioridad) lista.getR().getSiguiente().getObj()).getNoPrioridad() || obj.getNoPrioridad() > ((Prioridad) lista.getR().getObj()).getNoPrioridad())
                {
                    Prioridad prio = new Prioridad(obj.getNoPrioridad(), null);
                    ColasCircularesDinamicas cola = new ColasCircularesDinamicas();
                    cola.inserta(nodoCola);
                    prio.setCola(cola);

                    NodoL nodolista = new NodoL(String.valueOf(prio.getNoPrioridad()), prio);

                    lista.insertar(nodolista);
                } else
                {
                    NodoL aux = lista.getR();
                    while (true)
                    {
                        aux = aux.getSiguiente();
                        if (obj.getNoPrioridad() == ((Prioridad) aux.getObj()).getNoPrioridad())
                        {
                            ((Prioridad) aux.getObj()).getCola().inserta(nodoCola);
                            break;
                        } else
                        {
                            if (obj.getNoPrioridad() > ((Prioridad) aux.getObj()).getNoPrioridad() && obj.getNoPrioridad() < ((Prioridad) aux.getSiguiente().getObj()).getNoPrioridad())
                            {
                                Prioridad prio = new Prioridad(obj.getNoPrioridad(), null);
                                ColasCircularesDinamicas cola = new ColasCircularesDinamicas();
                                cola.inserta(nodoCola);
                                prio.setCola(cola);

                                NodoL nodolista = new NodoL(String.valueOf(prio.getNoPrioridad()), prio);

                                lista.insertar(nodolista);
                                break;
                            }
                        }
                    }
                }
            }
        } else
        {
            System.out.println("Error al añadir proceso");
        }

        return lista;
    }

    public static ColasCircularesDinamicas eliminarProceso(ColasCircularesDinamicas cola, String nombre, LDLC lista)
    {
        if (cola.getAtras() != null)
        {
            ColasCircularesDinamicas colaAux = new ColasCircularesDinamicas();
            Nodo aux = null;
            do
            {
                aux = cola.getAtras().getSiguiente();
                if (((Proceso) aux.getObj()).getNombre().equals(nombre))
                {
                    if (cola.getAtras() == aux)
                    {
                        cola.elimina();
                        System.out.println("Se encontró el proceso y se eliminó");
                        return null;
                    } else
                    {
                        System.out.println("Se encontró el proceso y se eliminó");
                        cola.elimina();
                    }

                } else
                {
                    cola.elimina();
                    colaAux.inserta(aux);
                }
            } while (cola.getAtras() != null);
            cola = colaAux;
        } else
        {
            System.out.println("Cola vacía");
        }
        return cola;
    }

    public static LDLC bajaProceso(LDLC lista, String nombre)
    {
        if (lista.getR() != null)
        {
            NodoL aux = lista.getR();
            do
            {
                aux = aux.getSiguiente();
                ((Prioridad) aux.getObj()).setCola(eliminarProceso(((Prioridad) aux.getObj()).getCola(), nombre, lista));
                if (((Prioridad) aux.getObj()).getCola() == null)
                {
                    lista.eliminar(aux.getEtiqueta());
                    break;
                }
                if (lista.getR() == null)
                {
                    break;
                }
            } while (aux != lista.getR());
        }
        return lista;
    }

    public static void desp(LDLC lista, NodoL aux, int noPrioridad)
    {
        do
        {
            aux = aux.getSiguiente();
            if (((Prioridad) aux.getObj()).getNoPrioridad() == noPrioridad)
            {
                System.out.println(aux.toString());
                Prioridad aux2 = (Prioridad) aux.getObj();
                System.out.println(aux2.toString());
                despCola(aux2);
            } else
            {
                System.out.println("No se encontraron coincidencias");
            }
        } while (aux != lista.getR());
    }

    public static void despCola(Prioridad aux)
    {
        ColasCircularesDinamicas cola = new ColasCircularesDinamicas();
        Nodo aux3;
        do
        {
            aux3 = aux.getCola().elimina();

            cola.inserta(aux3);
            Proceso aux4 = (Proceso) aux3.getObj();
            System.out.println(aux4.toString());
        } while (aux.getCola().getAtras() != null);
        aux.setCola(cola);
    }

//    public static LDLC procesar(LDLC lista)
//    {
//        Proceso o = null;
//
//        if (lista.getR() != null)
//        {
//            Prioridad aux = (Prioridad) lista.getR().getSiguiente().getObj();
//            Nodo auxCola = aux.getCola().getAtras().getSiguiente();
//            ((Proceso) auxCola.getObj()).setQuantums(((Proceso) auxCola.getObj()).getQuantums() - 1);
//
//            if (((Proceso)auxCola.getObj()).getQuantums() == 0)
//            {
//                if (auxCola == aux.getCola().getAtras())
//                {
//                    aux.setCola(null);
//                    lista.eliminar(String.valueOf(((Proceso) auxCola.getObj()).getNoPrioridad()));
//                } else
//                {
////                    o = (Proceso) auxCola.getObj();
//                    if (((Proceso)auxCola.getObj()).getNoPrioridad() > 0)
//                    {
//                        System.out.println("No se puede aumentar más la prioridad del proceso");
//                    } else
//                    {
//                        aux.getCola().elimina();
//                        ((Prioridad) lista.getR().getSiguiente().getObj()).setCola(aux.getCola());
//                        lista = altaProceso(o, lista);
//                    }
//                }
//            } else
//            {
//                o = (Proceso) auxCola.getObj();
//                if (o.getNoPrioridad() != 1)
//                {
//                    if (auxCola == aux.getCola().getAtras())
//                    {
//                        aux.setCola(null);
//                        lista.eliminar(String.valueOf(o.getNoPrioridad()));
//                        o.setNoPrioridad(o.getNoPrioridad() - 1);
//                        lista = altaProceso(o, lista);
//                    } else
//                    {
//                        aux.getCola().elimina();
//                        ((Prioridad) lista.getR().getSiguiente().getObj()).setCola(aux.getCola());
//                        o.setNoPrioridad(o.getNoPrioridad() - 1);
//                        lista = altaProceso(o, lista);
//                    }
//
//                } else
//                {
//                    System.out.println("Ya no se puede aumentar la prioridad del proceso");
//                }
//            }
//        } else
//        {
//            System.out.println("No se puede realizar un proceso. Lista vacía");
//        }
//
//        return lista;
//    }
    public static LDLC procesar(LDLC lista)
    {
        if (lista.getR() != null)
        {
            NodoL aux = lista.getR().getSiguiente();
            Nodo auxCola = ((Prioridad) aux.getObj()).getCola().getAtras().getSiguiente();

            ((Proceso) auxCola.getObj()).setQuantums(((Proceso) auxCola.getObj()).getQuantums() - 1);

            if (((Proceso) auxCola.getObj()).getQuantums() == 0)
            {
                if (auxCola == ((Prioridad) aux.getObj()).getCola().getAtras())
                {
                    lista.eliminar(aux.getEtiqueta());
                    return lista;
                } else
                {
                    ((Prioridad) aux.getObj()).getCola().elimina();
                }
            } else
            {
                if (((Proceso) auxCola.getObj()).getNoPrioridad() == 1)
                {
                    System.out.println("No se puede aumentar más la prioridad del proceso.");
                    return lista;
                } else
                {
                    if (auxCola == ((Prioridad) aux.getObj()).getCola().getAtras())
                    {
                        ((Prioridad) aux.getObj()).getCola().elimina();
                        ((Proceso) auxCola.getObj()).setNoPrioridad(((Proceso) auxCola.getObj()).getNoPrioridad() - 1);
                        lista.eliminar(aux.getEtiqueta());
                        lista = altaProceso((Proceso) auxCola.getObj(), lista);
                        return lista;
                    } else
                    {
                        ((Prioridad) aux.getObj()).getCola().elimina();
                        ((Proceso) auxCola.getObj()).setNoPrioridad(((Proceso) auxCola.getObj()).getNoPrioridad() - 1);
                        lista = altaProceso((Proceso) auxCola.getObj(), lista);
                        return lista;
                    }

                }
            }
        } else
        {
            System.out.println("No se puede realizar un proceso. Lista vacía.");
        }
        return lista;
    }

    public static LDLC procesar2(LDLC lista)
    {
        if (lista.getR() != null)
        {
            NodoL aux = lista.getR().getSiguiente();
            Nodo auxCola = ((Prioridad) aux.getObj()).getCola().getAtras().getSiguiente();

            ((Proceso) auxCola.getObj()).setQuantums(((Proceso) auxCola.getObj()).getQuantums() - 1);

            if (((Proceso) auxCola.getObj()).getQuantums() == 0)
            {
                if (auxCola == ((Prioridad) aux.getObj()).getCola().getAtras())
                {
                    lista.eliminar(aux.getEtiqueta());
                    return lista;
                } else
                {
                    ((Prioridad) aux.getObj()).getCola().elimina();
                }
            } else
            {
                if (auxCola == ((Prioridad) aux.getObj()).getCola().getAtras())
                {
                    ((Prioridad) aux.getObj()).getCola().elimina();
                    ((Proceso) auxCola.getObj()).setNoPrioridad(((Proceso) auxCola.getObj()).getNoPrioridad() + 1);
                    lista.eliminar(aux.getEtiqueta());
                    lista = altaProceso((Proceso) auxCola.getObj(), lista);
                    return lista;
                } else
                {
                    ((Prioridad) aux.getObj()).getCola().elimina();
                    ((Proceso) auxCola.getObj()).setNoPrioridad(((Proceso) auxCola.getObj()).getNoPrioridad() + 1);
                    lista = altaProceso((Proceso) auxCola.getObj(), lista);
                    return lista;
                }
            }
        } else
        {
            System.out.println("No se puede realizar un proceso. Lista vacía.");
        }
        return lista;
    }

    public static void despSigProceso(Nodo cola)
    {
        System.out.println(cola.getObj().toString());
    }
}
