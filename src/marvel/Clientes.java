package marvel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {
    
    ArrayList<Persona> ListaClientes = new ArrayList<>();

    public Clientes() {
        initComponents();
        cargarDatosPlano();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1_fondo = new javax.swing.JPanel();
        jButton1_registrarse = new javax.swing.JButton();
        jButton1_iniciarsesion = new javax.swing.JButton();
        jButton1_buscar = new javax.swing.JButton();
        jLabel1_nclientes = new javax.swing.JLabel();
        jButton1_tab = new javax.swing.JButton();
        jButton2_clientes_tab = new javax.swing.JButton();
        jButton3_mascotas_tab = new javax.swing.JButton();
        jButton4_vacunacion_tab = new javax.swing.JButton();
        jButton1_editar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2_clientes_tab = new javax.swing.JTable();
        jButton1_eliminar = new javax.swing.JButton();
        jButton1_ver = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        jLabel1_nclientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1_nclientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_nclientes.setText("Nuestros Clientes");

        jButton1_tab.setForeground(new java.awt.Color(51, 255, 204));
        jButton1_tab.setText("Tablòn");

        jButton2_clientes_tab.setBackground(new java.awt.Color(255, 255, 51));
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
        jButton4_vacunacion_tab.setText("Vacunaciòn");

        jButton1_editar.setBackground(new java.awt.Color(51, 255, 51));
        jButton1_editar.setText("Editar");
        jButton1_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_editarActionPerformed(evt);
            }
        });

        jTable2_clientes_tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Familia", "Teléfono", "Dirección"
            }
        ));
        jScrollPane2.setViewportView(jTable2_clientes_tab);

        jButton1_eliminar.setBackground(new java.awt.Color(255, 102, 102));
        jButton1_eliminar.setText("Eliminar");
        jButton1_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_eliminarActionPerformed(evt);
            }
        });

        jButton1_ver.setText("Ver");
        jButton1_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_verActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_fondoLayout = new javax.swing.GroupLayout(jPanel1_fondo);
        jPanel1_fondo.setLayout(jPanel1_fondoLayout);
        jPanel1_fondoLayout.setHorizontalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addComponent(jButton1_tab)
                                .addGap(35, 35, 35)
                                .addComponent(jButton2_clientes_tab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3_mascotas_tab)
                                .addGap(32, 32, 32)
                                .addComponent(jButton4_vacunacion_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                        .addComponent(jButton1_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133)
                                        .addComponent(jButton1_ver)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1_editar)))
                                .addGap(0, 19, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1_nclientes)
                            .addComponent(jButton1_buscar))
                        .addGap(24, 24, 24)
                        .addComponent(jButton1_iniciarsesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_registrarse)))
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_clientes_tab)
                    .addComponent(jButton1_tab)
                    .addComponent(jButton3_mascotas_tab)
                    .addComponent(jButton4_vacunacion_tab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_editar)
                    .addComponent(jButton1_eliminar)
                    .addComponent(jButton1_ver))
                .addGap(24, 24, 24))
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

    }//GEN-LAST:event_jButton1_registrarseActionPerformed

    private void jButton3_mascotas_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_mascotas_tabActionPerformed
       
    }//GEN-LAST:event_jButton3_mascotas_tabActionPerformed

    private void jButton1_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_editarActionPerformed
    int filaSeleccionada = this.jTable2_clientes_tab.getSelectedRow();

    if (filaSeleccionada == -1 || ListaClientes.isEmpty() || filaSeleccionada >= ListaClientes.size()) {
        JOptionPane.showMessageDialog(null, "No hay datos para editar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Persona clienteSeleccionado = ListaClientes.get(filaSeleccionada);
    String nombreOriginal = clienteSeleccionado.getNombre();

    int respuesta = JOptionPane.showConfirmDialog(
        null,
        "¿Deseas editar este cliente?\n" + clienteSeleccionado.Imprimir(),
        "Confirmar edición",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );
    if (respuesta != JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Edición cancelada");
        return;
    }

    JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
    panel.setPreferredSize(new Dimension(400, 200));

    JTextField txtNombre    = new JTextField(clienteSeleccionado.getNombre());
    JTextField txtFamilia   = new JTextField(clienteSeleccionado.getFamilia());
    JTextField txtTelefono  = new JTextField(String.valueOf(clienteSeleccionado.getTel()));
    JTextField txtDireccion = new JTextField(clienteSeleccionado.getDireccion());

    panel.add(new JLabel("Nombre:"));
    panel.add(txtNombre);
    panel.add(new JLabel("Familia:"));
    panel.add(txtFamilia);
    panel.add(new JLabel("Teléfono:"));
    panel.add(txtTelefono);
    panel.add(new JLabel("Dirección:"));
    panel.add(txtDireccion);

    int resultado = JOptionPane.showConfirmDialog(
        null,
        panel,
        "Editar Cliente",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE
    );
    if (resultado != JOptionPane.OK_OPTION) {
        JOptionPane.showMessageDialog(null, "Edición cancelada");
        return;
    }

    if (txtNombre.getText().trim().isEmpty() ||
        txtFamilia.getText().trim().isEmpty() ||
        txtTelefono.getText().trim().isEmpty() ||
        txtDireccion.getText().trim().isEmpty()) {

        JOptionPane.showMessageDialog(null,
            "¡Todos los campos son obligatorios!",
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        clienteSeleccionado.setNombre(txtNombre.getText().trim());
        clienteSeleccionado.setFamilia(txtFamilia.getText().trim());
        long telefonoLargo = Long.parseLong(txtTelefono.getText().trim());
        clienteSeleccionado.setTel((int) telefonoLargo);
        clienteSeleccionado.setDireccion(txtDireccion.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,
            "¡Teléfono inválido! Debe contener solo números.",
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    ListaClientes.set(filaSeleccionada, clienteSeleccionado);
    DefaultTableModel modelo = (DefaultTableModel) this.jTable2_clientes_tab.getModel();
    
    modelo.setValueAt(clienteSeleccionado.getNombre(), filaSeleccionada, 0);
    modelo.setValueAt(clienteSeleccionado.getFamilia(), filaSeleccionada, 1);
    modelo.setValueAt(clienteSeleccionado.getTel(), filaSeleccionada, 2);
    modelo.setValueAt(clienteSeleccionado.getDireccion(), filaSeleccionada, 3);

    ArchivoPlano.actualizarClienteEnArchivo(nombreOriginal, clienteSeleccionado);

    JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.");
    }//GEN-LAST:event_jButton1_editarActionPerformed

    private void jButton1_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_eliminarActionPerformed
    int filaSeleccionada = this.jTable2_clientes_tab.getSelectedRow(); 
    String Nombre = ListaClientes.get(filaSeleccionada).getNombre();
    
    if (filaSeleccionada == -1 || ListaClientes.isEmpty() || filaSeleccionada >= ListaClientes.size()) {
        JOptionPane.showMessageDialog(null, "No hay datos para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
        if (filaSeleccionada != -1){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este cliente? -> "
                    + ListaClientes.get(filaSeleccionada).Imprimir(), "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            
                    if(respuesta == JOptionPane.YES_OPTION){
                    ListaClientes.remove(filaSeleccionada);
                    DefaultTableModel modelo = (DefaultTableModel) this.jTable2_clientes_tab.getModel();
                    modelo.removeRow(filaSeleccionada);
                    ArchivoPlano.eliminarDeArchivo(Nombre);
                    
                    JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                }else{
                JOptionPane.showMessageDialog(null, "Se canceló la acción sobre el elemento");
            }
        }
    }//GEN-LAST:event_jButton1_eliminarActionPerformed

    private void jButton1_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_verActionPerformed
        cargarDatosPlano();
    }//GEN-LAST:event_jButton1_verActionPerformed

    public void cargarDatosPlano() {
    List<Persona> clientesCargados = ArchivoPlano.cargarDesdeArchivo();
    ListaClientes.clear();
    DefaultTableModel modelo = (DefaultTableModel) jTable2_clientes_tab.getModel();
    modelo.setRowCount(0);

    if (ListaClientes == null) {
        JOptionPane.showMessageDialog(null, "No se pudo cargar la lista de clientes desde el archivo.");
        return;
    }

        ListaClientes.addAll(clientesCargados);

        for(Persona cliente : clientesCargados){
            modelo.addRow(new Object[]{
                cliente.getNombre(),
                cliente.getFamilia(),
                cliente.getTel(),
                cliente.getDireccion(),
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_buscar;
    private javax.swing.JButton jButton1_editar;
    private javax.swing.JButton jButton1_eliminar;
    private javax.swing.JButton jButton1_iniciarsesion;
    private javax.swing.JButton jButton1_registrarse;
    private javax.swing.JButton jButton1_tab;
    private javax.swing.JButton jButton1_ver;
    private javax.swing.JButton jButton2_clientes_tab;
    private javax.swing.JButton jButton3_mascotas_tab;
    private javax.swing.JButton jButton4_vacunacion_tab;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1_nclientes;
    private javax.swing.JPanel jPanel1_fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2_clientes_tab;
    // End of variables declaration//GEN-END:variables
}