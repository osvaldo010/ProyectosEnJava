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
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class InformesMorbilidad extends javax.swing.JFrame
{

    /**
     * Creates new form RepAlumHom
     */
    public InformesMorbilidad()
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
        titulo.setText("Informe de Morbilidad");

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
                "Padecimiento", "Alumnos Hom.", "Alumnos Muj.", "Total Alum.", "Personal Hom.", "Personal Muj.", "Total Pers. ", "Totales"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false
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
            almsH.getColumnModel().getColumn(1).setResizable(false);
            almsH.getColumnModel().getColumn(2).setResizable(false);
            almsH.getColumnModel().getColumn(3).setResizable(false);
            almsH.getColumnModel().getColumn(4).setResizable(false);
            almsH.getColumnModel().getColumn(5).setResizable(false);
            almsH.getColumnModel().getColumn(6).setResizable(false);
            almsH.getColumnModel().getColumn(7).setResizable(false);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pdfGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pdfAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try
        {
            SelectRegistro.datos = (DatosGenerales[]) ManipulacionArchivos.carga(this, "Datos.dat");

            DefaultTableModel modelo = (DefaultTableModel) almsH.getModel();
            DatosGenerales[] dat = SelectRegistro.datos;

            int alumHom = 0;
            int alumMuj = 0;
            int alumTot = 0;
            int persHom = 0;
            int persMuj = 0;
            int persTot = 0;
            int totales;

            String[] alerg = null;
            String[] desn = null;
            String[] diab = null;
            String[] obsd = null;
            String[] sbps = null;
            String[] otros = null;

            for (int i = 0; i < 6; i++)
            {
                for (int j = 0; j < dat.length; j++)
                {
                    switch (i)
                    {
                        case 0:
                            if (dat[i] instanceof Alumnos && dat[i].isAlergias() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Alumnos)
                                {
                                    alumHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Alumnos)
                                {
                                    alumMuj += 1;
                                }

                                alumTot += 1;
                            }

                            if (dat[i] instanceof Personal && dat[i].isAlergias() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Personal)
                                {
                                    persHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Personal)
                                {
                                    persMuj += 1;
                                }

                                persTot += 1;
                            }

                            totales = alumTot + persTot;

                            String aH = String.valueOf(alumHom);
                            String aM = String.valueOf(alumMuj);
                            String aT = String.valueOf(alumTot);
                            String pH = String.valueOf(persHom);
                            String pM = String.valueOf(persMuj);
                            String pT = String.valueOf(persTot);
                            String tot = String.valueOf(totales);

                            alerg = new String[] {"Alergias", aH, aM, aT, pH, pM, pT, tot};

                            break;
                        case 1:

                            alumHom = 0;
                            alumMuj = 0;
                            alumTot = 0;
                            persHom = 0;
                            persMuj = 0;
                            persTot = 0;

                            if (dat[i] instanceof Alumnos && dat[i].isDesnutricion() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Alumnos)
                                {
                                    alumHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Alumnos)
                                {
                                    alumMuj += 1;
                                }

                                alumTot += 1;
                            }

                            if (dat[i] instanceof Personal && dat[i].isDesnutricion() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Personal)
                                {
                                    persHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Personal)
                                {
                                    persMuj += 1;
                                }

                                persTot++;
                            }

                            totales = alumTot + persTot;

                            aH = String.valueOf(alumHom);
                            aM = String.valueOf(alumMuj);
                            aT = String.valueOf(alumTot);
                            pH = String.valueOf(persHom);
                            pM = String.valueOf(persMuj);
                            pT = String.valueOf(persTot);
                            tot = String.valueOf(totales);

                            desn = new String[] {"Desnutrición", aH, aM, aT, pH, pM, pT, tot};

                            break;
                        case 2:

                            alumHom = 0;
                            alumMuj = 0;
                            alumTot = 0;
                            persHom = 0;
                            persMuj = 0;
                            persTot = 0;

                            if (dat[i] instanceof Alumnos && dat[i].isDiabetes() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Alumnos)
                                {
                                    alumHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Alumnos)
                                {
                                    alumMuj += 1;
                                }

                                alumTot += 1;
                            }

                            if (dat[i] instanceof Personal && dat[i].isDiabetes() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Personal)
                                {
                                    persHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Personal)
                                {
                                    persMuj += 1;
                                }

                                persTot += 1;
                            }

                            totales = alumTot + persTot;

                            aH = String.valueOf(alumHom);
                            aM = String.valueOf(alumMuj);
                            aT = String.valueOf(alumTot);
                            pH = String.valueOf(persHom);
                            pM = String.valueOf(persMuj);
                            pT = String.valueOf(persTot);
                            tot = String.valueOf(totales);

                            diab = new String[] {"Diabetes", aH, aM, aT, pH, pM, pT, tot};

                            break;
                        case 3:

                            alumHom = 0;
                            alumMuj = 0;
                            alumTot = 0;
                            persHom = 0;
                            persMuj = 0;
                            persTot = 0;

                            if (dat[i] instanceof Alumnos && dat[i].isObesidad() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Alumnos)
                                {
                                    alumHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Alumnos)
                                {
                                    alumMuj += 1;
                                }

                                alumTot += 1;
                            }

                            if (dat[i] instanceof Personal && dat[i].isObesidad() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Personal)
                                {
                                    persHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Personal)
                                {
                                    persMuj += 1;
                                }

                                persTot += 1;
                            }

                            totales = alumTot + persTot;

                            aH = String.valueOf(alumHom);
                            aM = String.valueOf(alumMuj);
                            aT = String.valueOf(alumTot);
                            pH = String.valueOf(persHom);
                            pM = String.valueOf(persMuj);
                            pT = String.valueOf(persTot);
                            tot = String.valueOf(totales);

                            obsd = new String[] {"Obesidad", aH, aM, aT, pH, pM, pT, tot};
                           

                            break;
                        case 4:

                            alumHom = 0;
                            alumMuj = 0;
                            alumTot = 0;
                            persHom = 0;
                            persMuj = 0;
                            persTot = 0;

                            if (dat[i] instanceof Alumnos && dat[i].isSobrepeso() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Alumnos)
                                {
                                    alumHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Alumnos)
                                {
                                    alumMuj += 1;
                                }

                                alumTot++;
                            }

                            if (dat[i] instanceof Personal && dat[i].isSobrepeso() == true)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Personal)
                                {
                                    persHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Personal)
                                {
                                    persMuj += 1;
                                }

                                persTot += 1;
                            }

                            totales = alumTot + persTot;

                            aH = String.valueOf(alumHom);
                            aM = String.valueOf(alumMuj);
                            aT = String.valueOf(alumTot);
                            pH = String.valueOf(persHom);
                            pM = String.valueOf(persMuj);
                            pT = String.valueOf(persTot);
                            tot = String.valueOf(totales);

                            sbps = new String[] {"Sobrepeso", aH, aM, aT, pH, pM, pT, tot};

                            break;
                        case 5:

                            alumHom = 0;
                            alumMuj = 0;
                            alumTot = 0;
                            persHom = 0;
                            persMuj = 0;
                            persTot = 0;

                            if (dat[i] instanceof Alumnos && dat[i].getOtras() != null)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Alumnos)
                                {
                                    alumHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Alumnos)
                                {
                                    alumMuj += 1;
                                }

                                alumTot += 1;
                            }

                            if (dat[i] instanceof Personal && dat[i].getOtras() != null)
                            {
                                if (dat[i].getSexo() == 'H' && dat[i] instanceof Personal)
                                {
                                    persHom += 1;
                                }

                                if (dat[i].getSexo() == 'M' && dat[i] instanceof Personal)
                                {
                                    persMuj += 1;
                                }

                                persTot += 1;
                            }

                            totales = alumTot + persTot;

                            aH = String.valueOf(alumHom);
                            aM = String.valueOf(alumMuj);
                            aT = String.valueOf(alumTot);
                            pH = String.valueOf(persHom);
                            pM = String.valueOf(persMuj);
                            pT = String.valueOf(persTot);
                            tot = String.valueOf(totales);

                            otros = new String[] {"Otros", aH, aM, aT, pH, pM, pT, tot};

                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            }

            modelo.addRow(alerg);
            modelo.addRow(desn);
            modelo.addRow(diab);
            modelo.addRow(obsd);
            modelo.addRow(sbps);
            modelo.addRow(otros);

        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowActivated
    {//GEN-HEADEREND:event_formWindowActivated
        JPanelImage iconoA = new JPanelImage(iconEd, "img/grafico.png");
        iconEd.add(iconoA).repaint();
        iconEd.setOpaque(false);
        iconEd.setBorder(null);
        iconEd.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_formWindowActivated

    private void pdfGenerateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pdfGenerateActionPerformed
    {//GEN-HEADEREND:event_pdfGenerateActionPerformed
        Date fecha = new Date();
        String fechaString = fecha.toString();
        PlantillaPdf9 plantilla = new PlantillaPdf9("Reportes Alergias Personal Mujeres", fechaString);
        plantilla.crearPlantilla(SelectRegistro.datos, titulo);
    }//GEN-LAST:event_pdfGenerateActionPerformed

    private void pdfAbrirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pdfAbrirActionPerformed
    {//GEN-HEADEREND:event_pdfAbrirActionPerformed
        abrir("reportes/Reportes " + titulo.getText());
    }//GEN-LAST:event_pdfAbrirActionPerformed

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
                new InformesMorbilidad().setVisible(true);
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
