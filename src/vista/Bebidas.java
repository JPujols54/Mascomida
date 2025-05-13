/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author justi
 */
public class Bebidas extends javax.swing.JFrame {

    public int precio = 0;
    public int coca = 499;
    public int pepsi = 499;
    public int fanta = 499;
    public int sprite = 499;
    public String selecionado = null;

    private Carrito ventanaCarrito;

    public Bebidas() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(cocaTXT, "src/imagenes/23.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(SpriteTXT, "src/imagenes/24.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(FantaTXT, "src/imagenes/25.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(PepsiTXT, "src/imagenes/26.png");
        ventanaCarrito = new Carrito();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iconVariable = new javax.swing.JLabel();
        btnVerCarrito = new javax.swing.JPanel();
        verCarritoTXT = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JPanel();
        carritoTXT = new javax.swing.JLabel();
        txtNombrePizza = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cocaTXT = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        SpriteTXT = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        FantaTXT = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        PepsiTXT = new javax.swing.JLabel();
        btnEXIT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 17, 12));

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

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio.setText("Precio Total: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombrePizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnVerCarrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(iconVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombrePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnVerCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cocaTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cocaTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cocaTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cocaTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cocaTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );

        SpriteTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpriteTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpriteTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SpriteTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SpriteTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );

        FantaTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FantaTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FantaTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FantaTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FantaTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );

        PepsiTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PepsiTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PepsiTXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PepsiTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PepsiTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 610, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verCarritoTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCarritoTXTMouseClicked
        ventanaCarrito.setVisible(true);
        ventanaCarrito.setLocationRelativeTo(this);
    }//GEN-LAST:event_verCarritoTXTMouseClicked

    private void carritoTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoTXTMouseClicked
        if (precio == 0 && selecionado == null) {
            JOptionPane.showMessageDialog(rootPane, "No has elegido un producto.");
        } else {
            JOptionPane.showMessageDialog(rootPane, "El producto " + selecionado + " se ha agregado al carrito satisfactoriamente");
            ventanaCarrito.agregarProductoAlCarrito(selecionado, precio);
        }

    }//GEN-LAST:event_carritoTXTMouseClicked

    private void btnBack3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack3MouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack3MouseClicked

    private void cocaTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cocaTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/23.png");
        precio = coca;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Coca-Cola";
        txtNombrePizza.setText(selecionado);
    }//GEN-LAST:event_cocaTXTMouseClicked

    private void SpriteTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpriteTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/24.png");
        precio = sprite;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Sprite";
        txtNombrePizza.setText(selecionado);
    }//GEN-LAST:event_SpriteTXTMouseClicked

    private void FantaTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FantaTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/25.png");
        precio = fanta;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Fanta";
        txtNombrePizza.setText(selecionado);
    }//GEN-LAST:event_FantaTXTMouseClicked

    private void PepsiTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PepsiTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/26.png");
        precio = pepsi;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Pepsi";
        txtNombrePizza.setText(selecionado);
    }//GEN-LAST:event_PepsiTXTMouseClicked

    private void btnEXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEXITMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnEXITMouseClicked

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
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FantaTXT;
    private javax.swing.JLabel PepsiTXT;
    private javax.swing.JLabel SpriteTXT;
    private javax.swing.JLabel btnBack3;
    private javax.swing.JPanel btnCarrito;
    private javax.swing.JLabel btnEXIT;
    private javax.swing.JPanel btnVerCarrito;
    private javax.swing.JLabel carritoTXT;
    private javax.swing.JLabel cocaTXT;
    private javax.swing.JLabel iconVariable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtNombrePizza;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel verCarritoTXT;
    // End of variables declaration//GEN-END:variables
}
