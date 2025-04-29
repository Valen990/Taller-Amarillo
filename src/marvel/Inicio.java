/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marvel;

import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Inicio extends javax.swing.JFrame {
    ArrayList<Cita> ListaCitas = new ArrayList<>();

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_buscar = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1_fondo = new javax.swing.JPanel();
        jButton1_registrarse = new javax.swing.JButton();
        jButton1_iniciarsesion = new javax.swing.JButton();
        jButton1_buscar = new javax.swing.JButton();
        jLabel1_titulo = new javax.swing.JLabel();
        jLabel1_descripcion = new javax.swing.JLabel();
        jButton1_agendar = new javax.swing.JButton();
        jButton2_nuestrosservicios = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1_buscar.setText("Buscar clientes o mascotas...");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1_fondo.setBackground(new java.awt.Color(51, 255, 204));

        jButton1_registrarse.setBackground(new java.awt.Color(255, 255, 51));
        jButton1_registrarse.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_registrarse.setText("Registrarse");
        jButton1_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_registrarseActionPerformed(evt);
            }
        });

        jButton1_iniciarsesion.setForeground(new java.awt.Color(51, 255, 204));
        jButton1_iniciarsesion.setText("Iniciar Sesión");

        jButton1_buscar.setForeground(new java.awt.Color(51, 255, 204));
        jButton1_buscar.setText("Buscar clientes o mascotas...");

        jLabel1_titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_titulo.setText("La Mascota Feliz");

        jLabel1_descripcion.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1_descripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_descripcion.setText("Con todo el amor y profesionalismo para tu mejor amigo");

        jButton1_agendar.setBackground(new java.awt.Color(255, 255, 51));
        jButton1_agendar.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_agendar.setText("Agendar Cita");
        jButton1_agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_agendarActionPerformed(evt);
            }
        });

        jButton2_nuestrosservicios.setForeground(new java.awt.Color(51, 255, 204));
        jButton2_nuestrosservicios.setText("Nuestros Servicios");

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Gestión Integral");

        javax.swing.GroupLayout jPanel1_fondoLayout = new javax.swing.GroupLayout(jPanel1_fondo);
        jPanel1_fondo.setLayout(jPanel1_fondoLayout);
        jPanel1_fondoLayout.setHorizontalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                        .addComponent(jButton1_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1_iniciarsesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_registrarse)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                            .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1_titulo)
                                .addComponent(jLabel1_descripcion))
                            .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                            .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                    .addComponent(jButton1_agendar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2_nuestrosservicios)))
                            .addGap(21, 21, 21)))))
        );
        jPanel1_fondoLayout.setVerticalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_registrarse)
                    .addComponent(jButton1_iniciarsesion)
                    .addComponent(jButton1_buscar))
                .addGap(81, 81, 81)
                .addComponent(jLabel1_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_descripcion)
                .addGap(18, 18, 18)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_agendar)
                    .addComponent(jButton2_nuestrosservicios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_registrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_registrarseActionPerformed

    private void jButton1_agendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_agendarActionPerformed
    try {
    JPanel panel = new JPanel(new GridLayout(5, 2));

    JTextField txtMascota = new JTextField();
    JTextField txtCliente = new JTextField();
    JTextField txtFecha = new JTextField(); 
    JTextField txtHora = new JTextField(); 
    JTextField txtMotivo = new JTextField();

    panel.add(new JLabel("Mascota:"));
    panel.add(txtMascota);
    panel.add(new JLabel("Cliente:"));
    panel.add(txtCliente);
    panel.add(new JLabel("Fecha (dd/mm/yyyy):"));
    panel.add(txtFecha);
    panel.add(new JLabel("Hora (hh:mm):"));
    panel.add(txtHora);
    panel.add(new JLabel("Motivo:"));
    panel.add(txtMotivo);

    int result = JOptionPane.showConfirmDialog(
        this,
        panel,
        "Agendar Cita",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE
    );

    if (result == JOptionPane.OK_OPTION) {
        if (txtMascota.getText().trim().isEmpty() || txtFecha.getText().trim().isEmpty() || txtHora.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Los campos de Mascota, Fecha y Hora son obligatorios",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombre_m = txtMascota.getText();
        String nombre = txtCliente.getText();
        String motivo_cita = txtMotivo.getText();
        String fechaStr = txtFecha.getText();
        String horaStr = txtHora.getText();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("H:mm");

        LocalDate fecha = LocalDate.parse(fechaStr, formatter);
        LocalTime hora = LocalTime.parse(horaStr, formatoHora);

        Cita cita = new Cita(nombre_m, nombre, fecha, hora, motivo_cita);

        System.out.println("Cita registrada: " + cita.toString());

        ListaCitas.add(cita);
        ArchivoPlano4.guardarCita(cita);

        JOptionPane.showMessageDialog(this, "Cita agendada correctamente.");
    }
} catch (Exception ex) {
    ex.printStackTrace(); 
    JOptionPane.showMessageDialog(this,
        "Error al agendar la cita: " + ex.getMessage(),
        "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jButton1_agendarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_agendar;
    private javax.swing.JButton jButton1_buscar;
    private javax.swing.JButton jButton1_iniciarsesion;
    private javax.swing.JButton jButton1_registrarse;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton2_nuestrosservicios;
    private javax.swing.JLabel jLabel1_buscar;
    private javax.swing.JLabel jLabel1_descripcion;
    private javax.swing.JLabel jLabel1_titulo;
    private javax.swing.JPanel jPanel1_fondo;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}