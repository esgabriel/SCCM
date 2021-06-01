package guisistema.citamedica;

import clases.CitaMedica;
import clases.DB;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiEliminarCitaMedica extends javax.swing.JFrame {

    private final DB db = new DB();
    private int posicion;
    private boolean firstClick = true;

    public GuiEliminarCitaMedica() {
        initComponents();
    }

    private boolean existe(ArrayList<CitaMedica> citas, int hora) {
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getHora() == hora) {
                posicion = i;
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        formatoDia = new javax.swing.JFormattedTextField();
        tHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Eliminar Cita Médica ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Día");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Hora");

        eliminarButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        formatoDia.setForeground(new java.awt.Color(153, 153, 153));
        formatoDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        formatoDia.setText("31-12-2000");
        formatoDia.setToolTipText("<html>\n<p>Formato de fecha:</p>\n<p>dia-mes-año</p>\n<p>31-12-2000</p>\n</html>");
        formatoDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formatoDiaMousePressed(evt);
            }
        });

        tHora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tHora.setToolTipText("Formato de 24 horas");
        tHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tHoraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelarButton)
                                .addGap(30, 30, 30)
                                .addComponent(eliminarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(formatoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tHora, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel5)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(eliminarButton))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        if (!firstClick) {
            if (formatoDia.getText().length() != 0 && tHora.getText().length() != 0) {
                String dia = formatoDia.getText();
                String archivo = db.CITA_MEDICA + dia + ".txt";
                ArrayList<CitaMedica> citas = db.leerTxt(archivo);
                int hora = Integer.parseInt(tHora.getText());

                if (existe(citas, hora)) {
                    int respuesta = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar la cita medica?", "Confirmacion", JOptionPane.YES_NO_OPTION);

                    if (respuesta == JOptionPane.YES_OPTION) {
                        citas.remove(posicion);

                        if (!db.borrarTxt(citas, dia)) {
                            db.guardarTxt(citas, archivo);
                        }
                        JOptionPane.showMessageDialog(this, "Operacion realizada de forma exitosa");

                        GuiCitaMedica citaM = new GuiCitaMedica();
                        citaM.setVisible(true);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontro ninguna concidencia");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Campo(s) Dia/Hora se encuentra vacio(s)");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese dia de forma manual");
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Cancelar operacion?", "Confirmacion", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            GuiCitaMedica citaMenu = new GuiCitaMedica();
            citaMenu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void formatoDiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formatoDiaMousePressed
        //Mostrar formato de ejemplo y quitarlo al primer click
        if (firstClick) {
            formatoDia.setText("");
            firstClick = false;
        }
    }//GEN-LAST:event_formatoDiaMousePressed

    private void tHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tHoraKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        String txt = tHora.getText();
        if (txt.length() != 0) {
            if (txt.length() < 2) {
                if (Character.isDigit(evt.getKeyChar())) {
                    txt += evt.getKeyChar();
                }
                int hora = Integer.parseInt(txt);
                if (!(hora >= 0 && hora <= 23)) {
                    evt.consume();
                }
            } else {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tHoraKeyTyped

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
            java.util.logging.Logger.getLogger(GuiEliminarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiEliminarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiEliminarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiEliminarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiEliminarCitaMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JFormattedTextField formatoDia;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tHora;
    // End of variables declaration//GEN-END:variables
}
