/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author marip
 */
public class VtnAnalizador extends javax.swing.JFrame
{

    /**
     * Creates new form VtnPrincipal
     */
    public VtnAnalizador()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png")));
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void analizarLexico() throws IOException
    {
        int cont = 1;
        
        String expr = (String) entrada.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA "+cont+"\t\tSIMBOLO\n";
        while (true)
        {            
            Tokens token = lexer.yylex();
            if (token == null)
            {
                salida.setText(resultado);
                return;
            }
            switch (token)
            {
                case Linea:
                    cont++;
                    resultado += "LINEA "+cont+ "\n";
                    break;
                case Int:
                    resultado += "   <Tipo de dato int>\t"+ lexer.lexeme+"\n";
                    break;
                case If:
                    resultado += "   <Reservada if>\t"+ lexer.lexeme+"\n";
                    break;
                case Else:
                    resultado += "   <Reservada else>\t"+ lexer.lexeme+"\n";
                    break;
                case While:
                    resultado += "   <Reservada while>\t"+ lexer.lexeme+"\n";
                    break;
                case Igual:
                    resultado += "   <Reservada igual>\t"+ lexer.lexeme+"\n";
                    break;
                case Suma:
                    resultado += "   <Operador suma>\t"+ lexer.lexeme+"\n";
                    break;
                case Resta:
                    resultado += "   <Operador resta>\t"+ lexer.lexeme+"\n";
                    break;
                case Multiplicacion:
                    resultado += "   <Operador multiplicacion>\t"+ lexer.lexeme+"\n";
                    break;
                case Division:
                    resultado += "   <Operador division>\t"+ lexer.lexeme+"\n";
                    break;
                case String:
                    resultado += "   <Tipo de dato string>\t"+ lexer.lexeme+"\n";
                    break;
                case Dim:
                    resultado += "   <Reservada Dim>\t"+ lexer.lexeme+"\n";
                    break;
                case As:
                    resultado += "   <Reservada As>\t"+ lexer.lexeme+"\n";
                    break;
                case End:
                    resultado += "   <Reservada End>\t"+ lexer.lexeme+"\n";
                    break;
                case Module:
                    resultado += "   <Reservada Module>\t"+ lexer.lexeme+"\n";
                    break;
                case Signo_Parentesis_Abierto:
                    resultado += "   <Signo parentesis abierto>\t"+ lexer.lexeme+"\n";
                    break;
                case Signo_Parentesis_Cerrado:
                    resultado += "   <Signo parentesis cerrado>\t"+ lexer.lexeme+"\n";
                    break;
                case Identificador:
                    resultado += "   <Identificador>\t"+ lexer.lexeme+"\n";
                    break;
                case Numero:
                    resultado += "   <Numero>\t"+ lexer.lexeme+"\n";
                    break;
                case Sub:
                    resultado += "   <Reservada Sub>\t"+ lexer.lexeme+"\n";
                    break;
                case ERROR:
                    resultado += "   <Símbolo no definido>\n";
                    break;
                default:
                    resultado += "   < "+ lexer.lexeme+"\n";
                    break;
            }
        }
    }
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        entrada = new javax.swing.JTextArea();
        LimpiaB = new javax.swing.JButton();
        AnalizaB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoSintactico = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        BotonAnalizarSint = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(173, 204, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(42, 64, 44));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 239, 242));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(233, 239, 242));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageee.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 64, 53));
        jLabel3.setText("Tokens");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 64, 53));
        jLabel4.setText("Ingresa tu código...");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        salida.setBackground(new java.awt.Color(233, 239, 242));
        salida.setColumns(20);
        salida.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        salida.setForeground(new java.awt.Color(49, 64, 53));
        salida.setRows(5);
        salida.setEnabled(false);
        jScrollPane1.setViewportView(salida);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 370, 280));

        entrada.setBackground(new java.awt.Color(233, 239, 242));
        entrada.setColumns(20);
        entrada.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        entrada.setForeground(new java.awt.Color(49, 64, 53));
        entrada.setRows(5);
        jScrollPane2.setViewportView(entrada);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 370, 280));

        LimpiaB.setBackground(new java.awt.Color(233, 239, 242));
        LimpiaB.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        LimpiaB.setForeground(new java.awt.Color(49, 64, 53));
        LimpiaB.setText("Limpiar");
        LimpiaB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LimpiaBActionPerformed(evt);
            }
        });
        jPanel1.add(LimpiaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        AnalizaB.setBackground(new java.awt.Color(233, 239, 242));
        AnalizaB.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        AnalizaB.setForeground(new java.awt.Color(49, 64, 53));
        AnalizaB.setText("Analizar");
        AnalizaB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AnalizaBActionPerformed(evt);
            }
        });
        jPanel1.add(AnalizaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 460));

        jPanel3.setBackground(new java.awt.Color(42, 64, 44));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoSintactico.setColumns(20);
        textoSintactico.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textoSintactico.setRows(5);
        jScrollPane3.setViewportView(textoSintactico);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 820, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Analizador Sintáctico");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        BotonAnalizarSint.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        BotonAnalizarSint.setText("Analizar");
        BotonAnalizarSint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotonAnalizarSintActionPerformed(evt);
            }
        });
        jPanel3.add(BotonAnalizarSint, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 900, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        new VtnPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void AnalizaBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AnalizaBActionPerformed
    {//GEN-HEADEREND:event_AnalizaBActionPerformed
        try
        {
            analizarLexico();
        } catch (Exception e)
        {
            Mensajes.error(this, "ERROR");
        }
    }//GEN-LAST:event_AnalizaBActionPerformed

    private void LimpiaBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_LimpiaBActionPerformed
    {//GEN-HEADEREND:event_LimpiaBActionPerformed
        CtrlInterfaz.limpia(entrada, salida);
        CtrlInterfaz.habilita(false, entrada, salida);
        CtrlInterfaz.cambia(entrada);
    }//GEN-LAST:event_LimpiaBActionPerformed

    private void BotonAnalizarSintActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotonAnalizarSintActionPerformed
    {//GEN-HEADEREND:event_BotonAnalizarSintActionPerformed
        String ST = entrada.getText();
        Sintax s = new Sintax(new principal.LexerCup(new StringReader(ST)));
        
        try
        {
            s.parse();
            textoSintactico.setText("Código sin errores.");
            textoSintactico.setForeground(new Color(25,111,61));
        } catch (Exception e)
        {
            Symbol sym = s.getS();
            textoSintactico.setText("Error de sintaxix. Linea: "+ (sym.right + 1) + " Columna: "+ (sym.left + 1)+ " Texto: \""+ sym.value+"\"");
            textoSintactico.setForeground(Color.red);
        }
    }//GEN-LAST:event_BotonAnalizarSintActionPerformed

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
            java.util.logging.Logger.getLogger(VtnAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalizaB;
    private javax.swing.JButton BotonAnalizarSint;
    private javax.swing.JButton LimpiaB;
    private javax.swing.JTextArea entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea salida;
    private javax.swing.JTextArea textoSintactico;
    // End of variables declaration//GEN-END:variables
}
