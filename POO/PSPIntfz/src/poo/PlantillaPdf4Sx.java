/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import cjb.ci.Mensaje;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Ramirez
 */
public class PlantillaPdf4Sx extends javax.swing.JFrame
{

    String reporte;
    String fecha;
    Document documento;
    Paragraph titulo;
    FileOutputStream archivo;

    public PlantillaPdf4Sx(String reporte, String fecha)
    {
        this.reporte = reporte;
        this.fecha = fecha;

        documento = new Document();
        titulo = new Paragraph("Plantilla Personalizada");
    }

    public void crearPlantilla(DatosGenerales[] datos, JLabel tituloA, int padecimiento, int sx)
    {
        try
        {
            archivo = new FileOutputStream("reportes/Reportes " + tituloA.getText() + ".pdf");
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            documento.add(titulo);

            documento.add(new Paragraph("Reportes " + tituloA.getText()));

            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);

            PdfPCell cve = new PdfPCell(new Phrase("Cve"));
            cve.setBackgroundColor(BaseColor.GREEN);
            PdfPCell nom = new PdfPCell(new Phrase("Nombre"));
            nom.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell carrera = new PdfPCell(new Phrase("Carrera"));
            carrera.setBackgroundColor(BaseColor.GREEN);
            PdfPCell convivencia = new PdfPCell(new Phrase("Convivencia"));
            convivencia.setBackgroundColor(BaseColor.YELLOW);

            tabla.addCell(cve);
            tabla.addCell(nom);
            tabla.addCell(carrera);
            tabla.addCell(convivencia);

            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i] instanceof Alumnos)
                {
                    String carr = null;
                    switch (((Alumnos) datos[i]).getCarrera())
                    {
                        case 0:
                            carr = "Ing. Computación";
                            break;
                        case 1:
                            carr = "Ing. Plásticos";
                            break;
                        case 2:
                            carr = "Ing. Prod. Industrial";
                            break;
                        case 3:
                            carr = "Ing. Software";
                            break;
                        case 4:
                            carr = "Ing. Mecánica";
                            break;
                        case 5:
                            carr = "Lic. S. Ciudadana";
                            break;
                        default:
                            break;
                    }

                    String conv = null;
                    switch (((Alumnos) datos[i]).getCarrera())
                    {
                        case 0:
                            conv = "Mamá y Papá";
                            break;
                        case 1:
                            conv = "Solo mamá";
                            break;
                        case 2:
                            conv = "Solo papá";
                            break;
                        case 3:
                            conv = "Otros";
                            break;
                        default:
                            break;
                    }

                    if (sx == 1)
                    {
                        if (datos[i].getSexo() == 'H')
                        {
                            switch (padecimiento)
                            {
                                case 0:
                                    if (datos[i] instanceof Alumnos && datos[i].isAlergias() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = conv;
                                        tabla.addCell(convi);
                                        String carre = carr;
                                        tabla.addCell(carre);
                                    }
                                    break;
                                case 1:
                                    if (datos[i] instanceof Alumnos && datos[i].isDesnutricion() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = conv;
                                        tabla.addCell(convi);
                                        String carre = carr;
                                        tabla.addCell(carre);
                                    }
                                    break;
                                case 2:
                                    if (datos[i] instanceof Alumnos && datos[i].isDiabetes() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = conv;
                                        tabla.addCell(convi);
                                        String carre = carr;
                                        tabla.addCell(carre);
                                    }
                                    break;
                                case 3:
                                    if (datos[i] instanceof Alumnos && datos[i].isObesidad() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = conv;
                                        tabla.addCell(convi);
                                        String carre = carr;
                                        tabla.addCell(carre);
                                    }
                                    break;
                                case 4:
                                    if (datos[i] instanceof Alumnos && datos[i].isSobrepeso() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = conv;
                                        tabla.addCell(convi);
                                        String carre = carr;
                                        tabla.addCell(carre);
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    } else if (sx == 2)
                    {
                        if (datos[i].getSexo() == 'M')
                        {
                            switch (padecimiento)
                            {
                                case 0:
                                    if (datos[i] instanceof Alumnos && datos[i].isAlergias() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = String.valueOf(((Alumnos) datos[i]).getViveCon());
                                        tabla.addCell(convi);
                                        String carre = String.valueOf(((Alumnos) datos[i]).getCarrera());
                                        tabla.addCell(carre);
                                    }
                                    break;
                                case 1:
                                    if (datos[i] instanceof Alumnos && datos[i].isDesnutricion() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = String.valueOf(((Alumnos) datos[i]).getViveCon());
                                        tabla.addCell(convi);
                                        String carre = String.valueOf(((Alumnos) datos[i]).getCarrera());
                                        tabla.addCell(carre);
                                    }
                                    break;
                                case 2:
                                    if (datos[i] instanceof Alumnos && datos[i].isDiabetes() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = String.valueOf(((Alumnos) datos[i]).getViveCon());
                                        tabla.addCell(convi);
                                        String carre = String.valueOf(((Alumnos) datos[i]).getCarrera());
                                        tabla.addCell(carre);
                                    }
                                    break;
                                case 3:
                                    if (datos[i] instanceof Alumnos && datos[i].isObesidad() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = String.valueOf(((Alumnos) datos[i]).getViveCon());
                                        tabla.addCell(convi);
                                        String carre = String.valueOf(((Alumnos) datos[i]).getCarrera());
                                        tabla.addCell(carre);
                                    }
                                    break;
                                case 4:
                                    if (datos[i] instanceof Alumnos && datos[i].isSobrepeso() == true)
                                    {
                                        tabla.addCell(datos[i].getCve());
                                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                        String convi = String.valueOf(((Alumnos) datos[i]).getViveCon());
                                        tabla.addCell(convi);
                                        String carre = String.valueOf(((Alumnos) datos[i]).getCarrera());
                                        tabla.addCell(carre);
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }
            }
            documento.add(tabla);
            documento.add(new Paragraph("Fecha: " + fecha));

            documento.close();
            Mensaje.exito(this, "Archivo creado correctamente");
        } catch (Exception e)
        {
            Mensaje.error(this, "Error... " + e);
        }
    }
}
