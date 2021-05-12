package guisistema.diagnostico;

import clases.*;
import guisistema.historial.DialogVerHistorial;
import guisistema.receta.GuiAgregarReceta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiDiagnostico extends javax.swing.JFrame {
    
    private final DB db = new DB();
    private Medico medico;
    private Paciente paciente;
    private final int DIA_ACTUAL;
    private final int HORA_ACTUAL;
    private String diagnostico;
    
    private ArrayList<Medico> listaMedicos = db.leerTxt(db.MEDICO);
    private ArrayList<Paciente> listaPacientes = db.leerTxt(db.PACIENTE);
    private ArrayList<String> horario = db.leerTxt(db.HORARIO);
    
    public GuiDiagnostico(int dia, int hora) {
        initComponents();
        this.setLocationRelativeTo(null);
        DIA_ACTUAL = dia;
        HORA_ACTUAL = hora;
        iniciarDatos();
    }
    
    private void iniciarDatos() {
        String Nss = horario.get(HORA_ACTUAL).split("~")[DIA_ACTUAL].split("-")[1];
        paciente = Paciente.buscar(listaPacientes, Nss);
        
        String cedula = horario.get(HORA_ACTUAL).split("~")[DIA_ACTUAL].split("-")[0];
        medico = Medico.buscar(listaMedicos, cedula);
        
        medicoTextField.setText(medico.getNombre());
        cedulaTextField.setText(medico.getCedula());
        pacienteTextField.setText(String.format("%s %s %s", paciente.getNombre(), paciente.getaP(), paciente.getaM()));
        
        paciente.setEdad();
        edadLabel.setText(String.valueOf(paciente.getEdad()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        medicoTextField = new javax.swing.JTextField();
        cedulaTextField = new javax.swing.JTextField();
        pacienteTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        continuarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        historialButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosticoTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Médico");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Paciente");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Cédula");

        medicoTextField.setEditable(false);

        cedulaTextField.setEditable(false);

        pacienteTextField.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Diagnóstico");

        continuarButton.setText("Continuar");
        continuarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Edad");

        edadLabel.setText("Edad");

        historialButton.setText("Historial");
        historialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialButtonActionPerformed(evt);
            }
        });

        diagnosticoTextArea.setColumns(20);
        diagnosticoTextArea.setRows(5);
        jScrollPane1.setViewportView(diagnosticoTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(historialButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                .addComponent(continuarButton)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pacienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                                    .addComponent(cedulaTextField)
                                    .addComponent(medicoTextField)
                                    .addComponent(edadLabel)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(medicoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cedulaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pacienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(edadLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continuarButton)
                    .addComponent(historialButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<String> historial = buscarHistorial();
        if (!historial.isEmpty()) {
            DialogVerHistorial verHistorial = new DialogVerHistorial(this, true, paciente, historial);
            verHistorial.setLocationRelativeTo(this);
            verHistorial.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Error, historial vacio","Sin concidencias",JOptionPane.INFORMATION_MESSAGE);
        }
        /*GuiVerHistorial verHistorial = new GuiVerHistorial();
        verHistorial.setLocationRelativeTo(this);
        verHistorial.setVisible(true);*/
    }//GEN-LAST:event_historialButtonActionPerformed

    private ArrayList buscarHistorial(){
        ArrayList<Historial> historialCompleto = db.leerTxt(db.HISTORIAL);
        ArrayList histori = new ArrayList<>();
        
        for(Historial temp : historialCompleto){
            if (temp.getNss().equals(paciente.getNumeroSeguroSocial())) {
                histori.add(temp);
            }
        }
        return histori;
    }
    private void continuarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarButtonActionPerformed
        // TODO add your handling code here:
        diagnostico = diagnosticoTextArea.getText();
        diagnostico = diagnostico.replaceAll("\n", "@");
        
        eliminarCita();
        GuiAgregarReceta receta = new GuiAgregarReceta(paciente, medico, diagnostico);
        receta.setVisible(true);
        dispose();
    }//GEN-LAST:event_continuarButtonActionPerformed

    private void eliminarCita(){
        CitaMedica cita = new CitaMedica();
        String arr[] = horario.get(HORA_ACTUAL).split("~");
        arr[DIA_ACTUAL] = "false";
        String nuevo = cita.formato(arr);
        horario.set(HORA_ACTUAL, nuevo);
        db.guardarTxt(horario, db.HORARIO);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulaTextField;
    private javax.swing.JButton continuarButton;
    private javax.swing.JTextArea diagnosticoTextArea;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JButton historialButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicoTextField;
    private javax.swing.JTextField pacienteTextField;
    // End of variables declaration//GEN-END:variables
}
