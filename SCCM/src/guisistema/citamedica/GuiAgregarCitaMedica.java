/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guisistema.citamedica;

/**
 *
 * @author TheHu
 */
import clases.*;
//import guisistema.medico.GuiMedico;
import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
//import txtPlano.*;

public class GuiAgregarCitaMedica extends javax.swing.JFrame {

    private DB mt = new DB();
    private ArrayList<Paciente> pacientes = mt.leerTxt("PacienteDB.txt");
    private ArrayList<Medico> medicos = mt.leerTxt("MedicoDB.txt");
    private ArrayList<String> horario = mt.leerTxt("HorarioDB.txt");

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

        tHora = new javax.swing.JTextField();
        cNSS = new javax.swing.JComboBox<>();
        agendarButton = new javax.swing.JButton();
        cNombreDoc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cDia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tHora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tHora.setToolTipText("Formato de 24 horas");

        cNSS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        agendarButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agendarButton.setText("Agendar Cita");
        agendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarButtonActionPerformed(evt);
            }
        });

        cNombreDoc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del medico");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("NSS del paciente");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Día");

        cDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Hora");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Agendar Cita Médica ");

        regresarButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        regresarButton.setText("Regresar ");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cNSS, 0, 190, Short.MAX_VALUE)
                            .addComponent(cNombreDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(259, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tHora, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(agendarButton)))
                        .addGap(40, 40, 40))))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agendarButton)
                    .addComponent(regresarButton))
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agendarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarButtonActionPerformed

        int hora = Integer.valueOf(tHora.getText());
        int dia = cDia.getSelectedIndex() + 1;

        if (verificar(dia, hora)) {
            String[] cadenaNue = horario.get(hora).split("~");

            cadenaNue[dia] = medicos.get(cNombreDoc.getSelectedIndex()).getCedula() + "-" + pacientes.get(cNSS.getSelectedIndex()).getNumeroSeguroSocial();
            String cadenaNueF = cadenaNue[0] + "~" + cadenaNue[1] + "~" + cadenaNue[2] + "~" + cadenaNue[3] + "~" + cadenaNue[4] + "~" + cadenaNue[5] + "~" + cadenaNue[6] + "~" + cadenaNue[7];
            horario.set(hora, cadenaNueF);
            mt.guardarTxt(horario, "HorarioDB.txt");
            JOptionPane.showMessageDialog(this, "Cita medica agregada correctamente");
            GuiCitaMedica gm = new GuiCitaMedica();
            gm.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_agendarButtonActionPerformed
    
    private boolean verificar(int dia, int hora) {
        String dato = horario.get(hora).split("~")[dia];
        if (dato.equalsIgnoreCase("false")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Dia y hora no disponibles");
            return false;
        }
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
    private javax.swing.JComboBox<String> cDia;
    private javax.swing.JComboBox<String> cNSS;
    private javax.swing.JComboBox<String> cNombreDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton regresarButton;
    private javax.swing.JTextField tHora;
    // End of variables declaration//GEN-END:variables
}
