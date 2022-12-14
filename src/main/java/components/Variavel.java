package components;

public class Variavel extends Elemento {


    public Variavel() {
        super();
        initComponents();
        
        System.out.println(super.getBackground() + " " + super.getBackgroundColor());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MargemInicio = new javax.swing.JPanel();
        IconJL = new javax.swing.JLabel();
        Margem3 = new javax.swing.JPanel();
        NomeJL = new javax.swing.JLabel();
        Margem2 = new javax.swing.JPanel();
        ValorJTF = new javax.swing.JTextField();
        MargemFim = new javax.swing.JPanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        MargemInicio.setBackground(super.getBackground());
        add(MargemInicio);

        IconJL.setText("VAR_ICON");
        add(IconJL);

        Margem3.setBackground(super.getBackground());
        add(Margem3);
        add(NomeJL);

        Margem2.setBackground(super.getBackground());
        add(Margem2);
        add(ValorJTF);

        MargemFim.setBackground(super.getBackground());
        add(MargemFim);
    }// </editor-fold>//GEN-END:initComponents

    public void refazer(){
        initComponents();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconJL;
    private javax.swing.JPanel Margem2;
    private javax.swing.JPanel Margem3;
    private javax.swing.JPanel MargemFim;
    private javax.swing.JPanel MargemInicio;
    private javax.swing.JLabel NomeJL;
    private javax.swing.JTextField ValorJTF;
    // End of variables declaration//GEN-END:variables
}
