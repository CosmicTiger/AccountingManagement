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
        selling1 = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        invInicial1 = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        UtilidadBruta = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        gastoOp = new javax.swing.JFormattedTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        utilidadOperacion = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        manufTotal1 = new javax.swing.JFormattedTextField();
        invFinal1 = new javax.swing.JFormattedTextField();
        costoDeVentas = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        gastoVenta = new javax.swing.JFormattedTextField();
        gastoAdm = new javax.swing.JFormattedTextField();
        gastoFinanc = new javax.swing.JFormattedTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        Calcular = new javax.swing.JButton();
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
        sellingCost = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        rawUti = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        var_sellingSpending = new javax.swing.JFormattedTextField();
        jSeparator13 = new javax.swing.JSeparator();
        operationSpend = new javax.swing.JFormattedTextField();
        jLabel40 = new javax.swing.JLabel();
        operationUti = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        static_AdminCost = new javax.swing.JFormattedTextField();
        calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel20.setText("VENTAS NETAS");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(110, 110, 100, 20);

        selling1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selling1ActionPerformed(evt);
            }
        });
        jPanel4.add(selling1);
        selling1.setBounds(260, 110, 80, 20);
        jPanel4.add(jLabel23);
        jLabel23.setBounds(80, 260, 0, 0);
        jPanel4.add(jSeparator9);
        jSeparator9.setBounds(240, 372, 140, 0);

        invInicial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invInicial1ActionPerformed(evt);
            }
        });
        jPanel4.add(invInicial1);
        invInicial1.setBounds(260, 170, 80, 20);

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
        jPanel4.add(UtilidadBruta);
        UtilidadBruta.setBounds(260, 340, 80, 20);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("  METODO ABSORBENTE");
        jPanel4.add(jLabel33);
        jLabel33.setBounds(150, 50, 160, 17);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("ESTADO DE RESULTADO");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(130, 20, 220, 22);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel41.setText("GASTO DE OPERACION");
        jPanel4.add(jLabel41);
        jLabel41.setBounds(60, 520, 140, 20);

        gastoOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastoOpActionPerformed(evt);
            }
        });
        jPanel4.add(gastoOp);
        gastoOp.setBounds(260, 520, 80, 20);
        jPanel4.add(jSeparator5);
        jSeparator5.setBounds(60, 570, 330, 10);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("UTILIDAD DE OPERACION");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(60, 590, 170, 20);

        utilidadOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilidadOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(utilidadOperacion);
        utilidadOperacion.setBounds(260, 590, 80, 20);

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

        manufTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufTotal1ActionPerformed(evt);
            }
        });
        jPanel4.add(manufTotal1);
        manufTotal1.setBounds(260, 210, 80, 20);

        invFinal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invFinal1ActionPerformed(evt);
            }
        });
        jPanel4.add(invFinal1);
        invFinal1.setBounds(260, 250, 80, 20);

        costoDeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoDeVentasActionPerformed(evt);
            }
        });
        jPanel4.add(costoDeVentas);
        costoDeVentas.setBounds(260, 300, 80, 20);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel24.setText("Gastos de Venta");
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

        gastoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastoVentaActionPerformed(evt);
            }
        });
        jPanel4.add(gastoVenta);
        gastoVenta.setBounds(260, 410, 80, 20);

        gastoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastoAdmActionPerformed(evt);
            }
        });
        jPanel4.add(gastoAdm);
        gastoAdm.setBounds(260, 440, 80, 20);

        gastoFinanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastoFinancActionPerformed(evt);
            }
        });
        jPanel4.add(gastoFinanc);
        gastoFinanc.setBounds(260, 470, 80, 20);
        jPanel4.add(jSeparator8);
        jSeparator8.setBounds(50, 330, 330, 10);
        jPanel4.add(jSeparator10);
        jSeparator10.setBounds(60, 500, 330, 10);

        Calcular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPanel4.add(Calcular);
        Calcular.setBounds(260, 650, 90, 23);

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

        sellingCost.setEditable(false);
        jPanel2.add(sellingCost);
        sellingCost.setBounds(280, 570, 80, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setText("UTILIDAD BRUTA");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(50, 630, 110, 14);
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(200, 610, 240, 10);

        rawUti.setEditable(false);
        rawUti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rawUtiActionPerformed(evt);
            }
        });
        jPanel2.add(rawUti);
        rawUti.setBounds(280, 620, 80, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("  METODO ABSORBENTE");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(140, 50, 160, 14);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel18.setText("ESTADO DE RESULTADO");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(130, 20, 190, 18);
        jPanel2.add(jLabel36);
        jLabel36.setBounds(70, 690, 0, 0);
        jPanel2.add(jLabel37);
        jLabel37.setBounds(80, 700, 0, 0);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel38.setText("Gasto Variable de Venta por unidad");
        jPanel2.add(jLabel38);
        jLabel38.setBounds(30, 680, 180, 20);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel39.setText("GASTO DE OPERACION");
        jPanel2.add(jLabel39);
        jLabel39.setBounds(40, 760, 140, 10);
        jPanel2.add(var_sellingSpending);
        var_sellingSpending.setBounds(280, 680, 80, 20);
        jPanel2.add(jSeparator13);
        jSeparator13.setBounds(230, 740, 180, 10);

        operationSpend.setEditable(false);
        operationSpend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationSpendActionPerformed(evt);
            }
        });
        jPanel2.add(operationSpend);
        operationSpend.setBounds(280, 760, 80, 20);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel40.setText("UTILIDAD DE OPERACION");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(30, 810, 160, 20);

        operationUti.setEditable(false);
        operationUti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationUtiActionPerformed(evt);
            }
        });
        jPanel2.add(operationUti);
        operationUti.setBounds(280, 810, 80, 20);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel25.setText("Costo Fijo de Administracion");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(40, 720, 150, 10);

        static_AdminCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                static_AdminCostActionPerformed(evt);
            }
        });
        jPanel2.add(static_AdminCost);
        static_AdminCost.setBounds(280, 710, 80, 20);

        calcular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        calcular.setText("Calcular");
        calcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        jPanel2.add(calcular);
        calcular.setBounds(260, 870, 110, 20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
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

    private void invInicial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invInicial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invInicial1ActionPerformed

    private void operationSpendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationSpendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operationSpendActionPerformed

    private void operationUtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationUtiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operationUtiActionPerformed

    private void gastoOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastoOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gastoOpActionPerformed

    private void utilidadOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilidadOperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utilidadOperacionActionPerformed

    private void manufTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufTotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufTotal1ActionPerformed

    private void invFinal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invFinal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invFinal1ActionPerformed

    private void costoDeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoDeVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoDeVentasActionPerformed

    private void static_AdminCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_static_AdminCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_static_AdminCostActionPerformed

    private void gastoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gastoVentaActionPerformed

    private void gastoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastoAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gastoAdmActionPerformed

    private void gastoFinancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastoFinancActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gastoFinancActionPerformed

    private void static_TotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_static_TotalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_static_TotalCostActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
      AccountingMath calculo = new AccountingMath();
      totalSelling.setValue(calculo.Ventas());
      
      static_TotalCost.setValue(calculo.costoFijoTotal());
      
      manufCost.setValue(calculo.costoArtiManufact());
      
      initialInventory.setValue(calculo.inventarioInic());
      
      totalManufCost.setValue(calculo.costoManufTotal());
      
      invFinal.setValue(calculo.inventarioFinal());
      
      sellingCost.setValue(calculo.CostoDeVentas());
      
      rawUti.setValue(calculo.utilidadBruta());
      
      operationSpend.setValue(calculo.gastoOperacion());
      
      operationUti.setValue(calculo.utilidadOperacion());
      
      
      
      
      
      
    }//GEN-LAST:event_calcularActionPerformed

    private void sellingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingKeyTyped
        char c=evt.getKeyChar();
                if((c<'0'||c>'9')&&c!='.')
                { 
                    evt.consume();
                } /*ioexc.... para aceptar numeros*/
    }//GEN-LAST:event_sellingKeyTyped

    private void rawUtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rawUtiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rawUtiActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        
        AccountingMath calculo = new AccountingMath();
        costoDeVentas.setValue(calculo.CostoDeVentas1());
        UtilidadBruta.setValue(calculo.UtilidadBruta());
        gastoOp.setValue(calculo.GastoDeOperacion());
        utilidadOperacion.setValue(calculo.UtilidadOp());
        
    }//GEN-LAST:event_CalcularActionPerformed

    private void selling1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selling1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selling1ActionPerformed

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
    private javax.swing.JButton Calcular;
    public static javax.swing.JFormattedTextField UtilidadBruta;
    private javax.swing.JButton calcular;
    public static javax.swing.JFormattedTextField costoDeVentas;
    public static javax.swing.JFormattedTextField gastoAdm;
    public static javax.swing.JFormattedTextField gastoFinanc;
    public static javax.swing.JFormattedTextField gastoOp;
    public static javax.swing.JFormattedTextField gastoVenta;
    public static javax.swing.JFormattedTextField initialInventory;
    public static javax.swing.JFormattedTextField invFinal;
    public static javax.swing.JFormattedTextField invFinal1;
    public static javax.swing.JFormattedTextField invInicial1;
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
    public static javax.swing.JFormattedTextField manufTotal1;
    public static javax.swing.JFormattedTextField operationSpend;
    public static javax.swing.JFormattedTextField operationUti;
    public static javax.swing.JFormattedTextField production;
    public static javax.swing.JFormattedTextField quantityProduct;
    public static javax.swing.JFormattedTextField rawUti;
    public static javax.swing.JFormattedTextField selling;
    public static javax.swing.JFormattedTextField selling1;
    public static javax.swing.JFormattedTextField sellingCost;
    public static javax.swing.JFormattedTextField static_AdminCost;
    public static javax.swing.JFormattedTextField static_TotalCost;
    public static javax.swing.JFormattedTextField static_UnitCost;
    public static javax.swing.JFormattedTextField totalManufCost;
    public static javax.swing.JFormattedTextField totalSelling;
    public static javax.swing.JFormattedTextField utilidadOperacion;
    public static javax.swing.JFormattedTextField var_UnitCost;
    public static javax.swing.JFormattedTextField var_sellingSpending;
    // End of variables declaration//GEN-END:variables
}
