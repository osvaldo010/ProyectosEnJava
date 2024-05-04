/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author USUARIO
 */
public class ModPersonal extends javax.swing.JFrame
{

    /**
     * Creates new form ModPersonal
     */
    public ModPersonal()
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
        iconM = new javax.swing.JPanel();
        diabetes = new javax.swing.JCheckBox();
        alergias = new javax.swing.JCheckBox();
        cve = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        otras = new javax.swing.JCheckBox();
        obesidad = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        otrasEsp = new javax.swing.JTextField();
        desnutricion = new javax.swing.JCheckBox();
        sexo = new javax.swing.JComboBox<>();
        sobrepeso = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        apPaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        apMaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(158, 188, 222));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Modificar Datos Personal");

        javax.swing.GroupLayout iconMLayout = new javax.swing.GroupLayout(iconM);
        iconM.setLayout(iconMLayout);
        iconMLayout.setHorizontalGroup(
            iconMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        iconMLayout.setVerticalGroup(
            iconMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(iconM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(iconM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        diabetes.setText("Diabetes");
        diabetes.setEnabled(false);

        alergias.setText("Alergias");
        alergias.setEnabled(false);

        cve.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cveKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cveKeyTyped(evt);
            }
        });

        nombre.setEditable(false);
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setBorder(null);
        nombre.setEnabled(false);
        nombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                nombreKeyPressed(evt);
            }
        });

        otras.setText("Otras");
        otras.setEnabled(false);
        otras.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                otrasItemStateChanged(evt);
            }
        });

        obesidad.setText("Obesidad");
        obesidad.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("Sexo");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Padecimientos");

        otrasEsp.setEnabled(false);
        otrasEsp.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                otrasEspKeyPressed(evt);
            }
        });

        desnutricion.setText("Desnutrición");
        desnutricion.setEnabled(false);

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        sexo.setEnabled(false);
        sexo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                sexoKeyPressed(evt);
            }
        });

        sobrepeso.setText("Sobrepeso");
        sobrepeso.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Apellido Paterno");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Apellido Materno");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Nombre(s)");

        apPaterno.setEditable(false);
        apPaterno.setForeground(new java.awt.Color(255, 255, 255));
        apPaterno.setBorder(null);
        apPaterno.setEnabled(false);
        apPaterno.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                apPaternoKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("CVE");

        cancelar.setBackground(new java.awt.Color(225, 147, 141));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/img/cancelar.png"))); // NOI18N
        cancelar.setToolTipText("Cancelar");
        cancelar.setBorderPainted(false);
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelarActionPerformed(evt);
            }
        });

        aceptar.setBackground(new java.awt.Color(158, 222, 165));
        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/img/descargar.png"))); // NOI18N
        aceptar.setToolTipText("Guardar Cambios");
        aceptar.setBorderPainted(false);
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aceptarActionPerformed(evt);
            }
        });
        aceptar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                aceptarKeyPressed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(102, 102, 102));
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/img/basura-light.png"))); // NOI18N
        borrar.setToolTipText("Borrar");
        borrar.setBorderPainted(false);
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        apMaterno.setEditable(false);
        apMaterno.setForeground(new java.awt.Color(255, 255, 255));
        apMaterno.setBorder(null);
        apMaterno.setEnabled(false);
        apMaterno.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                apMaternoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("Estatus");

        estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Base", "Temporal" }));
        estatus.setEnabled(false);
        estatus.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                estatusKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cve, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(26, 26, 26)
                            .addComponent(apPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(apMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(23, 23, 23)
                        .addComponent(estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(desnutricion)
                    .addComponent(sobrepeso)
                    .addComponent(alergias)
                    .addComponent(obesidad)
                    .addComponent(diabetes)
                    .addComponent(otras)
                    .addComponent(otrasEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(apPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(desnutricion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sobrepeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alergias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(obesidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diabetes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(otrasEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cveKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cveKeyPressed
    {//GEN-HEADEREND:event_cveKeyPressed
        try
        {
            if (evt.getKeyChar() == '\n')
            {

                if (Manipulacion.buscarPosicion(SelectRegistro.datos, cve.getText()) != -1)
                {
                    for (int i = 0; i < SelectRegistro.datos.length; i++)
                    {
                        if (SelectRegistro.datos[i].getCve().equals(cve.getText()) && SelectRegistro.datos[i] instanceof Personal)
                        {
                            int sexoIdx;
                            if (SelectRegistro.datos[i].getSexo() == 'H')
                            {
                                sexoIdx = 0;
                            } else
                            {
                                sexoIdx = 1;
                            }

                            int estIndx;
                            if (((Personal) SelectRegistro.datos[i]).getEstatus() == 'B')
                            {
                                estIndx = 0;
                            } else
                            {
                                estIndx = 1;
                            }

                            Validaciones.enterEntero(this, evt, cve, sexo);
                            nombre.setText(SelectRegistro.datos[i].getNom());
                            apPaterno.setText(SelectRegistro.datos[i].getPrimerAp());
                            apMaterno.setText(SelectRegistro.datos[i].getSegundoAp());
                            obesidad.setSelected(SelectRegistro.datos[i].isObesidad());
                            alergias.setSelected(SelectRegistro.datos[i].isAlergias());
                            diabetes.setSelected(SelectRegistro.datos[i].isDiabetes());
                            desnutricion.setSelected(SelectRegistro.datos[i].isDesnutricion());
                            sobrepeso.setSelected(SelectRegistro.datos[i].isSobrepeso());
                            sexo.setSelectedIndex(sexoIdx);
                            estatus.setSelectedIndex(estIndx);

                            CtrlInterfaz.habilita(true, estatus);
                            CtrlInterfaz.habilitaChB(0, true, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
                        }
                    }
                } else if (Manipulacion.buscarPosicion(SelectRegistro.datos, cve.getText()) == -1)
                {
                    Mensaje.error(this, "Clave de Personal no encontrada");
                } else if (SelectRegistro.datos == null)
                {
                    Mensaje.error(this, "No hay personal registrados");
                    dispose();
                }
            }
        } catch (Exception e)
        {
            if (SelectRegistro.datos == null)
            {
                Mensaje.error(this, "No hay registros");
                dispose();
            } else
            {
                Mensajes.error(this, "Error... " + e.toString());
                dispose();
            }
        }
    }//GEN-LAST:event_cveKeyPressed

    private void cveKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cveKeyTyped
    {//GEN-HEADEREND:event_cveKeyTyped
        Validaciones.validaEntero(evt, 7, cve.getText());
    }//GEN-LAST:event_cveKeyTyped

    private void nombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nombreKeyPressed
    {//GEN-HEADEREND:event_nombreKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, nombre, apPaterno);
    }//GEN-LAST:event_nombreKeyPressed

    private void otrasItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_otrasItemStateChanged
    {//GEN-HEADEREND:event_otrasItemStateChanged
        if (evt.getStateChange() == 1)
        {
            CtrlInterfaz.habilita(true, otrasEsp);
            CtrlInterfaz.cambia(otrasEsp);
        } else
        {
            CtrlInterfaz.habilita(false, otrasEsp);
            CtrlInterfaz.limpia(otrasEsp);
        }
    }//GEN-LAST:event_otrasItemStateChanged

    private void otrasEspKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_otrasEspKeyPressed
    {//GEN-HEADEREND:event_otrasEspKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, otrasEsp, aceptar);
    }//GEN-LAST:event_otrasEspKeyPressed

    private void sexoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_sexoKeyPressed
    {//GEN-HEADEREND:event_sexoKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            CtrlInterfaz.cambia(estatus);
        }
    }//GEN-LAST:event_sexoKeyPressed

    private void apPaternoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_apPaternoKeyPressed
    {//GEN-HEADEREND:event_apPaternoKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, apPaterno, apMaterno);
    }//GEN-LAST:event_apPaternoKeyPressed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarActionPerformed
    {//GEN-HEADEREND:event_cancelarActionPerformed
        ManipulacionArchivos.guarda(this, SelectRegistro.datos, "Datos.dat");
        new SelectMod().setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aceptarActionPerformed
    {//GEN-HEADEREND:event_aceptarActionPerformed
        try
        {
            int i = Manipulacion.buscarPosicion(SelectRegistro.datos, cve.getText());

            char sexoChar;
            char estatusChar;

            if (sexo.getSelectedIndex() == 0)
            {
                sexoChar = 'H';
            } else
            {
                sexoChar = 'M';
            }

            if (estatus.getSelectedIndex() == 0)
            {
                estatusChar = 'B';
            } else
            {
                estatusChar = 'T';
            }

            SelectRegistro.datos[i] = new Personal(estatusChar, cve.getText(), nombre.getText(), apPaterno.getText(), apMaterno.getText(), sexoChar, desnutricion.isSelected(), sobrepeso.isSelected(), alergias.isSelected(), obesidad.isSelected(), diabetes.isSelected(), otrasEsp.getText());
            ManipulacionArchivos.guarda(this, SelectRegistro.datos, "Datos.dat");

            Mensaje.exito(this, "Cambios Guardados");

            borrarActionPerformed(null);
        } catch (Exception e)
        {
            Mensaje.error(this, "Error... " + e);
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void aceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_aceptarKeyPressed
    {//GEN-HEADEREND:event_aceptarKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            aceptarActionPerformed(null);
        }
    }//GEN-LAST:event_aceptarKeyPressed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_borrarActionPerformed
    {//GEN-HEADEREND:event_borrarActionPerformed
        CtrlInterfaz.limpia(cve, nombre, apMaterno, apPaterno, sexo, estatus, otrasEsp);
        CtrlInterfaz.habilitaChB(1, false, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
        sexo.setSelectedIndex(0);
        estatus.setSelectedIndex(0);
        CtrlInterfaz.cambia(cve);
    }//GEN-LAST:event_borrarActionPerformed

    private void apMaternoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_apMaternoKeyPressed
    {//GEN-HEADEREND:event_apMaternoKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, apMaterno, sexo);
    }//GEN-LAST:event_apMaternoKeyPressed

    private void estatusKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_estatusKeyPressed
    {//GEN-HEADEREND:event_estatusKeyPressed
        CtrlInterfaz.cambia(aceptar);
    }//GEN-LAST:event_estatusKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        JPanelImage imagen = new JPanelImage(iconM, "img/edicion.png");
        iconM.add(imagen).repaint();
        iconM.setOpaque(false);
        iconM.setBorder(null);
        iconM.setBackground(new Color(0, 0, 0, 0));

        if (SelectRegistro.datos == null)
        {
            Mensaje.error(this, "No hay registros");
            new SelectOption().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        ManipulacionArchivos.guarda(this, SelectRegistro.datos, "Datos.dat");
        new SelectMod().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
                new ModPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JCheckBox alergias;
    private javax.swing.JTextField apMaterno;
    private javax.swing.JTextField apPaterno;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cve;
    private javax.swing.JCheckBox desnutricion;
    private javax.swing.JCheckBox diabetes;
    private javax.swing.JComboBox<String> estatus;
    private javax.swing.JPanel iconM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JCheckBox obesidad;
    private javax.swing.JCheckBox otras;
    private javax.swing.JTextField otrasEsp;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JCheckBox sobrepeso;
    // End of variables declaration//GEN-END:variables
}
