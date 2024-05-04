/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

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
        String mnu[] =
        {
            "Registro de Alumnos", "Registro de Peronal", "Modificaciones de Alumnos o Personal", "Consultas Alumnos o Personal", "Historial Clinico", "Reportes ", "Baja de Alumnos", "Salir"
        };

        String mnu2[] =
        {
            "Consulta de Alumnos", " Consulta de Personal"
        };

        String mnu3[] =
        {
            "Modificacion de Alumnos", "Modificacion de Personal"
        };

        String mnu4[] =
        {
            "Hombres...", "Mujeres...", "Solo Hombres", "Solo Mujeres", "Regresar"
        };

        String mnu5[] =
        {
            "Alergias", "Sobrepeso", "Diabetes", "Desnutricion", "Obesidad", "Otros", "Mayor frecuencia de citas", "Menor frecuencia de citas", "Borrar", "Regresar"
        };

        int opc, opc2, opc3;

        String clave = "";

        DatosGenerales[] datos = null;

        HistorialClinico[][] historiales = null;

        datos = (DatosGenerales[]) ManipulacionArchivos.carga(null, "Datos.dat");

        do
        {
            opc = Manipulacion.pintaMenu(mnu, "Principal");
            switch (opc)
            {
                case 1:
                    boolean verificarEspacio = false;
                    Alumnos nuevoAlumno = Manipulacion.crearAlumno();
                    verificarEspacio = Manipulacion.verificarVacio(datos);
                    if (verificarEspacio == true)
                    {
                        datos = Manipulacion.insertarEnVacio(datos, nuevoAlumno);
                    } else
                    {
                        datos = Manipulacion.inserta(datos, nuevoAlumno);
                    }
                    break;
                case 2:
                    boolean verificarEspacio2 = false;
                    Personal nuevoPersonal = Manipulacion.crearPersonal();
                    verificarEspacio2 = Manipulacion.verificarVacio(datos);
                    if (verificarEspacio2 == true)
                    {
                        datos = Manipulacion.insertarEnVacio(datos, nuevoPersonal);
                    } else
                    {
                        datos = Manipulacion.inserta(datos, nuevoPersonal);
                    }
                    datos = Manipulacion.inserta(datos, nuevoPersonal);
                    break;
                case 3:
                    opc3 = Manipulacion.pintaMenu(mnu3, "Modificaciones");

                    switch (opc3)
                    {
                        case 1:
                            clave = Lecturas.leerString();
                            Manipulacion.modificarAlumno(datos, clave);
                            break;

                        case 2:
                            System.out.println("Ingresa el cve del personal: ");
                            clave = Lecturas.leerString();
                            Manipulacion.modificarPersonal(datos, clave);
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    break;
                case 4:
                    opc2 = Manipulacion.pintaMenu(mnu2, "Consultas");

                    switch (opc2)
                    {
                        case 1:
                            System.out.println(Manipulacion.consultas(datos, opc2, mnu2));
                            break;
                        case 2:
                            System.out.println(Manipulacion.consultas(datos, opc2, mnu2));
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    break;
                case 5:

                    System.out.println("Ingrese la clave del alumno o personal para su historial: ");
                    String num = Lecturas.leerString();
                    int posicion = Manipulacion.buscarPosicion(datos, num);

                    if (posicion >= 0)
                    {
                        if (historiales == null)
                        {
                            HistorialClinico nuevohistorial = Manipulacion.creaHistorial();
                            historiales = Manipulacion.insertaHistorialClinico(historiales, nuevohistorial);
                        } else if (posicion >= historiales.length)
                        {
                            while (posicion >= historiales.length)
                            {

                                historiales = Manipulacion.insertaHistorialRenglon(historiales);

                            }
                            HistorialClinico nuevoHistorial = Manipulacion.creaHistorial();
                            historiales = Manipulacion.insertaHistorialColumna(historiales, nuevoHistorial, posicion);
                        } else
                        {
                            HistorialClinico nuevoHistorial = Manipulacion.creaHistorial();
                            historiales = Manipulacion.insertaHistorialColumna(historiales, nuevoHistorial, posicion);
                        }

                    } else
                    {
                        System.out.println("No se puede agregar el historial. Intente de nuevo.");
                    }
                    break;
                case 6:
                    int opc4 = Manipulacion.pintaMenu(mnu4, "Reportes");

                    switch (opc4)
                    {
                        case 1:
                            int opc5 = Manipulacion.pintaMenu(mnu5, "Agregar filtro");

                            switch (opc5)
                            {
                                case 1:
                                    Manipulacion.retornarHombresConAlergias(datos);
                                    break;
                                case 2:
                                    Manipulacion.retornarHombresConSobrepeso(datos);
                                    break;
                                case 3:
                                    Manipulacion.retornarHombresConDiabetes(datos);
                                    break;
                                case 4:
                                    Manipulacion.retornarHombresConDesnutricion(datos);
                                    break;
                                case 5:
                                    Manipulacion.retornarHombresConObesidad(datos);
                                    break;
                                case 6:
                                    Manipulacion.retornarHombresConOtros(datos);
                                    break;
                                case 7:
                                    Manipulacion.retornarHombresConMayorFrecuencia(historiales, datos);
                                    break;
                                case 8:
                                    Manipulacion.retornarHombresConMenorFrecuencia(datos, historiales);
                                    break;
                                case 9:
                                    System.out.println("Regresando...");
                                    break;
                                default:
                                    throw new AssertionError();
                            }

                            break;
                        case 2:
                            int opc6 = Manipulacion.pintaMenu(mnu5, "Agregar filtro");
                            do
                            {
                                switch (opc6)
                                {
                                    case 1:
                                        Manipulacion.retornarMujeresConAlergias(datos);
                                        break;
                                    case 2:
                                        Manipulacion.retornarMujeresConSobrepeso(datos);
                                        break;
                                    case 3:
                                        Manipulacion.retornarMujeresConDiabetes(datos);
                                        break;
                                    case 4:
                                        Manipulacion.retornarMujeresConDesnutricion(datos);
                                        break;
                                    case 5:
                                        Manipulacion.retornarMujeresConObesidad(datos);
                                        break;
                                    case 6:
                                        Manipulacion.retornarMujeresConOtros(datos);
                                        break;
                                    case 7:
                                        Manipulacion.retornarMujeresConMayorFrecuencia(historiales, datos);
                                        break;
                                    case 8:
                                        Manipulacion.retornarMujeresConMenorFrecuencia(datos, historiales);
                                        break;
                                    case 9:
                                        System.out.println("Regresando...");
                                        break;
                                    default:
                                        System.out.println("opcion incorrecta");
                                }
                            } while (opc6 != mnu5.length);
                            break;
                        case 3:
                            Manipulacion.retornarHombres(datos);
                            break;
                        case 4:
                            Manipulacion.retornarMujeres(datos);
                            break;
                        case 5:
                            System.out.println("Regresando al menu principal...");
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                case 7:
                    System.out.println("Introduzca la clave a borrar");
                    String borrar = Lecturas.leerString();

                    Manipulacion.borra(datos, borrar, historiales);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != mnu.length);

        ManipulacionArchivos.guarda(null, datos, "Datos.dat");
    }

}
