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
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Modificar Cita Médica ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Día");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Hora");

        buscarButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("NSS");

        nSSLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nSSLabel.setForeground(new java.awt.Color(153, 153, 153));
        nSSLabel.setText("NSS");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Nombre");

        nombreLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(153, 153, 153));
        nombreLabel.setText("Nombre");

        cancelarButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        aceptarButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        aceptarButton.setText("Guardar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Día");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Hora");

        formatoDiaBusqueda.setForeground(new java.awt.Color(153, 153, 153));
        formatoDiaBusqueda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        formatoDiaBusqueda.setText("31-12-2000");
        formatoDiaBusqueda.setToolTipText("<html>\n<p>Formato de fecha:</p>\n<p>dia-mes-año</p>\n<p>31-12-2000</p>\n</html>");
        formatoDiaBusqueda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        formatoDiaBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formatoDiaBusquedaMousePressed(evt);
            }
        });

        formatoDiaFinal.setEditable(false);
        formatoDiaFinal.setBackground(new java.awt.Color(255, 255, 255));
        formatoDiaFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        formatoDiaFinal.setToolTipText("<html>\n<p>Formato de fecha:</p>\n<p>dia-mes-año</p>\n<p>31-12-2000</p>\n</html>");
        formatoDiaFinal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        tHoraBusqueda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tHoraBusqueda.setToolTipText("Formato de 24 horas");
        tHoraBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tHoraBusquedaKeyTyped(evt);
            }
        });

        tHoraFinal.setEditable(false);
        tHoraFinal.setBackground(new java.awt.Color(255, 255, 255));
        tHoraFinal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formatoDiaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nSSLabel)
                            .addComponent(formatoDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(tHoraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buscarButton)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buscarButton)
                    .addComponent(jLabel4)
                    .addComponent(formatoDiaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tHoraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(nSSLabel)
                    .addComponent(nombreLabel))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(formatoDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(aceptarButton))
                .addContainerGap())
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
