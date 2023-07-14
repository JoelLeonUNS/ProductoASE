package vista;

public class PanelHistorialMedico extends javax.swing.JPanel {

    public PanelHistorialMedico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFld_valorBuscado = new javax.swing.JTextField();
        bttn_buscar = new javax.swing.JButton();
        scrll_tablaBusqueda = new javax.swing.JScrollPane();
        tbl_busquedaHistoria = new javax.swing.JTable();
        cmbBx_nuevaHistoria = new javax.swing.JComboBox<>();
        bttn_editarHistoria = new javax.swing.JButton();
        bttn_guardar = new javax.swing.JButton();
        pnl_baseHistoriaMedico = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1280, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFld_valorBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_valorBuscado.setPreferredSize(new java.awt.Dimension(250, 35));
        add(txtFld_valorBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, -1));

        bttn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttn_buscar.setText("Buscar");
        bttn_buscar.setPreferredSize(new java.awt.Dimension(150, 35));
        add(bttn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 130, 35));

        tbl_busquedaHistoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellido"
            }
        ));
        tbl_busquedaHistoria.setPreferredSize(new java.awt.Dimension(400, 495));
        scrll_tablaBusqueda.setViewportView(tbl_busquedaHistoria);

        add(scrll_tablaBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 95, 400, 495));

        cmbBx_nuevaHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbBx_nuevaHistoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nueva historia", "Estudiante", "Trabajador" }));
        cmbBx_nuevaHistoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbBx_nuevaHistoria.setPreferredSize(new java.awt.Dimension(215, 35));
        add(cmbBx_nuevaHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 30, -1, -1));

        bttn_editarHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttn_editarHistoria.setText("Editar historia");
        bttn_editarHistoria.setPreferredSize(new java.awt.Dimension(163, 35));
        add(bttn_editarHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 30, 163, -1));

        bttn_guardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttn_guardar.setText("Guardar");
        bttn_guardar.setPreferredSize(new java.awt.Dimension(133, 35));
        add(bttn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 30, -1, -1));

        pnl_baseHistoriaMedico.setBackground(new java.awt.Color(204, 204, 204));
        pnl_baseHistoriaMedico.setPreferredSize(new java.awt.Dimension(775, 495));
        pnl_baseHistoriaMedico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(pnl_baseHistoriaMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 95, 775, 495));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_buscar;
    private javax.swing.JButton bttn_editarHistoria;
    private javax.swing.JButton bttn_guardar;
    private javax.swing.JComboBox<String> cmbBx_nuevaHistoria;
    private javax.swing.JPanel pnl_baseHistoriaMedico;
    private javax.swing.JScrollPane scrll_tablaBusqueda;
    private javax.swing.JTable tbl_busquedaHistoria;
    private javax.swing.JTextField txtFld_valorBuscado;
    // End of variables declaration//GEN-END:variables
}
