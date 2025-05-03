/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marvel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registrarse extends javax.swing.JFrame {
    
    ArrayList<Persona> ListaClientes = new ArrayList<>();
    
    public Registrarse() {
    initComponents();
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2_contrasena_c = new javax.swing.JTextField();
        jPanel1_fondo_r = new javax.swing.JPanel();
        jPanel2_form = new javax.swing.JPanel();
        jLabel1_titulo_r = new javax.swing.JLabel();
        jLabel1_nombre = new javax.swing.JLabel();
        jTextField2_nombre_c = new javax.swing.JTextField();
        jLabel1_familia = new javax.swing.JLabel();
        jTextField2_familia_c = new javax.swing.JTextField();
        jLabel1_cedula = new javax.swing.JLabel();
        jTextField2_cedula_c = new javax.swing.JTextField();
        jLabel1_correo = new javax.swing.JLabel();
        jTextField2_correo_c = new javax.swing.JTextField();
        jLabel1_contrasena = new javax.swing.JLabel();
        jPasswordField1_contrasena_c = new javax.swing.JPasswordField();
        jLabel1_telefono = new javax.swing.JLabel();
        jTextField2_telefono_c = new javax.swing.JTextField();
        button1_registrarse = new java.awt.Button();
        jLabel1_direccion = new javax.swing.JLabel();
        jTextField2_direccion_c = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2_contrasena_c.setBackground(new java.awt.Color(51, 255, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1_fondo_r.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1_titulo_r.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1_titulo_r.setText("Registrarse");

        jLabel1_nombre.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_nombre.setText("Nombre completo:");

        jTextField2_nombre_c.setBackground(new java.awt.Color(51, 255, 204));
        jTextField2_nombre_c.setBorder(null);
        jTextField2_nombre_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_nombre_cActionPerformed(evt);
            }
        });

        jLabel1_familia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_familia.setText("Familia a la que pertenece:");

        jTextField2_familia_c.setBackground(new java.awt.Color(51, 255, 204));
        jTextField2_familia_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_familia_cActionPerformed(evt);
            }
        });

        jLabel1_cedula.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_cedula.setText("Cédula:");

        jTextField2_cedula_c.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1_correo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_correo.setText("Correo:");

        jTextField2_correo_c.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1_contrasena.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_contrasena.setText("Contraseña:");

        jPasswordField1_contrasena_c.setBackground(new java.awt.Color(51, 255, 204));
        jPasswordField1_contrasena_c.setActionCommand("null");
        jPasswordField1_contrasena_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1_contrasena_cActionPerformed(evt);
            }
        });

        jLabel1_telefono.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_telefono.setText("Teléfono:");

        jTextField2_telefono_c.setBackground(new java.awt.Color(51, 255, 204));
        jTextField2_telefono_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_telefono_cActionPerformed(evt);
            }
        });

        button1_registrarse.setBackground(new java.awt.Color(255, 255, 51));
        button1_registrarse.setForeground(new java.awt.Color(0, 255, 204));
        button1_registrarse.setLabel("Registrarse");
        button1_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1_registrarseActionPerformed(evt);
            }
        });

        jLabel1_direccion.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_direccion.setText("Dirección:");

        jTextField2_direccion_c.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout jPanel2_formLayout = new javax.swing.GroupLayout(jPanel2_form);
        jPanel2_form.setLayout(jPanel2_formLayout);
        jPanel2_formLayout.setHorizontalGroup(
            jPanel2_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_formLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel1_titulo_r)
                .addGap(72, 72, 72))
            .addGroup(jPanel2_formLayout.createSequentialGroup()
                .addGroup(jPanel2_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_formLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1_direccion)
                            .addGroup(jPanel2_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1_telefono)
                                .addComponent(jLabel1_contrasena)
                                .addComponent(jLabel1_correo)
                                .addComponent(jLabel1_cedula)
                                .addComponent(jLabel1_familia)
                                .addComponent(jLabel1_nombre)
                                .addComponent(jTextField2_nombre_c)
                                .addComponent(jTextField2_familia_c)
                                .addComponent(jTextField2_cedula_c)
                                .addComponent(jTextField2_correo_c)
                                .addComponent(jPasswordField1_contrasena_c, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(jTextField2_telefono_c))
                            .addComponent(jTextField2_direccion_c)))
                    .addGroup(jPanel2_formLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(button1_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2_formLayout.setVerticalGroup(
            jPanel2_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_formLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1_titulo_r)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_nombre_c, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_familia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_familia_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_cedula_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_correo_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_contrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1_contrasena_c, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1_telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_telefono_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1_direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_direccion_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(button1_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        button1_registrarse.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1_fondo_rLayout = new javax.swing.GroupLayout(jPanel1_fondo_r);
        jPanel1_fondo_r.setLayout(jPanel1_fondo_rLayout);
        jPanel1_fondo_rLayout.setHorizontalGroup(
            jPanel1_fondo_rLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondo_rLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jPanel2_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel1_fondo_rLayout.setVerticalGroup(
            jPanel1_fondo_rLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondo_rLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_fondo_r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1_fondo_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_nombre_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_nombre_cActionPerformed
    }//GEN-LAST:event_jTextField2_nombre_cActionPerformed

    private void jTextField2_familia_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_familia_cActionPerformed
    }//GEN-LAST:event_jTextField2_familia_cActionPerformed

    private void button1_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1_registrarseActionPerformed
    Persona cliente = new Persona();

    String nombre = " ";
    String familia = " ";
    int cedula = 0;
    String correo = " ";
    String contrasena = " ";
    int tel = 0;
    String direccion = " ";

if (jTextField2_nombre_c.getText().trim().isEmpty() ||
    jTextField2_familia_c.getText().trim().isEmpty() ||
    jTextField2_cedula_c.getText().trim().isEmpty() ||
    jTextField2_correo_c.getText().trim().isEmpty() ||
    String.valueOf(jPasswordField1_contrasena_c.getPassword()).trim().isEmpty() ||
    jTextField2_telefono_c.getText().trim().isEmpty() ||
    jTextField2_direccion_c.getText().trim().isEmpty()) 
{
    JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos para continuar");
    return;
}

nombre = jTextField2_nombre_c.getText();
familia = jTextField2_familia_c.getText();
cedula = Integer.parseInt(jTextField2_cedula_c.getText());
correo = jTextField2_correo_c.getText();
contrasena = String.valueOf(jPasswordField1_contrasena_c.getPassword());
tel = Integer.parseInt(jTextField2_telefono_c.getText());
direccion = jTextField2_direccion_c.getText();

cliente.setNombre(nombre);
cliente.setFamilia(familia);
cliente.setCedula(cedula);
cliente.setCorreo(correo);
cliente.setContrasena(contrasena);
cliente.setTel(tel);
cliente.setDireccion(direccion);

ListaClientes.add(cliente);
ArchivoPlano.guardarEnArchivo(ListaClientes);

JOptionPane.showMessageDialog(null, "¡Cliente registrado exitosamente!", "Registro completado", JOptionPane.INFORMATION_MESSAGE);

    Registrarse2 registrarse2 = new Registrarse2(); 
    registrarse2.setVisible(true); 
    dispose();
    }//GEN-LAST:event_button1_registrarseActionPerformed

    private void jTextField2_telefono_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_telefono_cActionPerformed
        
    }//GEN-LAST:event_jTextField2_telefono_cActionPerformed

    private void jPasswordField1_contrasena_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1_contrasena_cActionPerformed
        
    }//GEN-LAST:event_jPasswordField1_contrasena_cActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1_registrarse;
    private javax.swing.JLabel jLabel1_cedula;
    private javax.swing.JLabel jLabel1_contrasena;
    private javax.swing.JLabel jLabel1_correo;
    private javax.swing.JLabel jLabel1_direccion;
    private javax.swing.JLabel jLabel1_familia;
    private javax.swing.JLabel jLabel1_nombre;
    private javax.swing.JLabel jLabel1_telefono;
    private javax.swing.JLabel jLabel1_titulo_r;
    private javax.swing.JPanel jPanel1_fondo_r;
    private javax.swing.JPanel jPanel2_form;
    private javax.swing.JPasswordField jPasswordField1_contrasena_c;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2_cedula_c;
    private javax.swing.JTextField jTextField2_contrasena_c;
    private javax.swing.JTextField jTextField2_correo_c;
    private javax.swing.JTextField jTextField2_direccion_c;
    private javax.swing.JTextField jTextField2_familia_c;
    private javax.swing.JTextField jTextField2_nombre_c;
    private javax.swing.JTextField jTextField2_telefono_c;
    // End of variables declaration//GEN-END:variables
}