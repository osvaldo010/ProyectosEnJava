/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

import cjb.ci.Mensaje;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class RepDesnAlum extends javax.swing.JFrame
{

    /**
     * Creates new form RepAlumHom
     */
    public RepDesnAlum()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        iconEd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        almsH = new javax.swing.JTable();
        pdfGenerate = new javax.swing.JButton();
        pdfAbrir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("General");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowActivated(java.awt.event.WindowEvent evt)
            {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(158, 188, 222));

        titulo.setFont(new java.awt.Font("Open Sans Light", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Alumnos con Desnutrición");

        javax.swing.GroupLayout iconEdLayout = new javax.swing.GroupLayout(iconEd);
        iconEd.setLayout(iconEdLayout);
        iconEdLayout.setHorizontalGroup(
            iconEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        iconEdLayout.setVerticalGroup(
            iconEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(iconEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(iconEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        almsH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "CVE", "Nombre Completo", "Carrera", "Convivencia"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        almsH.setShowGrid(true);
        jScrollPane1.setViewportView(almsH);
        if (almsH.getColumnModel().getColumnCount() > 0)
        {
            almsH.getColumnModel().getColumn(0).setResizable(false);
            almsH.getColumnModel().getColumn(0).setPreferredWidth(10);
            almsH.getColumnModel().getColumn(1).setResizable(false);
            almsH.getColumnModel().getColumn(1).setPreferredWidth(120);
            almsH.getColumnModel().getColumn(2).setResizable(false);
            almsH.getColumnModel().getColumn(2).setPreferredWidth(50);
            almsH.getColumnModel().getColumn(3).setResizable(false);
            almsH.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        pdfGenerate.setText("Generar PDF");
        pdfGenerate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pdfGenerateActionPerformed(evt);
            }
        });

        pdfAbrir.setText("Abrir PDF");
        pdfAbrir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pdfAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pdfGenerate)
                        .addGap(18, 18, 18)
                        .addComponent(pdfAbrir)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pdfGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(pdfAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pdfGenerateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pdfGenerateActionPerformed
    {//GEN-HEADEREND:event_pdfGenerateActionPerformed
        Date fecha = new Date();
        String fechaString = fecha.toString();
        PlantillaPdf4 plantilla = new PlantillaPdf4("Reportes Desnutricion Alumnos", fechaString);
        plantilla.crearPlantilla(SelectRegistro.datos, titulo, 1);
    }//GEN-LAST:event_pdfGenerateActionPerformed

    public void abrir(String s)
    {
        try
        {
            File path = new File(s + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception e)
        {
            Mensaje.error(this, "Error... " + e);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try
        {
            SelectRegistro.datos = (DatosGenerales[]) ManipulacionArchivos.carga(this, "Datos.dat");

            DefaultTableModel modelo = (DefaultTableModel) almsH.getModel();
            DatosGenerales[] dat = SelectRegistro.datos;

            for (int i = 0; i < dat.length; i++)
            {
                if (dat[i] instanceof Alumnos)
                {
                    if (dat[i].isDesnutricion() == true)
                    {
                        String cve = dat[i].getCve();
                        String nomC = dat[i].getNom() + "\n" + dat[i].getPrimerAp() + "\n" + dat[i].getSegundoAp();
                        String carr = null;
                        switch (((Alumnos) dat[i]).getCarrera())
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
                        switch (((Alumnos) dat[i]).getViveCon())
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

                        String[] fila =
                        {
                            cve, nomC, carr, conv
                        };
                        modelo.addRow(fila);
                    }
                }
            }
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowActivated
    {//GEN-HEADEREND:event_formWindowActivated
        JPanelImage iconoA = new JPanelImage(iconEd, "img/restaurante.png");
        iconEd.add(iconoA).repaint();
        iconEd.setOpaque(false);
        iconEd.setBorder(null);
        iconEd.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_formWindowActivated

    private void pdfAbrirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pdfAbrirActionPerformed
    {//GEN-HEADEREND:event_pdfAbrirActionPerformed
        abrir("reportes/Reportes " + titulo.getText());
    }//GEN-LAST:event_pdfAbrirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        try
        {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex)
        {
            System.err.println("Failed to initialize LaF");
        }

        UIManager.put("TextComponent.arc", 15);
        UIManager.put("Button.arc", 35);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RepDesnAlum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable almsH;
    private javax.swing.JPanel iconEd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pdfAbrir;
    private javax.swing.JButton pdfGenerate;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
