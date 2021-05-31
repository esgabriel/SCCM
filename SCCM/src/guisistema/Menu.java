package guisistema;

import clases.*;
import guisistema.citamedica.GuiCitaMedica;
import guisistema.diagnostico.GuiDiagnostico;
import guisistema.medico.GuiMedico;
import guisistema.paciente.GuiPaciente;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Menu extends javax.swing.JFrame {

    private DB db = new DB();
    private ArrayList<Medico> medicos = db.leerTxt(db.MEDICO);
    private ArrayList<Paciente> pacientes = db.leerTxt(db.PACIENTE);

    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        citaMedicaButton = new javax.swing.JButton();
        medicoButton = new javax.swing.JButton();
        pacienteButton = new javax.swing.JButton();
        diagnosticoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        citaMedicaButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        citaMedicaButton.setText("Cita Médica");
        citaMedicaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citaMedicaButtonActionPerformed(evt);
            }
        });

        medicoButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        medicoButton.setText("Médico");
        medicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicoButtonActionPerformed(evt);
            }
        });

        pacienteButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pacienteButton.setText("Paciente");
        pacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteButtonActionPerformed(evt);
            }
        });

        diagnosticoButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        diagnosticoButton.setText("Diagnóstico");
        diagnosticoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosticoButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("SISTEMA DE CONTROL DE CITAS MÉDICAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diagnosticoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pacienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(citaMedicaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(medicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pacienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(citaMedicaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(diagnosticoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void citaMedicaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citaMedicaButtonActionPerformed
        //Sin citas medicas
        if (!(medicos.isEmpty() || pacientes.isEmpty())) {
            GuiCitaMedica ventanaCitaMedica = new GuiCitaMedica();
            ventanaCitaMedica.setVisible(true);
            dispose();
        } else if (medicos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encuentran medicos", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se encuentran pacientes", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_citaMedicaButtonActionPerformed

    private void pacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteButtonActionPerformed
        GuiPaciente ventanaPaciente = new GuiPaciente();
        ventanaPaciente.setVisible(true);
        dispose();
    }//GEN-LAST:event_pacienteButtonActionPerformed

    private void diagnosticoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosticoButtonActionPerformed
        if (!(medicos.isEmpty() || pacientes.isEmpty())) {
            JPasswordField passField = new JPasswordField();
            int respuesta = JOptionPane.showConfirmDialog(this, passField, "Ingrese cedula valida", JOptionPane.OK_CANCEL_OPTION);

            if (respuesta == JOptionPane.OK_OPTION) {
                String cedula = new String(passField.getPassword());

                Medico medico = busqueda(cedula);
                
                if (medico != null) {
                    //Obtener dia y hora del sistema
                    Calendar calendario = new GregorianCalendar();
                    int hora = calendario.get(Calendar.HOUR_OF_DAY);
                    int dia = calendario.get(Calendar.DAY_OF_WEEK);

                    if (verificarHorario(hora, dia, medico)) {
                        GuiDiagnostico diagnosticoGui = new GuiDiagnostico(dia, hora);
                        diagnosticoGui.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Este doctor no cuenta con citas medicas en este horario");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese una cedula valida");
                }
            }
        } else if (medicos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encuentran medicos", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se encuentran pacientes", "Vacio", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_diagnosticoButtonActionPerformed

    private void medicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicoButtonActionPerformed
        GuiMedico ventanaMedico = new GuiMedico();
        ventanaMedico.setVisible(true);
        dispose();
    }//GEN-LAST:event_medicoButtonActionPerformed

    private Medico busqueda(String cedula) {
        Medico medicoAct = null;
        for (Medico medicTemp : medicos) {
            if (medicTemp.getCedula().equals(cedula)) {
                medicoAct = medicTemp;
                return medicoAct;
            }
        }
        return medicoAct;
    }

    private boolean verificarHorario(int hora, int dia, Medico medico) {
        ArrayList<String> horario = db.leerTxt(db.HORARIO);
        String[] cadena = horario.get(hora).split("~");

        if (cadena[dia].equals("false")) {
            return false;
        } else {
            return cadena[dia].split("-")[0].equals(medico.getCedula());
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton citaMedicaButton;
    private javax.swing.JButton diagnosticoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton medicoButton;
    private javax.swing.JButton pacienteButton;
    // End of variables declaration//GEN-END:variables
}
