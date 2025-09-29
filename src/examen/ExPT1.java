package examen;

import Logica.Conjunto;
import Logica.Limpiar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JTextField;

public class ExPT1 extends javax.swing.JFrame {

    public Conjunto conjunto = new Conjunto();
    public Limpiar limpiar = new Limpiar();

    public ExPT1() {
        initComponents();
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
        interseccionBtn = new javax.swing.JButton();
        diferenciaBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        productoCruzBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        potenciaBtn1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setText("Conjunto A");

        jLabel2.setText("Conjunto B");

        jScrollPane2.setViewportView(resultadoArea);

        unionBtn.setText("Union");
        unionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unionBtnActionPerformed(evt);
            }
        });

        interseccionBtn.setText("Interseccion");
        interseccionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interseccionBtnActionPerformed(evt);
            }
        });

        diferenciaBtn.setText("Diferencia");
        diferenciaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diferenciaBtnActionPerformed(evt);
            }
        });

        limpiarBtn.setText("Limpiar");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        productoCruzBtn.setText("Producto Cruz");
        productoCruzBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoCruzBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("{");

        jLabel4.setText("Resultado");

        jLabel5.setText("Ejercicio 1");

        potenciaBtn1.setText("Conjunto de potencias");
        potenciaBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaBtn1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Operaciones");

        jLabel7.setText("{");

        jLabel8.setText("}");

        jLabel9.setText("}");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(unionBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(interseccionBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diferenciaBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productoCruzBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(potenciaBtn1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel5)))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conjuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conjuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(37, 37, 37)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(limpiarBtn)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(310, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(295, 295, 295)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(308, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(279, 279, 279)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(conjuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(conjuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unionBtn)
                    .addComponent(interseccionBtn)
                    .addComponent(diferenciaBtn)
                    .addComponent(productoCruzBtn)
                    .addComponent(potenciaBtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(limpiarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(298, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(136, 136, 136)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(212, 212, 212)
                    .addComponent(jLabel6)
                    .addContainerGap(222, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conjuntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conjuntoBActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
        resultadoArea.removeAll();
        conjuntoA.removeAll();
        conjuntoB.removeAll();
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void conjuntoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conjuntoAActionPerformed

    private void unionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unionBtnActionPerformed
        Set<String> A = limpiar.limpiar(conjuntoA.getText());
        Set<String> B = limpiar.limpiar(conjuntoB.getText());

        Set<String> resultado = conjunto.union(A, B);

        String output = "Unión (A ∪ B):\n" + resultado.toString();
        resultadoArea.setText(output);

    }//GEN-LAST:event_unionBtnActionPerformed

    private void interseccionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interseccionBtnActionPerformed
        // TODO add your handling code here:
        String[] arr1 = conjuntoA.getText().split(",");
        String[] arr2 = conjuntoB.getText().split(",");

        Set<String> A = new HashSet<>(Arrays.asList(arr1));
        Set<String> B = new HashSet<>(Arrays.asList(arr2));

        A.retainAll(B);

        resultadoArea.setText("interseccion: " + A.toString());
    }//GEN-LAST:event_interseccionBtnActionPerformed

    private void diferenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diferenciaBtnActionPerformed
        // TODO add your handling code here:
        String[] arr1 = conjuntoA.getText().split(",");
        String[] arr2 = conjuntoB.getText().split(",");

        Set<String> A = new HashSet<>(Arrays.asList(arr1));
        Set<String> B = new HashSet<>(Arrays.asList(arr2));

        A.remove("");
        B.remove("");

        A.removeAll(B); // Diferencia A - B

        resultadoArea.setText("Diferencia A - B: " + A.toString());
    }//GEN-LAST:event_diferenciaBtnActionPerformed

    private void productoCruzBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoCruzBtnActionPerformed
        // TODO add your handling code here:
        String[] arr1 = conjuntoA.getText().split(",");
        String[] arr2 = conjuntoB.getText().split(",");

        Set<String> A = new HashSet<>(Arrays.asList(arr1));
        Set<String> B = new HashSet<>(Arrays.asList(arr2));

        A.remove("");
        B.remove("");

        List<String> resultado = new ArrayList<>();
        for (String a : A) {
            for (String b : B) {
                resultado.add("(" + a + "," + b + ")");
            }
        }

        //resultado.setText("Producto Cruz: " + resultado.toString());
    }//GEN-LAST:event_productoCruzBtnActionPerformed

    private void potenciaBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potenciaBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(ExPT2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExPT2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExPT2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExPT2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExPT2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField conjuntoA;
    private javax.swing.JTextField conjuntoB;
    private javax.swing.JButton diferenciaBtn;
    private javax.swing.JButton interseccionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JButton potenciaBtn1;
    private javax.swing.JButton productoCruzBtn;
    private javax.swing.JTextPane resultadoArea;
    private javax.swing.JButton unionBtn;
    // End of variables declaration//GEN-END:variables
}
