
package guisistema.medico;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import clases.*;
public class GuiModificarMedico extends javax.swing.JFrame {

    private ArrayList<Medico> medicos;
    private final int TAMANIONSS = 8;
    
    public GuiModificarMedico() {
        initComponents();
        this.setLocationRelativeTo(null);
        DB mt = new DB();
        medicos = mt.leerTxt("MedicoDB.txt");
        for (Medico medico : medicos) {
            cCedulas.addItem(medico.getCedula());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tApellidoP = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tApellidoM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cCedulas = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        formatoFecha = new javax.swing.JFormattedTextField();
        tCedulaPro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Cedula Profesional");

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tApellidoP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tApellidoPActionPerformed(evt);
            }
        });

        tNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre: ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Fecha Nacimiento");

        tApellidoM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tApellidoMActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Apellido Paterno:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Cédula:");

        cCedulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCedulasActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setText("Modificar Médico");

        formatoFecha.setForeground(new java.awt.Color(153, 153, 153));
        formatoFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        formatoFecha.setText("31-12-2000");
        formatoFecha.setToolTipText("<html>\n<p>Formato de fecha:</p>\n<p>dia-mes-año</p>\n<p>31-12-2000</p>\n</html>");

        tCedulaPro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tCedulaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCedulaProActionPerformed(evt);
            }
        });
        tCedulaPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCedulaProKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tCedulaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(formatoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tApellidoP)
                                .addComponent(tApellidoM)
                                .addComponent(tNombre)
                                .addComponent(cCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(271, 271, 271))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(formatoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tCedulaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        DB mt = new DB();

        if( this.evaluarCampos() ){
            //String fecha = tDia.getText() + "-"+tMes.getText()+"-"+tAnio.getText();
            String fecha = formatoFecha.getText();
            if (fecha.length() != 0) {
            Medico medico = new Medico( tCedulaPro.getText(), tNombre.getText(), tApellidoP.getText(), tApellidoM.getText(), fecha);
       
            medicos.remove(cCedulas.getSelectedIndex());
            medicos.add(medico);
            
            mt.guardarTxt(medicos, mt.MEDICO);
            
            JOptionPane.showMessageDialog(this, "Medico modificado correctamente");

           GuiMedico gm = new GuiMedico();
            gm.setVisible(true);
            dispose();
            }else{
                JOptionPane.showMessageDialog(this, "El campo fecha se encuentra vacio");
            }
        }else{
            System.out.println("Vacio");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
private boolean evaluarCampos(){
        if (!((tNombre.getText().equals(""))
                || (tApellidoP.getText().equals(""))
                || (tApellidoM.getText().equals(""))
                || (tCedulaPro.getText().equals("")))) {
            if (tCedulaPro.getText().length() == TAMANIONSS) {
                for (int i = 0; i < medicos.size(); i++) {
                    String cedula = tCedulaPro.getText();
                    if ( medicos.get(i).getCedula().equals(cedula) && cCedulas.getSelectedIndex() != i ) {
                        JOptionPane.showMessageDialog(this, "La cedula que intento ingresar ya se encuentra dentro del sistema");
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
    private void tApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tApellidoPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GuiMedico gm = new GuiMedico();
        gm.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombreActionPerformed

    private void tApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tApellidoMActionPerformed

    private void cCedulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCedulasActionPerformed
        // TODO add your handling code here:
        tNombre.setText(medicos.get(cCedulas.getSelectedIndex()).getNombre());
        tApellidoP.setText(medicos.get(cCedulas.getSelectedIndex()).getaP());
        tApellidoM.setText(medicos.get(cCedulas.getSelectedIndex()).getaM());
        tCedulaPro.setText(medicos.get(cCedulas.getSelectedIndex()).getCedula());
        
        //String[] fecha = medicos.get(cCedulas.getSelectedIndex()).getFechaNacimiento().split("-");
        String fecha = medicos.get(cCedulas.getSelectedIndex()).getFechaNacimiento();
        formatoFecha.setText(fecha);
    }//GEN-LAST:event_cCedulasActionPerformed

    private void tCedulaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCedulaProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCedulaProActionPerformed

    private void tCedulaProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCedulaProKeyTyped
        // TODO add your handling code here:
        if (!((tCedulaPro.getText().length() != 8) && (Character.isDigit(evt.getKeyChar())))) {
            evt.consume();
        }
    }//GEN-LAST:event_tCedulaProKeyTyped

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
            java.util.logging.Logger.getLogger(GuiModificarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiModificarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiModificarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiModificarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiModificarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cCedulas;
    private javax.swing.JFormattedTextField formatoFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tApellidoM;
    private javax.swing.JTextField tApellidoP;
    private javax.swing.JTextField tCedulaPro;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables
}
