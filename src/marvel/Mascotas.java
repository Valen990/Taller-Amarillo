/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marvel;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Mascotas extends javax.swing.JFrame {
    
    ArrayList<Mascota> ListaMascotas = new ArrayList<>();

    public Mascotas() {
        initComponents();
        cargarDatosLiso();
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
        jTable1_mascotas = new javax.swing.JTable();
        jButton1_editar = new javax.swing.JButton();
        jButton1_eliminar = new javax.swing.JButton();
        jButton1_historial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jPanel1_fondo.setBackground(new java.awt.Color(51, 255, 204));

        jButton1_registrarse.setBackground(new java.awt.Color(255, 255, 51));
        jButton1_registrarse.setForeground(new java.awt.Color(51, 255, 204));
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
        jLabel1_nclientes.setText("Nuestras Mascotas");

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

        jButton3_mascotas_tab.setBackground(new java.awt.Color(255, 255, 51));
        jButton3_mascotas_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton3_mascotas_tab.setText("Mascotas");
        jButton3_mascotas_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_mascotas_tabActionPerformed(evt);
            }
        });

        jButton4_vacunacion_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton4_vacunacion_tab.setText("Vacunación");
        jButton4_vacunacion_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_vacunacion_tabActionPerformed(evt);
            }
        });

        jTable1_mascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apodo", "Especie", "Raza", "Pelaje", "Edad"
            }
        ));
        jScrollPane1.setViewportView(jTable1_mascotas);

        jButton1_editar.setBackground(new java.awt.Color(51, 255, 51));
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

        jButton1_historial.setBackground(new java.awt.Color(255, 51, 0));
        jButton1_historial.setForeground(new java.awt.Color(0, 0, 0));
        jButton1_historial.setText("Historial");
        jButton1_historial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_historialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_fondoLayout = new javax.swing.GroupLayout(jPanel1_fondo);
        jPanel1_fondo.setLayout(jPanel1_fondoLayout);
        jPanel1_fondoLayout.setHorizontalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                        .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1_buscar)
                                .addGap(23, 23, 23)
                                .addComponent(jButton1_iniciarsesion)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1_tab)
                                    .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(jButton2_clientes_tab)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3_mascotas_tab)
                                .addGap(77, 77, 77)))
                        .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4_vacunacion_tab)
                            .addComponent(jButton1_registrarse, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                        .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addComponent(jButton1_historial, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jButton1_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_nclientes)
                .addGap(263, 263, 263))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_editar)
                    .addComponent(jButton1_historial)
                    .addComponent(jButton1_eliminar))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        /*Mascotas mascotas = new Mascotas(); 
        mascotas.setVisible(true); 
        dispose();*/
    }//GEN-LAST:event_jButton3_mascotas_tabActionPerformed

    private void jButton1_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_editarActionPerformed
    int filaSeleccionada = this.jTable1_mascotas.getSelectedRow();
        
    if (filaSeleccionada != -1) {
    Mascota mascotaSeleccionada = ListaMascotas.get(filaSeleccionada);
    String mascotaActual = mascotaSeleccionada.getNombre_m();
    
    int respuesta = JOptionPane.showConfirmDialog(
        null, 
        "¿Deseas editar este cliente?\n" + mascotaSeleccionada.Imprimir(), 
        "Confirmar edición",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );
    
    if(respuesta == JOptionPane.YES_OPTION) {
        JPanel panel = new JPanel(new GridLayout(0, 2));
        
        JTextField txtNombre = new JTextField(mascotaSeleccionada.getNombre_m());
        JTextField txtApodo = new JTextField(mascotaSeleccionada.getApodo());
        JTextField txtEspecie = new JTextField(mascotaSeleccionada.getEspecie());
        JTextField txtRaza = new JTextField(mascotaSeleccionada.getRaza());
        JTextField txtPelaje = new JTextField(mascotaSeleccionada.getColor_pelo());
        JTextField txtEdad = new JTextField(mascotaSeleccionada.getEdad()); 
        
        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Apodo:")); 
        panel.add(txtApodo);
        panel.add(new JLabel("Especie:")); 
        panel.add(txtEspecie);
        panel.add(new JLabel("Raza:")); 
        panel.add(txtRaza);
        panel.add(new JLabel("Pelaje:")); 
        panel.add(txtPelaje);
        panel.add(new JLabel("Edad:")); 
        panel.add(txtEdad);
        
        int resultado = JOptionPane.showConfirmDialog(
            null, 
            panel, 
            "Editar Mascota",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
        
        if(resultado == JOptionPane.OK_OPTION) {
            mascotaSeleccionada.setNombre_m(txtNombre.getText());
            mascotaSeleccionada.setApodo(txtApodo.getText());
            mascotaSeleccionada.setEspecie(txtEspecie.getText());
            mascotaSeleccionada.setRaza(txtRaza.getText());
            mascotaSeleccionada.setColor_pelo(txtPelaje.getText());
            mascotaSeleccionada.setEdad(txtEdad.getText()); 
            
            ListaMascotas.set(filaSeleccionada, mascotaSeleccionada);
            ArchivoLiso.actualizarMascotaEnArchivo(mascotaActual, mascotaSeleccionada);
            
            DefaultTableModel modelo = (DefaultTableModel) this.jTable1_mascotas.getModel();
            modelo.setValueAt(mascotaSeleccionada.getNombre_m(), filaSeleccionada, 0);
            modelo.setValueAt(mascotaSeleccionada.getApodo(), filaSeleccionada, 1);
            modelo.setValueAt(mascotaSeleccionada.getEspecie(), filaSeleccionada, 2);
            modelo.setValueAt(mascotaSeleccionada.getRaza(), filaSeleccionada, 3);
            modelo.setValueAt(mascotaSeleccionada.getColor_pelo(), filaSeleccionada, 4);
            modelo.setValueAt(mascotaSeleccionada.getEdad(), filaSeleccionada, 5);
            
            JOptionPane.showMessageDialog(null, "Lista actualizada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Edición cancelada");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Se canceló la acción sobre el elemento");
    }
}
    }//GEN-LAST:event_jButton1_editarActionPerformed

    private void jButton1_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_eliminarActionPerformed
    int filaSeleccionada = this.jTable1_mascotas.getSelectedRow();
    String Nombre_m = ListaMascotas.get(filaSeleccionada).getNombre_m();
        
        if (filaSeleccionada != -1){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este dato? -> "
            + ListaMascotas.get(filaSeleccionada).Imprimir(), "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
                
            if(respuesta ==JOptionPane.YES_OPTION){
                    ListaMascotas.remove(filaSeleccionada);
                    DefaultTableModel modelo = (DefaultTableModel) this.jTable1_mascotas.getModel();
                    modelo.removeRow(filaSeleccionada);
                    ArchivoLiso.eliminarDeArchivo(Nombre_m);
                    
                    JOptionPane.showMessageDialog(null, "Elemento Eliminado");
                }else{
                    JOptionPane.showMessageDialog(null, "Se canceló la acción sobre el elemento");
                }
            }
    }//GEN-LAST:event_jButton1_eliminarActionPerformed

    private void jButton1_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_historialActionPerformed
        Historial_m historial = new Historial_m(); 
        historial.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton1_historialActionPerformed

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

    public void cargarDatosLiso() {
    ListaMascotas.clear(); 

    List<Mascota> mascotasCargadas = ArchivoLiso.cargarDesdeArchivo();
    if (mascotasCargadas == null || mascotasCargadas.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontraron datos de mascotas.");
        return;
    }

    ListaMascotas.addAll(mascotasCargadas);

    DefaultTableModel modelo = (DefaultTableModel) jTable1_mascotas.getModel();
    modelo.setRowCount(0); // limpiar tabla

    for (Mascota a : ListaMascotas) {
        modelo.addRow(new Object[]{
            a.getNombre_m(),
            a.getApodo(),
            a.getEspecie(),
            a.getRaza(),
            a.getColor_pelo(),
            a.getEdad()
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
            java.util.logging.Logger.getLogger(Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_buscar;
    private javax.swing.JButton jButton1_editar;
    private javax.swing.JButton jButton1_eliminar;
    private javax.swing.JButton jButton1_historial;
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
    private javax.swing.JTable jTable1_mascotas;
    // End of variables declaration//GEN-END:variables
}