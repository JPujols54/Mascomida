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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
            .addComponent(verCarritoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVerCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(iconVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(iconVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnVerCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPepe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQueso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
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
    }//GEN-LAST:event_jamonTXTMouseClicked

    private void pepTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pepTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/11.png");
        precio = pepe;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Pizza de Peperoni";
    }//GEN-LAST:event_pepTXTMouseClicked

    private void resTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/12.png");
        precio = res;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Pizza de res";
    }//GEN-LAST:event_resTXTMouseClicked

    private void quesoTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quesoTXTMouseClicked
        rsscalelabel.RSScaleLabel.setScaleLabel(iconVariable, "src/imagenes/14.png");
        precio = queso;
        txtPrecio.setText("Precio total: " + precio);
        selecionado = "Pizza de queso";
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
    private javax.swing.JPanel btnCarrito;
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
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel verCarritoTXT;
    // End of variables declaration//GEN-END:variables
}
