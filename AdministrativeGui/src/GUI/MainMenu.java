/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Component;
import java.awt.event.*;
import java.io.File;
import javax.swing.JFileChooser;
/**
 *
 * @author Joker_Queen
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    class mouseClicked extends MouseEvent{
    
        public mouseClicked(Component source, int id, long when, int modifiers, int x, int y, int clickCount, boolean popupTrigger, int button) {
            super(source, id, when, modifiers, x, y, clickCount, popupTrigger, button);
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        calculatorTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        worktable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        accountingEntityPanel = new javax.swing.JPanel();
        _enterpriseLBL = new javax.swing.JLabel();
        entityIDTextField = new javax.swing.JTextField();
        entityIDlabel = new javax.swing.JLabel();
        entityDateLabel = new javax.swing.JLabel();
        entityNameTextField = new javax.swing.JTextField();
        entityTitleLabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        _codeLabel = new javax.swing.JLabel();
        codeTxtField = new javax.swing.JTextField();
        accountTxtField = new javax.swing.JTextField();
        account_Label = new javax.swing.JLabel();
        accValue_Label = new javax.swing.JLabel();
        valueTxtField = new javax.swing.JTextField();
        accountsTitleLabel = new javax.swing.JLabel();
        AppMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        windowMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 102));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setName("MainMenuFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(null);
        getContentPane().add(calculatorTxtField);
        calculatorTxtField.setBounds(120, 20, 460, 30);

        worktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Filas/Columnas", "Código", "Cuenta", "Valor de Cuenta", "Sub-Operacion Disp.", "Operacion Disp", "Total Operación Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(worktable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 840, 470);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "f(x):", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(46, 20, 70, 30);

        accountingEntityPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        accountingEntityPanel.setLayout(new java.awt.GridBagLayout());

        _enterpriseLBL.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        _enterpriseLBL.setText("Enterprise");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        accountingEntityPanel.add(_enterpriseLBL, gridBagConstraints);

        entityIDTextField.setPreferredSize(new java.awt.Dimension(100, 20));
        entityIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entityIDTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        accountingEntityPanel.add(entityIDTextField, gridBagConstraints);

        entityIDlabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        entityIDlabel.setText("ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        accountingEntityPanel.add(entityIDlabel, gridBagConstraints);

        entityDateLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        entityDateLabel.setText("Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        accountingEntityPanel.add(entityDateLabel, gridBagConstraints);

        entityNameTextField.setPreferredSize(new java.awt.Dimension(100, 20));
        entityNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entityNameTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        accountingEntityPanel.add(entityNameTextField, gridBagConstraints);

        entityTitleLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        entityTitleLabel.setText("Accounting Entity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        accountingEntityPanel.add(entityTitleLabel, gridBagConstraints);

        jDateChooser1.setMinimumSize(new java.awt.Dimension(100, 20));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        accountingEntityPanel.add(jDateChooser1, gridBagConstraints);

        getContentPane().add(accountingEntityPanel);
        accountingEntityPanel.setBounds(880, 30, 210, 130);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        _codeLabel.setText("Code:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel2.add(_codeLabel, gridBagConstraints);

        codeTxtField.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(codeTxtField, gridBagConstraints);

        accountTxtField.setPreferredSize(new java.awt.Dimension(100, 20));
        accountTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTxtFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(accountTxtField, gridBagConstraints);

        account_Label.setText("Account: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel2.add(account_Label, gridBagConstraints);

        accValue_Label.setText("Account Value: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel2.add(accValue_Label, gridBagConstraints);

        valueTxtField.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(valueTxtField, gridBagConstraints);

        accountsTitleLabel.setText("Accounts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(accountsTitleLabel, gridBagConstraints);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(870, 200, 210, 120);

        AppMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        AppMenuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AppMenuBar.setOpaque(false);
        AppMenuBar.setPreferredSize(new java.awt.Dimension(180, 25));

        fileMenu.setText("File");
        fileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileMenuMouseClicked(evt);
            }
        });
        AppMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        jMenuItem2.setText("Type of Costing");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem2);

        AppMenuBar.add(editMenu);

        viewMenu.setText("View");
        AppMenuBar.add(viewMenu);

        windowMenu.setText("Window");
        AppMenuBar.add(windowMenu);

        helpMenu.setText("Help");
        AppMenuBar.add(helpMenu);

        setJMenuBar(AppMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void entityIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entityIDTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_entityIDTextFieldActionPerformed

    private void accountTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTxtFieldActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void entityNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entityNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entityNameTextFieldActionPerformed

    private void fileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuMouseClicked
        // TODO add your handling code here:
        fileFrame f = new fileFrame();
        this.setVisible(false);
        
        f.setVisible(true);
        
    }//GEN-LAST:event_fileMenuMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar AppMenuBar;
    private javax.swing.JLabel _codeLabel;
    private javax.swing.JLabel _enterpriseLBL;
    private javax.swing.JLabel accValue_Label;
    private javax.swing.JTextField accountTxtField;
    private javax.swing.JLabel account_Label;
    private javax.swing.JPanel accountingEntityPanel;
    private javax.swing.JLabel accountsTitleLabel;
    private javax.swing.JTextField calculatorTxtField;
    private javax.swing.JTextField codeTxtField;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel entityDateLabel;
    private javax.swing.JTextField entityIDTextField;
    private javax.swing.JLabel entityIDlabel;
    private javax.swing.JTextField entityNameTextField;
    private javax.swing.JLabel entityTitleLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField valueTxtField;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JMenu windowMenu;
    private javax.swing.JTable worktable;
    // End of variables declaration//GEN-END:variables
}
