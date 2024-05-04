/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Date;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author josee
 */
public class Manipulacion
{

    public static int pintaMenu(String[] mnu, String s)
    {
        System.out.println("==Menu" + s + "===");
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println((i + 1) + ".-" + mnu[i]);;
        }
        System.out.println("Elige una opcion:");
        return Lecturas.leerEntero(true);
    }

    public static Alumnos crearAlumno()
    {
        String cve, nom, primerAp, segundoAp;
        char sexo;
        boolean desnutricion, sobrepeso, alergias, obesidad, diabetes;
        int viveCon = 0;
        int carrera= 0;
        boolean opcionValida=false;
        System.out.println("Ingresa la clave del alumno:");
        cve = Lecturas.leerString();
        System.out.println("Ingresa el nombre del alumno:");
        nom = Lecturas.leerString();
        System.out.println("Ingresa el primer apellido del alumno:");
        primerAp = Lecturas.leerString();
        System.out.println("Ingresa el segundo apellido del alumno:");
        segundoAp = Lecturas.leerString();
        do
        {
            System.out.println("Ingresa el sexo del alumno (M/F):");
            sexo = Character.toUpperCase(Lecturas.leerChar()); // Leer el carácter y convertirlo a mayúscula
            if (sexo != 'M' && sexo != 'F')
            {
                System.out.println("Por favor, ingresa M o F para el sexo.");
            }
        } while (sexo != 'M' && sexo != 'F');

        System.out.println("Tiene desnutricion (true/false):");
        desnutricion = Lecturas.leerBoolean();
        System.out.println("Tiene sobrepeso (true/false):");
        sobrepeso = Lecturas.leerBoolean();
        while (!opcionValida) {
        System.out.println("Selecciona el tipo de convivencia del alumno:");
        System.out.println("1. Mama y Papa");
        System.out.println("2. Solo Mama");
        System.out.println("3. Solo Papa");
        System.out.println("4. Otros");
        viveCon = Lecturas.leerEntero(true);
        if (viveCon >= 1 && viveCon <= 4) {
            opcionValida = true;
        } else {
            System.out.println("Opción no válida. Por favor, elige un tipo de convivencia válido.");
        }
        }

        switch (viveCon)
        {
            case 1:
                viveCon = 1; // Ejemplo de asignación para "Mama y Papa"
                break;
            case 2:
                viveCon = 2; // Asignación para "Solo Mama"
                break;
            // Otros casos...
            default:
                viveCon = 4; // Por defecto, se asigna "Otros"
                break;
        }
        while (!opcionValida) {
        System.out.println("Selecciona la carrera del alumno:");
        System.out.println("1. Ingeniería en Computación");
        System.out.println("2. Ingeniería en Plásticos");
        System.out.println("3. Ingeniería en Producción Industrial");
        System.out.println("4. Ingeniería en Software");
        System.out.println("5. Ingeniería Mecánica");
        System.out.println("6. Licenciatura de Seguridad Ciudadana");

        carrera = Lecturas.leerEntero(true);
        if (carrera >= 1 && carrera <= 6) {
            opcionValida = true;
        } else {
            System.out.println("Opción no válida. Por favor, elige una carrera válida.");
        }
        }
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

        return new Alumnos(viveCon, carrera, cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes);
    }

    public static Personal crearPersonal()
    {
        String cve, nom, primerAp, segundoAp;
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

        return new Personal(estatus, cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes);
    }

    public static Alumnos[] modificarAlumnos(Alumnos[] alumnos, String cve)
    {
        for (int i = 0; i < alumnos.length; i++)
        {
            if (alumnos[i].getCve().equals(cve))
            {
                System.out.println("Datos del alumno con clave " + cve + ":");
                System.out.println("Clave: " + alumnos[i].getCve());
                System.out.println("Nombre: " + alumnos[i].getNom());
                System.out.println("Primer Apellido: " + alumnos[i].getPrimerAp());
                System.out.println("Segundo Apellido: " + alumnos[i].getSegundoAp());
                System.out.println("Sexo: " + alumnos[i].getSexo());
                System.out.println("Desnutrición: " + alumnos[i].isDesnutricion());
                System.out.println("Sobrepeso: " + alumnos[i].isSobrepeso());
                System.out.println("Alergias: " + alumnos[i].isAlergias());
                System.out.println("Obesidad: " + alumnos[i].isObesidad());
                System.out.println("Diabetes: " + alumnos[i].isDiabetes());
                System.out.println("Vive con: " + alumnos[i].getViveCon());
                System.out.println("Carrera: " + alumnos[i].getCarrera());
                System.out.println("Selecciona que dato deseas moficar");
                System.out.println("1.Sexo");
                System.out.println("2.Estado de salud");
                System.out.println("3.Carrera");
                System.out.println("4.Tipo de convivencia");

                int opcion = Lecturas.leerEntero(true);
                switch (opcion)
                {
                    case 1:
                        System.out.println("Ingresa el nuevo sexo(M/F)");
                        char nuevoSexo = Lecturas.leerChar();
                        alumnos[i].setSexo(nuevoSexo);
                        break;
                    case 2:
                        System.out.println("Selecciona que atributo de salud deseas modificar");
                        System.out.println("1.Desnutricion");
                        System.out.println("2.sobrepeso");
                        System.out.println("3.Alergias");
                        System.out.println("4.Obesidad");
                        System.out.println("5.Diabetes");

                        int opcionSalud = Lecturas.leerEntero(true);
                        switch (opcionSalud)
                        {
                            case 1:
                                System.out.println("¿El alumno tiene desnutricion?(true/false):");
                                boolean nuevaDesnutricion = Lecturas.leerBoolean();
                                alumnos[i].setDesnutricion(nuevaDesnutricion);
                                break;
                            case 2:
                                System.out.println("¿El alumno tiene sobrepeso?(true/false):");
                                boolean nuevoSobrepeso = Lecturas.leerBoolean();
                                alumnos[i].setSobrepeso(nuevoSobrepeso);
                                break;
                            case 3:
                                System.out.println("¿El alumno tiene Alergias?");
                                boolean nuevoAlergias = Lecturas.leerBoolean();
                                alumnos[i].setAlergias(nuevoAlergias);
                                break;
                            case 4:
                                System.out.println("¿El alumno tiene obesidad?");
                                boolean nuevaObesidad = Lecturas.leerBoolean();
                                alumnos[i].setObesidad(nuevaObesidad);
                                break;
                            case 5:
                                System.out.println("¿El alumno tiene diabetes?");
                                boolean nuevadiabetes = Lecturas.leerBoolean();
                                alumnos[i].setDiabetes(nuevadiabetes);
                                break;

                            default:
                                System.out.println("Opcion no valida");
                        }
                        break;
                    case 3:
                        // Modificación de la carrera del alumno
                        System.out.println("Selecciona la nueva carrera:");
                        System.out.println("1. Ingeniería en Computación");
                        System.out.println("2. Ingeniería en Plásticos");
                        System.out.println("3. Ingeniería en Producción Industrial");
                        System.out.println("4. Ingeniería en Software");
                        System.out.println("5. Ingeniería Mecánica");
                        System.out.println("6. Licenciatura de Seguridad Ciudadana");

                        int nuevaCarrera = Lecturas.leerEntero(true);

                        switch (nuevaCarrera)
                        {
                            case 1:
                                alumnos[i].setCarrera(1); // Ingeniería en Computación
                                break;
                            case 2:
                                alumnos[i].setCarrera(2); // Ingeniería en Plásticos
                                break;
                            case 3:
                                alumnos[i].setCarrera(3); // Ingeniería en Producción Industrial
                                break;
                            case 4:
                                alumnos[i].setCarrera(4); // Ingeniería en Software
                                break;
                            case 5:
                                alumnos[i].setCarrera(5); // Ingeniería Mecánica
                                break;
                            case 6:
                                alumnos[i].setCarrera(6); // Licenciatura de Seguridad Ciudadana
                                break;
                            default:
                                System.out.println("Opción no válida para carrera. No se realizó la modificación.");
                        }
                        break;
                    case 4:
                        System.out.println("Selecciona el tipo de convivencia del alumno:");
                        System.out.println("1. Mama y Papa");
                        System.out.println("2. Solo Mama");
                        System.out.println("3. Solo Papa");
                        System.out.println("4. Otros");
                        int tipoConvivencia = Lecturas.leerEntero(true);

                        switch (tipoConvivencia)
                        {
                            case 1:
                                alumnos[i].setViveCon(1); // Ejemplo de asignación para "Mama y Papa"
                                break;
                            case 2:
                                alumnos[i].setViveCon(2); // Asignación para "Solo Mama"
                                break;
                            // Otros casos...
                            default:
                                System.out.println("Opción no válida para tipo de convivencia. No se realizó la modificación.");
                                alumnos[i].setViveCon(4); // Por defecto, se asigna "Otros"
                                break;
                        }
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            }
        }
        return alumnos;
    }

    public static Alumnos[] insertaAlumno(Alumnos[] alumnos, Alumnos nuevoAlumno)
    {
        // Método para insertar un nuevo alumno

        if (alumnos == null)
        {
            // Si la lista de alumnos es nula, se crea una nueva lista y se agrega el nuevo alumno
            alumnos = new Alumnos[1];
        } else
        {
            // Si la lista de alumnos no está vacía, se redimensiona la lista y se agrega el nuevo alumno al final
            Alumnos[] temp = new Alumnos[alumnos.length + 1];
            System.arraycopy(alumnos, 0, temp, 0, alumnos.length);
            alumnos = temp;
        }
        alumnos[alumnos.length - 1] = nuevoAlumno;

        return alumnos; // Devuelve la lista de alumnos actualizada
    }

    public static Personal[] insertaPersonal(Personal[] personal, Personal nuevoPersonal)
    {
        // Método para insertar un nuevo miembro del personal

        if (personal == null)
        {
            // Si la lista de personal es nula, se crea una nueva lista y se agrega el nuevo miembro del personal
            personal = new Personal[1];
            personal[0] = nuevoPersonal;
        } else
        {
            // Si la lista de personal no está vacía, se redimensiona la lista y se agrega el nuevo miembro del personal al final
            Personal[] temp = new Personal[personal.length + 1];
            System.arraycopy(personal, 0, temp, 0, personal.length);
            temp[temp.length - 1] = nuevoPersonal;
            personal = temp;
        }

        return personal; // Devuelve la lista de personal actualizada
    }

    public static void consultaAlumnos(Alumnos[] alumnos)
    {
        System.out.println("==== Lista de Alumnos Registrados ====");

        if (alumnos != null && alumnos.length > 0)
        {
            // Encabezados para la información de los alumnos
            // Aquí se muestran todos los atributos disponibles en la clase Alumnos
            System.out.printf("%-10s | %-20s | %-15s | %-10s | %-10s | %-5s | %-8s | %-8s | %-8s | %-8s | %-8s\n",
                    "Clave", "Nombre", "Primer Ap.", "Segundo Ap.", "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obesidad", "Diabetes", "Carrera");

            for (Alumnos alumno : alumnos)
            {
                // Mostrar la información de cada alumno
                System.out.printf("%-10s | %-20s | %-15s | %-10s | %-5s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s\n",
                        alumno.getCve(), alumno.getNom(), alumno.getPrimerAp(), alumno.getSegundoAp(), alumno.getSexo(),
                        alumno.isDesnutricion(), alumno.isSobrepeso(), alumno.isAlergias(), alumno.isObesidad(), alumno.isDiabetes(), alumno.getCarrera());
            }
        } else
        {
            // Mensaje si no hay alumnos registrados
            System.out.println("No hay alumnos registrados.");
        }
    }

    public static void consultaPersonal(Personal[] personal)
    {
        // Método para mostrar información del personal

        System.out.println("==== Lista de Personal Registrado ====");

        if (personal != null && personal.length > 0)
        {
            // Encabezados para la información del personal
            // Puedes ajustar los encabezados según la información que desees mostrar
            System.out.printf("%-10s | %-20s | %-15s | %-10s | %-10s\n", "Clave", "Nombre", "Primer Ap.", "Segundo Ap.", "Estatus");

            for (Personal individuo : personal)
            {
                // Mostrar la información de cada miembro del personal
                System.out.printf("%-10s | %-20s | %-15s | %-10s | %-10s\n",
                        individuo.getCve(), individuo.getNom(), individuo.getPrimerAp(), individuo.getSegundoAp(), individuo.getEstatus());
            }
        } else
        {
            // Mensaje si no hay miembros del personal registrados
            System.out.println("No hay miembros del personal registrados.");
        }
    }

    public static void guardarDatos(DatosGenerales[] datos, String nombreArchivo)
    {
        // Método para guardar datos en un archivo

        try ( FileOutputStream fileOut = new FileOutputStream(nombreArchivo);  ObjectOutputStream objectOut = new ObjectOutputStream(fileOut))
        {

            objectOut.writeObject(datos); // Guardar el arreglo de DatosGenerales

            System.out.println("Datos guardados en " + nombreArchivo);

        } catch (IOException ex)
        {
            System.out.println("Error al guardar los datos en el archivo " + nombreArchivo);
            ex.printStackTrace();
        }

    }

    public static String solicitarClaveAlumno()
    {
        System.out.println("Ingresa la clave del alumno que deseas modificar:");
        return Lecturas.leerString();
    }

    // Método para buscar un alumno por clave
    public static boolean buscarAlumnoPorClave(Alumnos[] alumnos, String clave)
    {
        for (int i = 0; i < alumnos.length; i++)
        {
            if (alumnos[i].getCve().equals(clave))
            {
                return true; // Se encontró la clave del alumno
            }
        }
        return false; // No se encontró la clave del alumno
    }
    
    public static boolean buscarPersonalPorClave(Personal[] personal, String clave)
    {
        for (int i = 0; i < personal.length; i++)
        {
            if (personal[i].getCve().equals(clave))
            {
                return true; // Se encontró la clave del alumno
            }
        }
        return false; // No se encontró la clave del alumno
    }
    
    public static int buscarAlumnoPorClaveInt(Alumnos[] alumnos, String clave)
    {
        for (int i = 0; i < alumnos.length; i++)
        {
            if (alumnos[i].getCve().equals(clave))
            {
                return i; // Se encontró la clave del alumno
            }
        }
        return -1;
    }
    
    public static int buscarPersonalPorClaveInt(Personal[] personal, String clave)
    {
        for (int i = 0; i < personal.length; i++)
        {
            if (personal[i].getCve().equals(clave))
            {
                return i; // Se encontró la clave del alumno
            }
        }
        return -1;
    }

    // Método para realizar modificaciones si la clave del alumno existe
    public static void modificarAlumnoSiExiste(Alumnos[] alumnos, String clave)
    {
        if (buscarAlumnoPorClave(alumnos, clave))
        {
            alumnos = modificarAlumnos(alumnos, clave);
        } else
        {
            System.out.println("La clave del alumno no existe. No se pueden realizar modificaciones.");
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

}
