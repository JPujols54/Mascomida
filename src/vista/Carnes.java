package vista;

import javax.swing.JOptionPane;
import vista.Carrito;

public class Carnes extends javax.swing.JFrame {

    public int precio = 0;
    public int pepe = 499;
    public int queso = 499;
    public int jamon = 499;
    public int res = 499;
    public String selecionado = null;

    private Carrito ventanaCarrito;

    public Carnes() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(jamonTXT, "src/imagenes/13.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(pepTXT, "src/imagenes/11.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(quesoTXT, "src/imagenes/14.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(resTXT, "src/imagenes/12.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(btnBack3, "src/imagenes/back.png");
        ventanaCarrito = new Carrito();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iconVariable = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        btnVerCarrito = new javax.swing.JPanel();
        verCarritoTXT = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JPanel();
        carritoTXT = new javax.swing.JLabel();
        txtNombrePizza = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btnPepe = new javax.swing.JPanel();
        pepTXT = new javax.swing.JLabel();
        btnJamon = new javax.swing.JPanel();
        jamonTXT = new javax.swing.JLabel();
        btnQueso = new javax.swing.JPanel();
        quesoTXT = new javax.swing.JLabel();
        btnRes = new javax.swing.JPanel();
        resTXT = new javax.swing.JLabel();
        btnEXIT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 17, 12));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio.setText("Precio Total: ");

        verCarritoTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        verCarritoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verCarritoTXT.setText("Ver carrito");
        verCarritoTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verCarritoTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verCarritoTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnVerCarritoLayout = new javax.swing.GroupLayout(btnVerCarrito);
        btnVerCarrito.setLayout(btnVerCarritoLayout);
        btnVerCarritoLayout.setHorizontalGroup(
            btnVerCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verCarritoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnVerCarritoLayout.setVerticalGroup(
            btnVerCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verCarritoTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        carritoTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        carritoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carritoTXT.setText("Añadir al carrito");
        carritoTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carritoTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carritoTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCarritoLayout = new javax.swing.GroupLayout(btnCarrito);
        btnCarrito.setLayout(btnCarritoLayout);
        btnCarritoLayout.setHorizontalGroup(
            btnCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carritoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );
        btnCarritoLayout.setVerticalGroup(
            btnCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carritoTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        txtNombrePizza.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNombrePizza.setForeground(new java.awt.Color(255, 255, 255));
        txtNombrePizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnBack3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBack3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnVerCarrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCarrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(40, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombrePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(iconVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(txtNombrePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnVerCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pepTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pepTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pepTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPepeLayout = new javax.swing.GroupLayout(btnPepe);
        btnPepe.setLayout(btnPepeLayout);
        btnPepeLayout.setHorizontalGroup(
            btnPepeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pepTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
        );
        btnPepeLayout.setVerticalGroup(
            btnPepeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pepTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        jamonTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jamonTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jamonTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnJamonLayout = new javax.swing.GroupLayout(btnJamon);
        btnJamon.setLayout(btnJamonLayout);
        btnJamonLayout.setHorizontalGroup(
            btnJamonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jamonTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
        );
        btnJamonLayout.setVerticalGroup(
            btnJamonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jamonTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        quesoTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quesoTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quesoTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnQuesoLayout = new javax.swing.GroupLayout(btnQueso);
        btnQueso.setLayout(btnQuesoLayout);
        btnQuesoLayout.setHorizontalGroup(
            btnQuesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
            .addGroup(btnQuesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(quesoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
        );
        btnQuesoLayout.setVerticalGroup(
            btnQuesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
            .addGroup(btnQuesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(quesoTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
        );

        resTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnResLayout = new javax.swing.GroupLayout(btnRes);
        btnRes.setLayout(btnResLayout);
        btnResLayout.setHorizontalGroup(
            btnResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnResLayout.setVerticalGroup(
            btnResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        btnEXIT.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnEXIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEXIT.setText("X");
        btnEXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEXITMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPepe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQueso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPepe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQueso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
        );

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 0, 770, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jamonTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jamonTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/13.png");
        precio = jamon;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Pizza de Jamon";
        txtNombrePizza.setText(selecionado);
    }//GEN-LAST:event_jamonTXTMouseClicked

    private void pepTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pepTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/11.png");
        precio = pepe;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Pizza de Peperoni";
        txtNombrePizza.setText(selecionado);
    }//GEN-LAST:event_pepTXTMouseClicked

    private void resTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/12.png");
        precio = res;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Pizza de res";
        txtNombrePizza.setText(selecionado);
    }//GEN-LAST:event_resTXTMouseClicked

    private void quesoTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quesoTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/14.png");
        precio = queso;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Pizza de queso";
        txtNombrePizza.setText(selecionado);
    }//GEN-LAST:event_quesoTXTMouseClicked

    private void carritoTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoTXTMouseClicked
        if (precio == 0 && selecionado == null) {
            JOptionPane.showMessageDialog(rootPane, "No has elegido un producto.");
        }else{
            JOptionPane.showMessageDialog(rootPane, "El producto " + selecionado + " se ha agregado al carrito satisfactoriamente");
            ventanaCarrito.agregarProductoAlCarrito(selecionado,precio );
        }
        
    }//GEN-LAST:event_carritoTXTMouseClicked

    private void verCarritoTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCarritoTXTMouseClicked
        ventanaCarrito.setVisible(true);
        ventanaCarrito.setLocationRelativeTo(this);
    }//GEN-LAST:event_verCarritoTXTMouseClicked

    private void btnBack3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack3MouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack3MouseClicked

    private void btnEXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEXITMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnEXITMouseClicked

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
            java.util.logging.Logger.getLogger(Carnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carnes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack3;
    private javax.swing.JPanel btnCarrito;
    private javax.swing.JLabel btnEXIT;
    private javax.swing.JPanel btnJamon;
    private javax.swing.JPanel btnPepe;
    private javax.swing.JPanel btnQueso;
    private javax.swing.JPanel btnRes;
    private javax.swing.JPanel btnVerCarrito;
    private javax.swing.JLabel carritoTXT;
    private javax.swing.JLabel iconVariable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jamonTXT;
    private javax.swing.JLabel pepTXT;
    private javax.swing.JLabel quesoTXT;
    private javax.swing.JLabel resTXT;
    private javax.swing.JLabel txtNombrePizza;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel verCarritoTXT;
    // End of variables declaration//GEN-END:variables
}
