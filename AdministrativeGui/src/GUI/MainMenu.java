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
import javax.swing.JTable;
/**
 *
 * @author Joker_Queen
 */
public class MainMenu extends javax.swing.JFrame {

    private int [] columnRow;
    private int yAxis;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        yAxis = workTable.getRowCount();
        this.fillingColumnRow(yAxis);
    }

    public void fillingColumnRow(int yAxis){
        columnRow = new int [yAxis];
        
        for (int i = 0; i < yAxis; i++){
            columnRow[i] = i+1;
            workTable.setValueAt(columnRow[i], i, 0);
        }
    }
    
    public void fillingColumnRow(int yAxis, JTable table)
    {
        columnRow = new int [yAxis];
        
        for (int i = 0; i < table.getRowCount(); i++){
            if(table.getValueAt(i, 0) == null)
            {
                
            }
        }
        
        for (int i = 0; i < yAxis; i++){
            columnRow[i] = i+1;
            workTable.setValueAt(columnRow[i], i, 0);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        workTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        coordinatesComboBox = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        acceptButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fxButton = new javax.swing.JButton();
        calculatorTxtField = new javax.swing.JTextField();
        revealingEcButton = new javax.swing.JButton();
        AppMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        windowMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setName("MainMenuFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(null);

        workTable.setModel(new javax.swing.table.DefaultTableModel(
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
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workTable.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                workTableMouseWheelMoved(evt);
            }
        });
        workTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 1100, 510);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        coordinatesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "f(x):", " " }));
        coordinatesComboBox.setMinimumSize(new java.awt.Dimension(100, 24));
        coordinatesComboBox.setOpaque(false);
        coordinatesComboBox.setPreferredSize(new java.awt.Dimension(100, 24));
        coordinatesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordinatesComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(coordinatesComboBox);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        acceptButton.setText("Y");
        acceptButton.setOpaque(false);
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(acceptButton, gridBagConstraints);

        jButton2.setText("X");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jButton2, gridBagConstraints);

        fxButton.setText("fx");
        fxButton.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(fxButton, gridBagConstraints);

        calculatorTxtField.setOpaque(false);
        calculatorTxtField.setPreferredSize(new java.awt.Dimension(550, 35));
        jPanel1.add(calculatorTxtField, new java.awt.GridBagConstraints());

        revealingEcButton.setText("v");
        revealingEcButton.setOpaque(false);
        jPanel1.add(revealingEcButton, new java.awt.GridBagConstraints());

        jToolBar1.add(jPanel1);

        jPanel3.add(jToolBar1);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1100, 40);

        AppMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        AppMenuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AppMenuBar.setOpaque(false);
        AppMenuBar.setPreferredSize(new java.awt.Dimension(180, 25));

        fileMenu.setBackground(new java.awt.Color(204, 204, 204));
        fileMenu.setText("Archivo");
        fileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileMenuMouseClicked(evt);
            }
        });
        AppMenuBar.add(fileMenu);

        editMenu.setBackground(new java.awt.Color(204, 204, 204));
        editMenu.setText("Edición");

        jMenuItem2.setText("Type of Costing");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem2);

        AppMenuBar.add(editMenu);

        viewMenu.setBackground(new java.awt.Color(204, 204, 204));
        viewMenu.setText("Vista");
        AppMenuBar.add(viewMenu);

        windowMenu.setBackground(new java.awt.Color(204, 204, 204));
        windowMenu.setText("Ventana");
        AppMenuBar.add(windowMenu);

        helpMenu.setBackground(new java.awt.Color(204, 204, 204));
        helpMenu.setText("Ayuda");
        AppMenuBar.add(helpMenu);

        setJMenuBar(AppMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coordinatesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordinatesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordinatesComboBoxActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void fileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuMouseClicked
        // TODO add your handling code here:
        fileFrame f = new fileFrame();
        this.setVisible(false);
        
        f.setVisible(true);
        
    }//GEN-LAST:event_fileMenuMouseClicked

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void workTableMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_workTableMouseWheelMoved
        // TODO add your handling code here:
        yAxis = evt.getUnitsToScroll()+workTable.getRowCount();
        if(!evt.isShiftDown())
        {
            this.fillingColumnRow(yAxis);
        }
    }//GEN-LAST:event_workTableMouseWheelMoved

    private void workTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workTableMouseClicked
        // TODO add your handling code here:
        if (evt.getComponent() == workTable)
        {
            workTable.getCellEditor();
            
        }
    }//GEN-LAST:event_workTableMouseClicked

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
    private javax.swing.JButton acceptButton;
    private javax.swing.JTextField calculatorTxtField;
    private javax.swing.JComboBox<String> coordinatesComboBox;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton fxButton;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton revealingEcButton;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JMenu windowMenu;
    private javax.swing.JTable workTable;
    // End of variables declaration//GEN-END:variables
}
