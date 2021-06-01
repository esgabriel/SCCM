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
    private final String DIA_ACTUAL;
    private final int HORA_ACTUAL;
    private int posicion;
    private String diagnostico;
    
    private ArrayList<Medico> listaMedicos = db.leerTxt(db.MEDICO);
    private ArrayList<Paciente> listaPacientes = db.leerTxt(db.PACIENTE);
    private ArrayList<CitaMedica> citas;
    
    public GuiDiagnostico(String dia, int hora) {
        initComponents();
        this.setLocationRelativeTo(null);
        DIA_ACTUAL = dia;
        HORA_ACTUAL = hora;
        iniciarDatos();
    }
    
    private void iniciarDatos() {
        String archivo = db.CITA_MEDICA+DIA_ACTUAL+".txt";
        citas = db.leerTxt(archivo);
        
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getHora() == HORA_ACTUAL) {
                posicion = i;
                paciente = Paciente.buscar(listaPacientes, citas.get(i).getNSSPaciente());
                medico = Medico.buscar(listaMedicos, citas.get(i).getCedulaMedico());
                break;
            }
        }
        
        medicoTextField.setText(medico.getNombreCompleto());
        cedulaTextField.setText(medico.getCedula());
        
        pacienteTextField.setText(paciente.getNombreCompleto());
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
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Médico");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Paciente");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Cédula");

        medicoTextField.setEditable(false);
        medicoTextField.setForeground(new java.awt.Color(255, 255, 255));

        cedulaTextField.setEditable(false);
        cedulaTextField.setForeground(new java.awt.Color(255, 255, 255));

        pacienteTextField.setEditable(false);
        pacienteTextField.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Diagnóstico");

        continuarButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        continuarButton.setText("Continuar");
        continuarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Edad");

        edadLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(153, 153, 153));
        edadLabel.setText("Edad");

        historialButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        historialButton.setText("Ver historial");
        historialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialButtonActionPerformed(evt);
            }
        });

        diagnosticoTextArea.setColumns(20);
        diagnosticoTextArea.setRows(5);
        jScrollPane1.setViewportView(diagnosticoTextArea);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Ingresar diagnóstico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(290, 290, 290))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edadLabel)
                                    .addComponent(cedulaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(medicoTextField)
                                    .addComponent(pacienteTextField))))
                        .addGap(18, 18, 18)
                        .addComponent(historialButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(continuarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(medicoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cedulaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pacienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edadLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historialButton))
                .addGap(29, 29, 29)
                .addComponent(continuarButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
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
        GuiAgregarReceta receta = new GuiAgregarReceta(DIA_ACTUAL, paciente, medico, diagnostico);
        receta.setVisible(true);
        dispose();
    }//GEN-LAST:event_continuarButtonActionPerformed

    private void eliminarCita(){
        citas.remove(posicion);
        if (!db.borrarTxt(citas, DIA_ACTUAL)) {
            String archivo = db.CITA_MEDICA+DIA_ACTUAL+".txt";
            db.guardarTxt(citas, DIA_ACTUAL);
        }
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicoTextField;
    private javax.swing.JTextField pacienteTextField;
    // End of variables declaration//GEN-END:variables
}
