package vista;

import historias.HistoriaClinica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import presentador.PresentadorGeneral;

public class PanelHistoriaClinica extends javax.swing.JPanel  implements ActionListener{
    
    private final PresentadorGeneral pGeneral;
    private PanelHistoriaEstudiante pHistoriaEstudiante;
    private PanelHistoriaTrabajador pHistoriaTrabajador;
    
    private DefaultTableModel modelTablaBuscarHistoria = new DefaultTableModel();
    private DefaultComboBoxModel<String> comboBoxNuevaHistoria = new DefaultComboBoxModel<>();
    
    public PanelHistoriaClinica(PresentadorGeneral pGeneral){
        initComponents();
        this.pGeneral = pGeneral;
        pHistoriaEstudiante = new PanelHistoriaEstudiante(pGeneral);
        pHistoriaTrabajador = new PanelHistoriaTrabajador(pGeneral);
        llenarComboBoxNuevaHistoria();
        crearEncabezadoTablaBuscarHistoria();
        cmbBx_nuevaHistoria.addActionListener(this);
        bttn_buscar.addActionListener(this);
        
    }
    
    public String getInputText(JTextField txtFld) {
        return txtFld.getText();
    }
    
    private void llenarComboBoxNuevaHistoria() {
        comboBoxNuevaHistoria.addElement("Nueva Historia");
        comboBoxNuevaHistoria.addElement("Estudiante");
        comboBoxNuevaHistoria.addElement("Trabajador");
    }
    
    private void crearEncabezadoTablaBuscarHistoria() {
        modelTablaBuscarHistoria.addColumn("DNI");
        modelTablaBuscarHistoria.addColumn("Nombre");
        modelTablaBuscarHistoria.addColumn("Apellido");
    }
    
    public boolean isBusquedaDNI(){
        return this.txtFld_valorBuscado.getText().matches("[0-9]+");
    }
    
    public void mostrarTablaBuscarHistoria(ArrayList<HistoriaClinica> historiasClinicas) {
        modelTablaBuscarHistoria.setRowCount(0);
        for (HistoriaClinica historiaClinica : historiasClinicas) {
            addHistoriaClinica(historiaClinica);
        }
    }
    
    private void addHistoriaClinica(HistoriaClinica historiaClinica) {
        if(historiaClinica!=null){
            modelTablaBuscarHistoria.addRow(new Object[]{
            historiaClinica, // Guardar el objeto HistoriaClinica
            historiaClinica.getPaciente().getNombre(),
            historiaClinica.getPaciente().getApellido(),   
            });
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Buscar" -> {
                if(isBusquedaDNI()){
                    modelTablaBuscarHistoria.setRowCount(0);
                    addHistoriaClinica(pGeneral.getpHistoriaClinica().buscarHistoriaClinicaDNI(getInputText(txtFld_valorBuscado)));
                }else{
                    mostrarTablaBuscarHistoria(pGeneral.getpHistoriaClinica().buscarHistoriaClinicaCoincidente(getInputText(txtFld_valorBuscado)));
                }
            }
            case "Nueva Historia" -> {
                if (cmbBx_nuevaHistoria.getSelectedIndex() == 1) {
                    pGeneral.getpHistoriaClinica().cambiarTipoHistoriaClinica(pnl_baseHistoriaClinica, pHistoriaEstudiante);
                } else if (cmbBx_nuevaHistoria.getSelectedIndex() == 2) {
                    pGeneral.getpHistoriaClinica().cambiarTipoHistoriaClinica(pnl_baseHistoriaClinica, pHistoriaTrabajador);
                }
            }
            case "Editar Historia" -> {
                
            }
            case "Guardar" -> {
                
            }
        }
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
        pnl_baseHistoriaClinica = new javax.swing.JPanel();
        lbl_indicacionTipoHistoria = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFld_valorBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_valorBuscado.setPreferredSize(new java.awt.Dimension(250, 35));
        add(txtFld_valorBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, -1));

        bttn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttn_buscar.setText("Buscar");
        bttn_buscar.setPreferredSize(new java.awt.Dimension(150, 35));
        add(bttn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 130, 35));

        tbl_busquedaHistoria.setBackground(new java.awt.Color(217, 217, 217));
        tbl_busquedaHistoria.setModel(modelTablaBuscarHistoria);
        tbl_busquedaHistoria.setPreferredSize(new java.awt.Dimension(400, 495));
        scrll_tablaBusqueda.setViewportView(tbl_busquedaHistoria);

        add(scrll_tablaBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 95, 400, 495));

        cmbBx_nuevaHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbBx_nuevaHistoria.setModel(comboBoxNuevaHistoria);
        cmbBx_nuevaHistoria.setActionCommand("Nueva Historia");
        cmbBx_nuevaHistoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbBx_nuevaHistoria.setPreferredSize(new java.awt.Dimension(215, 35));
        add(cmbBx_nuevaHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 30, -1, -1));

        bttn_editarHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttn_editarHistoria.setText("Editar Historia");
        bttn_editarHistoria.setPreferredSize(new java.awt.Dimension(163, 35));
        add(bttn_editarHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 30, 163, -1));

        bttn_guardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttn_guardar.setText("Guardar");
        bttn_guardar.setPreferredSize(new java.awt.Dimension(133, 35));
        add(bttn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 30, -1, -1));

        pnl_baseHistoriaClinica.setBackground(new java.awt.Color(204, 204, 204));
        pnl_baseHistoriaClinica.setPreferredSize(new java.awt.Dimension(775, 495));

        lbl_indicacionTipoHistoria.setBackground(new java.awt.Color(217, 217, 217));
        lbl_indicacionTipoHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_indicacionTipoHistoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_indicacionTipoHistoria.setText("<html>\n<h2>Seleccione un nuevo tipo de historia</h2>\n<ul>\n<li>Historia para Estudiantes</li>\n<li>Historia para Trabajadores</li>\n</ul>\n</html>");
        lbl_indicacionTipoHistoria.setToolTipText("");

        javax.swing.GroupLayout pnl_baseHistoriaClinicaLayout = new javax.swing.GroupLayout(pnl_baseHistoriaClinica);
        pnl_baseHistoriaClinica.setLayout(pnl_baseHistoriaClinicaLayout);
        pnl_baseHistoriaClinicaLayout.setHorizontalGroup(
            pnl_baseHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_indicacionTipoHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_baseHistoriaClinicaLayout.setVerticalGroup(
            pnl_baseHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_indicacionTipoHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(pnl_baseHistoriaClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 95, 775, 495));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_buscar;
    private javax.swing.JButton bttn_editarHistoria;
    private javax.swing.JButton bttn_guardar;
    private javax.swing.JComboBox<String> cmbBx_nuevaHistoria;
    private javax.swing.JLabel lbl_indicacionTipoHistoria;
    private javax.swing.JPanel pnl_baseHistoriaClinica;
    private javax.swing.JScrollPane scrll_tablaBusqueda;
    private javax.swing.JTable tbl_busquedaHistoria;
    private javax.swing.JTextField txtFld_valorBuscado;
    // End of variables declaration//GEN-END:variables
}
