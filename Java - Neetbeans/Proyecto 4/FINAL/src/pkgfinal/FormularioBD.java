/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgfinal;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormularioBD extends javax.swing.JFrame {

    public FormularioBD() {
        initComponents();
        UsuarioTinkaDB db = new UsuarioTinkaDB();
        listar(db.getUsuarios());
        System.out.println(db.getUsuarios().size());
        

    }

    private int getId() {
        return Integer.parseInt(txtId.getText());
    }

    private String getNombre() {
        return txtNombre.getText();
    }

    private String getCorreo() {
        return txtCorreo.getText();
    }

    private int getPuntos() {
        return Integer.parseInt(txtpuntos.getText());
    }

    public void mensaje(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, tipo);
    }

    public void mensajeError(String mensaje) {
        mensaje(mensaje, "Mensaje de error", JOptionPane.ERROR_MESSAGE);
    }

    public void listar(ArrayList<UsuarioTinka> lista) {
        DefaultTableModel df = ((DefaultTableModel) tbTinka.getModel());
        if (lista.size() > 0) {
            
            df.setRowCount(0);
            for (UsuarioTinka usuario : lista) {
                df.addRow(new Object[]{
                    usuario.getId(),
                    usuario.getNombres(),
                    usuario.getCorreo(),
                    usuario.getPuntos()
                });
            }
        } else {
            df.setRowCount(0);
            mensaje("No hay registros", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }

    public UsuarioTinka buscarId(ArrayList<UsuarioTinka> lista, int id) {
        for (UsuarioTinka usuar : lista) {
            if (usuar.getId() == id) {
                return usuar;
            }
        }
        return null;
    }

    public void limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        txtpuntos.setText("");
        cbOpcion.setSelectedIndex(0);
    }

    public void ingresar() {
        try {
            UsuarioTinkaDB db = new UsuarioTinkaDB();
            db.InsertarUsuario(getId(), getNombre(), getCorreo(), getPuntos());
            listar(db.getUsuarios());
            limpiar();
            mensaje("Usuario ingresado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            mensajeError(ex.getMessage());
        }
    }

    public void consultar() {
        UsuarioTinkaDB db = new UsuarioTinkaDB();
        UsuarioTinka author = buscarId(db.getUsuarios(), getId());
        if (author != null) {
            String mensaje = "Id: " + author.getId() + "\n"
                    + "Nombre: " + author.getNombres() + "\n"
                    + "Correo: " + author.getCorreo();
            limpiar();
            mensaje(mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            mensajeError("Usuario ingresado.");
        }
    }

    public void modificar() {
        UsuarioTinkaDB db = new UsuarioTinkaDB();
        UsuarioTinka author = buscarId(db.getUsuarios(), getId());
        if (author != null) {
            db.updateUsuario(getId(), getNombre(), getCorreo(), getPuntos());
            listar(db.getUsuarios());
            limpiar();
            mensaje("Autor modificado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            mensajeError("Autor no existe.");
        }
    }

    public void eliminar() {
        try {
            UsuarioTinkaDB db = new UsuarioTinkaDB();
            UsuarioTinka author = buscarId(db.getUsuarios(), getId());
            if (author != null) {
                db.EliminarUsuario(author.getId());
                
                listar(db.getUsuarios());
                limpiar();
                mensaje("Autor eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                mensajeError("Autor no existe.");
            }
            
        } catch (Exception ex) {
            mensajeError(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOpcion = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTinka = new javax.swing.JTable();
        lblOpcion1 = new javax.swing.JLabel();
        cbOpcion = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        adsa = new javax.swing.JLabel();
        asd = new javax.swing.JLabel();
        txtpuntos = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();

        lblOpcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOpcion.setText("Opción:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbTinka.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbTinka);

        lblOpcion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOpcion1.setText("Opción:");

        cbOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingresar", "Consultar", "Modificar", "Eliminar" }));
        cbOpcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOpcionItemStateChanged(evt);
            }
        });
        cbOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcionActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("Id:");

        adsa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adsa.setText("Correo:");

        asd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        asd.setText("Puntos:");

        txtpuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpuntosActionPerformed(evt);
            }
        });

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre1.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(asd, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(lblNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adsa)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombre)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOpcion1)
                            .addComponent(cbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adsa)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asd))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getAccessibleContext().setAccessibleName("frmtinka");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOpcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOpcionItemStateChanged

        int opcion = cbOpcion.getSelectedIndex();
        boolean visible = true;
        if (opcion == 1 || opcion == 3) {
            visible = false;
        }
        

    }//GEN-LAST:event_cbOpcionItemStateChanged

    private void cbOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcionActionPerformed

    }//GEN-LAST:event_cbOpcionActionPerformed

    private void txtpuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpuntosActionPerformed

    }//GEN-LAST:event_txtpuntosActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
switch (cbOpcion.getSelectedIndex()) {
            case 0: ingresar(); break;
            case 1: consultar(); break;
            case 2: modificar(); break;
            default: eliminar();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcesarActionPerformed

    public static void main(String args[]) {
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adsa;
    private javax.swing.JLabel asd;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cbOpcion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblOpcion;
    private javax.swing.JLabel lblOpcion1;
    private javax.swing.JTable tbTinka;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtpuntos;
    // End of variables declaration//GEN-END:variables
}
