/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marvel;

public class NuestrosServicios extends javax.swing.JFrame {

    public NuestrosServicios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1_fondo = new javax.swing.JPanel();
        jButton1_registrarse = new javax.swing.JButton();
        jButton1_iniciarsesion = new javax.swing.JButton();
        jButton1_buscar = new javax.swing.JButton();
        jLabel1_nclientes = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_v = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2_p = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3_c_m = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4_c = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1_fondo.setBackground(new java.awt.Color(51, 255, 204));

        jButton1_registrarse.setBackground(new java.awt.Color(255, 255, 51));
        jButton1_registrarse.setForeground(new java.awt.Color(0, 255, 204));
        jButton1_registrarse.setText("Registrarse");
        jButton1_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_registrarseActionPerformed(evt);
            }
        });

        jButton1_iniciarsesion.setForeground(new java.awt.Color(51, 255, 204));
        jButton1_iniciarsesion.setText("Iniciar Sesión");
        jButton1_iniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_iniciarsesionActionPerformed(evt);
            }
        });

        jButton1_buscar.setForeground(new java.awt.Color(51, 255, 204));
        jButton1_buscar.setText("Buscar clientes o mascotas...");

        jLabel1_nclientes.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1_nclientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1_nclientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_nclientes.setText("Nuestros Servicios");

        jTextField1.setBackground(new java.awt.Color(51, 255, 204));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Ofrecemos una amplia gama de servicios veterinarios para mantener a tu mascota saludable y feliz.");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1_v.setBackground(new java.awt.Color(51, 204, 255));
        jTextArea1_v.setColumns(20);
        jTextArea1_v.setRows(5);
        jTextArea1_v.setText("                 Vacunación\n\n    Programas de vacunación\n              personalizados \n     para cada etapa de vida.");
        jScrollPane1.setViewportView(jTextArea1_v);

        jTextArea2_p.setBackground(new java.awt.Color(51, 204, 255));
        jTextArea2_p.setColumns(20);
        jTextArea2_p.setRows(5);
        jTextArea2_p.setText("               Peluquería\n\n       Servicios de estética y \n      cuidado del pelaje para \n             todas las razas.");
        jScrollPane2.setViewportView(jTextArea2_p);

        jTextArea3_c_m.setBackground(new java.awt.Color(51, 204, 255));
        jTextArea3_c_m.setColumns(20);
        jTextArea3_c_m.setRows(5);
        jTextArea3_c_m.setText("       Consultas Médicas\n\n    Exámenes completos y \n             diagnósticos\n  precisos para tu mascota.");
        jScrollPane3.setViewportView(jTextArea3_c_m);

        jTextArea4_c.setBackground(new java.awt.Color(51, 204, 255));
        jTextArea4_c.setColumns(20);
        jTextArea4_c.setRows(5);
        jTextArea4_c.setText("                   Cirugía\n\n            Procedimientos \n    quirúrgicos con equipos \n        de última generación.");
        jScrollPane4.setViewportView(jTextArea4_c);

        javax.swing.GroupLayout jPanel1_fondoLayout = new javax.swing.GroupLayout(jPanel1_fondo);
        jPanel1_fondo.setLayout(jPanel1_fondoLayout);
        jPanel1_fondoLayout.setHorizontalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                        .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1_nclientes)
                                    .addComponent(jButton1_buscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1_iniciarsesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1_registrarse)))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                        .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))))
            .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );
        jPanel1_fondoLayout.setVerticalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_registrarse)
                    .addComponent(jButton1_iniciarsesion)
                    .addComponent(jButton1_buscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel1_nclientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(42, 42, 42))
            .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_registrarseActionPerformed
        Registrarse registrarse = new Registrarse();
        registrarse.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1_registrarseActionPerformed

    private void jButton1_iniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_iniciarsesionActionPerformed
        IniciarSesion iniciarsesion = new IniciarSesion();
        iniciarsesion.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1_iniciarsesionActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(NuestrosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuestrosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuestrosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuestrosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuestrosServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_buscar;
    private javax.swing.JButton jButton1_iniciarsesion;
    private javax.swing.JButton jButton1_registrarse;
    private javax.swing.JLabel jLabel1_nclientes;
    private javax.swing.JPanel jPanel1_fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1_v;
    private javax.swing.JTextArea jTextArea2_p;
    private javax.swing.JTextArea jTextArea3_c_m;
    private javax.swing.JTextArea jTextArea4_c;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}