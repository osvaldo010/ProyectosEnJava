/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import cjb.ci.Mensajes;
import edd.LDLC;
import edd.Nodo;
import edd.NodoL;
import edd.Prioridad;
import edd.Proceso;
import poo.Archivos;

/**
 *
 * @author osval
 */
public class ConsultaPróximo extends javax.swing.JFrame
{

    /**
     * Creates new form ConsultaPróximo
     */
    public ConsultaPróximo()
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

        panel = new javax.swing.JPanel();
        próximoProceso = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        panelProceso2 = new javax.swing.JPanel();
        nombre2 = new javax.swing.JLabel();
        númeroDePropiedad2 = new javax.swing.JLabel();
        quantums2 = new javax.swing.JLabel();
        textoNumPrioridad2 = new javax.swing.JTextField();
        textoQuan2 = new javax.swing.JTextField();
        textoNom2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        panel.setBackground(new java.awt.Color(48, 146, 255));
        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        próximoProceso.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        próximoProceso.setText("Próximo Proceso");

        botonSalir.setBackground(new java.awt.Color(255, 0, 0));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SímboloCerrar.png"))); // NOI18N
        botonSalir.setToolTipText("Cerrar programa");
        botonSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botonSalirActionPerformed(evt);
            }
        });

        botonRegresar.setBackground(new java.awt.Color(255, 255, 0));
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regreso.png"))); // NOI18N
        botonRegresar.setToolTipText("Menú Principal");
        botonRegresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botonRegresarActionPerformed(evt);
            }
        });

        panelProceso2.setBackground(new java.awt.Color(102, 255, 102));
        panelProceso2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nombre2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        nombre2.setText("Nombre:");

        númeroDePropiedad2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        númeroDePropiedad2.setText("Número de Prioridad:");

        quantums2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        quantums2.setText("Quantums:");

        textoNumPrioridad2.setEditable(false);
        textoNumPrioridad2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoNumPrioridad2.setToolTipText("Número de prioridad del proceso");
        textoNumPrioridad2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textoNumPrioridad2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textoNumPrioridad2ActionPerformed(evt);
            }
        });
        textoNumPrioridad2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                textoNumPrioridad2KeyTyped(evt);
            }
        });

        textoQuan2.setEditable(false);
        textoQuan2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoQuan2.setToolTipText("Quantums del proceso");
        textoQuan2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoNom2.setEditable(false);
        textoNom2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoNom2.setToolTipText("Nombre del proceso");
        textoNom2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelProceso2Layout = new javax.swing.GroupLayout(panelProceso2);
        panelProceso2.setLayout(panelProceso2Layout);
        panelProceso2Layout.setHorizontalGroup(
            panelProceso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProceso2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelProceso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProceso2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(quantums2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoQuan2))
                    .addGroup(panelProceso2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(nombre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNom2))
                    .addGroup(panelProceso2Layout.createSequentialGroup()
                        .addComponent(númeroDePropiedad2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNumPrioridad2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        panelProceso2Layout.setVerticalGroup(
            panelProceso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProceso2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(panelProceso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(númeroDePropiedad2)
                    .addComponent(textoNumPrioridad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelProceso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre2)
                    .addComponent(textoNom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelProceso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoQuan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantums2))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelProceso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(próximoProceso)
                        .addGap(53, 53, 53)
                        .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(próximoProceso)))
                .addGap(44, 44, 44)
                .addComponent(panelProceso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botonSalirActionPerformed
    {//GEN-HEADEREND:event_botonSalirActionPerformed
        Archivos.guarda(this, MenuPrincipal.lista, "Datos.dat");
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botonRegresarActionPerformed
    {//GEN-HEADEREND:event_botonRegresarActionPerformed
        Archivos.guarda(this, MenuPrincipal.lista, "Datos.dat");
        new MenuPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void textoNumPrioridad2KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_textoNumPrioridad2KeyTyped
    {//GEN-HEADEREND:event_textoNumPrioridad2KeyTyped

    }//GEN-LAST:event_textoNumPrioridad2KeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try
        {
            MenuPrincipal.lista = (LDLC) Archivos.carga(this, "Datos.dat");
            if (MenuPrincipal.lista.getR() == null)
            {
                Mensajes.error(this, "Lista vacía.");
                new MenuPrincipal().setVisible(true);
                dispose();
            } else
            {
                Prioridad aux = (Prioridad) MenuPrincipal.lista.getR().getSiguiente().getObj();
                Nodo aux2 = aux.getCola().getAtras().getSiguiente();
                textoNumPrioridad2.setText(String.valueOf(aux.getNoPrioridad()));
                textoNom2.setText(((Proceso) aux2.getObj()).getNombre());
                textoQuan2.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums()));
            }
        } catch (Exception e)
        {
            Mensajes.error(this, "Error..." + e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void textoNumPrioridad2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textoNumPrioridad2ActionPerformed
    {//GEN-HEADEREND:event_textoNumPrioridad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNumPrioridad2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ConsultaPróximo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ConsultaPróximo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ConsultaPróximo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ConsultaPróximo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ConsultaPróximo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel númeroDePropiedad2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelProceso2;
    private javax.swing.JLabel próximoProceso;
    private javax.swing.JLabel quantums2;
    private javax.swing.JTextField textoNom2;
    private javax.swing.JTextField textoNumPrioridad2;
    private javax.swing.JTextField textoQuan2;
    // End of variables declaration//GEN-END:variables
}
