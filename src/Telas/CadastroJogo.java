
package Telas;

import DAO.CadastrarCliente;
import javabeans.cadastrojogo;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila e Luan 
 */


   
public class CadastroJogo extends javax.swing.JFrame {

    /**
     * Creates new form formPrincipal
     */
    public CadastroJogo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIdade1 = new javax.swing.JPanel();
        jcb1 = new javax.swing.JCheckBox();
        jcb2 = new javax.swing.JCheckBox();
        codigo = new javax.swing.JLabel();
        jrbF = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        sexo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        quantidade = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idade = new javax.swing.JLabel();
        jrbM = new javax.swing.JRadioButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Fabricante = new javax.swing.JTextField();
        Salvar1 = new javax.swing.JButton();
        inserir = new javax.swing.JButton();
        Aventura = new javax.swing.JRadioButton();
        Corrida = new javax.swing.JRadioButton();
        RPG = new javax.swing.JRadioButton();
        MOBA = new javax.swing.JRadioButton();
        PC = new javax.swing.JCheckBox();
        proximo = new javax.swing.JButton();
        Xbox = new javax.swing.JCheckBox();
        jDesktopPane4 = new javax.swing.JDesktopPane();

        jpIdade1.setBackground(new java.awt.Color(255, 255, 255));
        jpIdade1.setBorder(new javax.swing.border.MatteBorder(null));

        jcb1.setBackground(new java.awt.Color(255, 255, 255));
        jcb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcb1.setForeground(new java.awt.Color(0, 102, 51));
        jcb1.setText("jCheckBox1");
        jcb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb1ActionPerformed(evt);
            }
        });

        jcb2.setBackground(new java.awt.Color(255, 255, 255));
        jcb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcb2.setForeground(new java.awt.Color(0, 102, 51));
        jcb2.setText("jCheckBox2");

        javax.swing.GroupLayout jpIdade1Layout = new javax.swing.GroupLayout(jpIdade1);
        jpIdade1.setLayout(jpIdade1Layout);
        jpIdade1Layout.setHorizontalGroup(
            jpIdade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIdade1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jcb1)
                .addGap(47, 47, 47)
                .addComponent(jcb2)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jpIdade1Layout.setVerticalGroup(
            jpIdade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIdade1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIdade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb1)
                    .addComponent(jcb2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codigo.setForeground(new java.awt.Color(0, 102, 51));
        codigo.setText("Codigo:");

        jrbF.setBackground(new java.awt.Color(255, 255, 255));
        jrbF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbF.setForeground(new java.awt.Color(0, 102, 51));
        jrbF.setText("F");
        jrbF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(153, 153, 153));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 102, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        sexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sexo.setForeground(new java.awt.Color(0, 102, 51));
        sexo.setText("Sexo:");

        btnNovo.setBackground(new java.awt.Color(153, 153, 153));
        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(0, 102, 51));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        quantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quantidade.setForeground(new java.awt.Color(0, 102, 51));
        quantidade.setText("Quantidade");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCodigo.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Cadastro de Bovinos");

        txtQuantidade.setToolTipText("");
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Data de registro:");

        idade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idade.setForeground(new java.awt.Color(0, 102, 51));
        idade.setText("Classificacao da Idade");

        jrbM.setBackground(new java.awt.Color(255, 255, 255));
        jrbM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbM.setForeground(new java.awt.Color(0, 102, 51));
        jrbM.setText("M");
        jrbM.setToolTipText("");
        jrbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMActionPerformed(evt);
            }
        });

        jDesktopPane2.setBackground(new java.awt.Color(0, 255, 204));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane3.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Cadastro do Jogo");
        jDesktopPane3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Titulo:");
        jDesktopPane3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });
        jDesktopPane3.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Genero:");
        jDesktopPane3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Plataforma:");
        jDesktopPane3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Fabricante do Jogo:");
        jDesktopPane3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Fabricante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDesktopPane3.add(Fabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 230, -1));

        Salvar1.setBackground(new java.awt.Color(153, 153, 153));
        Salvar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salvar1.setText("SALVAR");
        Salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salvar1ActionPerformed(evt);
            }
        });
        jDesktopPane3.add(Salvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 90, 30));

        inserir.setBackground(new java.awt.Color(153, 153, 153));
        inserir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inserir.setText("INSERIR");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });
        jDesktopPane3.add(inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 100, 30));

        Aventura.setBackground(new java.awt.Color(255, 255, 255));
        Aventura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aventura.setText("Aventura");
        Aventura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AventuraActionPerformed(evt);
            }
        });
        jDesktopPane3.add(Aventura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        Corrida.setBackground(new java.awt.Color(255, 255, 255));
        Corrida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Corrida.setText("Corrida");
        jDesktopPane3.add(Corrida, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        RPG.setBackground(new java.awt.Color(255, 255, 255));
        RPG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RPG.setText("RPG");
        jDesktopPane3.add(RPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        MOBA.setBackground(new java.awt.Color(255, 255, 255));
        MOBA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MOBA.setText("MOBA");
        jDesktopPane3.add(MOBA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        PC.setBackground(new java.awt.Color(255, 255, 255));
        PC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PC.setText("PC");
        jDesktopPane3.add(PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        proximo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proximo.setText("PRÓXIMO");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        jDesktopPane3.add(proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 120, 30));

        Xbox.setBackground(new java.awt.Color(255, 255, 255));
        Xbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Xbox.setText("Xbox");
        Xbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XboxActionPerformed(evt);
            }
        });
        jDesktopPane3.add(Xbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jPanel1.add(jDesktopPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 550, 540));

        jTabbedPane1.addTab("Cadastro", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 560));

        jDesktopPane4.setBackground(new java.awt.Color(51, 255, 204));
        jDesktopPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jDesktopPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void jcb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb1ActionPerformed

    private void jrbFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFActionPerformed

    private void jrbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrbMActionPerformed

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        // botao novo
        
        this.Aventura.setSelected(false);
        this.RPG.setSelected(false);
        this.Corrida.setSelected(false);
        this.MOBA.setSelected(false);

        this.PC.setSelected(false);
        this.Xbox.setSelected(false);

        
        this.Fabricante.setText("");
        this.titulo.setText("");
    }//GEN-LAST:event_inserirActionPerformed

    private void Salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salvar1ActionPerformed
        // botao salvar
        try {
            cadastrojogo obj = new cadastrojogo();

            if(Aventura.isSelected()){
                obj.setGenero(Aventura.getText());
            }
            
            if(RPG.isSelected()){
                obj.setGenero(RPG.getText());
            }
            
            if(Corrida.isSelected()){
                obj.setGenero(Corrida.getText());
            }
            
            if(MOBA.isSelected()){
                obj.setGenero(MOBA.getText());
            }
            
            if(PC.isSelected()){
                obj.setPlataforma(PC.getText());
            }
            if(Xbox.isSelected()){
                obj.setPlataforma(Xbox.getText());
            }
            
            obj.setTituloJogo(titulo.getText());
            
            obj.setFabricanteJogo(Fabricante.getText());

            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
            
            CadastrarCliente dao = new CadastrarCliente();
            dao.cadastrarFabricante(obj);
            //-------------------------------
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null,"Erro" + erro);
        }
        
    }//GEN-LAST:event_Salvar1ActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        Listar CadastroJogo = new Listar ();
        CadastroJogo.setVisible(true);
        dispose();
    }//GEN-LAST:event_proximoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void XboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XboxActionPerformed

    private void AventuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AventuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AventuraActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Aventura;
    private javax.swing.JRadioButton Corrida;
    private javax.swing.JTextField Fabricante;
    private javax.swing.JRadioButton MOBA;
    private javax.swing.JCheckBox PC;
    private javax.swing.JRadioButton RPG;
    private javax.swing.JButton Salvar1;
    private javax.swing.JCheckBox Xbox;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel idade;
    private javax.swing.JButton inserir;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox jcb1;
    private javax.swing.JCheckBox jcb2;
    private javax.swing.JPanel jpIdade1;
    private javax.swing.JRadioButton jrbF;
    private javax.swing.JRadioButton jrbM;
    private javax.swing.JButton proximo;
    private javax.swing.JLabel quantidade;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}