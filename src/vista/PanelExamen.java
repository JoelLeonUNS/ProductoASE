
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import presentador.PresentadorGeneral;

public class PanelExamen extends javax.swing.JPanel implements ActionListener {

    private PresentadorGeneral pGeneral;
    private PanelExamenClinico pExamenClinico;
    private PanelExamenMedico pExamenMedico;
    private PanelExamenFisico pExamenFisico;
    
    private DefaultTableModel modelTablaCuentas = new DefaultTableModel();
    private DefaultComboBoxModel comboBoxTipoExamen = new DefaultComboBoxModel();
    
    public PanelExamen(PresentadorGeneral p) {
        initComponents();
        this.pGeneral = p;
        this.pExamenClinico = new PanelExamenClinico();
        this.pExamenFisico = new PanelExamenFisico();
        this.pExamenMedico = new PanelExamenMedico();
        this.cmbBx_tipoExamen.addActionListener(this);
        llenarComboBoxTipoExamen();
    }
    
    private void llenarComboBoxTipoExamen() {
        cmbBx_tipoExamen.addItem("Tipo de Examen");
        cmbBx_tipoExamen.addItem("Examen Médico");
        cmbBx_tipoExamen.addItem("Examen Físico");
        cmbBx_tipoExamen.addItem("Examen Clínico");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        cmbBx_tipoExamen = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        pnl_consultaExamenes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pnl_baseTipoExamen = new javax.swing.JPanel();
        lbl_indicacionTipoHistoria = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(250, 35));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 35));
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 30, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(404, 500));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellido"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 95, -1, 500));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Añadir consulta");
        jButton2.setPreferredSize(new java.awt.Dimension(163, 35));
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 30, -1, -1));

        cmbBx_tipoExamen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbBx_tipoExamen.setModel(comboBoxTipoExamen);
        cmbBx_tipoExamen.setActionCommand("Tipo de Examen");
        cmbBx_tipoExamen.setPreferredSize(new java.awt.Dimension(200, 35));
        add(cmbBx_tipoExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 30, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.setPreferredSize(new java.awt.Dimension(133, 35));
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1115, 30, -1, -1));

        pnl_consultaExamenes.setBackground(new java.awt.Color(217, 217, 217));
        pnl_consultaExamenes.setPreferredSize(new java.awt.Dimension(764, 500));
        pnl_consultaExamenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fecha");
        pnl_consultaExamenes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(180, 30));
        pnl_consultaExamenes.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Hora");
        pnl_consultaExamenes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 30, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(120, 30));
        pnl_consultaExamenes.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 55, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Edad");
        pnl_consultaExamenes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 30, -1, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(90, 30));
        pnl_consultaExamenes.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 55, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tipo de enfermedad");
        pnl_consultaExamenes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 30, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(234, 30));
        pnl_consultaExamenes.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 55, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Motivo");
        pnl_consultaExamenes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 100, -1, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(234, 99));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(new java.awt.Dimension(232, 85));
        jScrollPane2.setViewportView(jTextArea1);

        pnl_consultaExamenes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 125, -1, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField7.setPreferredSize(new java.awt.Dimension(205, 30));
        pnl_consultaExamenes.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 125, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Sueño");
        pnl_consultaExamenes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Sed");
        pnl_consultaExamenes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 170, -1, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(205, 30));
        pnl_consultaExamenes.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 195, -1, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(205, 30));
        pnl_consultaExamenes.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 195, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Estado de ánimo");
        pnl_consultaExamenes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField9.setPreferredSize(new java.awt.Dimension(205, 30));
        pnl_consultaExamenes.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Apetito");
        pnl_consultaExamenes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        pnl_baseTipoExamen.setBackground(new java.awt.Color(200, 200, 200));
        pnl_baseTipoExamen.setPreferredSize(new java.awt.Dimension(764, 250));

        lbl_indicacionTipoHistoria.setBackground(new java.awt.Color(217, 217, 217));
        lbl_indicacionTipoHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_indicacionTipoHistoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_indicacionTipoHistoria.setText("<html>\n<h2>Seleccione un tipo de examen</h2>\n<ul>\n<li>Examen médico</li>\n<li>Examen físico</li>\n<li>Examen clínico</li>\n</ul>\n</html>");
        lbl_indicacionTipoHistoria.setToolTipText("");

        javax.swing.GroupLayout pnl_baseTipoExamenLayout = new javax.swing.GroupLayout(pnl_baseTipoExamen);
        pnl_baseTipoExamen.setLayout(pnl_baseTipoExamenLayout);
        pnl_baseTipoExamenLayout.setHorizontalGroup(
            pnl_baseTipoExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_indicacionTipoHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_baseTipoExamenLayout.setVerticalGroup(
            pnl_baseTipoExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_indicacionTipoHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnl_consultaExamenes.add(pnl_baseTipoExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 764, 250));

        add(pnl_consultaExamenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 95, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbBx_tipoExamen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbl_indicacionTipoHistoria;
    private javax.swing.JPanel pnl_baseTipoExamen;
    private javax.swing.JPanel pnl_consultaExamenes;
    // End of variables declaration//GEN-END:variables

    public String getInput(JTextField jtxfld){
        return jtxfld.getText();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Tipo de Examen" -> {
                switch (cmbBx_tipoExamen.getSelectedIndex()) {
                    case 1 -> {
                        pGeneral.getpExamen().cambiarTipoExamen(pnl_baseTipoExamen, pExamenMedico);
                    }
                    case 2 -> {
                        pGeneral.getpExamen().cambiarTipoExamen(pnl_baseTipoExamen, pExamenFisico);
                    }
                    case 3 -> {
                        pGeneral.getpExamen().cambiarTipoExamen(pnl_baseTipoExamen, pExamenClinico);
                    }
                }
            }
        }
    }
}
