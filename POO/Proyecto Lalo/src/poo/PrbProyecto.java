/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import javax.crypto.Mac;

/**
 *
 * @author josee
 */
public class PrbProyecto
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        String[] mnuPrincipal =
        {
            "Registro de Alumnos",
            "Registro de Personal",
            "Modificaciones de Alumnos",
            "Modificaciones de Personal",
            "Consulta de Alumnos",
            "Consulta de Personal",
            "Historial clinico para Alumnos",
            "Historial clinico para Personal",
            "Salir"
        };

        Alumnos[] alumnos = new Alumnos[0];
        Personal[] personal = new Personal[0];
        
        HistorialClinico [][] alumnosHistoriales = null;
        HistorialClinico [][] personalHistoriales = null;
        

        int opc;

        do
        {
            opc = Manipulacion.pintaMenu(mnuPrincipal, "Principal");

            switch (opc)
            {
                case 1: // Registro de Alumnos
                    Alumnos nuevoAlumno = Manipulacion.crearAlumno();
                    alumnos = Manipulacion.insertaAlumno(alumnos, nuevoAlumno);
                    System.out.println(alumnos.length);
                    break;

                case 2: // Registro de Personal
                    Personal nuevoPersonal = Manipulacion.crearPersonal();
                    personal = Manipulacion.insertaPersonal(personal, nuevoPersonal);
                    break;

                case 3: // Modificaciones de Alumnos
                    String claveAlumno;
                    boolean existeClaveAlumno;
                    do
                    {
                        claveAlumno = Manipulacion.solicitarClaveAlumno();
                        existeClaveAlumno = Manipulacion.buscarAlumnoPorClave(alumnos, claveAlumno);
                        if (!existeClaveAlumno)
                        {
                            System.out.println("La clave del alumno no existe. Inténtalo de nuevo.");
                        }
                    } while (!existeClaveAlumno);

                    Manipulacion.modificarAlumnoSiExiste(alumnos, claveAlumno);
                    break;

                case 4: // Modificaciones de Personal
                    
                    break;

                case 5: // Consulta de Alumnos
                    Manipulacion.consultaAlumnos(alumnos);
                    break;

                case 6: // Consulta de Personal

                    break;
                case 7:     //Crear los historiales en la matriz de alumnos
                    System.out.println("Ingresa la clave del alumno: ");
                    String num = Lecturas.leerString();
                    int posicion = Manipulacion.buscarPosicion(alumnos, num);
                    
                    if (posicion > -1)
                    {
                        if (alumnosHistoriales == null)
                        {
                            HistorialClinico nuevohistorial = Manipulacion.creaHistorial();
                            alumnosHistoriales = Manipulacion.insertaHistorialClinico(alumnosHistoriales, nuevohistorial);
                        }else if (posicion >= alumnosHistoriales.length)
                        {
                            while (posicion >= alumnosHistoriales.length)
                            {                                
                                alumnosHistoriales = Manipulacion.insertaHistorialRenglon(alumnosHistoriales);
                            }
                            HistorialClinico nuevoHistorial = Manipulacion.creaHistorial();
                            alumnosHistoriales = Manipulacion.insertaHistorialColumna(alumnosHistoriales, nuevoHistorial, posicion);
                        }else
                        {
                            System.out.println("No se puede agrega el historial. Intente de nuevo.");
                        }
                    }
                    break;
                    
                case 8:     //Crear los historiales en la matriz de personal
                    System.out.println("Ingresa la clave del alumno: ");
                    String num2 = Lecturas.leerString();
                    int posicion2 = Manipulacion.buscarPosicion(personal, num2);
                    
                    if (posicion2 > -1)
                    {
                        if (personalHistoriales == null)
                        {
                            HistorialClinico nuevohistorial = Manipulacion.creaHistorial();
                            personalHistoriales = Manipulacion.insertaHistorialClinico(personalHistoriales, nuevohistorial);
                        }else if (posicion2 >= personalHistoriales.length)
                        {
                            while (posicion2 >= personalHistoriales.length)
                            {                                
                                personalHistoriales = Manipulacion.insertaHistorialRenglon(personalHistoriales);
                            }
                            HistorialClinico nuevoHistorial = Manipulacion.creaHistorial();
                            personalHistoriales = Manipulacion.insertaHistorialColumna(personalHistoriales, nuevoHistorial, posicion2);
                        }else
                        {
                            System.out.println("No se puede agrega el historial. Intente de nuevo.");
                        }
                    }
                    break;

                case 9: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opc != mnuPrincipal.length);

        // Guardar datos al final del programa
        Manipulacion.guardarDatos(alumnos, "Alumnos.dat");
        Manipulacion.guardarDatos(personal, "Personal.dat");
    }

}
