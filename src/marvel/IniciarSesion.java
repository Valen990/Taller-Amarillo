/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marvel;

import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    public IniciarSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_iniciar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1_fondo_i = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2_iniciar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_correo_c = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1_contrasena_c = new javax.swing.JPasswordField();
        jLabel4_olvidar = new javax.swing.JLabel();
        jButton1_iniciar_sesion = new javax.swing.JButton();

        jLabel1_iniciar.setText("Iniciar Sesión");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("Correo electrónico:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1_fondo_i.setBackground(new java.awt.Color(51, 255, 204));

        jLabel2_iniciar.setText("Iniciar Sesión");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("Correo electrónico:");

        jTextField1_correo_c.setBackground(new java.awt.Color(51, 255, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("Contraseña:");

        jPasswordField1_contrasena_c.setBackground(new java.awt.Color(51, 255, 204));
        jPasswordField1_contrasena_c.setText("jPasswordField1");

        jLabel4_olvidar.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4_olvidar.setText("¿Olvidaste tu contraseña?");

        jButton1_iniciar_sesion.setBackground(new java.awt.Color(255, 255, 51));
        jButton1_iniciar_sesion.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1_iniciar_sesion.setText("Iniciar Sesión");
        jButton1_iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_iniciar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1_correo_c)
                            .addComponent(jPasswordField1_contrasena_c, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4_olvidar)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2_iniciar)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1_iniciar_sesion)
                        .addGap(92, 92, 92))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2_iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1_correo_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1_contrasena_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4_olvidar)
                .addGap(27, 27, 27)
                .addComponent(jButton1_iniciar_sesion)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1_fondo_iLayout = new javax.swing.GroupLayout(jPanel1_fondo_i);
        jPanel1_fondo_i.setLayout(jPanel1_fondo_iLayout);
        jPanel1_fondo_iLayout.setHorizontalGroup(
            jPanel1_fondo_iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondo_iLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1_fondo_iLayout.setVerticalGroup(
            jPanel1_fondo_iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondo_iLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_fondo_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_fondo_i, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_iniciar_sesionActionPerformed
    Persona a = new Persona();
    
    if(jTextField1_correo_c.getText().trim().isEmpty() ||
            String.valueOf(jPasswordField1_contrasena_c.getPassword()).trim().isEmpty())
     {
        JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos para continuar");
    }
    
    try{
        String correo = jTextField1_correo_c.getText().trim();
        String contrasena = String.valueOf(jPasswordField1_contrasena_c.getPassword());
        
        a.setCorreo(correo);
        a.setContrasena(contrasena);
        
        JOptionPane.showMessageDialog(null, "¡Cliente registrado de manera exitosa!");

    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Todos los campos deben ser válidos");   
        }
    }//GEN-LAST:event_jButton1_iniciar_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_iniciar_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_iniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_iniciar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4_olvidar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_fondo_i;
    private javax.swing.JPasswordField jPasswordField1_contrasena_c;
    private javax.swing.JTextField jTextField1_correo_c;
    // End of variables declaration//GEN-END:variables
}