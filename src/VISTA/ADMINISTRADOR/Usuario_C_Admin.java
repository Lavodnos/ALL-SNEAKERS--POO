package VISTA.ADMINISTRADOR;

 
 
 
import java.awt.Color;

public class Usuario_C_Admin extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Usuario_C_Admin() {
        initComponents();
       
 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnStock = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        LABELADMINSTRADOR1 = new javax.swing.JLabel();
        LABELADMINSTRADOR = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        lbalelogo = new javax.swing.JLabel();
        LabelDash = new javax.swing.JLabel();
        header2 = new javax.swing.JPanel();
        LABELADMINSTRADOR2 = new javax.swing.JLabel();
        btnInicio1 = new javax.swing.JButton();
        btnCREARUSUARIO = new javax.swing.JButton();
        txtDNIUSUARIO = new javax.swing.JTextField();
        LABELADMINSTRADOR3 = new javax.swing.JLabel();
        txtNOMBREAPELLIDOUSU = new javax.swing.JTextField();
        LABELADMINSTRADOR4 = new javax.swing.JLabel();
        txtCORREOUSU = new javax.swing.JTextField();
        CBOCARGOUSUA = new javax.swing.JComboBox<>();
        LABELADMINSTRADOR6 = new javax.swing.JLabel();
        LABELADMINSTRADOR7 = new javax.swing.JLabel();
        txtContraseUSU = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStock.setBackground(new java.awt.Color(204, 204, 204));
        btnStock.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        btnStock.setForeground(new java.awt.Color(0, 0, 0));
        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/editar-product.png"))); // NOI18N
        btnStock.setText("    STOCK");
        btnStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStockMouseClicked(evt);
            }
        });
        bg.add(btnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 190, 40));

        btnProductos.setBackground(new java.awt.Color(204, 204, 204));
        btnProductos.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/editar-product.png"))); // NOI18N
        btnProductos.setText("    PRODUCTOS");
        btnProductos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });
        bg.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 190, 40));

        btnInventario.setBackground(new java.awt.Color(204, 204, 204));
        btnInventario.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(0, 0, 0));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/INVENTARIO.png"))); // NOI18N
        btnInventario.setText("    INVENTARIO");
        btnInventario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        bg.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 190, 40));

        btnUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        btnUsuarios.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/edition_user.png"))); // NOI18N
        btnUsuarios.setText("    USUARIOS");
        btnUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        bg.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 190, 40));

        btnReportes.setBackground(new java.awt.Color(204, 204, 204));
        btnReportes.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(0, 0, 0));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/REPORTE.png"))); // NOI18N
        btnReportes.setText("    REPORTES");
        btnReportes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        bg.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 190, 40));

        btnCategoria.setBackground(new java.awt.Color(204, 204, 204));
        btnCategoria.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        btnCategoria.setForeground(new java.awt.Color(0, 0, 0));
        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Inicio.png"))); // NOI18N
        btnCategoria.setText("     CATEGORIAS");
        btnCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        bg.add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 190, -1));

        jLabel2.setText("-----------------------------------------------------------------");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, -1));

        header.setBackground(new java.awt.Color(0, 74, 173));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LABELADMINSTRADOR1.setBackground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        LABELADMINSTRADOR1.setForeground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LogoAll -PEQ.png"))); // NOI18N
        LABELADMINSTRADOR1.setText("ADMINISTRADOR");

        LABELADMINSTRADOR.setBackground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        LABELADMINSTRADOR.setForeground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR.setText("CREAR USUARIO");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LABELADMINSTRADOR1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(505, 505, 505)
                .addComponent(LABELADMINSTRADOR)
                .addContainerGap(550, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABELADMINSTRADOR1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABELADMINSTRADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 50));

        header1.setBackground(new java.awt.Color(0, 74, 173));
        header1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header1MouseDragged(evt);
            }
        });
        header1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header1MousePressed(evt);
            }
        });
        header1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbalelogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LogoAll.png"))); // NOI18N
        header1.add(lbalelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 170, 120));

        LabelDash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/POSTER1.png"))); // NOI18N
        header1.add(LabelDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 230, 470, 790));

        bg.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        header2.setBackground(new java.awt.Color(255, 255, 255));
        header2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header2MouseDragged(evt);
            }
        });
        header2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bg.add(header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 230, 710));

        LABELADMINSTRADOR2.setBackground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR2.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        LABELADMINSTRADOR2.setForeground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ID.png"))); // NOI18N
        LABELADMINSTRADOR2.setText("    DNI :");
        bg.add(LABELADMINSTRADOR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 210, 60));

        btnInicio1.setBackground(new java.awt.Color(204, 204, 204));
        btnInicio1.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        btnInicio1.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/menos.png"))); // NOI18N
        btnInicio1.setText("LIMPIAR");
        btnInicio1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });
        bg.add(btnInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 650, 190, 40));

        btnCREARUSUARIO.setBackground(new java.awt.Color(204, 204, 204));
        btnCREARUSUARIO.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        btnCREARUSUARIO.setForeground(new java.awt.Color(0, 0, 0));
        btnCREARUSUARIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/editar-product.png"))); // NOI18N
        btnCREARUSUARIO.setText("CREAR USUARIO");
        btnCREARUSUARIO.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCREARUSUARIO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCREARUSUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCREARUSUARIOMouseClicked(evt);
            }
        });
        btnCREARUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCREARUSUARIOActionPerformed(evt);
            }
        });
        bg.add(btnCREARUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 650, 190, 40));

        txtDNIUSUARIO.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        bg.add(txtDNIUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 650, 40));

        LABELADMINSTRADOR3.setBackground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR3.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        LABELADMINSTRADOR3.setForeground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/categorizacion.png"))); // NOI18N
        LABELADMINSTRADOR3.setText("    CARGO : ");
        bg.add(LABELADMINSTRADOR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 220, 60));

        txtNOMBREAPELLIDOUSU.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        bg.add(txtNOMBREAPELLIDOUSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 650, 40));

        LABELADMINSTRADOR4.setBackground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR4.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        LABELADMINSTRADOR4.setForeground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/correo.png"))); // NOI18N
        LABELADMINSTRADOR4.setText("       CORREO : ");
        bg.add(LABELADMINSTRADOR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 220, 50));

        txtCORREOUSU.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        bg.add(txtCORREOUSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 650, 30));

        CBOCARGOUSUA.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        CBOCARGOUSUA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ADMINISTRADOR", "PROVEDOR", "CAJERO", " " }));
        bg.add(CBOCARGOUSUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 650, -1));

        LABELADMINSTRADOR6.setBackground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR6.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        LABELADMINSTRADOR6.setForeground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/placa-de-nombre.png"))); // NOI18N
        LABELADMINSTRADOR6.setText("   NOMBRE Y APELLIDOS :");
        bg.add(LABELADMINSTRADOR6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 240, 60));

        LABELADMINSTRADOR7.setBackground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR7.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        LABELADMINSTRADOR7.setForeground(new java.awt.Color(255, 255, 255));
        LABELADMINSTRADOR7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/padlock.png"))); // NOI18N
        LABELADMINSTRADOR7.setText("        CONTRASEÑA :");
        bg.add(LABELADMINSTRADOR7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 220, 50));
        bg.add(txtContraseUSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 650, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void header1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_header1MouseDragged

    private void header1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_header1MousePressed

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void header2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_header2MouseDragged

    private void header2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_header2MousePressed

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
       
    }//GEN-LAST:event_btnInicio1ActionPerformed

    private void btnCREARUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCREARUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCREARUSUARIOActionPerformed

    private void btnCREARUSUARIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCREARUSUARIOMouseClicked
 
        ///al dar click se hara la consulktr
          ///generar objeto de creacion de usuario y llamar a base datos

        
    }//GEN-LAST:event_btnCREARUSUARIOMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesMouseClicked

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStockMouseClicked

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
            java.util.logging.Logger.getLogger(Usuario_C_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario_C_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario_C_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario_C_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Usuario_C_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CBOCARGOUSUA;
    private javax.swing.JLabel LABELADMINSTRADOR;
    private javax.swing.JLabel LABELADMINSTRADOR1;
    private javax.swing.JLabel LABELADMINSTRADOR2;
    private javax.swing.JLabel LABELADMINSTRADOR3;
    private javax.swing.JLabel LABELADMINSTRADOR4;
    private javax.swing.JLabel LABELADMINSTRADOR6;
    private javax.swing.JLabel LABELADMINSTRADOR7;
    private javax.swing.JLabel LabelDash;
    private javax.swing.JPanel bg;
    public javax.swing.JButton btnCREARUSUARIO;
    public javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnInicio1;
    public javax.swing.JButton btnInventario;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnReportes;
    public javax.swing.JButton btnStock;
    public javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbalelogo;
    public javax.swing.JTextField txtCORREOUSU;
    public javax.swing.JPasswordField txtContraseUSU;
    public javax.swing.JTextField txtDNIUSUARIO;
    public javax.swing.JTextField txtNOMBREAPELLIDOUSU;
    // End of variables declaration//GEN-END:variables
}
