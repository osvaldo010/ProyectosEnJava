/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class RepMnrFrecPers extends javax.swing.JFrame
{

    /**
     * Creates new form RepAlumHom
     */
    public RepMnrFrecPers()
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
        jLabel1 = new javax.swing.JLabel();
        iconEd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        almsH = new javax.swing.JTable();

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

        jLabel1.setFont(new java.awt.Font("Open Sans Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Personal Menor Frecuencia");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                "CVE", "Nombre Completo", "Estatus"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false
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
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try
        {
            SelectRegistro.datos = (DatosGenerales[]) ManipulacionArchivos.carga(this, "Datos.dat");
            SelectHistorial.historiales = (HistorialClinico[][]) ManipulacionArchivos.carga(this, "Historiales.dat");

            DefaultTableModel modelo = (DefaultTableModel) almsH.getModel();
            DatosGenerales[] dat = SelectRegistro.datos;
            HistorialClinico[][] hist = SelectHistorial.historiales;

            int minLongitud = Integer.MAX_VALUE;

            if (hist != null)
            {
                for (int i = 0; i < hist.length; i++)
                {
                    if (hist[i] != null && hist[i].length < minLongitud && dat[i] instanceof Personal)
                    {
                        minLongitud = hist[i].length;
                    }
                }
            }

            for (int i = 0; i < hist.length; i++)
            {
                if (hist.length <= minLongitud && dat[i] instanceof Personal)
                {
                    String cve = dat[i].getCve();
                    String nomC = dat[i].getNom() + " " + dat[i].getPrimerAp() + " " + dat[i].getSegundoAp();
                    String est = null;
                    if (((Personal) dat[i]).getEstatus() == 'B')
                    {
                        est = "Base";
                    } else
                    {
                        est = "Temporal";
                    }
                    int numCitas = (hist[i].length);
                    String nC = String.valueOf(numCitas);

                    String[] fila =
                    {
                        cve, nomC, est, nC
                    };
                    modelo.addRow(fila);
                }
            }
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowActivated
    {//GEN-HEADEREND:event_formWindowActivated
        JPanelImage iconoA = new JPanelImage(iconEd, "img/capa-menos.png");
        iconEd.add(iconoA).repaint();
        iconEd.setOpaque(false);
        iconEd.setBorder(null);
        iconEd.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_formWindowActivated

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
                new RepMnrFrecPers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable almsH;
    private javax.swing.JPanel iconEd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
