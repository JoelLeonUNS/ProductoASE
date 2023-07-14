package vista;


public class PanelExamenMedico extends javax.swing.JPanel {

    public PanelExamenMedico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButtonGuardarExamMedico = new javax.swing.JButton();

        setBackground(new java.awt.Color(217, 217, 217));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(764, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Diagnóstico");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tratamiento");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 45, -1, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(260, 30));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 195, -1, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(260, 30));
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 195, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Examenes Auxiliares");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Observación");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 170, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(331, 90));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(new java.awt.Dimension(331, 80));
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(331, 90));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setPreferredSize(new java.awt.Dimension(331, 75));
        jScrollPane2.setViewportView(jTextArea2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Examen Médico");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 10, -1, -1));

        jButtonGuardarExamMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonGuardarExamMedico.setText("Guardar");
        jButtonGuardarExamMedico.setActionCommand("Guardar Examen Medico");
        jButtonGuardarExamMedico.setPreferredSize(new java.awt.Dimension(122, 30));
        add(jButtonGuardarExamMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 195, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonGuardarExamMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    public String getjTextArea1() {
        return jTextArea1.getText();
    }

    public void setjTextArea1(String jTextArea1) {
        this.jTextArea1.setText(jTextArea1);
    }

    public String getjTextArea2() {
        return jTextArea2.getText();
    }

    public void setjTextArea2(String jTextArea2) {
        this.jTextArea2.setText(jTextArea2);
    }

    public String getjTextField6() {
        return jTextField6.getText();
    }

    public void setjTextField6(String jTextField6) {
        this.jTextField6.setText(jTextField6);
    }

    public String getjTextField8() {
        return jTextField8.getText();
    }

    public void setjTextField8(String jTextField8) {
        this.jTextField8.setText(jTextField8);
    }    
}
