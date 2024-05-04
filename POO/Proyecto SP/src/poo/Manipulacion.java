/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Date;

/**
 *
 * @author josee
 */
public class Manipulacion
{

    public static int pintaMenu(String[] mnu, String s)
    {
        System.out.println("==Menu " + s + "===");
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println((i + 1) + ".-" + mnu[i]);;
        }
        System.out.println("Elige una opcion:");
        return Lecturas.leerEntero(true);
    }

    public static DatosGenerales[] inserta(DatosGenerales[] datos, DatosGenerales obj)
    {
        if (datos == null)
        {
            datos = new DatosGenerales[1];
        } else
        {
            DatosGenerales[] temp = new DatosGenerales[datos.length + 1];
            System.arraycopy(datos, 0, temp, 0, datos.length);
            datos = temp;
        }
        datos[datos.length - 1] = obj;
        return datos;
    }
    
    public static DatosGenerales[] borra(DatosGenerales[] datos, String cve,HistorialClinico[][] historiales)
    {
        try
        {
            for (int i = 0; i < datos.length; i++)
            {
                if (cve.equals(datos[i].getCve()))
                {
                    datos[i] = null;
                    historiales[i] = null;
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
        
        return datos;
    }
    
    public static boolean verificarVacio(DatosGenerales[] datos)
    {
        try
        {
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i] == null)
                {
                    return true;
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
        
        return false;
    }
    
    public static DatosGenerales[] insertarEnVacio(DatosGenerales[] datos, DatosGenerales obj)
    {
        try
        {
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i] == null)
                {
                    datos[i] = obj;
                    break;
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
        
        return datos;
    }

    public static Alumnos crearAlumno()
    {
        String cve, nom, primerAp, segundoAp, otras;
        char sexo;
        boolean desnutricion, sobrepeso, alergias, obesidad, diabetes;
        int viveCon, carrera;
        System.out.println("Ingrese el id del alumno");
        cve = Lecturas.leerString();
        System.out.println("Ingresa el nombre del alumno:");
        nom = Lecturas.leerString();
        System.out.println("Ingresa el primer apellido del alumno:");
        primerAp = Lecturas.leerString();
        System.out.println("Ingresa el segundo apellido del alumno:");
        segundoAp = Lecturas.leerString();
        System.out.println("Ingresa el sexo del alumno(M/F):");
        sexo = Lecturas.leerChar();
        System.out.println("Tiene desnutricion (true/false):");
        desnutricion = Lecturas.leerBoolean();
        System.out.println("Tiene sobrepeso (true/false):");
        sobrepeso = Lecturas.leerBoolean();
        System.out.println("Selecciona el tipo de convivencia del alumno:");
        System.out.println("1. Mama y Papa");
        System.out.println("2. Solo Mama");
        System.out.println("3. Solo Papa");
        System.out.println("4. Otros");
        int tipoConvivencia = Lecturas.leerEntero(true);

        switch (tipoConvivencia)
        {
            case 1:
                viveCon = 1; // Ejemplo de asignación para "Mama y Papa"
                break;
            case 2:
                viveCon = 2; // Asignación para "Solo Mama"
                break;
            case 3:
                viveCon = 3;
            // Otros casos...
            default:
                viveCon = 4; // Por defecto, se asigna "Otros"
                break;
        }
        System.out.println("Selecciona la carrera del alumno:");
        System.out.println("1. Ingeniería en Computación");
        System.out.println("2. Ingeniería en Plásticos");
        System.out.println("3. Ingeniería en Producción Industrial");
        System.out.println("4. Ingeniería en Software");
        System.out.println("5. Ingeniería Mecánica");
        System.out.println("6. Licenciatura de Seguridad Ciudadana");

        carrera = Lecturas.leerEntero(true);

        // Asignar la carrera correspondiente según la selección del usuario
        switch (carrera)
        {
            case 1:
                carrera = 1; // Ingeniería en Computación
                break;
            case 2:
                carrera = 2; // Ingeniería en Plásticos
                break;
            case 3:
                carrera = 3; // Ingeniería en Producción Industrial
                break;
            case 4:
                carrera = 4; // Ingeniería en Software
                break;
            case 5:
                carrera = 5; // Ingeniería Mecánica
                break;
            case 6:
                carrera = 6; // Licenciatura de Seguridad Ciudadana
                break;
            default:
                carrera = 0; // Opción no válida
                break;
        }
        System.out.println("Tienes alergias(TRUE/FALSE): ");
        alergias = Lecturas.leerBoolean();
        System.out.println("Tienes obesidad(TRUE/FALSE): ");
        obesidad = Lecturas.leerBoolean();
        System.out.println("Tienes diabetes(TRUE/FALSE): ");
        diabetes = Lecturas.leerBoolean();
        System.out.println("Otros padecimientos: ");
        otras = Lecturas.leerString();
        return new Alumnos(viveCon, carrera, cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
    }

    public static Personal crearPersonal()
    {
        String cve, nom, primerAp, segundoAp, otras;
        char sexo, estatus;
        boolean desnutricion, sobrepeso, alergias, obesidad, diabetes;

        // Lógica para la lectura de los datos del Personal
        System.out.print("Ingrese la clave del personal: ");
        cve = Lecturas.leerString();
        System.out.print("Ingrese el nombre del personal: ");
        nom = Lecturas.leerString();
        System.out.print("Ingrese el primer apellido del personal: ");
        primerAp = Lecturas.leerString();
        System.out.print("Ingrese el segundo apellido del personal: ");
        segundoAp = Lecturas.leerString();
        System.out.print("Ingrese el sexo del personal (M/F): ");
        sexo = Lecturas.leerChar();
        System.out.print("Ingrese el estatus del personal (B/T): ");
        estatus = Lecturas.leerChar();
        System.out.print("Tienes desnutricion(true/false): ");
        desnutricion = Lecturas.leerBoolean();
        System.out.print("Tienes spbrepeso(true/false): ");
        sobrepeso = Lecturas.leerBoolean();
        System.out.print("Tienes alergias(true/false): ");
        alergias = Lecturas.leerBoolean();
        System.out.print("Tienes obesidad(true/false): ");
        obesidad = Lecturas.leerBoolean();
        System.out.print("Tienes diabetes(true/false): ");
        diabetes = Lecturas.leerBoolean();
        System.out.println("Otros padecimientos: ");
        otras = Lecturas.leerString();
        return new Personal(estatus, cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
    }

    public static String consultas(DatosGenerales[] datos, int opc2, String[] mnu2)
    {
        String s = "";

        try
        {
            if (opc2 == 1)
            {
                System.out.printf("%-10s | %-20s | %-15s | %-10s | %-10s | %-5s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s\n",
                        "Clave", "Nombre", "Primer Ap.", "Segundo Ap.", "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obesidad", "Diabetes", "Otros", "ViveCon", "Carrera");
            } else
            {
                if (opc2 == 2)
                {
                    System.out.printf("%-10s | %-20s | %-15s | %-10s | %-10s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s\n", "Clave", "Nombre", "Primer Ap.", "Segundo Ap.", "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obesidad", "Diabetes", "Otros", "Estatus");
                }
            }

            for (int i = 0; i < datos.length; i++)
            {
                if (opc2 == 1 && datos[i] instanceof Alumnos)
                {
                    s += datos[i].toString();
                } else
                {
                    if (opc2 == 2 && datos[i] instanceof Personal)
                    {
                        s += datos[i].toString();
                    }
                }
            }
        } catch (Exception e)
        {
            s = "No hay datos para mostrar " + mnu2[opc2 - 1];
        }

        return s;
    }

    public static void modificarAlumno(DatosGenerales[] datos, String cve)
    {
        String[] mnu =
        {
            "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obesidad", "Diabetes", "Otros", "Vive con", "Carrera"
        };

        try
        {
            for (int i = 0; i < datos.length; i++)
            {
                if (cve.equals(datos[i].getCve()) && datos[i] instanceof Alumnos)
                {
                    int opc = Manipulacion.pintaMenu(mnu, "Modificaciones Alumnos");

                    switch (opc)
                    {
                        case 1:
                            System.out.println("Ingrese el sexo del Alumno (M/F)");
                            char sexo = Lecturas.leerChar();
                            datos[i].setSexo(sexo);
                            break;
                        case 2:
                            System.out.println("Tiene desnutricion (true/false):");
                            boolean desnutricion = Lecturas.leerBoolean();
                            datos[i].setDesnutricion(desnutricion);
                            break;
                        case 3:
                            System.out.println("Tiene sobrepeso (true/false):");
                            boolean sobrepeso = Lecturas.leerBoolean();
                            datos[i].setSobrepeso(sobrepeso);
                            break;
                        case 4:
                            System.out.println("Tienes alergias(TRUE/FALSE): ");
                            boolean alergias = Lecturas.leerBoolean();
                            datos[i].setAlergias(alergias);
                            break;
                        case 5:
                            System.out.println("Tienes obesidad(TRUE/FALSE): ");
                            boolean obesidad = Lecturas.leerBoolean();
                            datos[i].setObesidad(obesidad);
                            break;
                        case 6:
                            System.out.println("Tienes diabetes(TRUE/FALSE): ");
                            boolean diabetes = Lecturas.leerBoolean();
                            datos[i].setDiabetes(diabetes);
                            break;
                        case 7:
                            System.out.println("Otros padecimientos: ");
                            String otras = Lecturas.leerString();
                            datos[i].setOtras(otras);
                            break;
                        case 8:
                            System.out.println("Selecciona el tipo de convivencia del alumno:");
                            System.out.println("1. Mama y Papa");
                            System.out.println("2. Solo Mama");
                            System.out.println("3. Solo Papa");
                            System.out.println("4. Otros");
                            int tipoConvivencia = Lecturas.leerEntero(true);
                            ((Alumnos) datos[i]).setViveCon(tipoConvivencia);
                            break;
                        case 9:
                            System.out.println("Selecciona la carrera del alumno:");
                            System.out.println("1. Ingeniería en Computación");
                            System.out.println("2. Ingeniería en Plásticos");
                            System.out.println("3. Ingeniería en Producción Industrial");
                            System.out.println("4. Ingeniería en Software");
                            System.out.println("5. Ingeniería Mecánica");
                            System.out.println("6. Licenciatura de Seguridad Ciudadana");

                            int carrera = Lecturas.leerEntero(true);
                            ((Alumnos) datos[i]).setCarrera(carrera);
                            break;
                        default:
                            System.out.print("Opcion incorrecta ");
                    }
                }
            }
        } catch (Exception e)
        {
            System.out.println("No se encontro el ID o el ID no es de un Alumno");
        }
    }

    public static void modificarPersonal(DatosGenerales[] datos, String cve)
    {

        String[] mnu2 =
        {
            "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obesidad", "Diabetes", "Otros", "Estatus"
        };

        try
        {
            for (int i = 0; i < datos.length; i++)
            {
                if (cve.equals(datos[i].getCve()) && datos[i] instanceof Personal)
                {
                    int opc = Manipulacion.pintaMenu(mnu2, "Modificaciones Personal");

                    switch (opc)
                    {
                        case 1:
                            System.out.println("Ingrese el sexo del Personal (M/F)");
                            char sexo = Lecturas.leerChar();
                            datos[i].setSexo(sexo);
                            break;
                        case 2:
                            System.out.println("Tiene desnutricion (true/false):");
                            boolean desnutricion = Lecturas.leerBoolean();
                            datos[i].setDesnutricion(desnutricion);
                            break;
                        case 3:
                            System.out.println("Tiene sobrepeso (true/false):");
                            boolean sobrepeso = Lecturas.leerBoolean();
                            datos[i].setSobrepeso(sobrepeso);
                            break;
                        case 4:
                            System.out.println("Tienes alergias(TRUE/FALSE): ");
                            boolean alergias = Lecturas.leerBoolean();
                            datos[i].setAlergias(alergias);
                            break;
                        case 5:
                            System.out.println("Tienes obesidad(TRUE/FALSE): ");
                            boolean obesidad = Lecturas.leerBoolean();
                            datos[i].setObesidad(obesidad);
                            break;
                        case 6:
                            System.out.println("Tienes diabetes(TRUE/FALSE): ");
                            boolean diabetes = Lecturas.leerBoolean();
                            datos[i].setDiabetes(diabetes);
                            break;
                        case 7:
                            System.out.println("Otros padecimientos: ");
                            String otras = Lecturas.leerString();
                            datos[i].setOtras(otras);
                            break;
                        case 8:
                            System.out.print("Ingrese el estatus del personal (B/T): ");
                            char estatus = Lecturas.leerChar();
                            ((Personal) datos[i]).setEstatus(estatus);
                            break;
                        default:
                            System.out.print("Opcion incorrecta ");
                    }
                }

            }
        } catch (Exception e)
        {
            System.out.println("No se encontro el ID o el ID no es de un Personal");
        }
    }

    public static HistorialClinico[][] insertaHistorialClinico(HistorialClinico[][] historiales, HistorialClinico obj)
    {

        if (historiales == null)
        {
            historiales = new HistorialClinico[1][1];
            historiales[0][0] = obj;
        } else
        {
            HistorialClinico nuevo[] = new HistorialClinico[historiales[historiales.length - 1].length + 1];
            System.arraycopy(historiales[historiales.length - 1], 0, nuevo, 0, historiales[historiales.length - 1].length);
            nuevo[historiales[historiales.length - 1].length] = obj;
            historiales[historiales.length - 1] = nuevo;
        }

        return historiales;
    }

    public static HistorialClinico[][] insertaHistorialRenglon(HistorialClinico[][] historiales)
    {
        if (historiales == null)
        {
            historiales = new HistorialClinico[1][];
        } else
        {
            HistorialClinico nuevo[][] = new HistorialClinico[historiales.length + 1][];
            for (int i = 0; i < historiales.length; i++)
            {
                nuevo[i] = historiales[i];
            }
            historiales = nuevo;
        }

        return historiales;
    }

    public static HistorialClinico[][] insertaHistorialColumna(HistorialClinico[][] historiales, HistorialClinico obj, int p)
    {
        if (historiales[p] == null)
        {
            historiales[p] = new HistorialClinico[1];
            historiales[p][0] = obj;

        } else
        {
            HistorialClinico nuevo[] = new HistorialClinico[historiales[p].length + 1];
            System.arraycopy(historiales[p], 0, nuevo, 0, historiales[p].length);
            nuevo[historiales[p].length] = obj;
            historiales[p] = nuevo;
        }

        return historiales;
    }

    public static HistorialClinico creaHistorial()
    {
        System.out.println("Padecimientos: " + "\n");
        String padecimientoAct = Lecturas.leerString();

        System.out.println("Antecedentes: " + "\n");
        String antecedentesPer = Lecturas.leerString();

        System.out.println("Medicamento: " + "\n");
        String medicamento = Lecturas.leerString();

        System.out.println("Plan de Tratamiento: " + "\n");
        String planTratamiento = Lecturas.leerString();

        System.out.println("Fecha: " + "\n");
        Date fecha = new Date();
        System.out.println(fecha);
        
        System.out.println("Fecha: " + fecha.getDate() + "Dia: " + fecha.getDay()+ "Hora: " + fecha.getHours() + "Minutos: " + fecha.getMinutes());

        return new HistorialClinico(padecimientoAct, antecedentesPer, medicamento, planTratamiento, fecha);
    }

public static int buscarPosicion(DatosGenerales[] datos, String cve)
    {

        try
        {
            for (int i = 0; i < datos.length; i++)
            {
                if (cve.equals(datos[i].getCve()))
                {
                    return i;
                }
            }
            System.out.println("No se encontraron coincidencias en la clavle del Alumno/Personal");
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
        return -1;
    }

    public static void retornarHombres(DatosGenerales[] datos)
    {

        try
        {
            System.out.println("========Hombres========");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].getSexo() == 'm' || datos[i].getSexo() == 'M')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Hombres");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarMujeres(DatosGenerales[] datos)
    {

        try
        {
            System.out.println("========Mujeres========");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].getSexo() == 'f' || datos[i].getSexo() == 'F')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Mujeres");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarAlergias(DatosGenerales[] datos)
    {

        try
        {
            System.out.println("========Alergias========");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isAlergias() == true)
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal con alergias");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarSobrepeso(DatosGenerales[] datos)
    {

        try
        {
            System.out.println("========Sobrepeso========");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isSobrepeso() == true)
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal con sobrepeso");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarDiabetes(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("========Diabetes========");

            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isDiabetes() == true)
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal con diabetes");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarDesnutricion(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("========Desnutrición========");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isDesnutricion() == true)
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal con desnutricion");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarObesidad(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("========Obesidad========");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isObesidad() == true)
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal con obesidad");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarOtros(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("========Otros========");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isObesidad() == true)
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal con diabetes");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarHombresConAlergias(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Hombres con Alergias======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isAlergias() == true && datos[i].getSexo() == 'm' || datos[i].getSexo() == 'M')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Hombres con alergias");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarHombresConSobrepeso(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Hombres con Sobrepeso======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].getSexo() == 'm' || datos[i].getSexo() == 'M' && datos[i].isSobrepeso() == true)
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Hombres con sobrepeso");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarHombresConDiabetes(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Hombres con Diabetes======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isDiabetes() == true && datos[i].getSexo() == 'm' || datos[i].getSexo() == 'M')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Hombres con diabetes");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarHombresConDesnutricion(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Hombres con Desnutricion======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isDesnutricion() == true && datos[i].getSexo() == 'm' || datos[i].getSexo() == 'M')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Hombres con desnutricion");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarHombresConObesidad(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Hombres con Obesidad======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isObesidad() == true && datos[i].getSexo() == 'm' || datos[i].getSexo() == 'M')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Hombres con obesidad");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarHombresConOtros(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Hombres con Otros======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].getOtras() != null && datos[i].getSexo() == 'm' || datos[i].getSexo() == 'M')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Hombres con otros");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarHombresConMenorFrecuencia(DatosGenerales[] datos, HistorialClinico[][] historiales)
    {
        try
        {
            int minLongitud = Integer.MAX_VALUE;  

            if (historiales != null)
            {
                for (int i = 0; i < historiales.length; i++)
                {
                    if (historiales[i] != null && historiales[i].length < minLongitud)
                    {
                        minLongitud = historiales[i].length;
                    }
                }
            }

            for (int i = 0; i < historiales.length; i++)
            {
                if (historiales[i].length == minLongitud)
                {
                    System.out.println(datos[i].toString());
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarHombresConMayorFrecuencia(HistorialClinico[][] historiales, DatosGenerales[] datos)
    {
        try
        {
            int longitudMaxima = 0;

            System.out.println("La persona(s) con mas historiales clinicos es: ");

            if (historiales != null)
            {
                for (int i = 0; i < historiales.length; i++)
                {
                    if (historiales[i] != null && historiales[i].length > longitudMaxima)
                    {
                        longitudMaxima = historiales[i].length;
                    }
                }
            }

            for (int i = 0; i < historiales.length; i++)
            {
                if (historiales[i].length == longitudMaxima)
                {
                    System.out.println(datos[i].toString());
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }
    public static void retornarMujeresConAlergias(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Mujeres con Alergias======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isAlergias() == true && datos[i].getSexo() == 'f' || datos[i].getSexo() == 'F')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Mujeres con alergias");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarMujeresConSobrepeso(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Mujeres con Sobrepeso======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].getSexo() == 'f' || datos[i].getSexo() == 'F' && datos[i].isSobrepeso() == true)
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Mujeres con sobrepeso");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarMujeresConDiabetes(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Mujeres con Diabetes======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isDiabetes() == true && datos[i].getSexo() == 'f' || datos[i].getSexo() == 'F')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Mujeres con diabetes");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarMujeresConDesnutricion(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Mujeres con Desnutricion======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isDesnutricion() == true && datos[i].getSexo() == 'f' || datos[i].getSexo() == 'F')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Mujeres con desnutricion");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarMujeresConObesidad(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Mujeres con Obesidad======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].isObesidad() == true && datos[i].getSexo() == 'f' || datos[i].getSexo() == 'F')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Mujeres con obesidad");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarMujeresConOtros(DatosGenerales[] datos)
    {
        try
        {
            System.out.println("=======Mujeres con Otros======");
            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i].getOtras() != null && datos[i].getSexo() == 'f' || datos[i].getSexo() == 'F')
                {
                    System.out.println("-----------------------------------------");
                    System.out.println(datos[i].toString() + "\n");
                } else
                {
                    System.out.println("No hay datos de Alumnos/Personal Mujeres con otros");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarMujeresConMenorFrecuencia(DatosGenerales[] datos, HistorialClinico[][] historiales)
    {
        try
        {
            int minLongitud = Integer.MAX_VALUE;  

            if (historiales != null)
            {
                for (int i = 0; i < historiales.length; i++)
                {
                    if (historiales[i] != null && historiales[i].length < minLongitud)
                    {
                        minLongitud = historiales[i].length;
                    }
                }
            }

            for (int i = 0; i < historiales.length; i++)
            {
                if (historiales[i].length == minLongitud && datos[i].getSexo() == 'f' || datos[i].getSexo() == 'F')
                {
                    System.out.println(datos[i].toString());
                }else
                {
                    System.out.println("No se considera que hay datos menores");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    public static void retornarMujeresConMayorFrecuencia(HistorialClinico[][] historiales, DatosGenerales[] datos)
    {
        try
        {
            int longitudMaxima = 0;

            System.out.println("La persona(s) con mas historiales clinicos es: ");

            if (historiales != null)
            {
                for (int i = 0; i < historiales.length; i++)
                {
                    if (historiales[i] != null && historiales[i].length > longitudMaxima)
                    {
                        longitudMaxima = historiales[i].length;
                    }
                }
            }

            for (int i = 0; i < historiales.length; i++)
            {
                if (historiales[i].length == longitudMaxima && datos[i].getSexo() =='m' || datos[i].getSexo() == 'M')
                {
                    System.out.println(datos[i].toString());
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }

    
//    public static void reportes(DatosGenerales[] datos)
//    {
//        System.out.println("Reportes de Hombres: ");
//        Manipulacion.retornarHombres(datos);
//
//        System.out.println("Reportes de Mujeres: ");
//        Manipulacion.retornarMujeres(datos);
//
//        System.out.println("Reportes de Alergias: ");
//        Manipulacion.retornarAlergias(datos);
//
//        System.out.println("Reportes de Sobrepeso: ");
//        Manipulacion.retornarSobrepeso(datos);
//
//        System.out.println("Reportes de Diabetes: ");
//        Manipulacion.retornarDiabetes(datos);
//
//        System.out.println("Reportes de Desnutricion: ");
//        Manipulacion.retornarDesnutricion(datos);
//
//        System.out.println("Reportes de Obesidad: ");
//        Manipulacion.retornarObesidad(datos);
//
//        System.out.println("Reportes de Otros: ");
//        Manipulacion.retornarOtros(datos);
//    }
}
