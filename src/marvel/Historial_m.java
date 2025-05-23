/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marvel;

import java.awt.GridLayout;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

//Estos imports son de lo del PDF jujuju.
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;

public class Historial_m extends javax.swing.JFrame {

    private List<Historial> ListaHistorial = new ArrayList<>(); 
    
    public Historial_m() {
    initComponents();
    cargarDatosGrueso();
    }

    private void generarHTMLyAbrir(Historial historial) throws Exception {
    File htmlFile = File.createTempFile("historial", ".html");
    
    String html = "<!DOCTYPE html>\n" +
                 "<html>\n" +
                 "<head>\n" +
                 "  <meta charset='UTF-8'>\n" +
                 "  <title>Historial Médico - " + historial.getNombre_m() + "</title>\n" +
                 "  <style>\n" +
                 "    body { \n" +
                 "      font-family: 'Arial', sans-serif; \n" +
                 "      margin: 0; \n" +
                 "      padding: 20px; \n" +
                 "      color: #333;\n" +
                 "      background-color: #f0f8ff;\n" +
                 "    }\n" +
                 "    .header { \n" +
                 "      text-align: center; \n" +
                 "      margin-bottom: 20px; \n" +
                 "      padding-bottom: 10px; \n" +
                 "      border-bottom: 2px solid #00BFFF;\n" +
                 "    }\n" +
                 "    h1 { \n" +
                 "      color: #00BFFF;\n" +
                 "      margin-top: 10px;\n" +
                 "    }\n" +
                 "    .historial-info { \n" +
                 "      background: white; \n" +
                 "      padding: 20px; \n" +
                 "      border-radius: 8px; \n" +
                 "      box-shadow: 0 2px 5px rgba(0,0,0,0.1);\n" +
                 "      border-left: 4px solid #00BFFF;\n" +
                 "    }\n" +
                 "    .instrucciones { \n" +
                 "      background: #e6f2ff;\n" +
                 "      padding: 15px; \n" +
                 "      border-radius: 5px; \n" +
                 "      margin-top: 30px;\n" +
                 "    }\n" +
                 "    @media print {\n" +
                 "      .instrucciones { display: none !important; }\n" +
                 "      body { background-color: white; }\n" +
                 "      .historial-info { box-shadow: none; }\n" +
                 "    }\n" +
                 "  </style>\n" +
                 "</head>\n" +
                 "<body>\n" +
                 "  <div class='header'>\n" +
                 "    <h1>Historial Médico</h1>\n" +  
                 "  </div>\n" +
                 "  \n" +
                 "  <div class='historial-info'>\n" +
                 "    <p><strong>Mascota:</strong> " + historial.getNombre_m() + "</p>\n" +
                 "    <p><strong>Observaciones:</strong> " + historial.getObservaciones() + "</p>\n" +
                 "    <p><strong>Fecha:</strong> " + new SimpleDateFormat("dd/MM/yyyy").format(historial.getFecha()) + "</p>\n" +
                 "  </div>\n" +
                 "  \n" +
                 "  <div class='instrucciones'>\n" +
                 "    <h3>¿Cómo guardar como PDF?</h3>\n" +
                 "    <ol>\n" +
                 "      <li>Presiona <kbd>Ctrl + P</kbd> (Windows) o <kbd>Cmd + P</kbd> (Mac).</li>\n" +
                 "      <li>Selecciona <b>'Guardar como PDF'</b> como impresora.</li>\n" +
                 "      <li>¡Listo! Elige la ubicación y guarda.</li>\n" +
                 "    </ol>\n" +
                 "  </div>\n" +
                 "</body>\n" +
                 "</html>";

    try (FileWriter writer = new FileWriter(htmlFile)) {
        writer.write(html);
    }
    
    Desktop.getDesktop().browse(htmlFile.toURI());
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jTable1_historial = new javax.swing.JTable();
        jButton1_editar = new javax.swing.JButton();
        jButton1_eliminar = new javax.swing.JButton();
        jButton1_añadir = new javax.swing.JButton();
        jButton1_verdetalles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jTable1_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mascota", "Observaciones", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTable1_historial);

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

        jButton1_añadir.setBackground(new java.awt.Color(51, 51, 255));
        jButton1_añadir.setForeground(new java.awt.Color(0, 0, 0));
        jButton1_añadir.setText("Añadir");
        jButton1_añadir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_añadirActionPerformed(evt);
            }
        });

        jButton1_verdetalles.setBackground(new java.awt.Color(255, 102, 0));
        jButton1_verdetalles.setForeground(new java.awt.Color(0, 0, 0));
        jButton1_verdetalles.setText("Ver detalles");
        jButton1_verdetalles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_verdetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_verdetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_fondoLayout = new javax.swing.GroupLayout(jPanel1_fondo);
        jPanel1_fondo.setLayout(jPanel1_fondoLayout);
        jPanel1_fondoLayout.setHorizontalGroup(
            jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_fondoLayout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addComponent(jButton1_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_iniciarsesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_registrarse)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addComponent(jButton1_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1_verdetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel1_nclientes)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1_fondoLayout.createSequentialGroup()
                                .addComponent(jButton1_tab)
                                .addGap(33, 33, 33)
                                .addComponent(jButton2_clientes_tab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3_mascotas_tab)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4_vacunacion_tab)))))
                .addGap(11, 11, 11))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_eliminar)
                    .addComponent(jButton1_editar)
                    .addComponent(jButton1_añadir)
                    .addComponent(jButton1_verdetalles))
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
        Registrarse registrarse = new Registrarse(); 
        registrarse.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton1_registrarseActionPerformed

    private void jButton3_mascotas_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_mascotas_tabActionPerformed
        Mascotas mascotas = new Mascotas(); 
        mascotas.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton3_mascotas_tabActionPerformed

    private void jButton1_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_editarActionPerformed
    int filaSeleccionada = this.jTable1_historial.getSelectedRow();

    if (filaSeleccionada != -1) {
    Historial historialSeleccionado = ListaHistorial.get(filaSeleccionada);
    String historialActual = historialSeleccionado.getNombre_m();

    int respuesta = JOptionPane.showConfirmDialog(
        null,
        "¿Deseas editar este historial?\n" + historialSeleccionado.Imprimir(),
        "Confirmar edición",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );

    if (respuesta == JOptionPane.YES_OPTION) {
        JPanel panel = new JPanel(new GridLayout(0, 2));
        JTextField txtNombre = new JTextField(historialSeleccionado.getNombre_m());
        JTextField txtObservaciones = new JTextField(historialSeleccionado.getObservaciones());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        JTextField txtFecha = new JTextField(sdf.format(historialSeleccionado.getFecha()));

        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Observaciones:"));
        panel.add(txtObservaciones);
        panel.add(new JLabel("Fecha (dd-MM-yyyy):"));
        panel.add(txtFecha);

        int resultado = JOptionPane.showConfirmDialog(
            null,
            panel,
            "Editar Historial",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        if (resultado == JOptionPane.OK_OPTION) {
            try {
                Date fechaParseada = sdf.parse(txtFecha.getText());

                historialSeleccionado.setNombre_m(txtNombre.getText());
                historialSeleccionado.setObservaciones(txtObservaciones.getText());
                historialSeleccionado.setFecha(fechaParseada);

                ListaHistorial.set(filaSeleccionada, historialSeleccionado);
                ArchivoGrueso.actualizarHistorialEnArchivo(historialActual, historialSeleccionado);

                DefaultTableModel modelo = (DefaultTableModel) this.jTable1_historial.getModel();
                modelo.setValueAt(historialSeleccionado.getNombre_m(), filaSeleccionada, 0);
                modelo.setValueAt(historialSeleccionado.getObservaciones(), filaSeleccionada, 1);
                modelo.setValueAt(sdf.format(historialSeleccionado.getFecha()), filaSeleccionada, 2);

                JOptionPane.showMessageDialog(null, "Lista actualizada correctamente");
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Fecha inválida. Use el formato dd-MM-yyyy.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Edición cancelada");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Se canceló la acción sobre el elemento");
    }
}
    }//GEN-LAST:event_jButton1_editarActionPerformed

    private void jButton1_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_eliminarActionPerformed
    int filaSeleccionada = this.jTable1_historial.getSelectedRow();

    if (filaSeleccionada != -1) {
    Historial historialSeleccionado = ListaHistorial.get(filaSeleccionada);
    String nombre_m = historialSeleccionado.getNombre_m();

    int respuesta = JOptionPane.showConfirmDialog(
        null,
        "¿Estás seguro de que deseas eliminar este dato? ->\n" + historialSeleccionado.Imprimir(),
        "Confirmar eliminación",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );

    if (respuesta == JOptionPane.YES_OPTION) {
        ListaHistorial.remove(filaSeleccionada);
        DefaultTableModel modelo = (DefaultTableModel) this.jTable1_historial.getModel();
        modelo.removeRow(filaSeleccionada);
        ArchivoGrueso.eliminarDeArchivo(nombre_m);

        JOptionPane.showMessageDialog(null, "Elemento eliminado correctamente.");
    } else {
        JOptionPane.showMessageDialog(null, "Se canceló la acción sobre el elemento.");
    }
} else {
    JOptionPane.showMessageDialog(null, "Por favor selecciona una fila para eliminar.");
}
    }//GEN-LAST:event_jButton1_eliminarActionPerformed

    private void jButton1_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_añadirActionPerformed
    try {
    JPanel panel = new JPanel(new GridLayout(4, 2));

    JTextField txtMascota = new JTextField();
    JTextField txtObservaciones = new JTextField();
    JTextField txtFecha = new JTextField(); 

    panel.add(new JLabel("Mascota:"));
    panel.add(txtMascota);
    panel.add(new JLabel("Observaciones:"));
    panel.add(txtObservaciones);
    panel.add(new JLabel("Fecha (dd-MM-yyyy):"));
    panel.add(txtFecha);

    int result = JOptionPane.showConfirmDialog(
        this,
        panel,
        "Nuevo Historial",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE
    );

    if (result == JOptionPane.OK_OPTION) {
        if (txtMascota.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "El nombre de la mascota es obligatorio",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha;
        try {
            fecha = sdf.parse(txtFecha.getText().trim());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this,
                "La fecha debe tener el formato dd-MM-yyyy",
                "Error de fecha", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Historial m = new Historial();
        m.setNombre_m(txtMascota.getText());
        m.setObservaciones(txtObservaciones.getText());
        m.setFecha(fecha);

        DefaultTableModel modelo = (DefaultTableModel) jTable1_historial.getModel();
        modelo.addRow(new Object[]{
            m.getNombre_m(),
            m.getObservaciones(),
            sdf.format(m.getFecha())
        });

        ListaHistorial.add(m);
        ArchivoGrueso.guardarEnArchivo(ListaHistorial);

        JOptionPane.showMessageDialog(this, "Historial añadido correctamente.");
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this,
        "Error al agregar historial: " + ex.getMessage(),
        "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1_añadirActionPerformed

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

    private void jButton1_verdetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_verdetallesActionPerformed
    int filaSeleccionada = jTable1_historial.getSelectedRow();
    if (filaSeleccionada != -1) {
        try {
            Historial historial = ListaHistorial.get(filaSeleccionada);
            generarHTMLyAbrir(historial); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar HTML: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona un historial primero.", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jButton1_verdetallesActionPerformed

    public  void cargarDatosGrueso() {
    List<Historial> historialesCargados = ArchivoGrueso.cargarDesdeArchivo();
    ListaHistorial.clear();
    DefaultTableModel modelo = (DefaultTableModel) jTable1_historial.getModel();
    modelo.setRowCount(0);

    if (ListaHistorial == null) {
        JOptionPane.showMessageDialog(null, "No se pudo cargar la lista de los historiales desde el archivo.");
        return;
    }

        ListaHistorial.addAll(historialesCargados);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        for(Historial m : historialesCargados){
            modelo.addRow(new Object[]{
                m.getNombre_m(),
                m.getObservaciones(),
                sdf.format(m.getFecha())
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
            java.util.logging.Logger.getLogger(Historial_m.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial_m.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial_m.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial_m.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial_m().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_añadir;
    private javax.swing.JButton jButton1_buscar;
    private javax.swing.JButton jButton1_editar;
    private javax.swing.JButton jButton1_eliminar;
    private javax.swing.JButton jButton1_iniciarsesion;
    private javax.swing.JButton jButton1_registrarse;
    private javax.swing.JButton jButton1_tab;
    private javax.swing.JButton jButton1_verdetalles;
    private javax.swing.JButton jButton2_clientes_tab;
    private javax.swing.JButton jButton3_mascotas_tab;
    private javax.swing.JButton jButton4_vacunacion_tab;
    private javax.swing.JLabel jLabel1_nclientes;
    private javax.swing.JPanel jPanel1_fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_historial;
    // End of variables declaration//GEN-END:variables
}