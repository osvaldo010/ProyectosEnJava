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
import java.util.Date;
import javax.swing.UIManager;

/**
 *
 * @author USUARIO
 */
public class ConsHistorialAlumnos extends javax.swing.JFrame
{

    public static int registro = 0;

    /**
     * Creates new form HistorialAlumnos
     */
    public ConsHistorialAlumnos()
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

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        apMaterno = new javax.swing.JTextField();
        diabetes = new javax.swing.JCheckBox();
        alergias = new javax.swing.JCheckBox();
        cve = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        otras = new javax.swing.JCheckBox();
        obesidad = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        otrasEspField = new javax.swing.JTextField();
        desnutricion = new javax.swing.JCheckBox();
        sobrepeso = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iconM = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        apPaterno = new javax.swing.JTextField();
        viveConField = new javax.swing.JTextField();
        sexoField = new javax.swing.JTextField();
        carreraField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        padActual = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        antPers = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        planTratamiento = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        medicamentos = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        noConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alumnos");
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

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("CVE");

        siguiente.setBackground(new java.awt.Color(102, 102, 102));
        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/img/siguiente12.png"))); // NOI18N
        siguiente.setToolTipText("Siguiente");
        siguiente.setBorderPainted(false);
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.setEnabled(false);
        siguiente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setBackground(new java.awt.Color(102, 102, 102));
        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/img/atras12.png"))); // NOI18N
        anterior.setToolTipText("Anterior");
        anterior.setBorderPainted(false);
        anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anterior.setEnabled(false);
        anterior.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                anteriorActionPerformed(evt);
            }
        });
        anterior.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                anteriorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        apMaterno.setEditable(false);
        apMaterno.setForeground(new java.awt.Color(255, 255, 255));
        apMaterno.setBorder(null);
        apMaterno.setEnabled(false);

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

        otras.setText("Otras");
        otras.setEnabled(false);

        obesidad.setText("Obesidad");
        obesidad.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("Sexo");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Padecimientos");

        otrasEspField.setEditable(false);
        otrasEspField.setBorder(null);
        otrasEspField.setEnabled(false);

        desnutricion.setText("Desnutrición");
        desnutricion.setEnabled(false);

        sobrepeso.setText("Sobrepeso");
        sobrepeso.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setText("Vive con");

        jPanel1.setBackground(new java.awt.Color(157, 208, 222));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Historial Clínico");

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
                .addContainerGap(738, Short.MAX_VALUE))
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

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Apellido Paterno");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("Carrera");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Apellido Materno");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Nombre(s)");

        apPaterno.setEditable(false);
        apPaterno.setForeground(new java.awt.Color(255, 255, 255));
        apPaterno.setBorder(null);
        apPaterno.setEnabled(false);

        viveConField.setEditable(false);
        viveConField.setBorder(null);
        viveConField.setEnabled(false);

        sexoField.setEditable(false);
        sexoField.setBorder(null);
        sexoField.setEnabled(false);

        carreraField.setEditable(false);
        carreraField.setBorder(null);
        carreraField.setEnabled(false);

        jLabel11.setText("Padecimiento Actual");

        padActual.setEditable(false);
        padActual.setColumns(20);
        padActual.setRows(5);
        jScrollPane1.setViewportView(padActual);

        jLabel12.setText("Antecedentes Personales");

        antPers.setEditable(false);
        antPers.setColumns(20);
        antPers.setRows(5);
        jScrollPane2.setViewportView(antPers);

        planTratamiento.setEditable(false);
        planTratamiento.setColumns(20);
        planTratamiento.setRows(5);
        jScrollPane3.setViewportView(planTratamiento);

        jLabel13.setText("Plan y Tratamiento");

        medicamentos.setEditable(false);
        medicamentos.setColumns(20);
        medicamentos.setRows(5);
        jScrollPane4.setViewportView(medicamentos);

        jLabel14.setText("Medicamentos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(desnutricion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diabetes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alergias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(obesidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sobrepeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(otras)
                        .addGap(18, 18, 18)
                        .addComponent(otrasEspField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(carreraField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(sexoField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cve, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(apPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(apMaterno))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(viveConField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(noConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(336, 336, 336)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(apMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(sexoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(carreraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(viveConField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(otras)
                            .addComponent(otrasEspField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(noConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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
                HistorialClinico hist[][] = (HistorialClinico[][]) ManipulacionArchivos.cargMatriz("Historiales.dat");

                for (int i = 0; i < hist.length; i++)
                {
                    if (hist[i][0].getClave().equals(cve.getText()))
                    {
                        int pos = Manipulacion.buscarPosicion(SelectRegistro.datos, cve.getText());
                        DatosGenerales datos[] = (DatosGenerales[]) ManipulacionArchivos.carga(this, "Datos.dat");
                        noConsulta.setText("Número de consulta: " + String.valueOf(registro + 1));

                        if (hist[i].length > 1)
                        {
                            anterior.setEnabled(true);
                            siguiente.setEnabled(true);
                        }

                        if (pos != -1)
                        {
                            if (datos[pos].getCve().equals(cve.getText()) && SelectRegistro.datos[pos] instanceof Alumnos)
                            {
                                String sexoSt;
                                if (datos[pos].getSexo() == 'H')
                                {
                                    sexoSt = "Hombre";
                                } else
                                {
                                    sexoSt = "Mujer";
                                }
                                String carr = "";
                                switch (((Alumnos) datos[pos]).getCarrera())
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
                                String conv = "";
                                switch (((Alumnos) datos[pos]).getViveCon())
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
                                String ots = datos[pos].getOtras();

                                Validaciones.enterEntero(this, evt, cve, cve);
                                nombre.setText(datos[pos].getNom());
                                apPaterno.setText(datos[pos].getPrimerAp());
                                apMaterno.setText(datos[pos].getSegundoAp());
                                obesidad.setSelected(datos[pos].isObesidad());
                                alergias.setSelected(datos[pos].isAlergias());
                                diabetes.setSelected(datos[pos].isDiabetes());
                                desnutricion.setSelected(datos[pos].isDesnutricion());
                                sobrepeso.setSelected(datos[pos].isSobrepeso());
                                sexoField.setText(sexoSt);
                                carreraField.setText(carr);
                                viveConField.setText(conv);
                                otrasEspField.setText(ots);

                                String pA = hist[i][registro].getPadecimientoAct();
                                String med = hist[i][registro].getMedicamento();
                                String aP = hist[i][registro].getAntedecendentesPer();
                                String pT = hist[i][registro].getPlanTratamiento();

                                padActual.setText(pA);
                                medicamentos.setText(med);
                                antPers.setText(aP);
                                planTratamiento.setText(pT);

                            } else if (SelectRegistro.datos[pos] instanceof Personal)
                            {
                                Mensaje.error(this, "Clave de Alumno no encontrada");
                            }
                        } else if (pos == -1)
                        {
                            Mensaje.error(this, "Clave de Alumno no encontrada");
                        } else if (datos == null)
                        {
                            Mensaje.error(this, "No hay alumnos registrados");
                            dispose();
                        }
                    }
                }
            }
        } catch (Exception e)
        {
            if (SelectRegistro.datos == null || SelectHistorial.historiales == null)
            {
                Mensaje.error(this, "No hay registros");
            } else
            {
                Mensajes.error(this, "Error... " + e.toString());
            }
        }
    }//GEN-LAST:event_cveKeyPressed

    private void cveKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cveKeyTyped
    {//GEN-HEADEREND:event_cveKeyTyped
        Validaciones.validaEntero(evt, 7, cve.getText());
    }//GEN-LAST:event_cveKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        JPanelImage imagen = new JPanelImage(iconM, "img/hospital.png");
        iconM.add(imagen).repaint();
        iconM.setOpaque(false);
        iconM.setBorder(null);
        iconM.setBackground(new Color(0, 0, 0, 0));

        SelectRegistro.datos = (DatosGenerales[]) ManipulacionArchivos.carga(this, "Datos.dat");

        if (SelectRegistro.datos == null)
        {
            Mensaje.error(this, "No hay registros");
            new SelectOption().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        new SelectCitaConsAlum().setVisible(true);
        ManipulacionArchivos.guarda(this, SelectHistorial.historiales, "Historiales.dat");
    }//GEN-LAST:event_formWindowClosing

    private void anteriorKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_anteriorKeyPressed
    {//GEN-HEADEREND:event_anteriorKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            anteriorActionPerformed(null);
        }
    }//GEN-LAST:event_anteriorKeyPressed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_anteriorActionPerformed
    {//GEN-HEADEREND:event_anteriorActionPerformed
        HistorialClinico hist[][] = (HistorialClinico[][]) ManipulacionArchivos.cargMatriz("Historiales.dat");

        registro--;
        if (registro < 0)
        {
            registro = 0;
        }

        for (int i = 0; i < hist.length; i++)
        {
            if (hist[i][0].getClave() == cve.getText())
            {
                String pA = hist[i][registro].getPadecimientoAct();
                String med = hist[i][registro].getMedicamento();
                String aP = hist[i][registro].getAntedecendentesPer();
                String pT = hist[i][registro].getPlanTratamiento();

                padActual.setText(pA);
                medicamentos.setText(med);
                antPers.setText(aP);
                planTratamiento.setText(pT);
                
                noConsulta.setText("Número de consulta: " + String.valueOf(registro + 1));
            }
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_siguienteActionPerformed
    {//GEN-HEADEREND:event_siguienteActionPerformed
        HistorialClinico hist[][] = (HistorialClinico[][]) ManipulacionArchivos.cargMatriz("Historiales.dat");

        registro++;
        for (int i = 0; i < hist.length; i++)
        {
            if (hist[i][0].getClave() == cve.getText())
            {
                if (registro > hist[i].length - 1)
                {
                    registro = hist[i].length - 1;
                }

                String pA = hist[i][registro].getPadecimientoAct();
                String med = hist[i][registro].getMedicamento();
                String aP = hist[i][registro].getAntedecendentesPer();
                String pT = hist[i][registro].getPlanTratamiento();

                padActual.setText(pA);
                medicamentos.setText(med);
                antPers.setText(aP);
                planTratamiento.setText(pT);
                
                noConsulta.setText("Número de consulta: " + String.valueOf(registro + 1));
            }
        }
    }//GEN-LAST:event_siguienteActionPerformed

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
        UIManager.put("Component.arc", 15);
        UIManager.put("CheckBox.arc", 15);
        UIManager.put("Component.arrowType", "triangle");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ConsHistorialAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alergias;
    private javax.swing.JTextArea antPers;
    private javax.swing.JButton anterior;
    private javax.swing.JTextField apMaterno;
    private javax.swing.JTextField apPaterno;
    private javax.swing.JTextField carreraField;
    private javax.swing.JTextField cve;
    private javax.swing.JCheckBox desnutricion;
    private javax.swing.JCheckBox diabetes;
    private javax.swing.JPanel iconM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea medicamentos;
    private javax.swing.JLabel noConsulta;
    private javax.swing.JTextField nombre;
    private javax.swing.JCheckBox obesidad;
    private javax.swing.JCheckBox otras;
    private javax.swing.JTextField otrasEspField;
    private javax.swing.JTextArea padActual;
    private javax.swing.JTextArea planTratamiento;
    private javax.swing.JTextField sexoField;
    private javax.swing.JButton siguiente;
    private javax.swing.JCheckBox sobrepeso;
    private javax.swing.JTextField viveConField;
    // End of variables declaration//GEN-END:variables
}