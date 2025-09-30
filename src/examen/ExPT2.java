package examen;

import Logica.Checador;
import java.util.Set;

public class ExPT2 extends javax.swing.JFrame {

    public ExPT2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lenguaje = new javax.swing.JTextField();
        alfabeto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        limpiarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadoArea = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        Volver1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comprobarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        alfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfabetoActionPerformed(evt);
            }
        });

        jLabel1.setText("Lenguaje");

        jLabel2.setText("Alfabeto");

        limpiarBtn.setText("Limpiar");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(resultadoArea);

        jLabel3.setText("Resultado");

        Volver1.setText("<---");
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Adwaita Sans", 0, 24)); // NOI18N
        jLabel4.setText("Conjuntos");

        comprobarBtn.setText("Comprobar");
        comprobarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(limpiarBtn)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Volver1)
                                .addGap(169, 169, 169)
                                .addComponent(jLabel4)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comprobarBtn)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(alfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Volver1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comprobarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpiarBtn)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        Menú_General menu = new Menú_General();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Menú_General menu = new Menú_General();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
        resultadoArea.setText("");
        alfabeto.setText("");
        lenguaje.setText("");
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        // TODO add your handling code here:
        Menú_General menu = new Menú_General();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Volver1ActionPerformed

    private void comprobarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarBtnActionPerformed
        // TODO add your handling code here:
        String textoAlfabeto = alfabeto.getText();
        String cadenaAChecar = lenguaje.getText();
        
        Set<Character> alfabetoSet = Checador.crearAlfabeto(textoAlfabeto);
        boolean pertenece = Checador.perteneceAlfabeto(cadenaAChecar, alfabetoSet);
        
        String mensaje = "Alfabeto definido: " + alfabetoSet.toString() + "\n";
        mensaje += "Conjunto de cadenas a comprobar: \"" + cadenaAChecar + "\"\n";

        if (pertenece) {
            mensaje += "Resultado: PERTENECE al alfabeto (Σ*) ✅";
        } else {
            mensaje += "Resultado: NO PERTENECE al alfabeto (Σ*) ❌";
        }
        resultadoArea.setText(mensaje);

    }//GEN-LAST:event_comprobarBtnActionPerformed

    private void alfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfabetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alfabetoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver1;
    private javax.swing.JTextField alfabeto;
    private javax.swing.JButton comprobarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lenguaje;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextPane resultadoArea;
    // End of variables declaration//GEN-END:variables
}
