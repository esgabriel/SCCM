package guisistema.citamedica;

import clases.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiModificarCitaMedica extends javax.swing.JFrame {

    private final DB db = new DB();
    private ArrayList<CitaMedica> citas;
    private String diaAntiguo;
    private boolean firstClick = true;
    private int posicion;

    public GuiModificarCitaMedica() {
        initComponents();
    }

    private boolean existe(ArrayList<CitaMedica> cadena, int hora) {
        for (int i = 0; i < cadena.size(); i++) {
            if (cadena.get(i).getHora() == hora) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nSSLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        aceptarButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        formatoDiaBusqueda = new javax.swing.JFormattedTextField();
        formatoDiaFinal = new javax.swing.JFormattedTextField();
        tHoraBusqueda = new javax.swing.JTextField();
        tHoraFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Modificar Cita Médica ");

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

        jLabel4.setText("Día");

        jLabel7.setText("Hora");

        formatoDiaBusqueda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        formatoDiaBusqueda.setText("31-12-2000");
        formatoDiaBusqueda.setToolTipText("<html>\n<p>Formato de fecha:</p>\n<p>dia-mes-año</p>\n<p>31-12-2000</p>\n</html>");
        formatoDiaBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formatoDiaBusquedaMousePressed(evt);
            }
        });

        formatoDiaFinal.setEditable(false);
        formatoDiaFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        formatoDiaFinal.setToolTipText("<html>\n<p>Formato de fecha:</p>\n<p>dia-mes-año</p>\n<p>31-12-2000</p>\n</html>");

        tHoraBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tHoraBusqueda.setToolTipText("Formato de 24 horas");
        tHoraBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tHoraBusquedaKeyTyped(evt);
            }
        });

        tHoraFinal.setEditable(false);
        tHoraFinal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tHoraFinal.setToolTipText("Formato de 24 horas");
        tHoraFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tHoraFinalKeyTyped(evt);
            }
        });

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
                .addContainerGap(88, Short.MAX_VALUE)
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
                                    .addComponent(formatoDiaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formatoDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nombreLabel)
                                .addGap(90, 90, 90))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tHoraFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tHoraBusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                    .addComponent(jLabel3)
                    .addComponent(buscarButton)
                    .addComponent(jLabel4)
                    .addComponent(formatoDiaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tHoraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nSSLabel)
                    .addComponent(jLabel6)
                    .addComponent(nombreLabel))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(formatoDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(aceptarButton))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
        if (!firstClick) {
            if (formatoDiaBusqueda.getText().length() != 0 && tHoraBusqueda.getText().length() != 0) {
                String archivo = db.CITA_MEDICA + formatoDiaBusqueda.getText() + ".txt";
                citas = db.leerTxt(archivo);
                if (!citas.isEmpty()) {
                    int hora = Integer.parseInt(tHoraBusqueda.getText());
                    if (existe(citas, hora)) {
                        diaAntiguo = formatoDiaBusqueda.getText();
                        nSSLabel.setText(citas.get(posicion).getNSSPaciente());
                        nombreLabel.setText(citas.get(posicion).getNombrePaciente());

                        formatoDiaBusqueda.setEditable(false);
                        tHoraBusqueda.setEditable(false);

                        formatoDiaFinal.setEditable(true);
                        tHoraFinal.setEditable(true);
                        formatoDiaFinal.setText(formatoDiaBusqueda.getText());
                        tHoraFinal.setText(tHoraBusqueda.getText());
                    } else {
                        JOptionPane.showMessageDialog(this, "No se encontraron citas medicas en la hora ingresada");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontraron citas medicas en el dia ingresado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Campo(s) Dia/Hora se encuentra vacio(s)");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese dia de forma manual");
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        if (formatoDiaFinal.getText().length() != 0 && tHoraFinal.getText().length() != 0) {
            String dia = formatoDiaFinal.getText();
            CitaMedica citaAntigua = citas.get(posicion);
            citas.remove(posicion);

            if (dia.equalsIgnoreCase(diaAntiguo)) {
                int hora = Integer.parseInt(tHoraFinal.getText());
                if (!existe(citas, hora)) {
                    int respuesta = JOptionPane.showConfirmDialog(this, "¿Esta seguro de modificar la cita medica?", "Confirmacion", JOptionPane.YES_NO_OPTION);

                    if (respuesta == JOptionPane.YES_OPTION) {
                        citaAntigua.setHora(hora);
                        citas.add(citaAntigua);

                        String archivo = db.CITA_MEDICA + diaAntiguo + ".txt";
                        db.guardarTxt(citas, archivo);
                        JOptionPane.showMessageDialog(this, "Modificacion realizada de forma exitosa");
                        
                        GuiCitaMedica citaM = new GuiCitaMedica();
                        citaM.setVisible(true);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encuentra disponible la fecha ingresada");
                }
            } else {
                String archivo = db.CITA_MEDICA + formatoDiaFinal.getText() + ".txt";
                ArrayList<CitaMedica> citasNuevas = db.leerTxt(archivo);
                int hora = Integer.parseInt(tHoraFinal.getText());

                if (!existe(citasNuevas, hora)) {
                    int respuesta = JOptionPane.showConfirmDialog(this, "¿Esta seguro de modificar la cita medica?", "Confirmacion", JOptionPane.YES_NO_OPTION);

                    if (respuesta == JOptionPane.YES_OPTION) {
                        citaAntigua.setHora(hora);
                        citasNuevas.add(citaAntigua);

                        db.guardarTxt(citasNuevas, archivo);
                        db.borrarTxt(citas, diaAntiguo);
                        
                        JOptionPane.showMessageDialog(this, "Modificacion realizada de forma exitosa");
                        
                        GuiCitaMedica citaM = new GuiCitaMedica();
                        citaM.setVisible(true);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encuentra disponible la fecha ingresada");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Campo(s) Dia/Hora se encuentra vacio(s)");
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

    private void formatoDiaBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formatoDiaBusquedaMousePressed
        //Mostrar formato de ejemplo y quitarlo al primer click
        if (firstClick) {
            formatoDiaBusqueda.setText("");
            firstClick = false;
        }
    }//GEN-LAST:event_formatoDiaBusquedaMousePressed

    private void tHoraBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tHoraBusquedaKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        String txt = tHoraBusqueda.getText();
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
    }//GEN-LAST:event_tHoraBusquedaKeyTyped

    private void tHoraFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tHoraFinalKeyTyped
        //Formato para controlar la hora
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        String txt = tHoraFinal.getText();
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
    }//GEN-LAST:event_tHoraFinalKeyTyped

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
    private javax.swing.JFormattedTextField formatoDiaBusqueda;
    private javax.swing.JFormattedTextField formatoDiaFinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nSSLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField tHoraBusqueda;
    private javax.swing.JTextField tHoraFinal;
    // End of variables declaration//GEN-END:variables
}
