package examen;

import Logica.Conjunto;
import Logica.Limpiar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExPT1 extends javax.swing.JFrame {

    public ExPT1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conjuntoA = new javax.swing.JTextField();
        conjuntoB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadoArea = new javax.swing.JTextPane();
        unionBtn = new javax.swing.JButton();
        interBtn = new javax.swing.JButton();
        diferenciaBtn = new javax.swing.JButton();
        potenciaBtn = new javax.swing.JButton();
        pCruzBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Volver1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        conjuntoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuntoAActionPerformed(evt);
            }
        });

        conjuntoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuntoBActionPerformed(evt);
            }
        });

        jLabel1.setText("¡Solo se toma el conjunto A!");

        jLabel2.setText("INGRESE SU CONJUNTO 2");

        jScrollPane2.setViewportView(resultadoArea);

        unionBtn.setText("Union");
        unionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unionBtnActionPerformed(evt);
            }
        });

        interBtn.setText("Interseccion");
        interBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interBtnActionPerformed(evt);
            }
        });

        diferenciaBtn.setText("Diferencia");
        diferenciaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diferenciaBtnActionPerformed(evt);
            }
        });

        potenciaBtn.setText("Conjunto de potencias");
        potenciaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaBtnActionPerformed(evt);
            }
        });

        pCruzBtn.setText("Producto Cruz");
        pCruzBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pCruzBtnActionPerformed(evt);
            }
        });

        limpiarBtn.setText("Limpiar");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado");

        Volver1.setText("<---");
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Adwaita Sans", 0, 24)); // NOI18N
        jLabel4.setText("Operacion de conjuntos");

        jLabel5.setText("INGRESE SU CONJUNTO 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpiarBtn)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Volver1)
                                .addGap(126, 126, 126)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(conjuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(conjuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(pCruzBtn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(potenciaBtn))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(unionBtn)
                                            .addGap(18, 18, 18)
                                            .addComponent(interBtn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(diferenciaBtn)
                                            .addGap(9, 9, 9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(11, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver1)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(conjuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unionBtn)
                            .addComponent(interBtn)
                            .addComponent(diferenciaBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(potenciaBtn)
                            .addComponent(pCruzBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conjuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(limpiarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conjuntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conjuntoBActionPerformed

    private void potenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaBtnActionPerformed
        // TODO add your handling code here:
        Set<String> A = Limpiar.limpiar(conjuntoA.getText());
        
        Set<Set<String>> resultado = Conjunto.conjuntoPotencia(A);

        String output = resultado.toString();
        resultadoArea.setText(output);

    }//GEN-LAST:event_potenciaBtnActionPerformed

    private void conjuntoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conjuntoAActionPerformed

    private void unionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unionBtnActionPerformed
        // TODO add your handling code here:
        Set<String> A = Limpiar.limpiar(conjuntoA.getText());
        Set<String> B = Limpiar.limpiar(conjuntoB.getText());

        Set<String> resultado = Conjunto.union(A, B);

        String output = resultado.toString();
        resultadoArea.setText(output);
    }//GEN-LAST:event_unionBtnActionPerformed

    private void interBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interBtnActionPerformed
        // TODO add your handling code here:
        Set<String> A = Limpiar.limpiar(conjuntoA.getText());
        Set<String> B = Limpiar.limpiar(conjuntoB.getText());

        Set<String> resultado = Conjunto.interseccion(A, B);

        String output = resultado.toString();
        resultadoArea.setText(output);
    }//GEN-LAST:event_interBtnActionPerformed

    private void diferenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diferenciaBtnActionPerformed
        // TODO add your handling code here:
        Set<String> A = Limpiar.limpiar(conjuntoA.getText());
        Set<String> B = Limpiar.limpiar(conjuntoB.getText());

        Set<String> resultado = Conjunto.diferencia(A, B);

        String output = resultado.toString();
        resultadoArea.setText(output);
    }//GEN-LAST:event_diferenciaBtnActionPerformed

    private void pCruzBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pCruzBtnActionPerformed
        // TODO add your handling code here:
        Set<String> A = Limpiar.limpiar(conjuntoA.getText());
        Set<String> B = Limpiar.limpiar(conjuntoB.getText());

        Set<String> resultado = Conjunto.productoCruz(A, B);

        String output = resultado.toString();
        resultadoArea.setText(output);
    }//GEN-LAST:event_pCruzBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
        resultadoArea.setText("");
        conjuntoA.setText("");
        conjuntoB.setText("");
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Volver1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver1;
    private javax.swing.JTextField conjuntoA;
    private javax.swing.JTextField conjuntoB;
    private javax.swing.JButton diferenciaBtn;
    private javax.swing.JButton interBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JButton pCruzBtn;
    private javax.swing.JButton potenciaBtn;
    private javax.swing.JTextPane resultadoArea;
    private javax.swing.JButton unionBtn;
    // End of variables declaration//GEN-END:variables
}
