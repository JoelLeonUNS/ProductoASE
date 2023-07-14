package vista;


public class PanelExamenClinico extends javax.swing.JPanel {

    public PanelExamenClinico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonGuardarExamClinico = new javax.swing.JButton();

        setBackground(new java.awt.Color(217, 217, 217));
        setPreferredSize(new java.awt.Dimension(764, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Examen Clínico");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 10, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setText("AP Cardiovascular");
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox2.setText("AP Respiratorio");
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Observación");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(280, 86));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jButtonGuardarExamClinico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonGuardarExamClinico.setText("Guardar");
        jButtonGuardarExamClinico.setPreferredSize(new java.awt.Dimension(122, 30));
        add(jButtonGuardarExamClinico, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonGuardarExamClinico;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    public boolean getjCheckBox1() {
        return jCheckBox1.isSelected();
    }

    public void setjCheckBox1(boolean jCheckBox1) {
        this.jCheckBox1.setSelected(jCheckBox1);
    }

    public boolean getjCheckBox2() {
        return jCheckBox2.isSelected();
    }

    public void setjCheckBox2(boolean jCheckBox2) {
        this.jCheckBox2.setSelected(jCheckBox2);
    }

    public String getjTextArea1() {
        return jTextArea1.getText();
    }

    public void setjTextArea1(String jTextArea1) {
        this.jTextArea1.setText(jTextArea1);
    }

    
}
