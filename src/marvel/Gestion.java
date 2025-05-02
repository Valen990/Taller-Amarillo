/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marvel;

import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Gestion extends javax.swing.JFrame {

    ArrayList<Cita> ListaCitas = new ArrayList<>();

    public Gestion() {
    initComponents();
    cargarDatosPlano4();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel1_fondo = new javax.swing.JPanel();
        jButton1_registrarse = new javax.swing.JButton();
        jButton1_iniciarsesion = new javax.swing.JButton();
        jButton1_buscar = new javax.swing.JButton();
        jLabel1_gestion = new javax.swing.JLabel();
        jLabel1_desc = new javax.swing.JLabel();
        jButton1_tab = new javax.swing.JButton();
        jButton2_clientes_tab = new javax.swing.JButton();
        jButton3_mascotas_tab = new javax.swing.JButton();
        jButton4_vacunacion_tab = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_citas_tab = new javax.swing.JTable();
        jButton1_eliminar = new javax.swing.JButton();
        jButton2_editar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jPanel1_fondo.setBackground(new java.awt.Color(51, 255, 204));

        jButton1_registrarse.setBackground(new java.awt.Color(255, 255, 51));
        jButton1_registrarse.setText("Registrarse");
        jButton1_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_registrarseActionPerformed(evt);
            }
        });

        jButton1_iniciarsesion.setText("Iniciar Sesión");

        jButton1_buscar.setText("Buscar clientes o mascotas...");

        jLabel1_gestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1_gestion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_gestion.setText("Gestión De Citas");

        jLabel1_desc.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_desc.setText("Sistema completo de administración de citas");

        jButton1_tab.setBackground(new java.awt.Color(255, 255, 51));
        jButton1_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton1_tab.setText("Tablón");
        jButton1_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_tabActionPerformed(evt);
            }
        });

        jButton2_clientes_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton2_clientes_tab.setText("Clientes");

        jButton3_mascotas_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton3_mascotas_tab.setText("Mascotas");
        jButton3_mascotas_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_mascotas_tabActionPerformed(evt);
            }
        });

        jButton4_vacunacion_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton4_vacunacion_tab.setText("Vacunación");

        jTable1_citas_tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Mascota", "Fecha", "Hora", "Motivo"
            }
        ));
        jScrollPane1.setViewportView(jTable1_citas_tab);

        jButton1_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        jButton1_eliminar.setText("Eliminar");
        jButton1_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_eliminarActionPerformed(evt);
            }
        });

        jButton2_editar.setBackground(new java.awt.Color(51, 255, 0));
        jButton2_editar.setText("Editar");
        jButton2_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_fondoLayout = new javax.swing.GroupLayout(jPanel1_fondo);
        jPanel1_fondo.setLayout(jPanel1_fondoLayout);
        jPanel1_fondoLayout.setHorizontalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1_desc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_gestion)
                .addGap(192, 192, 192))
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                        .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addComponent(jButton1_eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2_editar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1_buscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1_iniciarsesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1_registrarse)))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                        .addComponent(jButton1_tab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2_clientes_tab)
                        .addGap(49, 49, 49)
                        .addComponent(jButton3_mascotas_tab)
                        .addGap(37, 37, 37)
                        .addComponent(jButton4_vacunacion_tab)
                        .addGap(7, 7, 7))))
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
                .addComponent(jLabel1_gestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_desc)
                .addGap(18, 18, 18)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_tab)
                    .addComponent(jButton2_clientes_tab)
                    .addComponent(jButton3_mascotas_tab)
                    .addComponent(jButton4_vacunacion_tab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_eliminar)
                    .addComponent(jButton2_editar))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_registrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_registrarseActionPerformed

    private void jButton3_mascotas_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_mascotas_tabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3_mascotas_tabActionPerformed

    private void jButton1_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_tabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_tabActionPerformed

    private void jButton2_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_editarActionPerformed
    int filaSeleccionada = this.jTable1_citas_tab.getSelectedRow();

    if (filaSeleccionada != -1) {
        Cita citaSeleccionada = ListaCitas.get(filaSeleccionada);
        String nombreAnterior = citaSeleccionada.getNombre();

        int respuesta = JOptionPane.showConfirmDialog(
            null,
            "¿Deseas editar esta cita?\n" + citaSeleccionada.Imprimir(),
            "Confirmar edición",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            JPanel panel = new JPanel(new GridLayout(0, 2));

            DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");

            JTextField txtCliente = new JTextField(citaSeleccionada.getNombre());
            JTextField txtMascota = new JTextField(citaSeleccionada.getNombre_m());
            JTextField txtFecha = new JTextField(citaSeleccionada.getFecha().format(formatterFecha));
            JTextField txtHora = new JTextField(citaSeleccionada.getHora().format(formatterHora));
            JTextField txtMotivo = new JTextField(citaSeleccionada.getMotivo_cita());

            panel.add(new JLabel("Cliente:"));
            panel.add(txtCliente);
            panel.add(new JLabel("Mascota:"));
            panel.add(txtMascota);
            panel.add(new JLabel("Fecha (dd-MM-yyyy):"));
            panel.add(txtFecha);
            panel.add(new JLabel("Hora (HH:mm):"));
            panel.add(txtHora);
            panel.add(new JLabel("Motivo de la cita:"));
            panel.add(txtMotivo);

            int resultado = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Editar Cita",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
            );

            if (resultado == JOptionPane.OK_OPTION) {
                try {
                    citaSeleccionada.setNombre(txtCliente.getText().trim());
                    citaSeleccionada.setNombre_m(txtMascota.getText().trim());
                    citaSeleccionada.setFecha(LocalDate.parse(txtFecha.getText().trim(), formatterFecha));
                    citaSeleccionada.setHora(LocalTime.parse(txtHora.getText().trim(), formatterHora));
                    citaSeleccionada.setMotivo_cita(txtMotivo.getText().trim());

                    ListaCitas.set(filaSeleccionada, citaSeleccionada);
                    ArchivoPlano4.actualizarCitaEnArchivo(nombreAnterior, citaSeleccionada);

                    DefaultTableModel modelo = (DefaultTableModel) this.jTable1_citas_tab.getModel();
                    modelo.setValueAt(citaSeleccionada.getNombre(), filaSeleccionada, 0);
                    modelo.setValueAt(citaSeleccionada.getNombre_m(), filaSeleccionada, 1);
                    modelo.setValueAt(citaSeleccionada.getFecha().format(formatterFecha), filaSeleccionada, 2);
                    modelo.setValueAt(citaSeleccionada.getHora().format(formatterHora), filaSeleccionada, 3);
                    modelo.setValueAt(citaSeleccionada.getMotivo_cita(), filaSeleccionada, 4);

                    JOptionPane.showMessageDialog(null, "Lista actualizada correctamente");

                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Error: formato inválido en fecha u hora.\nUsa dd-MM-yyyy y HH:mm");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Edición cancelada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se canceló la acción sobre el elemento");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debes seleccionar una fila primero.");
    }
    }//GEN-LAST:event_jButton2_editarActionPerformed

    private void jButton1_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_eliminarActionPerformed
    int filaSeleccionada = this.jTable1_citas_tab.getSelectedRow();

    if (filaSeleccionada != -1) {
        Cita citaSeleccionada = ListaCitas.get(filaSeleccionada);

        int respuesta = JOptionPane.showConfirmDialog(
            null,
            "¿Estás seguro de que deseas eliminar esta cita?\n" + citaSeleccionada.Imprimir(),
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            ListaCitas.remove(filaSeleccionada);
            DefaultTableModel modelo = (DefaultTableModel) this.jTable1_citas_tab.getModel();
            modelo.removeRow(filaSeleccionada);

            ArchivoPlano4.eliminarDeArchivo(citaSeleccionada);

            JOptionPane.showMessageDialog(null, "Cita eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Se canceló la acción sobre el elemento");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debes seleccionar una fila primero.");
    }
    }//GEN-LAST:event_jButton1_eliminarActionPerformed

    public  void cargarDatosPlano4() {
    List<Cita> citasCargadas = ArchivoPlano4.cargarDesdeArchivo();
    ListaCitas.clear();
    DefaultTableModel modelo = (DefaultTableModel) jTable1_citas_tab.getModel();
    modelo.setRowCount(0);

    if (ListaCitas == null) {
        JOptionPane.showMessageDialog(null, "No se pudo cargar la lista de clientes desde el archivo.");
        return;
    }

        ListaCitas.addAll(citasCargadas);

        for(Cita cita : citasCargadas){
            modelo.addRow(new Object[]{
                cita.getNombre(),
                cita.getNombre_m(),
                cita.getFecha(),
                cita.getHora(),
                cita.getMotivo_cita()
            });
        }
    }
    
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
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_buscar;
    private javax.swing.JButton jButton1_eliminar;
    private javax.swing.JButton jButton1_iniciarsesion;
    private javax.swing.JButton jButton1_registrarse;
    private javax.swing.JButton jButton1_tab;
    private javax.swing.JButton jButton2_clientes_tab;
    private javax.swing.JButton jButton2_editar;
    private javax.swing.JButton jButton3_mascotas_tab;
    private javax.swing.JButton jButton4_vacunacion_tab;
    private javax.swing.JLabel jLabel1_desc;
    private javax.swing.JLabel jLabel1_gestion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_fondo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_citas_tab;
    // End of variables declaration//GEN-END:variables
}