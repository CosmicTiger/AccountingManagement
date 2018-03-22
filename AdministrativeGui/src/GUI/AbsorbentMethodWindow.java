package GUI;
import Process.*;

public class AbsorbentMethodWindow extends javax.swing.JFrame {

     AccountingMath m = new AccountingMath();
    /**
     * Creates new form NewJFrame
     */
    public AbsorbentMethodWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator14 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jFormattedTextField17 = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jFormattedTextField24 = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jFormattedTextField28 = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jFormattedTextField33 = new javax.swing.JFormattedTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextField15 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jFormattedTextField16 = new javax.swing.JFormattedTextField();
        jFormattedTextField18 = new javax.swing.JFormattedTextField();
        jFormattedTextField19 = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jFormattedTextField21 = new javax.swing.JFormattedTextField();
        jFormattedTextField22 = new javax.swing.JFormattedTextField();
        jFormattedTextField23 = new javax.swing.JFormattedTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        selling = new javax.swing.JFormattedTextField();
        quantityProduct = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        totalSelling = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        static_UnitCost = new javax.swing.JFormattedTextField();
        production = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        static_TotalCost = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        var_UnitCost = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        manufCost = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        initialInventory = new javax.swing.JFormattedTextField();
        totalManufCost = new javax.swing.JFormattedTextField();
        invFinal = new javax.swing.JFormattedTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jFormattedTextField13 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jFormattedTextField14 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jFormattedTextField29 = new javax.swing.JFormattedTextField();
        jFormattedTextField30 = new javax.swing.JFormattedTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jFormattedTextField31 = new javax.swing.JFormattedTextField();
        jLabel40 = new javax.swing.JLabel();
        jFormattedTextField32 = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jFormattedTextField20 = new javax.swing.JFormattedTextField();
        calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel20.setText("VENTAS NETAS");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(110, 110, 100, 20);
        jPanel4.add(jFormattedTextField17);
        jFormattedTextField17.setBounds(260, 110, 80, 20);
        jPanel4.add(jLabel23);
        jLabel23.setBounds(80, 260, 0, 0);
        jPanel4.add(jSeparator9);
        jSeparator9.setBounds(240, 372, 140, 0);

        jFormattedTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField24ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField24);
        jFormattedTextField24.setBounds(260, 170, 80, 20);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel31.setText("COSTO DE VENTAS");
        jPanel4.add(jLabel31);
        jLabel31.setBounds(90, 300, 110, 20);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel32.setText("UTILIDAD BRUTA");
        jPanel4.add(jLabel32);
        jLabel32.setBounds(90, 350, 120, 14);
        jPanel4.add(jSeparator12);
        jSeparator12.setBounds(50, 280, 330, 10);
        jPanel4.add(jFormattedTextField28);
        jFormattedTextField28.setBounds(260, 340, 80, 20);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("  METODO ABSORBENTE");
        jPanel4.add(jLabel33);
        jLabel33.setBounds(140, 50, 160, 17);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("ESTADO DE RESULTADO");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(130, 20, 220, 22);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel41.setText("GASTO DE OPERACION");
        jPanel4.add(jLabel41);
        jLabel41.setBounds(60, 520, 140, 20);

        jFormattedTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField33ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField33);
        jFormattedTextField33.setBounds(260, 520, 80, 20);
        jPanel4.add(jSeparator5);
        jSeparator5.setBounds(60, 570, 330, 10);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("UTILIDAD DE OPERACION");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(60, 590, 170, 20);

        jFormattedTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField15ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField15);
        jFormattedTextField15.setBounds(260, 590, 80, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setText("Inventario inicial");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(110, 170, 110, 14);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel21.setText("Costo de articulos manofacturados");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(60, 210, 166, 14);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel22.setText("Inventario Final");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(95, 250, 90, 14);

        jFormattedTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField16ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField16);
        jFormattedTextField16.setBounds(260, 210, 80, 20);

        jFormattedTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField18ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField18);
        jFormattedTextField18.setBounds(260, 250, 80, 20);

        jFormattedTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField19ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField19);
        jFormattedTextField19.setBounds(260, 300, 80, 20);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel24.setText("Gastos de Operacion");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(90, 410, 120, 20);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel26.setText("Gastos de Administracion");
        jPanel4.add(jLabel26);
        jLabel26.setBounds(80, 440, 140, 20);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel27.setText("Gastos Financieros");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(100, 470, 120, 20);

        jFormattedTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField21ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField21);
        jFormattedTextField21.setBounds(260, 410, 80, 20);

        jFormattedTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField22ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField22);
        jFormattedTextField22.setBounds(260, 440, 80, 20);

        jFormattedTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField23ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField23);
        jFormattedTextField23.setBounds(260, 470, 80, 20);
        jPanel4.add(jSeparator8);
        jSeparator8.setBounds(50, 330, 330, 10);
        jPanel4.add(jSeparator10);
        jSeparator10.setBounds(60, 500, 330, 10);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 410, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Cifras conocidas", jScrollPane2);

        jPanel2.setMinimumSize(new java.awt.Dimension(446, 668));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 1000));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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
        jLabel4.setBounds(70, 100, 100, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setText("Costo de ventas unitario");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(30, 130, 130, 20);

        selling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellingActionPerformed(evt);
            }
        });
        selling.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sellingKeyTyped(evt);
            }
        });
        jPanel2.add(selling);
        selling.setBounds(280, 100, 80, 20);

        quantityProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityProductActionPerformed(evt);
            }
        });
        jPanel2.add(quantityProduct);
        quantityProduct.setBounds(280, 130, 80, 20);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("VENTAS NETAS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 170, 100, 14);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(230, 160, 170, 10);

        totalSelling.setEditable(false);
        jPanel2.add(totalSelling);
        totalSelling.setBounds(280, 170, 80, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Costo Fijo total de produccion");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 220, 160, 14);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Produccion en unidades");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 250, 113, 14);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(80, 260, 0, 0);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Costo Fijo Unitario de produccion ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 290, 170, 20);
        jPanel2.add(static_UnitCost);
        static_UnitCost.setBounds(280, 220, 80, 20);

        production.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productionActionPerformed(evt);
            }
        });
        jPanel2.add(production);
        production.setBounds(280, 250, 80, 20);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(240, 280, 160, 10);

        static_TotalCost.setEditable(false);
        static_TotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                static_TotalCostActionPerformed(evt);
            }
        });
        jPanel2.add(static_TotalCost);
        static_TotalCost.setBounds(280, 290, 80, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Costo variable unitario de produccion");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 330, 190, 14);
        jPanel2.add(var_UnitCost);
        var_UnitCost.setBounds(280, 330, 80, 20);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(240, 372, 140, 0);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(230, 370, 170, 10);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("Costo de articulos manofacturados");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 390, 180, 14);

        manufCost.setEditable(false);
        manufCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufCostActionPerformed(evt);
            }
        });
        jPanel2.add(manufCost);
        manufCost.setBounds(280, 390, 80, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Inventario Inicial");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(70, 480, 100, 14);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Costo articulos manofacturados");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(30, 510, 152, 14);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("Inventario Final");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(70, 540, 90, 14);

        initialInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialInventoryActionPerformed(evt);
            }
        });
        jPanel2.add(initialInventory);
        initialInventory.setBounds(280, 470, 80, 20);

        totalManufCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalManufCostActionPerformed(evt);
            }
        });
        jPanel2.add(totalManufCost);
        totalManufCost.setBounds(280, 500, 80, 20);
        jPanel2.add(invFinal);
        invFinal.setBounds(280, 530, 80, 20);
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(220, 560, 190, 10);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setText("COSTO DE VENTAS");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(60, 570, 110, 14);

        jFormattedTextField13.setEditable(false);
        jPanel2.add(jFormattedTextField13);
        jFormattedTextField13.setBounds(280, 570, 80, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setText("UTILIDAD BRUTA");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(50, 630, 110, 14);
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(200, 610, 240, 10);

        jFormattedTextField14.setEditable(false);
        jPanel2.add(jFormattedTextField14);
        jFormattedTextField14.setBounds(280, 620, 80, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("  METODO ABSORBENTE");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(140, 50, 160, 14);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel18.setText("ESTADO DE RESULTADO");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(130, 20, 190, 18);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel35.setText("Ventas en unidades");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(60, 690, 100, 20);
        jPanel2.add(jLabel36);
        jLabel36.setBounds(70, 690, 0, 0);
        jPanel2.add(jLabel37);
        jLabel37.setBounds(80, 700, 0, 0);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel38.setText("Gasto Variable de Venta por unidad");
        jPanel2.add(jLabel38);
        jLabel38.setBounds(30, 720, 180, 20);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel39.setText("GASTO DE OPERACION");
        jPanel2.add(jLabel39);
        jLabel39.setBounds(40, 800, 140, 14);

        jFormattedTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField29ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField29);
        jFormattedTextField29.setBounds(280, 690, 80, 20);
        jPanel2.add(jFormattedTextField30);
        jFormattedTextField30.setBounds(280, 720, 80, 20);
        jPanel2.add(jSeparator13);
        jSeparator13.setBounds(230, 780, 180, 10);

        jFormattedTextField31.setEditable(false);
        jFormattedTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField31ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField31);
        jFormattedTextField31.setBounds(280, 800, 80, 20);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel40.setText("UTILIDAD DE OPERACION");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(30, 850, 160, 20);

        jFormattedTextField32.setEditable(false);
        jFormattedTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField32ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField32);
        jFormattedTextField32.setBounds(280, 850, 80, 20);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel25.setText("Costo Fijo de Administracion");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(40, 760, 150, 14);

        jFormattedTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField20ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField20);
        jFormattedTextField20.setBounds(280, 750, 80, 20);

        calcular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        calcular.setText("Calcular");
        calcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        jPanel2.add(calcular);
        calcular.setBounds(260, 910, 110, 21);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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

    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4AncestorAdded

    private void sellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellingActionPerformed

    private void quantityProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityProductActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_quantityProductActionPerformed

    private void productionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productionActionPerformed

    private void manufCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufCostActionPerformed

    private void initialInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialInventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initialInventoryActionPerformed

    private void totalManufCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalManufCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalManufCostActionPerformed

    private void jFormattedTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField24ActionPerformed

    private void jFormattedTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField29ActionPerformed

    private void jFormattedTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField31ActionPerformed

    private void jFormattedTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField32ActionPerformed

    private void jFormattedTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField33ActionPerformed

    private void jFormattedTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField15ActionPerformed

    private void jFormattedTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField16ActionPerformed

    private void jFormattedTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField18ActionPerformed

    private void jFormattedTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField19ActionPerformed

    private void jFormattedTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField20ActionPerformed

    private void jFormattedTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField21ActionPerformed

    private void jFormattedTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField22ActionPerformed

    private void jFormattedTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField23ActionPerformed

    private void static_TotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_static_TotalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_static_TotalCostActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
      AccountingMath calculo = new AccountingMath();
      totalSelling.setValue(calculo.Ventas());
      
      
      
      
    }//GEN-LAST:event_calcularActionPerformed

    private void sellingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingKeyTyped
        char c=evt.getKeyChar();
                if((c<'0'||c>'9')&&c!='.')
                { 
                    evt.consume();
                } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_sellingKeyTyped

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
            java.util.logging.Logger.getLogger(AbsorbentMethodWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbsorbentMethodWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbsorbentMethodWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbsorbentMethodWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AbsorbentMethodWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    public static javax.swing.JFormattedTextField initialInventory;
    public static javax.swing.JFormattedTextField invFinal;
    public static javax.swing.JFormattedTextField jFormattedTextField13;
    public static javax.swing.JFormattedTextField jFormattedTextField14;
    private javax.swing.JFormattedTextField jFormattedTextField15;
    private javax.swing.JFormattedTextField jFormattedTextField16;
    private javax.swing.JFormattedTextField jFormattedTextField17;
    private javax.swing.JFormattedTextField jFormattedTextField18;
    private javax.swing.JFormattedTextField jFormattedTextField19;
    public static javax.swing.JFormattedTextField jFormattedTextField20;
    private javax.swing.JFormattedTextField jFormattedTextField21;
    private javax.swing.JFormattedTextField jFormattedTextField22;
    private javax.swing.JFormattedTextField jFormattedTextField23;
    private javax.swing.JFormattedTextField jFormattedTextField24;
    private javax.swing.JFormattedTextField jFormattedTextField28;
    public static javax.swing.JFormattedTextField jFormattedTextField29;
    public static javax.swing.JFormattedTextField jFormattedTextField30;
    public static javax.swing.JFormattedTextField jFormattedTextField31;
    public static javax.swing.JFormattedTextField jFormattedTextField32;
    private javax.swing.JFormattedTextField jFormattedTextField33;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JFormattedTextField manufCost;
    public static javax.swing.JFormattedTextField production;
    public static javax.swing.JFormattedTextField quantityProduct;
    public static javax.swing.JFormattedTextField selling;
    public static javax.swing.JFormattedTextField static_TotalCost;
    public static javax.swing.JFormattedTextField static_UnitCost;
    public static javax.swing.JFormattedTextField totalManufCost;
    public static javax.swing.JFormattedTextField totalSelling;
    public static javax.swing.JFormattedTextField var_UnitCost;
    // End of variables declaration//GEN-END:variables
}
