/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marvel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registrarse2 extends javax.swing.JFrame {
    
    ArrayList<Mascota> ListaMascotas = new ArrayList<>();
    
    public Registrarse2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1_form2 = new javax.swing.JPanel();
        jLabel1_titulo_m = new javax.swing.JLabel();
        jLabel1_nombre2 = new javax.swing.JLabel();
        jTextField2_nombre_c2 = new javax.swing.JTextField();
        jLabel1_apodo = new javax.swing.JLabel();
        jTextField2_apodo = new javax.swing.JTextField();
        jLabel1_especie = new javax.swing.JLabel();
        jTextField2_especie_c = new javax.swing.JTextField();
        jLabel1_raza = new javax.swing.JLabel();
        jTextField2_raza_c = new javax.swing.JTextField();
        jLabel1_color = new javax.swing.JLabel();
        jLabel1_edad = new javax.swing.JLabel();
        jTextField2_edad_c = new javax.swing.JTextField();
        button1_registrarse2 = new java.awt.Button();
        jTextField2_color_c = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1_titulo_m.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1_titulo_m.setText("Registra a tu mascota");

        jLabel1_nombre2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_nombre2.setText("Nombre completo:");

        jTextField2_nombre_c2.setBackground(new java.awt.Color(51, 255, 204));
        jTextField2_nombre_c2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jTextField2_nombre_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_nombre_c2ActionPerformed(evt);
            }
        });

        jLabel1_apodo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_apodo.setText("Apodo:");

        jTextField2_apodo.setBackground(new java.awt.Color(51, 255, 204));
        jTextField2_apodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_apodoActionPerformed(evt);
            }
        });

        jLabel1_especie.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_especie.setText("Especie:");

        jTextField2_especie_c.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1_raza.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_raza.setText("Raza:");

        jTextField2_raza_c.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1_color.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_color.setText("Color:");

        jLabel1_edad.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_edad.setText("Edad promedio:");

        jTextField2_edad_c.setBackground(new java.awt.Color(51, 255, 204));

        button1_registrarse2.setBackground(new java.awt.Color(255, 255, 51));
        button1_registrarse2.setForeground(new java.awt.Color(0, 255, 204));
        button1_registrarse2.setLabel("Registrarse");
        button1_registrarse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1_registrarse2ActionPerformed(evt);
            }
        });

        jTextField2_color_c.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout jPanel1_form2Layout = new javax.swing.GroupLayout(jPanel1_form2);
        jPanel1_form2.setLayout(jPanel1_form2Layout);
        jPanel1_form2Layout.setHorizontalGroup(
            jPanel1_form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_form2Layout.createSequentialGroup()
                .addGroup(jPanel1_form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_form2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1_form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1_edad)
                            .addComponent(jLabel1_color)
                            .addComponent(jLabel1_raza)
                            .addComponent(jLabel1_especie)
                            .addComponent(jLabel1_apodo)
                            .addComponent(jLabel1_nombre2)
                            .addComponent(jTextField2_nombre_c2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jTextField2_apodo)
                            .addComponent(jTextField2_especie_c)
                            .addComponent(jTextField2_raza_c)
                            .addComponent(jTextField2_edad_c)
                            .addComponent(jTextField2_color_c)))
                    .addGroup(jPanel1_form2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(button1_registrarse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_form2Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addComponent(jLabel1_titulo_m)
                .addGap(38, 38, 38))
        );
        jPanel1_form2Layout.setVerticalGroup(
            jPanel1_form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_form2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1_titulo_m)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1_nombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_nombre_c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_apodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_apodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_especie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_especie_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_raza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_raza_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_color)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_color_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_edad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_edad_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(button1_registrarse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        button1_registrarse2.getAccessibleContext().setAccessibleName("Registrar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jPanel1_form2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1_form2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_nombre_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_nombre_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_nombre_c2ActionPerformed

    private void jTextField2_apodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_apodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_apodoActionPerformed

    private void button1_registrarse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1_registrarse2ActionPerformed
    Mascota a = new Mascota();

    String nombre_m = " ";
    String apodo = " ";
    String especie = " ";
    String raza = " ";
    String color_pelo = " ";
    String edad = " ";

   if(jTextField2_nombre_c2.getText().trim().isEmpty() ||
   jTextField2_apodo.getText().trim().isEmpty() ||
   jTextField2_especie_c.getText().trim().isEmpty() ||
   jTextField2_raza_c.getText().trim().isEmpty() ||
   jTextField2_color_c.getText().trim().isEmpty() ||
   jTextField2_edad_c.getText().trim().isEmpty()) 
   
{
   JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos para continuar");
   return;
}

nombre_m = jTextField2_nombre_c2.getText();
apodo = jTextField2_apodo.getText();
especie = jTextField2_especie_c.getText();
raza = jTextField2_raza_c.getText();
color_pelo = jTextField2_color_c.getText();
edad = jTextField2_edad_c.getText();

a.setNombre_m(nombre_m);
a.setApodo(apodo);
a.setEspecie(especie);
a.setRaza(raza);
a.setColor_pelo(color_pelo);
a.setEdad(edad);  

ListaMascotas.add(a);
ArchivoLiso.guardarEnArchivo(ListaMascotas);

JOptionPane.showMessageDialog(null, "¡Mascota registrada exitosamente!", "Registro completado", JOptionPane.INFORMATION_MESSAGE);

    Mascotas mascotas  = new Mascotas(); 
    mascotas.setVisible(true); 
    dispose();
    }//GEN-LAST:event_button1_registrarse2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1_registrarse2;
    private javax.swing.JLabel jLabel1_apodo;
    private javax.swing.JLabel jLabel1_color;
    private javax.swing.JLabel jLabel1_edad;
    private javax.swing.JLabel jLabel1_especie;
    private javax.swing.JLabel jLabel1_nombre2;
    private javax.swing.JLabel jLabel1_raza;
    private javax.swing.JLabel jLabel1_titulo_m;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_form2;
    private javax.swing.JTextField jTextField2_apodo;
    private javax.swing.JTextField jTextField2_color_c;
    private javax.swing.JTextField jTextField2_edad_c;
    private javax.swing.JTextField jTextField2_especie_c;
    private javax.swing.JTextField jTextField2_nombre_c2;
    private javax.swing.JTextField jTextField2_raza_c;
    // End of variables declaration//GEN-END:variables
}