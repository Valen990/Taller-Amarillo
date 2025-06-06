/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marvel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Vacunas extends javax.swing.JFrame {
    
    ArrayList<Vacunacion> ListaVacunas = new ArrayList<>();
    
    public Vacunas() {
        initComponents();
        ListaVacunas = new ArrayList<>();
        cargarDatosLlano();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1_fondo = new javax.swing.JPanel();
        jButton1_registrarse = new javax.swing.JButton();
        jButton1_iniciarsesion = new javax.swing.JButton();
        jButton1_buscar = new javax.swing.JButton();
        jLabel1_nclientes = new javax.swing.JLabel();
        jButton1_tab = new javax.swing.JButton();
        jButton2_clientes_tab = new javax.swing.JButton();
        jButton3_mascotas_tab = new javax.swing.JButton();
        jButton4_vacunacion_tab = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_vacunacion = new javax.swing.JTable();
        jButton1_anadir = new javax.swing.JButton();
        jButton1_editar = new javax.swing.JButton();
        jButton1_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jPanel1_fondo.setBackground(new java.awt.Color(51, 255, 204));

        jButton1_registrarse.setBackground(new java.awt.Color(255, 255, 51));
        jButton1_registrarse.setForeground(new java.awt.Color(0, 0, 0));
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
        jLabel1_nclientes.setText("Nuestras Vacunas");

        jButton1_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton1_tab.setText("Tablón");
        jButton1_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_tabActionPerformed(evt);
            }
        });

        jButton2_clientes_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton2_clientes_tab.setText("Clientes");
        jButton2_clientes_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_clientes_tabActionPerformed(evt);
            }
        });

        jButton3_mascotas_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton3_mascotas_tab.setText("Mascotas");
        jButton3_mascotas_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_mascotas_tabActionPerformed(evt);
            }
        });

        jButton4_vacunacion_tab.setBackground(new java.awt.Color(255, 255, 51));
        jButton4_vacunacion_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton4_vacunacion_tab.setText("Vacunación");
        jButton4_vacunacion_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_vacunacion_tabActionPerformed(evt);
            }
        });

        jTable1_vacunacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mascota", "Cliente", "Vacuna", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1_vacunacion);

        javax.swing.GroupLayout jPanel1_fondoLayout = new javax.swing.GroupLayout(jPanel1_fondo);
        jPanel1_fondo.setLayout(jPanel1_fondoLayout);
        jPanel1_fondoLayout.setHorizontalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1_nclientes)
                    .addComponent(jButton1_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1_iniciarsesion)
                .addGap(9, 9, 9)
                .addComponent(jButton1_registrarse)
                .addContainerGap())
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                        .addComponent(jButton1_tab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2_clientes_tab)
                        .addGap(75, 75, 75)
                        .addComponent(jButton3_mascotas_tab)
                        .addGap(52, 52, 52)
                        .addComponent(jButton4_vacunacion_tab)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel1_fondoLayout.setVerticalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_registrarse)
                    .addComponent(jButton1_iniciarsesion)
                    .addComponent(jButton1_buscar))
                .addGap(24, 24, 24)
                .addComponent(jLabel1_nclientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_clientes_tab)
                    .addComponent(jButton1_tab)
                    .addComponent(jButton3_mascotas_tab)
                    .addComponent(jButton4_vacunacion_tab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1_anadir.setBackground(new java.awt.Color(51, 153, 255));
        jButton1_anadir.setForeground(new java.awt.Color(0, 0, 0));
        jButton1_anadir.setText("Añadir");
        jButton1_anadir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_anadirActionPerformed(evt);
            }
        });

        jButton1_editar.setBackground(new java.awt.Color(0, 255, 0));
        jButton1_editar.setForeground(new java.awt.Color(0, 0, 0));
        jButton1_editar.setText("Editar");
        jButton1_editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_editarActionPerformed(evt);
            }
        });

        jButton1_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton1_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButton1_eliminar.setText("Eliminar");
        jButton1_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jButton1_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_anadir)
                    .addComponent(jButton1_editar)
                    .addComponent(jButton1_eliminar))
                .addGap(0, 20, Short.MAX_VALUE))
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
        Registrarse registrarse = new Registrarse(); 
        registrarse.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton1_registrarseActionPerformed

    private void jButton3_mascotas_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_mascotas_tabActionPerformed
        Mascotas mascotas = new Mascotas(); 
        mascotas.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton3_mascotas_tabActionPerformed

    private void jButton1_anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_anadirActionPerformed
    try{
        JPanel panel = new JPanel(new GridLayout(4, 2));
            
        JTextField txtMascota = new JTextField();
        JTextField txtCliente = new JTextField();
        JComboBox<String> cbVacuna = new JComboBox<>(new String[]{
            "Rabia", "Moquillo", "Parvovirus", "Leptospirosis", "Hexavalente"
        });
        
        JComboBox<String> cbEstado = new JComboBox<>(new String[]{
            "Pendiente", "Aplicada", "Refuerzo pendiente", "Completo"
        });
            
        panel.add(new JLabel("Mascota:"));
        panel.add(txtMascota);
        panel.add(new JLabel("Cliente:"));
        panel.add(txtCliente);
        panel.add(new JLabel("Vacuna:"));
        panel.add(cbVacuna);
        panel.add(new JLabel("Estado:"));
        panel.add(cbEstado);
            
        int result = JOptionPane.showConfirmDialog(
            this, 
            panel, 
            "Nueva Vacunación", 
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
            );
            
        if (result == JOptionPane.OK_OPTION) {
            if (txtMascota.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "El nombre de mascota es obligatorio", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                
            Vacunacion v = new Vacunacion();
            v.setNombre_m(txtMascota.getText());
            v.setNombre(txtCliente.getText());
            v.setVacuna((String) cbVacuna.getSelectedItem());
            v.setEstado((String) cbEstado.getSelectedItem());
                
            DefaultTableModel modelo = (DefaultTableModel) jTable1_vacunacion.getModel();
            modelo.addRow(new Object[]{
                v.getNombre_m(),  
                v.getNombre(),  
                v.getVacuna(),    
                v.getEstado()     
            });
                
            ListaVacunas.add(v);
            ArchivoLlano.guardarEnArchivo(ListaVacunas);
                
            JOptionPane.showMessageDialog(this, "Vacunación añadida correctamente.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, 
            "Error al agregar vacunación: " + ex.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1_anadirActionPerformed

    private void jButton1_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_editarActionPerformed
    int filaSeleccionada = jTable1_vacunacion.getSelectedRow();
    
    if (filaSeleccionada != -1) {
        Vacunacion vacunaSeleccionada = ListaVacunas.get(filaSeleccionada);
        String nombreOriginal = vacunaSeleccionada.getNombre_m();
        
        int respuesta = JOptionPane.showConfirmDialog(
            null, 
            "¿Deseas editar esta vacunación?\n" + vacunaSeleccionada.Imprimir(), 
            "Confirmar edición",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        if(respuesta == JOptionPane.YES_OPTION) {
            JPanel panel = new JPanel(new GridLayout(0, 2));
            
            JTextField txtMascota = new JTextField(vacunaSeleccionada.getNombre_m());
            JTextField txtCliente = new JTextField(vacunaSeleccionada.getNombre());
            JComboBox<String> cbVacuna = new JComboBox<>(new String[]{
                "Rabia", "Moquillo", "Parvovirus", "Leptospirosis", "Hexavalente"});
            cbVacuna.setSelectedItem(vacunaSeleccionada.getVacuna());
            
            JComboBox<String> cbEstado = new JComboBox<>(new String[]{
                "Pendiente", "Aplicada", "Refuerzo pendiente", "Completo"});
            cbEstado.setSelectedItem(vacunaSeleccionada.getEstado());
            
            panel.add(new JLabel("Mascota:"));
            panel.add(txtMascota);
            panel.add(new JLabel("Cliente:"));
            panel.add(txtCliente);
            panel.add(new JLabel("Vacuna:"));
            panel.add(cbVacuna);
            panel.add(new JLabel("Estado:"));
            panel.add(cbEstado);
            
            int resultado = JOptionPane.showConfirmDialog(
                null, 
                panel, 
                "Editar Vacunación",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
            );
            
            if(resultado == JOptionPane.OK_OPTION) {
                vacunaSeleccionada.setNombre_m(txtMascota.getText());
                vacunaSeleccionada.setNombre(txtCliente.getText());
                vacunaSeleccionada.setVacuna((String) cbVacuna.getSelectedItem());
                vacunaSeleccionada.setEstado((String) cbEstado.getSelectedItem());
                
                ListaVacunas.set(filaSeleccionada, vacunaSeleccionada);
                
                ArchivoLlano.actualizarVacunacionEnArchivo(nombreOriginal, vacunaSeleccionada);
                
                DefaultTableModel modelo = (DefaultTableModel) jTable1_vacunacion.getModel();
                modelo.setValueAt(vacunaSeleccionada.getNombre_m(), filaSeleccionada, 0);
                modelo.setValueAt(vacunaSeleccionada.getNombre(), filaSeleccionada, 1);
                modelo.setValueAt(vacunaSeleccionada.getVacuna(), filaSeleccionada, 2);
                modelo.setValueAt(vacunaSeleccionada.getEstado(), filaSeleccionada, 3);
                
                JOptionPane.showMessageDialog(null, "Vacunación actualizada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Edición cancelada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se canceló la acción sobre el elemento");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor seleccione una vacunación de la tabla", 
            "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1_editarActionPerformed

    private void jButton1_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_eliminarActionPerformed
    int filaSeleccionada = this.jTable1_vacunacion.getSelectedRow(); 
    String Nombre_m = ListaVacunas.get(filaSeleccionada).getNombre_m();
    
    if (filaSeleccionada == -1 || ListaVacunas.isEmpty() || filaSeleccionada >= ListaVacunas.size()) {
        JOptionPane.showMessageDialog(null, "No hay datos para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        if (filaSeleccionada != -1){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar esta vacuna? -> "
                    + ListaVacunas.get(filaSeleccionada).Imprimir(), "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            
                    if(respuesta == JOptionPane.YES_OPTION){
                    ListaVacunas.remove(filaSeleccionada);
                    DefaultTableModel modelo = (DefaultTableModel) this.jTable1_vacunacion.getModel();
                    modelo.removeRow(filaSeleccionada);
                    ArchivoLlano.eliminarDeArchivo(Nombre_m);
                    
                    JOptionPane.showMessageDialog(null, "Vacuna Eliminada");
                }else{
                JOptionPane.showMessageDialog(null, "Se canceló la acción sobre el elemento");
            }
        }
    }//GEN-LAST:event_jButton1_eliminarActionPerformed

    private void jButton1_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_tabActionPerformed
        Gestion gestion = new Gestion(); 
        gestion.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton1_tabActionPerformed

    private void jButton2_clientes_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_clientes_tabActionPerformed
        Clientes clientes = new Clientes(); 
        clientes.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton2_clientes_tabActionPerformed

    private void jButton4_vacunacion_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_vacunacion_tabActionPerformed
        Vacunas vacunas = new Vacunas(); 
        vacunas.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton4_vacunacion_tabActionPerformed

    private void jButton1_iniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_iniciarsesionActionPerformed
        IniciarSesion iniciarsesion = new IniciarSesion(); 
        iniciarsesion.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton1_iniciarsesionActionPerformed

    public void cargarDatosLlano() {
    java.util.List<Vacunacion> vacunasCargadas = ArchivoLlano.cargarDesdeArchivo();

    if (vacunasCargadas == null) {
        JOptionPane.showMessageDialog(null, "No se pudieron cargar los datos.");
        return;
    }

    if (ListaVacunas == null) {
        ListaVacunas = new ArrayList<>();
    }

    ListaVacunas.clear();

    DefaultTableModel modelo = (DefaultTableModel) jTable1_vacunacion.getModel();
    modelo.setRowCount(0);

    ListaVacunas.addAll(vacunasCargadas);

    for (Vacunacion v : vacunasCargadas) {
        modelo.addRow(new Object[]{
            v.getNombre_m(),
            v.getNombre(),
            v.getVacuna(),
            v.getEstado()
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
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vacunas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_anadir;
    private javax.swing.JButton jButton1_buscar;
    private javax.swing.JButton jButton1_editar;
    private javax.swing.JButton jButton1_eliminar;
    private javax.swing.JButton jButton1_iniciarsesion;
    private javax.swing.JButton jButton1_registrarse;
    private javax.swing.JButton jButton1_tab;
    private javax.swing.JButton jButton2_clientes_tab;
    private javax.swing.JButton jButton3_mascotas_tab;
    private javax.swing.JButton jButton4_vacunacion_tab;
    private javax.swing.JLabel jLabel1_nclientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_vacunacion;
    // End of variables declaration//GEN-END:variables
}