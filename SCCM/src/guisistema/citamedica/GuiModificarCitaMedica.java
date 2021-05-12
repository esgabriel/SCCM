package guisistema.citamedica;

import clases.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiModificarCitaMedica extends javax.swing.JFrame {

    private final DB db = new DB();
    private CitaMedica cita = new CitaMedica();
    private ArrayList<String> citasMedicas = db.leerTxt(db.HORARIO);
    
    //private int NSS;
    
    public GuiModificarCitaMedica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        horaTextField = new javax.swing.JTextField();
        diaComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nSSLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        aceptarButton = new javax.swing.JButton();
        diaNuevoComboBox = new javax.swing.JComboBox<>();
        horaNuevaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Modificar Cita Médica ");

        horaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horaTextFieldKeyTyped(evt);
            }
        });

        diaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));

        jLabel2.setText("Día");

        jLabel3.setText("Hora");

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("NSS");

        nSSLabel.setText("NSS");

        jLabel6.setText("Nombre");

        nombreLabel.setText("Nombre");

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        aceptarButton.setText("Guardar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        diaNuevoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Domingo", "Lunes", "Martes", "Jueves", "Viernes", "Sabado" }));
        diaNuevoComboBox.setEnabled(false);

        horaNuevaTextField.setEditable(false);
        horaNuevaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horaNuevaTextFieldKeyTyped(evt);
            }
        });

        jLabel4.setText("Día");

        jLabel7.setText("Hora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nSSLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarButton)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diaNuevoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nombreLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(horaNuevaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(horaTextField))))))
                .addGap(62, 62, 62)
                .addComponent(buscarButton)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(buscarButton)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nSSLabel)
                    .addComponent(jLabel6)
                    .addComponent(nombreLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNuevoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaNuevaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(aceptarButton))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
        if (horaTextField.getText().length() != 0) { // Verificar que se ingresa una hora valida
            int dia = diaComboBox.getSelectedIndex() + 1;
            int hora = Integer.valueOf(horaTextField.getText());

            if (!verificarFecha(hora, dia)) {//Verificar que existe cita en ese dia - hora
                //Bloquear comboBox y textField para evitar modificación
                diaComboBox.disable();
                horaTextField.setEditable(false);
                
                diaNuevoComboBox.enable();
                horaNuevaTextField.setEditable(true);
                
                String nss = citasMedicas.get(hora).split("~")[dia].split("-")[1];
                nSSLabel.setText(nss);
                //nombreLabel.setText("Jose Angel Rincon Martinez"); //Nombre del paciente...
                quitarCita(hora, dia);
                
                diaNuevoComboBox.setSelectedIndex(dia-1);
                horaNuevaTextField.setText(String.valueOf(hora));
            } else {
                JOptionPane.showMessageDialog(this, "Cita medica no encontrada ", "Sin informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            horaTextField.requestFocus();
            JOptionPane.showMessageDialog(this, "El campo 'Hora' se encuentra vacio\nPor favor ingrese una hora valida", "Campo vacio", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void horaNuevaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horaNuevaTextFieldKeyTyped
        // TODO add your handling code here:
        if (!(Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else {
            String texto = horaNuevaTextField.getText();
            if ( texto.length() == 2) {
                evt.consume();
                /*if (texto.length() != 0) {
                    int hora = Integer.valueOf(texto);
                    System.out.println(hora);
                    if ( hora > 23 ) {
                        evt.consume();
                    }
                }*/
            } /*else {
                evt.consume();
            }*/
        }
    }//GEN-LAST:event_horaNuevaTextFieldKeyTyped

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        // TODO add your handling code here:
        if (horaTextField.getText().length() != 0) {
            int dia = diaNuevoComboBox.getSelectedIndex() + 1;
            int hora = Integer.valueOf(horaNuevaTextField.getText());
            
            if (verificarFecha(hora, dia)) {
                String arr[] = citasMedicas.get(hora).split("~");
                arr[dia] = cita.getCita();
                System.out.println("nueva"+cita.formato(arr));
                citasMedicas.set(hora, cita.formato(arr));
                db.guardarTxt(citasMedicas, db.HORARIO);
                
                try{
                    db.guardarTxt(citasMedicas, db.HORARIO);
                    JOptionPane.showMessageDialog(this, "Cita medica modificada correctamente","Guardado exitoso",JOptionPane.INFORMATION_MESSAGE);
                    
                    GuiCitaMedica citaMenu = new GuiCitaMedica();
                    citaMenu.setVisible(true);
                    dispose();
                }catch(Exception ex){
                    //No fue posible modifcar el archivo
                }
            }else{
                JOptionPane.showMessageDialog(this, "Día y hora no disponibles\nPor favor ingresar nueva","Fecha indisponible",JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            horaNuevaTextField.requestFocus();
            JOptionPane.showMessageDialog(this, "El campo 'Hora' se encuentra vacio\nPor favor ingrese una hora valida", "Campo vacio", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_aceptarButtonActionPerformed

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
        cita.setCita(arr[dia]);
        arr[dia] = "false";
        String horario = cita.formato(arr);
        System.out.println(horario);
        citasMedicas.set(hora, horario);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiModificarCitaMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JComboBox<String> diaComboBox;
    private javax.swing.JComboBox<String> diaNuevoComboBox;
    private javax.swing.JTextField horaNuevaTextField;
    private javax.swing.JTextField horaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nSSLabel;
    private javax.swing.JLabel nombreLabel;
    // End of variables declaration//GEN-END:variables
}
