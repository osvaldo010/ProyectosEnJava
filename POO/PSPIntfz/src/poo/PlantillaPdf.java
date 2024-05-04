/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import javax.swing.JOptionPane;
/**
 *
 * @author Estrada
 */
public class PlantillaPdf extends javax.swing.JFrame
{
    String reporte;
    String fecha;
    Document documento;
    Paragraph titulo;
    FileOutputStream archivo;

    public PlantillaPdf(String reporte, String fecha)
    {
        this.reporte = reporte;
        this.fecha = fecha;
        
        documento = new Document();
        titulo = new Paragraph("Plantilla Personalizada");
    }
    
    
    public void crearPlantilla(DatosGenerales[] datos)
    {
        try
        {
            archivo = new FileOutputStream("Reportes Alergias Alumnos" + ".pdf");
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, archivo);
            documento.open();
            titulo.setAlignment(1);
            
            documento.add(titulo);
            
            documento.add(new Paragraph("Reportes de Alumnos con Alergias"));
            
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);
            
            PdfPCell cve = new PdfPCell(new Phrase("Cve"));
            cve.setBackgroundColor(BaseColor.GREEN);
            PdfPCell nom = new PdfPCell(new Phrase("Nombre"));
            nom.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell carrera = new PdfPCell(new Phrase("Carrera"));
            carrera.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell convivencia = new PdfPCell(new Phrase("Convivencia"));
            convivencia.setBackgroundColor(BaseColor.GREEN);
            
            tabla.addCell(cve);
            tabla.addCell(nom);
            tabla.addCell(carrera);
            tabla.addCell(convivencia);
            
            for (int i = 0; i < datos.length; i++)
            {
                tabla.addCell(datos[i].getCve());
                tabla.addCell(datos[i].getNom() +"/"+ datos[i].getPrimerAp() +"/"+ datos[i].getSegundoAp());
                String convi = String.valueOf(((Alumnos) datos[i]).getViveCon());
                tabla.addCell(convi);
                String carre = String.valueOf(((Alumnos)datos[i]).getCarrera());
                tabla.addCell(carre);
            }
            documento.add(tabla);
            documento.add(new Paragraph("Fecha: " + fecha));
            
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo fue creado correctamente");
        } catch (Exception e)
        {
            System.out.println("Error..." + e.getMessage());
        }
    }
    
    
    
    
    
}
