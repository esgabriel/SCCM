package guisistema.citamedica;

import clases.CitaMedica;
import clases.DB;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiEliminarCitaMedica extends javax.swing.JFrame {

    private final DB db = new DB();
    private CitaMedica cita = new CitaMedica();
    private ArrayList<String> citasMedicas = db.leerTxt(db.HORARIO);

    public GuiEliminarCitaMedica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        diaComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminarButton = new javax.swing.JButton();
        horaTextField = new javax.swing.JTextField();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Eliminar Cita Médica ");

        diaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));

        jLabel4.setText("Día");

        jLabel3.setText("Hora");

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        horaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horaTextFieldKeyTyped(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
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
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(diaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(horaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(78, 78, 78))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cancelarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarButton)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButton)
                    .addComponent(cancelarButton))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        if (horaTextField.getText().length() != 0) { // Verificar que se ingresa una hora valida
            int dia = diaComboBox.getSelectedIndex() + 1;
            int hora = Integer.valueOf(horaTextField.getText());

            if (!verificarFecha(hora, dia)) {//Verificar que existe cita en ese dia - hora
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea eliminar?","Confirmacion",JOptionPane.YES_NO_OPTION);
                
                if (respuesta == JOptionPane.YES_OPTION) {
                    quitarCita(hora, dia);
                    db.guardarTxt(citasMedicas, db.HORARIO);
                    JOptionPane.showMessageDialog(this, "Cita medica eliminada","Informacion",JOptionPane.INFORMATION_MESSAGE);
                    
                    GuiCitaMedica citaMenu = new GuiCitaMedica();
                    citaMenu.setVisible(true);
                    dispose();
                }

                //Bloquear comboBox y textField para evitar modificación
                //diaComboBox.disable();
                //horaTextField.setEditable(false);

                //diaNuevoComboBox.enable();
                //horaNuevaTextField.setEditable(true);

                //String nss = citasMedicas.get(hora).split("~")[dia].split("-")[1];
                //nSSLabel.setText(nss);
                //nombreLabel.setText("Jose Angel Rincon Martinez"); //Nombre del paciente...
                //quitarCita(hora, dia);

                //diaNuevoComboBox.setSelectedIndex(dia - 1);
                //horaNuevaTextField.setText(String.valueOf(hora));
            } else {
                JOptionPane.showMessageDialog(this, "Cita medica no encontrada ", "Sin informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            horaTextField.requestFocus();
            JOptionPane.showMessageDialog(this, "El campo 'Hora' se encuentra vacio\nPor favor ingrese una hora valida", "Campo vacio", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void horaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horaTextFieldKeyTyped
        // TODO add your handling code here: Limitar a solo digitos y formato de 24 horas (00 -> 23)
        if (!(Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else {
            String texto = horaTextField.getText();
            if (texto.length() == 2) {
                evt.consume();
                /*/if (texto.length() != 0) {
                    int hora = Integer.valueOf(texto);
                    if (!(hora >= 0 && hora <= 23)) {
                        evt.consume();
                    }
                }/*/
            }
        }
    }//GEN-LAST:event_horaTextFieldKeyTyped

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Cancelar operacion?", "Confirmacion", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            GuiCitaMedica citaMenu = new GuiCitaMedica();
            citaMenu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_cancelarButtonActionPerformed
    public boolean verificarFecha(int hora, int dia) {
        return citasMedicas.get(hora).split("~")[dia].equalsIgnoreCase("false");
    }

    public void quitarCita(int hora, int dia) {
        String arr[] = citasMedicas.get(hora).split("~");
        //cita.setCita(arr[dia]);
        arr[dia] = "false";
        String horario = cita.formato(arr);
        //System.out.println(horario);
        citasMedicas.set(hora, horario);
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
    private javax.swing.JComboBox<String> diaComboBox;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTextField horaTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
