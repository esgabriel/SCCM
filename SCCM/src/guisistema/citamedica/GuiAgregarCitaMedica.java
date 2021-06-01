package guisistema.citamedica;

import clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class GuiAgregarCitaMedica extends javax.swing.JFrame {

    private final DB mt = new DB();
    private ArrayList<Paciente> pacientes = mt.leerTxt(mt.PACIENTE);
    private ArrayList<Medico> medicos = mt.leerTxt(mt.MEDICO);
    private ArrayList<CitaMedica> citas;
    private boolean firstClick = true;

    /**
     * Creates new form GuiAgregarCitaMedica
     */
    public GuiAgregarCitaMedica() {
        initComponents();
        cargarDatos();
    }

    private void cargarDatos() {
        for (Medico medic : medicos) {
            cNombreDoc.addItem(medic.getNombre() + " " + medic.getaP() + " " + medic.getaM());
        }
        for (Paciente pacien : pacientes) {
            cNSS.addItem(pacien.getNumeroSeguroSocial());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cNSS = new javax.swing.JComboBox<>();
        agendarButton = new javax.swing.JButton();
        cNombreDoc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        formatoDia = new javax.swing.JFormattedTextField();
        tHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cNSS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        agendarButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        agendarButton.setText("Agendar Cita");
        agendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarButtonActionPerformed(evt);
            }
        });

        cNombreDoc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del medico");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("NSS del paciente");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Día");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Hora");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Agendar Cita Médica ");

        regresarButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        regresarButton.setText("Regresar ");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cNSS, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cNombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(59, 59, 59)
                                .addComponent(formatoDia, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addGap(162, 162, 162)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tHora, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel5)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agendarButton)
                .addGap(207, 207, 207))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cNombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(formatoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(agendarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regresarButton)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agendarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarButtonActionPerformed
        if (!firstClick) {
            if (formatoDia.getText().length() != 0 && tHora.getText().length() != 0) {
                //Proceso para guardar la fecha
                String archivo = mt.CITA_MEDICA + formatoDia.getText() + ".txt";
                citas = mt.leerTxt(archivo);

                int hora = Integer.parseInt(tHora.getText());
                if (verificar(hora)) {
                    String cedulaMedico = medicos.get(cNombreDoc.getSelectedIndex()).getCedula();
                    String nombreMedico = medicos.get(cNombreDoc.getSelectedIndex()).getNombreCompleto();

                    String nSSPaciente = pacientes.get(cNSS.getSelectedIndex()).getNumeroSeguroSocial();
                    String nombrePaciente = pacientes.get(cNSS.getSelectedIndex()).getNombreCompleto();
                    CitaMedica cita = new CitaMedica(hora, cedulaMedico, nombreMedico, nSSPaciente, nombrePaciente);
                    citas.add(cita);
                    mt.guardarTxt(citas, archivo);
                    JOptionPane.showMessageDialog(this, "Cita medica agregada correctamente");

                    GuiCitaMedica citaM = new GuiCitaMedica();
                    citaM.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No disponible la fecha ingresada");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor de ingresar un dia manualmente.");
        }
    }//GEN-LAST:event_agendarButtonActionPerformed

    private boolean verificar(int hora) {
        for (CitaMedica cita : citas) {
            if (cita.getHora() == hora) {
                return false;
            }
        }
        return true;
    }

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea cancela la accion?", "Confirmaccion", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            GuiCitaMedica gm = new GuiCitaMedica();
            gm.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void formatoDiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formatoDiaMousePressed
        //Mostrar formato de ejemplo y quitarlo al primer click
        if (firstClick) {
            formatoDia.setText("");
            firstClick = false;
        }
    }//GEN-LAST:event_formatoDiaMousePressed

    private void tHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tHoraKeyTyped
        //Formato para controlar la hora
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
            java.util.logging.Logger.getLogger(GuiAgregarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAgregarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAgregarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAgregarCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAgregarCitaMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agendarButton;
    private javax.swing.JComboBox<String> cNSS;
    private javax.swing.JComboBox<String> cNombreDoc;
    private javax.swing.JFormattedTextField formatoDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton regresarButton;
    private javax.swing.JTextField tHora;
    // End of variables declaration//GEN-END:variables
}
