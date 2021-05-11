package guisistema.medico;

import java.awt.event.KeyEvent;
import clases.*;
import guisistema.citamedica.GuiCitaMedica;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiAgregarMedico extends javax.swing.JFrame {

    private DB mt = new DB();
    private ArrayList<Medico> medicos = mt.leerTxt(mt.MEDICO);

    public GuiAgregarMedico() {
        initComponents();
        tCedula.setToolTipText("<html>Formato de cedula<br>1. La cedula es de 8 caractares</br><br>2. Solo valores numericos</br></html>");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        tMes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tCedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tApellidoPaterno = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tApellidoMaterno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tDia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tAnnio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Nacimiento");

        tMes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tMesKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Día:");

        tCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCedulaActionPerformed(evt);
            }
        });
        tCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCedulaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Mes:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Año:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Cedula Profesional");

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tApellidoPaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tApellidoPaternoActionPerformed(evt);
            }
        });
        tApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tApellidoPaternoKeyTyped(evt);
            }
        });

        tNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNombreKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre: ");

        tApellidoMaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tApellidoMaternoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Apellido Paterno:");

        tDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tDiaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        tAnnio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tAnnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tAnnioKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("Agregar Médico");

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tDia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(67, 67, 67)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel7)
                                                .addComponent(tAnnio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(tMes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(162, 162, 162))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(252, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tAnnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.evaluarCampos()) {
            String fecha = tDia.getText() + "-" + tMes.getText() + "-" + tAnnio.getText();
            Medico medico = new Medico(tCedula.getText(), tNombre.getText(), tApellidoPaterno.getText(), tApellidoMaterno.getText(), fecha);

            medicos.add(medico);

            mt.guardarTxt(medicos, mt.MEDICO);

            JOptionPane.showMessageDialog(this, "Medico agregado correctamente");

            GuiMedico gm = new GuiMedico();
            gm.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tApellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tApellidoPaternoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GuiMedico gm = new GuiMedico();
        gm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCedulaKeyTyped
        // TODO add your handling code here:
        if (!((tCedula.getText().length() != 8) && (Character.isDigit(evt.getKeyChar())))) {
            evt.consume();
        }
    }//GEN-LAST:event_tCedulaKeyTyped

    private void tNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNombreKeyTyped
        // TODO add your handling code here:
        if (!(Character.isAlphabetic(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tNombreKeyTyped

    private void tApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tApellidoPaternoKeyTyped
        // TODO add your handling code here:
        if (!Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tApellidoPaternoKeyTyped

    private void tApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tApellidoMaternoKeyTyped
        // TODO add your handling code here:
        if (!Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tApellidoMaternoKeyTyped

    private void tDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tDiaKeyTyped
        // TODO add your handling code here:
        if (!(Character.isDigit(evt.getKeyChar()) && tDia.getText().length() != 2)) {
            evt.consume();
        }
    }//GEN-LAST:event_tDiaKeyTyped

    private void tMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMesKeyTyped
        // TODO add your handling code here:
        if (!(Character.isDigit(evt.getKeyChar()) && tMes.getText().length() != 2)) {
            evt.consume();
        }
    }//GEN-LAST:event_tMesKeyTyped

    private void tAnnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tAnnioKeyTyped
        // TODO add your handling code here:
        if (!(Character.isDigit(evt.getKeyChar()) && tAnnio.getText().length() != 4)) {
            evt.consume();
        }
    }//GEN-LAST:event_tAnnioKeyTyped
    
    private boolean evaluarCampos() {
        if (!((tNombre.getText().equals(""))
                || (tApellidoPaterno.getText().equals(""))
                || (tApellidoMaterno.getText().equals(""))
                || (tCedula.getText().equals("")))) {
            if (tCedula.getText().length() == 8) {
                for (int i = 0; i < medicos.size(); i++) {
                    String cedula = tCedula.getText();
                    if (medicos.get(i).getCedula().equals(cedula)) {
                        JOptionPane.showMessageDialog(this, "La cedula ingresada ya se encuentra dentro del sistema");
                        return false;
                    }
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "El formato de la cedula es incorrecto");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Algun campo se encuentra vacio, verifique nuevamente los campos");
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiAgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAgregarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tAnnio;
    private javax.swing.JTextField tApellidoMaterno;
    private javax.swing.JTextField tApellidoPaterno;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tDia;
    private javax.swing.JTextField tMes;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables
}
