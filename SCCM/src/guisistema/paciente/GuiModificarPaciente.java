package guisistema.paciente;

import clases.DB;
import clases.Paciente;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiModificarPaciente extends javax.swing.JFrame {

    private ArrayList<Paciente> pacientes;
    private final int TAMANIONSS = 11;

    public GuiModificarPaciente() {
        initComponents();
        DB mt = new DB();
        pacientes = mt.leerTxt("PacienteDB.txt");
        for (Paciente paciente : pacientes) {
            cNSS.addItem(paciente.getNumeroSeguroSocial());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tNSS = new javax.swing.JTextField();
        cNSS = new javax.swing.JComboBox<>();
        tNombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        formatoDia = new javax.swing.JFormattedTextField();
        tApellidoP = new javax.swing.JTextField();
        tApellidoM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("NSS");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Apellido Paterno");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Apellido Materno");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("NSS");

        cNSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNSSActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        formatoDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        formatoDia.setText("31-12-2000");
        formatoDia.setToolTipText("<html>\n<p>Formato de fecha:</p>\n<p>dia-mes-año</p>\n<p>31-12-2000</p>\n</html>");

        tApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tApellidoPKeyTyped(evt);
            }
        });

        tApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tApellidoMKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Modificar paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tApellidoM)
                            .addComponent(tApellidoP)
                            .addComponent(tNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(cNSS, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNSS)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(192, 192, 192)
                        .addComponent(jButton1)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(formatoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DB mt = new DB();

        if (this.evaluarCampos()) {
            //String fecha = tDia.getText() + "-" + tMes.getText() + "-" + tAnnio.getText();
            String fecha = formatoDia.getText();
            if (fecha.length() != 0) {
                Paciente paciente = new Paciente(tNSS.getText(), tNombre.getText(), tApellidoP.getText(), tApellidoM.getText(), fecha);

                pacientes.remove(cNSS.getSelectedIndex());
                pacientes.add(paciente);

                mt.guardarTxt(pacientes, "PacienteDB.txt");

                JOptionPane.showMessageDialog(this, "Paciente modificado correctamente");

                GuiPaciente gm = new GuiPaciente();
                gm.setVisible(true);
                dispose();
            }else{
               JOptionPane.showMessageDialog(this, "El campo fecha se encuentra vacio");
            }
            
        } else {
            System.out.println("Vacio");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cNSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNSSActionPerformed
        tNombre.setText(pacientes.get(cNSS.getSelectedIndex()).getNombre());
        tApellidoP.setText(pacientes.get(cNSS.getSelectedIndex()).getaP());
        tApellidoM.setText(pacientes.get(cNSS.getSelectedIndex()).getaM());
        tNSS.setText(pacientes.get(cNSS.getSelectedIndex()).getNumeroSeguroSocial());

        String fecha = pacientes.get(cNSS.getSelectedIndex()).getFechaNacimiento();
        //String[] fecha = pacientes.get(cNSS.getSelectedIndex()).getFechaNacimiento().split("-");
        formatoDia.setText(fecha);
    }//GEN-LAST:event_cNSSActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GuiPaciente menuPaciente = new GuiPaciente();
        menuPaciente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tApellidoPKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!(Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tApellidoPKeyTyped

    private void tApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tApellidoMKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!(Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tApellidoMKeyTyped

    private boolean evaluarCampos() {

        if (!((tNombre.getText().equals(""))
                || (tApellidoP.getText().equals(""))
                || (tApellidoM.getText().equals(""))
                || (tNSS.getText().equals("")))) {
            if (tNSS.getText().length() == TAMANIONSS) {
                for (int i = 0; i < pacientes.size(); i++) {
                    String NSS = tNSS.getText();
                    if (pacientes.get(i).getNumeroSeguroSocial().equals(NSS) && cNSS.getSelectedIndex() != i) {

                        JOptionPane.showMessageDialog(this, "El numero de seguro social ingresado ya se encuentra dentro del sistema");
                        return false;
                    }
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "El formato del numero de seguro social es incorrecto");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Algun campo se encuentra vacio, verifique nuevamente los campos");
            return false;
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
            java.util.logging.Logger.getLogger(GuiModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiModificarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cNSS;
    private javax.swing.JFormattedTextField formatoDia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tApellidoM;
    private javax.swing.JTextField tApellidoP;
    private javax.swing.JTextField tNSS;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables
}
