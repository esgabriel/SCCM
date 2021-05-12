package guisistema.historial;

import clases.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DialogVerHistorial extends javax.swing.JDialog {

    private Paciente paciente;
    private ArrayList<Historial> historialPersonal;
    private DefaultListModel modelo = new DefaultListModel();

    public DialogVerHistorial(java.awt.Frame parent, boolean modal, Paciente paciente, ArrayList historialPersonal) {
        super(parent, modal);
        initComponents();
        this.paciente = paciente;
        this.historialPersonal = historialPersonal;
        recetaList.setModel(modelo);
        cargarCombo();
    }

    private void cargarCombo() {
        citasMedicasComboBox.removeAllItems();
        int cont = 1;
        for (Historial hi : historialPersonal) {
            citasMedicasComboBox.addItem(cont + " - " + hi.forma());
            cont++;
        }
        //
        /*String txt = "1~2~3~6~4~6~9~4";
        ArrayList cadena = new ArrayList<>();
        ArrayList nue = new ArrayList<>();
        for (String x : txt.split("~")) {
            nue.add(x);
            System.out.println(x);
        }
        cadena.add("Nombre");
        cadena.add("Paciente");
        cadena.add(nue);
        modelo.addAll((ArrayList) cadena.get(2));*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recetaList = new javax.swing.JList<>();
        citasMedicasComboBox = new javax.swing.JComboBox<>();
        volverButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagnosticoTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Citas Medicas");

        jScrollPane1.setViewportView(recetaList);

        citasMedicasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Citas Medicas" }));
        citasMedicasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citasMedicasComboBoxActionPerformed(evt);
            }
        });

        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        modificarButton.setText("Modificar receta");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        diagnosticoTextArea.setColumns(20);
        diagnosticoTextArea.setRows(5);
        jScrollPane2.setViewportView(diagnosticoTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volverButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modificarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(citasMedicasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(citasMedicasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverButton)
                    .addComponent(modificarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void citasMedicasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citasMedicasComboBoxActionPerformed
        // TODO add your handling code here:
        modelo.removeAllElements();
        int index = citasMedicasComboBox.getSelectedIndex();
        if (index != -1) {
            ArrayList lista = historialPersonal.get(index).toArray();
            modelo.addAll(lista);
            diagnosticoTextArea.setText(historialPersonal.get(index).getDiagnostico());
            /*        //Array de arrays y la posicion del comboBox es de la lista principal
        int index = citasMedicasComboBox.getSelectedIndex();
        ArrayList<ArrayList> lista = new ArrayList<>();
        ArrayList lis2 = new ArrayList<>();
        lis2.add("Paracetamol");
        lis2.add("Lidocaina");
        lis2.add("Minecraf");
        lis2.add("No se que mas");
        lista.add(lis2);

        ArrayList list3 = new ArrayList<>();
        list3.add("Paamol");
        list3.add("Lina");
        list3.add("Minraf");
        list3.add("No mas");
        lista.add(list3);
        //lista.add("Pocion de mana¬Scrim¬Fifa");
        //lista.add("Pick1¬pic2");
        //lista.add("000¬1235¬66699");

        switch(index){
            case 0:
            modelo.addAll(lista.get(index));
            break;
            case 1:
            modelo.addAll(lista.get(index));
            break;
            case 2:
            break;
            case 3:
            break;
            default:
            break;
        }*/
        }
    }//GEN-LAST:event_citasMedicasComboBoxActionPerformed

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        // TODO add your handling code here:
        //add(new PanelModificarReceta());
        dispose();
    }//GEN-LAST:event_volverButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        // TODO add your handling code here:
        //PanelModificarReceta panel = new PanelModificarReceta(this);
        //panel.setVisible(true);
    }//GEN-LAST:event_modificarButtonActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogVerHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogVerHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogVerHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogVerHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogVerHistorial dialog = new DialogVerHistorial(new javax.swing.JFrame(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> citasMedicasComboBox;
    private javax.swing.JTextArea diagnosticoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificarButton;
    private javax.swing.JList<String> recetaList;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
