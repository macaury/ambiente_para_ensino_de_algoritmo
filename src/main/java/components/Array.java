package components;

public class Array extends Elemento {

   
    public Array() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IconJL = new javax.swing.JLabel();
        AdicionarLinhaJB = new javax.swing.JButton();
        AdicionarColunaJB1 = new javax.swing.JButton();
        AgruparJP = new javax.swing.JPanel();
        ValorJTF = new javax.swing.JTextField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        IconJL.setText("ARRAY");
        add(IconJL);

        AdicionarLinhaJB.setText("+L");
        add(AdicionarLinhaJB);

        AdicionarColunaJB1.setText("+C");
        add(AdicionarColunaJB1);

        AgruparJP.setLayout(new java.awt.GridLayout(1, 1));
        AgruparJP.add(ValorJTF);

        add(AgruparJP);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarColunaJB1;
    private javax.swing.JButton AdicionarLinhaJB;
    private javax.swing.JPanel AgruparJP;
    private javax.swing.JLabel IconJL;
    private javax.swing.JTextField ValorJTF;
    // End of variables declaration//GEN-END:variables
}
