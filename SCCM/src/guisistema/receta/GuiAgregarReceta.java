package guisistema.receta;

import clases.*;
import guisistema.Menu;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class GuiAgregarReceta extends javax.swing.JFrame {

    //private int posicionFinal; - son 10 elementos, incian en posicion 4 <- ese necesito
    private Medico medico;
    private Paciente paciente;
    private String diagnostico;
    private String fecha;
    private DefaultListModel modelo = new DefaultListModel();

    public GuiAgregarReceta(String fecha, Paciente paciente, Medico medico, String diagnostico) {
        initComponents();
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.diagnostico = diagnostico;
        recetaList.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        continuarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        recetaList = new javax.swing.JList<>();
        medicamentoTextField = new javax.swing.JTextField();
        modificarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        continuarButton.setText("Aceptar");
        continuarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(recetaList);

        modificarButton.setText("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Medicamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(continuarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(medicamentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(agregarButton)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(modificarButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eliminarButton))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton)
                    .addComponent(medicamentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButton)
                    .addComponent(modificarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(continuarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        int index = recetaList.getSelectedIndex();
        if (index != -1) {
            modelo.remove(index);
        } else {
            JOptionPane.showMessageDialog(this, "Error, selecciona un elemento", "Sin seleccion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        // TODO add your handling code here:
        int index = recetaList.getSelectedIndex();
        if (index != -1) {
            String medicamento = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
            modelo.remove(index);
            modelo.addElement(medicamento);
        } else {
            JOptionPane.showMessageDialog(this, "Error, selecciona un elemento", "Sin seleccion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        // TODO add your handling code here:
        String medicamento = medicamentoTextField.getText();
        if (medicamento != null) {
            modelo.addElement(medicamento);
            medicamentoTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese algun dato");
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void continuarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarButtonActionPerformed
        // TODO add your handling code here:
        //System.out.println("Historial");
        Object[] arr = modelo.toArray();
        if (arr.length != 0) {
            String receta = "";
            for (Object temp : arr) {
                receta += temp.toString() + "¬";
            }
            receta = receta.substring(0, (receta.length() - 1));
            Historial hist = new Historial(paciente.getNumeroSeguroSocial(), medico.getCedula(), diagnostico, receta, fecha);

            DB db = new DB();
            ArrayList<Historial> historial = db.leerTxt(db.HISTORIAL);
            historial.add(hist);
            db.guardarTxt(historial,db.HISTORIAL);
            JOptionPane.showMessageDialog(this, "Operacion exitosa");

            Menu menu = new Menu();
            menu.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error, ningun medicamento en la receta");
        }
    }//GEN-LAST:event_continuarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton continuarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicamentoTextField;
    private javax.swing.JButton modificarButton;
    private javax.swing.JList<String> recetaList;
    // End of variables declaration//GEN-END:variables
}
