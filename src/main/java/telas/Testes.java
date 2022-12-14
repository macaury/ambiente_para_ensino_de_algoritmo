
package telas;

import components.Array;
import components.Variavel;
import java.awt.MouseInfo;

public class Testes extends javax.swing.JFrame {
    final int MENU_WINDOWS = 30;


    public Testes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ferramentas = new javax.swing.ButtonGroup();
        VariavelJTB = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criarElemento(evt);
            }
        });

        Ferramentas.add(VariavelJTB);
        VariavelJTB.setText("VAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(VariavelJTB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(VariavelJTB))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarElemento(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarElemento
        if(VariavelJTB.isSelected()){
            Variavel v1 = new Variavel();
            this.add(v1);
            v1.setSize(v1.getPreferredSize());
            v1.setLocation(evt.getX()-v1.getWidth()/2, evt.getY()-v1.getHeight()/2-MENU_WINDOWS);
            revalidate();
        }
        /*else if(ArrayJTB.isSelected()){
            Array a1 = new Array();
            this.add(a1);
            a1.setSize(a1.getPreferredSize());
            a1.setLocation(evt.getPoint());
            revalidate();
        }*/
    }//GEN-LAST:event_criarElemento

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
            java.util.logging.Logger.getLogger(Testes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Ferramentas;
    private javax.swing.JToggleButton VariavelJTB;
    // End of variables declaration//GEN-END:variables
}
