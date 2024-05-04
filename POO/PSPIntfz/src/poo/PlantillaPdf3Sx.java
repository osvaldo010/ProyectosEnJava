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
public class PlantillaPdf3Sx extends javax.swing.JFrame
{

    String reporte;
    String fecha;
    Document documento;
    Paragraph titulo;
    FileOutputStream archivo;

    public PlantillaPdf3Sx(String reporte, String fecha)
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
            archivo = new FileOutputStream("Reportes " + tituloA.getText() + ".pdf");
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            documento.add(titulo);

            documento.add(new Paragraph("Reportes " + tituloA.getText()));

            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(3);
            tabla.setWidthPercentage(100);

            PdfPCell cve = new PdfPCell(new Phrase("Cve"));
            cve.setBackgroundColor(BaseColor.GREEN);
            PdfPCell nom = new PdfPCell(new Phrase("Nombre"));
            nom.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell estat = new PdfPCell(new Phrase("Estatus"));
            estat.setBackgroundColor(BaseColor.YELLOW);

            tabla.addCell(cve);
            tabla.addCell(nom);
            tabla.addCell(estat);

            for (int i = 0; i < datos.length; i++)
            {
                if (datos[i] instanceof Personal)
                {
                    String est = null;
                    if (((Personal) datos[i]).getEstatus() == 'B')
                    {
                        est = "Base";
                    } else
                    {
                        est = "Temporal";
                    }

                    switch (sx)
                    {
                        case 1:
                            if (datos[i].getSexo() == 'H')
                            {
                                switch (padecimiento)
                                {
                                    case 0:
                                        if (datos[i] instanceof Personal && datos[i].isAlergias() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    case 1:
                                        if (datos[i] instanceof Personal && datos[i].isDesnutricion() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    case 2:
                                        if (datos[i] instanceof Personal && datos[i].isDiabetes() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    case 3:
                                        if (datos[i] instanceof Personal && datos[i].isObesidad() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    case 4:
                                        if (datos[i] instanceof Personal && datos[i].isSobrepeso() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        case 2:
                            if (datos[i].getSexo() == 'M')
                            {
                                switch (padecimiento)
                                {
                                    case 0:
                                        if (datos[i] instanceof Personal && datos[i].isAlergias() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    case 1:
                                        if (datos[i] instanceof Personal && datos[i].isDesnutricion() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    case 2:
                                        if (datos[i] instanceof Personal && datos[i].isDiabetes() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    case 3:
                                        if (datos[i] instanceof Personal && datos[i].isObesidad() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    case 4:
                                        if (datos[i] instanceof Personal && datos[i].isSobrepeso() == true)
                                        {
                                            tabla.addCell(datos[i].getCve());
                                            tabla.addCell(datos[i].getNom() + " " + datos[i].getPrimerAp() + " " + datos[i].getSegundoAp());
                                            tabla.addCell(est);
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        default:
                            break;
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
