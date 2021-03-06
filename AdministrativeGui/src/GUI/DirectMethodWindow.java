
package GUI;
import Process.*;



/**
 *
 * @author Anabell
 */
public class DirectMethodWindow extends javax.swing.JFrame 
{
    AccountingMath2 met = new AccountingMath2();

    /**
     * Creates new form NewJFrame
     */
    public DirectMethodWindow() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Ventas = new javax.swing.JFormattedTextField();
        CostoUnitVentas = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        VentasNetas = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CostoVarProd = new javax.swing.JFormattedTextField();
        CostoVarOp = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        CostoVarUnit = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        InvInicial = new javax.swing.JFormattedTextField();
        ArtManuf = new javax.swing.JFormattedTextField();
        InvFinal = new javax.swing.JFormattedTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        CostoVarVenta = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        UtilidadNeta = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MargenContr = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        CostoFijoProd = new javax.swing.JFormattedTextField();
        CostoFijoAdm = new javax.swing.JFormattedTextField();
        CostoFijo = new javax.swing.JFormattedTextField();
        jSeparator13 = new javax.swing.JSeparator();
        Calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Ventas");
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(100, 120, 100, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Costo de ventas unitario");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(60, 150, 150, 20);

        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });
        Ventas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VentasKeyTyped(evt);
            }
        });
        jPanel2.add(Ventas);
        Ventas.setBounds(300, 120, 80, 20);

        CostoUnitVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoUnitVentasActionPerformed(evt);
            }
        });
        CostoUnitVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoUnitVentasKeyTyped(evt);
            }
        });
        jPanel2.add(CostoUnitVentas);
        CostoUnitVentas.setBounds(300, 150, 80, 20);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("VENTAS NETAS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 190, 120, 17);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(250, 180, 170, 10);

        VentasNetas.setEditable(false);
        jPanel2.add(VentasNetas);
        VentasNetas.setBounds(300, 190, 80, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Costo Variable Unitario de produccion");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 240, 220, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Costo Variable Unitario de operacion");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 270, 220, 17);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(80, 260, 0, 0);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Costo Variable Unitario");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 310, 160, 20);

        CostoVarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoVarProdKeyTyped(evt);
            }
        });
        jPanel2.add(CostoVarProd);
        CostoVarProd.setBounds(300, 240, 80, 20);

        CostoVarOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoVarOpActionPerformed(evt);
            }
        });
        CostoVarOp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoVarOpKeyTyped(evt);
            }
        });
        jPanel2.add(CostoVarOp);
        CostoVarOp.setBounds(300, 270, 80, 20);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(260, 300, 160, 10);

        CostoVarUnit.setEditable(false);
        jPanel2.add(CostoVarUnit);
        CostoVarUnit.setBounds(300, 310, 80, 20);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(240, 372, 140, 0);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Inventario Inicial");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(90, 380, 100, 17);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Costo articulos manofacturados");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(50, 410, 180, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Inventario Final");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(90, 440, 120, 17);

        InvInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvInicialActionPerformed(evt);
            }
        });
        InvInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InvInicialKeyTyped(evt);
            }
        });
        jPanel2.add(InvInicial);
        InvInicial.setBounds(300, 370, 80, 20);

        ArtManuf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtManufActionPerformed(evt);
            }
        });
        ArtManuf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ArtManufKeyTyped(evt);
            }
        });
        jPanel2.add(ArtManuf);
        ArtManuf.setBounds(300, 400, 80, 20);

        InvFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InvFinalKeyTyped(evt);
            }
        });
        jPanel2.add(InvFinal);
        InvFinal.setBounds(300, 430, 80, 20);
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(240, 460, 190, 10);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("COSTO VARIABLE DE VENTA");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(40, 470, 190, 20);

        CostoVarVenta.setEditable(false);
        jPanel2.add(CostoVarVenta);
        CostoVarVenta.setBounds(300, 470, 80, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("UTILIDAD NETA");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(80, 720, 130, 20);
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(220, 500, 230, 10);

        UtilidadNeta.setEditable(false);
        jPanel2.add(UtilidadNeta);
        UtilidadNeta.setBounds(300, 720, 80, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("  METODO DIRECTO");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(150, 60, 150, 17);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("ESTADO DE RESULTADO");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(120, 30, 220, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("MARGEN DE CONTRIBUCION");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 520, 210, 17);

        MargenContr.setEditable(false);
        MargenContr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MargenContrActionPerformed(evt);
            }
        });
        jPanel2.add(MargenContr);
        MargenContr.setBounds(300, 520, 80, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Costo Fijo de Produccion");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(70, 590, 150, 17);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Gasto Fijo de Administracion");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(50, 620, 180, 17);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setText("Costo Fijo");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(100, 670, 70, 17);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(210, 700, 250, 10);

        CostoFijoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoFijoProdActionPerformed(evt);
            }
        });
        CostoFijoProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoFijoProdKeyTyped(evt);
            }
        });
        jPanel2.add(CostoFijoProd);
        CostoFijoProd.setBounds(300, 590, 80, 20);

        CostoFijoAdm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoFijoAdmKeyTyped(evt);
            }
        });
        jPanel2.add(CostoFijoAdm);
        CostoFijoAdm.setBounds(300, 620, 80, 20);

        CostoFijo.setEditable(false);
        CostoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoFijoActionPerformed(evt);
            }
        });
        jPanel2.add(CostoFijo);
        CostoFijo.setBounds(300, 670, 80, 20);
        jPanel2.add(jSeparator13);
        jSeparator13.setBounds(260, 650, 150, 10);

        Calcular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPanel2.add(Calcular);
        Calcular.setBounds(270, 790, 130, 23);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Con precio Unitario", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        AccountingMath2 met = new AccountingMath2();
        VentasNetas.setValue(met.Ventas());
        CostoVarUnit.setValue(met.CostoVariable());
        CostoVarVenta.setValue(met.CostoVariableDeVenta());
        MargenContr.setValue(met.Margen());
        CostoFijo.setValue(met.CostoFijo());
        UtilidadNeta.setValue(met.UtilidadNeta());

    }//GEN-LAST:event_CalcularActionPerformed

    private void CostoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostoFijoActionPerformed

    private void CostoFijoAdmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoFijoAdmKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c!='.')
        {
            evt.consume();
        } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_CostoFijoAdmKeyTyped

    private void CostoFijoProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoFijoProdKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c!='.')
        {
            evt.consume();
        } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_CostoFijoProdKeyTyped

    private void CostoFijoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoFijoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostoFijoProdActionPerformed

    private void MargenContrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MargenContrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MargenContrActionPerformed

    private void InvFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InvFinalKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c!='.')
        {
            evt.consume();
        } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_InvFinalKeyTyped

    private void ArtManufKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ArtManufKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c!='.')
        {
            evt.consume();
        } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_ArtManufKeyTyped

    private void ArtManufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtManufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArtManufActionPerformed

    private void InvInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InvInicialKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c!='.')
        {
            evt.consume();
        } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_InvInicialKeyTyped

    private void InvInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvInicialActionPerformed

    private void CostoVarOpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoVarOpKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c!='.')
        {
            evt.consume();
        } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_CostoVarOpKeyTyped

    private void CostoVarOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoVarOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostoVarOpActionPerformed

    private void CostoVarProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoVarProdKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c!='.')
        {
            evt.consume();
        } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_CostoVarProdKeyTyped

    private void CostoUnitVentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoUnitVentasKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c!='.')
        {
            evt.consume();
        } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_CostoUnitVentasKeyTyped

    private void CostoUnitVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoUnitVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostoUnitVentasActionPerformed

    private void VentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentasKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c!='.')
        {
            evt.consume();
        } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_VentasKeyTyped

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentasActionPerformed

    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4AncestorAdded

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
            java.util.logging.Logger.getLogger(DirectMethodWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DirectMethodWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DirectMethodWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DirectMethodWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DirectMethodWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JFormattedTextField ArtManuf;
    private javax.swing.JButton Calcular;
    public static javax.swing.JFormattedTextField CostoFijo;
    public static javax.swing.JFormattedTextField CostoFijoAdm;
    public static javax.swing.JFormattedTextField CostoFijoProd;
    public static javax.swing.JFormattedTextField CostoUnitVentas;
    public static javax.swing.JFormattedTextField CostoVarOp;
    public static javax.swing.JFormattedTextField CostoVarProd;
    public static javax.swing.JFormattedTextField CostoVarUnit;
    public static javax.swing.JFormattedTextField CostoVarVenta;
    public static javax.swing.JFormattedTextField InvFinal;
    public static javax.swing.JFormattedTextField InvInicial;
    public static javax.swing.JFormattedTextField MargenContr;
    public static javax.swing.JFormattedTextField UtilidadNeta;
    public static javax.swing.JFormattedTextField Ventas;
    public static javax.swing.JFormattedTextField VentasNetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    
}
