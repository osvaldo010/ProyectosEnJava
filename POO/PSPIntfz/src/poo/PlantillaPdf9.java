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
public class PlantillaPdf9 extends javax.swing.JFrame
{

    String reporte;
    String fecha;
    Document documento;
    Paragraph titulo;
    FileOutputStream archivo;

    public PlantillaPdf9(String reporte, String fecha)
    {
        this.reporte = reporte;
        this.fecha = fecha;

        documento = new Document();
        titulo = new Paragraph("Plantilla Personalizada");
    }

    public void crearPlantilla(DatosGenerales[] datos, JLabel tituloA)
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

            PdfPTable tabla = new PdfPTable(9);
            tabla.setWidthPercentage(100);

            PdfPCell cve = new PdfPCell(new Phrase("Cve"));
            cve.setBackgroundColor(BaseColor.GREEN);
            PdfPCell nom = new PdfPCell(new Phrase("Nombre"));
            nom.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell carrera = new PdfPCell(new Phrase("Carrera"));
            carrera.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell convivencia = new PdfPCell(new Phrase("Convivencia"));
            convivencia.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell alergias = new PdfPCell(new Phrase("Alergias"));
            alergias.setBackgroundColor(BaseColor.GREEN);
            PdfPCell diab = new PdfPCell(new Phrase("Diabetes"));
            diab.setBackgroundColor(BaseColor.GREEN);
            PdfPCell desn = new PdfPCell(new Phrase("Desnutricion"));
            desn.setBackgroundColor(BaseColor.GREEN);
            PdfPCell sP = new PdfPCell(new Phrase("Sobrepeso"));
            sP.setBackgroundColor(BaseColor.GREEN);
            PdfPCell obsd = new PdfPCell(new Phrase("Obesidad"));
            obsd.setBackgroundColor(BaseColor.GREEN);

            tabla.addCell(cve);
            tabla.addCell(nom);
            tabla.addCell(carrera);
            tabla.addCell(convivencia);
            tabla.addCell(alergias);
            tabla.addCell(diab);
            tabla.addCell(desn);
            tabla.addCell(sP);
            tabla.addCell(obsd);

            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i] instanceof Alumnos)
                {
                    String alerg;
                    if (((Alumnos) datos[i]).isAlergias() == true)
                    {
                        alerg = "Si";
                    } else
                    {
                        alerg = "No";
                    }
                    String diabts;
                    if (((Alumnos) datos[i]).isDiabetes() == true)
                    {
                        diabts = "Si";
                    } else
                    {
                        diabts = "No";
                    }
                    String desnut;
                    if (((Alumnos) datos[i]).isDesnutricion() == true)
                    {
                        desnut = "Si";
                    } else
                    {
                        desnut = "No";
                    }
                    String sobP;
                    if (((Alumnos) datos[i]).isSobrepeso() == true)
                    {
                        sobP = "Si";
                    } else
                    {
                        sobP = "No";
                    }
                    String obesidad;
                    if (((Alumnos) datos[i]).isObesidad() == true)
                    {
                        obesidad = "Si";
                    } else
                    {
                        obesidad = "No";
                    }
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

                    if (datos[i] instanceof Alumnos)
                    {
                        tabla.addCell(datos[i].getCve());
                        tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                        tabla.addCell(conv);
                        tabla.addCell(carr);
                        tabla.addCell(alerg);
                        tabla.addCell(diabts);
                        tabla.addCell(desnut);
                        tabla.addCell(sobP);
                        tabla.addCell(obesidad);
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
